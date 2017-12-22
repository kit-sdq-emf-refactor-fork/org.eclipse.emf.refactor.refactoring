package comrel.generator.refactoring.wizards;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import comrel.CompositeRefactoring;
import comrel.generator.refactoring.ComrelConfig;
import comrel.generator.refactoring.ComrelGenerationManager;

public class NewRefactoringWizardCoMReL extends Wizard 
				implements INewWizard {
	
	private final String WINDOW_TITLE = "New Composite EMF Model Refactoring";
	
	/**
	 * Wizard page for specifying the CoMReL file to 
	 * be used for executing the EMF model refactoring.
	 */
	private CoMReLRefactoringWizardPage comrelWizardPage;

	public NewRefactoringWizardCoMReL() {  }

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {  }
	
	@Override
	public void addPages() {
		setWindowTitle(WINDOW_TITLE);
		this.comrelWizardPage = new CoMReLRefactoringWizardPage();
		this.addPage(comrelWizardPage);
	}

	@Override
	public boolean performFinish() {
		
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				try {
					createComrelRefactoring(monitor);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			IWizardContainer container = getContainer();
			if (container != null) {
				container.run(false, false, op);
			}
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
		
	}
	
	protected void createComrelRefactoring(IProgressMonitor monitor) {
		System.out.println("Generate EMF Model Refactoring");
		System.out.println("Project: " + comrelWizardPage.getProject());
		System.out.println("CoMReL: " + comrelWizardPage.getComrelFileName());
		CompositeRefactoring cr = loadComrelModel();
		// TODO test cr
		ComrelConfig config = new ComrelConfig(
				cr, 
				comrelWizardPage.getProject(), 
				comrelWizardPage.getComrelFileName());
		System.out.println(config.toString());
		ComrelGenerationManager generationManager = new ComrelGenerationManager(config);
		System.out.println(generationManager.toString());
		generationManager.run(monitor);
	}
	
	private CompositeRefactoring loadComrelModel() {
		String path = comrelWizardPage.getProject().getLocationURI().getPath() 
						+ ComrelConfig.COMRELDIR + comrelWizardPage.getComrelFileName();
		URI uri = URI.createFileURI(new File(path).getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (CompositeRefactoring) resource.getContents().get(0);
	}
	
	@Override
	public boolean canFinish() {
		return comrelWizardPage.isPageComplete();
	}
}
