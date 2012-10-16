/*******************************************************************************
 * Copyright (c) Philipps University of Marburg. All rights reserved. 
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Philipps University of Marburg - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.refactor.refactoring.generator.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;
import org.eclipse.emf.refactor.refactoring.generator.interfaces.INewRefactoringWizard;
import org.eclipse.emf.refactor.refactoring.generator.managers.GeneratioManager;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * Wizard for editing data needed for model refactoring code generation.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class NewRefactoringWizardJava extends Wizard implements INewRefactoringWizard {
	
	/**
	 *  Wizard page for configurating model refactoring data (basics).
	 */
	private BasicDataWizardPage basicWizardPage;	
	
	/**
	 * Wizard page for configurating model refactoring parameters.
	 */
	private ParameterWizardPage parameterWizardPage;
	
	/**
	  * Wizard page for configurating model test parameters.
	  */
	 private TestWizardPage testWizardPage;
	
	/**
	 * Default constructor that initializes its wizard pages.
	 * @param selectedEObject The selected EObject when starting the 
	 * generation process of the model refactoring.
	 */
	public NewRefactoringWizardJava(EObject selectedEObject){
		super();
		setWindowTitle("EMF Refactor - Specify EMF Model Refactoring");
		this.basicWizardPage = new BasicDataWizardPage("EMF Refactor", selectedEObject);
		this.parameterWizardPage = new ParameterWizardPage("EMF Refactor");
		this.testWizardPage = new TestWizardPage("EMF Refactor");
		this.addPage(basicWizardPage);
		this.addPage(parameterWizardPage);
		this.addPage(testWizardPage);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			@Override
			public void execute(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {				
					createRefactoring(monitor);
				} catch (Exception e){
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(false, false, op);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	/**
	 * Triggers the model refactoring generation activity. Collects data
	 * from its wizard pages and starts the refactoring generator.
	 * @param monitor Object monitoring the model refactoring 
	 * generation activity.
	 */
	protected void createRefactoring(IProgressMonitor monitor) {
		String projectName = basicWizardPage.getProjectName();
		String id = basicWizardPage.getRefactoringId();
		String menuLabel = basicWizardPage.getMenuLabel();
		String namespaceUri = basicWizardPage.getNsUri();
		String namespacePrefix = basicWizardPage.getNsPrefix();
		String metaModelName = basicWizardPage.getMetaModelName();
		String className = basicWizardPage.getClassName();
		String jar = basicWizardPage.getJar();
		int numberOfTests = testWizardPage.getNumberOfTests();
		RefactoringInfo refactoringConfig = 
		   new RefactoringInfo(projectName, id, menuLabel, namespaceUri,
		         namespacePrefix, numberOfTests);
		refactoringConfig.setSelectedEObjectJar(jar);
		refactoringConfig.setSelectedEObjectClass(className);
		refactoringConfig.setMetaModelName(metaModelName);
		refactoringConfig.setParameters(parameterWizardPage.getParameters());
		GeneratioManager rg = new GeneratioManager(refactoringConfig);
		rg.run(monitor);
	}

}
