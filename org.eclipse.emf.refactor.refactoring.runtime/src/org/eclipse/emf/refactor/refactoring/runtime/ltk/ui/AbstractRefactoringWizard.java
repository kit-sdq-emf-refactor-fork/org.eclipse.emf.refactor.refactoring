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
package org.eclipse.emf.refactor.refactoring.runtime.ltk.ui;

import org.eclipse.emf.refactor.refactoring.interfaces.IController;
import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

/**
 * Abstract class used for providing an implementation of an LTK
 * RefactoringWizard in EMF Refactor.
 * @generated NOT
 * @author Florian Mantz
 */
public abstract class AbstractRefactoringWizard extends RefactoringWizard {
	
	/**
	 * Controller of the corresponding EMF model refactoring.
	 */
	protected final IController controller;

	/**
	 * Default constructor implementation.
	 * @param controller Controller of the EMF model refactoring.
	 */
	public AbstractRefactoringWizard(IController controller) {
		super(new ProcessorBasedRefactoring
				(controller.getLtkRefactoringProcessor()), 
								DIALOG_BASED_USER_INTERFACE);
		this.controller = controller;
	}

}
