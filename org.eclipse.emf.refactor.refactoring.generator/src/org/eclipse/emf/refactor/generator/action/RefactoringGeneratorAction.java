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
package org.eclipse.emf.refactor.generator.action;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.generator.ui.NewRefactoringWizardJava;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Class for triggering the model refactoring generation process.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class RefactoringGeneratorAction implements IObjectActionDelegate {
	
	/**
	 * Selected elements on the active part.
	 */
	private ISelection selection;	
	
	/**
	 * Active part of the workbench.
	 */
	private IWorkbenchPart targetPart;

	/**
	 * Default constructor.
	 */
	public RefactoringGeneratorAction() {}

	/**
	 * @see org.eclipse.ui.IActionDelegate#run
	 * (org.eclipse.jface.action.IAction)
	 */
	@Override
	public void run(IAction action) {
		StructuredSelection ss = (StructuredSelection) selection;
		EObject selectedEObject = (EObject) ss.getFirstElement();
		Shell shell = targetPart.getSite().getShell();
		WizardDialog wizard = new WizardDialog
							(shell, new NewRefactoringWizardJava(selectedEObject));
		wizard.open();
	}

	/**
	 * @see org.eclipse.ui.IActionDelegate#selectionChanged
	 * (org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	/**
	 * @see org.eclipse.ui.IObjectActionDelegate#setActivePart
	 * (org.eclipse.jface.action.IAction, org.eclipse.ui.IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

}
