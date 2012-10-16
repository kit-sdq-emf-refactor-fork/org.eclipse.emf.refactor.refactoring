package org.eclipse.emf.refactor.refactoring.generator.interfaces;

import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.wizard.WizardPage;

public interface INewRefactoringWizard {

	public LinkedList<IProject> getProjects();

	public int getPageNumbers();

	public void updateSecondPage();

	public WizardPage getSecondPage();

	public void setTargetProject(String text);

	public void setName(String text);

	public void setId(String text);

	public void setMetamodel(String text);

	public void setContext(String text);

	public void setJar(String jar);

	public void setImportPackage(String importPackage);

}
