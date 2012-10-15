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
package org.eclipse.emf.refactor.refactoring.interfaces;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

/**
 * Interface used for specifying gui topics of a specific model refactoring.
 * @generated NOT
 * @author Florian Mantz
 */
public interface IGuiHandler {
	
	/**
	 * Sets the EmfRefactoring supported by the GuiHandler.
	 * @param emfRefactoring EmfRefactoring supported by the GuiHandler.
	 */
	public void setParent(Refactoring refactoring);
	
	/**
	 * Gets the EmfRefactoring supported by the GuiHandler.
	 * @return EmfRefactoring supported by the GuiHandler.
	 */
	public Refactoring getParent();
	
	
	/**
	 * Specifies whether the model refactoring can be invoked from the
	 * context menu of the given selection context.
	 * @param selection Invocation context of the model refactoring.
	 * @return true, if the  model refactoring can be invoked from the
	 * context menu of the given selection context, false otherwise.
	 */
	public boolean showInMenu(List<EObject> selection);
	
	/**
	 * Initializes the ltk RefactoringWzard of the model refactoring.
	 * @return Ltk RefactoringWzard of the model refactoring.
	 */
	public RefactoringWizard show();

}
