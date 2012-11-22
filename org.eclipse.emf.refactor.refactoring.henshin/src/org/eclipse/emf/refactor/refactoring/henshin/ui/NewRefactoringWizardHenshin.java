package org.eclipse.emf.refactor.refactoring.henshin.ui;

import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.refactor.refactoring.generator.interfaces.INewRefactoringWizard;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

public class NewRefactoringWizardHenshin extends Wizard implements INewWizard, INewRefactoringWizard {

	public NewRefactoringWizardHenshin() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public LinkedList<IProject> getProjects() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPageNumbers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void updateSecondPage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public WizardPage getSecondPage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTargetProject(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setId(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMetamodel(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setContext(String text) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setJar(String jar) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setImportPackage(String importPackage) {
		// TODO Auto-generated method stub
		
	}

	public void setTransformationFileName(String transformationFileName) {
		// TODO Auto-generated method stub
		
	}

}
