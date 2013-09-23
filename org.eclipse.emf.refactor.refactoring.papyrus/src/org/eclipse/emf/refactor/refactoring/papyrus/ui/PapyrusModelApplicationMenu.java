package org.eclipse.emf.refactor.refactoring.papyrus.ui;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.configuration.managers.ConfigurationManager;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.ProjectManager;
import org.eclipse.emf.refactor.refactoring.papyrus.managers.PapyrusSelectionManager;
import org.eclipse.jface.action.ContributionItem;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ltk.ui.refactoring.RefactoringWizardOpenOperation;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;

public class PapyrusModelApplicationMenu extends ContributionItem {

	private final List<EObject> selection;

	public PapyrusModelApplicationMenu() {
		selection = PapyrusSelectionManager.getENotationSelection();
		System.out.println("PapyrusNotationApplicationMenu::selection: " +  selection);
	}

	public PapyrusModelApplicationMenu(String id) {
		super(id);
		selection = PapyrusSelectionManager.getENotationSelection();
		System.out.println("PapyrusNotationApplicationMenu::selection: " +  selection);
	}
	
	@Override
	public void fill(Menu menu, int index) {			
		ConfigurationManager.getInstance();
		IProject project = ProjectManager.getActualProject();
		LinkedList<Refactoring> refactorings = 
				ConfigurationManager.getSelectedRefactorings(project);	
		for(final Refactoring r : refactorings){
			if(r.getGui().showInMenu(this.selection)){	
				MenuItem menuItem = new MenuItem(menu, SWT.CHECK, index);
				menuItem.setText(r.getName());
				menuItem.addSelectionListener(new SelectionAdapter() {
					public void widgetSelected(SelectionEvent e) {
						try {
							//1. Set Selection:
							r.getController().setSelection(selection);							
							//2. Preselect Values:
							r.getController().getDataManagementObject()
													.preselect(selection);							
							//3. Show Refactoring-Gui:
							Shell shell = 
									Display.getDefault().getActiveShell();
							RefactoringWizardOpenOperation dialog = 
								new RefactoringWizardOpenOperation
														(r.getGui().show());
							dialog.run(shell, "Refactoring: " + r.getName());
							
						} catch (Exception e2) {
							MessageDialog
								.openError(null, "Error", e2.getMessage());
						}
					}
				});
			}			
		}	
	}
}