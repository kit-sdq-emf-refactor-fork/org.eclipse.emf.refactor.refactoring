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
package org.eclipse.emf.refactor.refactoring.henshin.runtime;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.henshin.interfaces.IHenshinDataManagement;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.LtkEmfRefactoringProcessorAdapter;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;

/**
 * Adapter class of a LTK RefactoringProcessor used for
 * EMF model refactorings using Henshin transformations.
 * @generated NOT
 * @author Thorsten Arendt
 */
public abstract class HenshinLtkEmfRefactoringProcessorAdapter extends
		LtkEmfRefactoringProcessorAdapter {
	
	/**
	 * Corresponding EMF model refactoring.
	 */
	private Refactoring refactoring;
	
	/**
	 * Default constructor using the corresponding EMF model
	 * refactoring, a selection objects the model refactoring 
	 * shall be executed on, and a Runnable that executes the model 
	 * refactoring.
	 * @param refactoring Corresponding EMF model refactoring.
	 * @param selection Given selection objects the model refactoring 
	 * shall be executed on.
	 * @param refactoringAction Runnable that executes the model refactoring.
	 */
	public HenshinLtkEmfRefactoringProcessorAdapter(Refactoring refactoring,
			List<EObject> selection, Runnable refactoringAction) {
		super(refactoring, selection, refactoringAction);
		this.refactoring = refactoring;
	}
	
	/**
	 * 
	 * @param c
	 * @return
	 */
	private RefactoringStatus doCheck(CheckConditionsCommand c) {
		this.editingDomain.getCommandStack().execute(c);
		RefactoringStatus result = new RefactoringStatus();
		for(String s:c.getMessages()){
			 result.addFatalError(s);
		}
		return result;
	}
	
	/**
	 * @see org.eclipse.emf.refactor.runtime.ltk.
	 * LtkEmfRefactoringProcessorAdapter#
	 * checkFinalConditions(org.eclipse.core.runtime.IProgressMonitor, 
	 * org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext)
	 */
	@Override
	public RefactoringStatus checkFinalConditions() {
		return doCheck(new CheckConditionsCommand(
				((IHenshinDataManagement)this.refactoring.getController()
						.getDataManagementObject())
						.getFinalConditionsHenshinInformation(),
						this.root));
	}
	
	/**
	 * @see org.eclipse.emf.refactor.runtime.ltk.
	 * LtkEmfRefactoringProcessorAdapter#
	 * checkInitialConditions(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	public RefactoringStatus checkInitialConditions() {
		return doCheck(new CheckConditionsCommand(
				((IHenshinDataManagement)this.refactoring.getController()
						.getDataManagementObject())
						.getInitialConditionsHenshinInformation(),
						this.root));
	}

}
