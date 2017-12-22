package org.eclipse.emf.refactor.refactoring.analyzer.core;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.interfaces.IController;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.LtkEmfRefactoringProcessorAdapter;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.change.RefactoringChange;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.ui.AbstractRefactoringWizard;
import org.eclipse.emf.refactor.refactoring.runtime.ui.IInputPageButtonCreator;
import org.eclipse.emf.refactor.smells.configuration.managers.ConfigurationManager;
import org.eclipse.emf.refactor.smells.core.ModelSmell;
import org.eclipse.emf.refactor.smells.runtime.core.ModelSmellFinder;
import org.eclipse.emf.refactor.smells.runtime.core.Result;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

/**
 * Class implementing the Interface IInputPageButtonCreator from EMF Refactor. It provides a method
 * to create a button for the input page of the refactoring wizard of EMF Refactor.
 * 
 * @author Matthias Burhenne
 *
 */
public class StatisticsButtonCreator implements IInputPageButtonCreator {

	@Override
	public Button createButton(final Composite parent, final IController controller, final AbstractRefactoringWizard wizard) {
		Button statButton = new Button(parent, SWT.NONE);
		statButton.setText("Model smell statistics");
		statButton.addMouseListener(new MouseListener() {
			boolean mouseDown = false;
			AbstractRefactoringWizard abstrWizard = wizard;
			
			@Override
			public void mouseUp(MouseEvent e) {
				if(mouseDown){
					abstrWizard.getNextPage(abstrWizard.getStartingPage());
					LtkEmfRefactoringProcessorAdapter processor = (LtkEmfRefactoringProcessorAdapter) controller.getLtkRefactoringProcessor();
					try {
						RefactoringStatus status = processor.checkFinalConditions();
						boolean applicable = status.isOK(); 
						if(applicable) {
							RefactoringChange c = (RefactoringChange) processor.createChange(new NullProgressMonitor());
							c.perform(new NullProgressMonitor());
//							c.getModelCompareInput();
							EObject rootAfterRefactoring = (EObject) c.getModifiedElement();
							EObject rootBeforeRefactoring = (EObject) c.getRootCopy();
							String path = rootAfterRefactoring.eResource().getURI().toPlatformString(false);
							IFile iFile = (IFile)org.eclipse.core.resources.ResourcesPlugin.getWorkspace().getRoot().findMember(path);
							List<Result> smellResultsBefore = ModelSmellFinder.findModelSmells(ConfigurationManager.getSelectedModelSmells(iFile.getProject()), rootBeforeRefactoring);
							List<Result> smellResultsAfter = ModelSmellFinder.findModelSmells(ConfigurationManager.getSelectedModelSmells(iFile.getProject()), rootAfterRefactoring);
							CompareResult result = ModelSmellResultComparator.compareModelSmellSearchResults(smellResultsBefore, smellResultsAfter);
							String message = buildStatisticsMessage(result);
							MessageDialog.openInformation(parent.getShell(), "Changes in model smell occurrences", message);
						} else {
							String message = "The provided input parameter(s) lead to a failure of the final check:\n" + status.getEntryWithHighestSeverity().getMessage();
							MessageDialog.openInformation(parent.getShell(), "Condition checks not passed", message);
						}
					} catch (OperationCanceledException e1) {
						e1.printStackTrace();
					} catch (CoreException e1) {
						e1.printStackTrace();
					}
				}
				mouseDown = false;
			}
			
			/*
			 * Creates the message for the dialog called by the created button.
			 */
			private String buildStatisticsMessage(CompareResult result) {
				
				Map<ModelSmell, Integer> originalSmells = result.getOccurencesInOriginalModel();
				Map<ModelSmell, Integer> changedSmells = result.getOccurencesInChangedModel();
				Map<ModelSmell, Integer> differences = result.getDifferences();
				
				String message = "Following model smell occurences are found before\n "
						+ "applying refactoring '" + controller.getParent().getName() + "': Total " 
						+ result.getTotalNumberInOriginalModel() + "\n\n";
				
				for(ModelSmell smell : originalSmells.keySet()){
					if(originalSmells.get(smell) != 0){
						message += smell.getName() + ": " + originalSmells.get(smell) + "\n";
					}
				}
				
				message += "\n\nFollowing model smells are found after\n "
						+ "applying refactoring '" + controller.getParent().getName() + "': Total " 
						+ result.getTotalNumberInChangedModel() + "\n\n";
				for(ModelSmell smell : changedSmells.keySet()){
					if(changedSmells.get(smell) != 0){
						message += smell.getName() + ": " + changedSmells.get(smell) + "\n";
					}
				}
								
				message += "\n\nFollowing model smell occurrences will change when\n "
						+ "applying refactoring '" + controller.getParent().getName() + "':\n\n";
								for(ModelSmell smell : differences.keySet()){
					if(differences.get(smell) != 0){
						message += smell.getName() + ": " + differences.get(smell) + "\n";
					}
				}
								
				return message;
			}

			@Override
			public void mouseDown(MouseEvent e) {
				mouseDown = true;
				
			}
			
			@Override
			public void mouseDoubleClick(MouseEvent e) {
				
			}
		});
		return statButton;
	}

}
