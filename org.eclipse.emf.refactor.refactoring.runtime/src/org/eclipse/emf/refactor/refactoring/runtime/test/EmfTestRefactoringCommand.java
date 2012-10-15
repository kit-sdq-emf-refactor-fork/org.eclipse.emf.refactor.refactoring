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
package org.eclipse.emf.refactor.refactoring.runtime.test;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.LtkEmfRefactoringProcessorAdapter;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;

/**
 * Class used for providing a command that tests an EMF model refactoring.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class EmfTestRefactoringCommand extends AbstractCommand {

	/**
	 * Root of the corresponding EMF model.
	 */
	private final EObject root;
	
	/**
	 * RefactoringProcessor to be used by the command.
	 */
	private final LtkEmfRefactoringProcessorAdapter processor;

	/**
	 * Constructor.
	 * @param name Name of the refactoring to run.
	 * @param newProcessor RefactoringProcessor to be used by the command.
	 * @param rootObject Root EObject to run the refactoring on.
	 */
	public EmfTestRefactoringCommand(
			final String name,
			final RefactoringProcessor newProcessor,
			final EObject rootObject) {
		super(name);
		this.root = rootObject;
		this.processor =
			(LtkEmfRefactoringProcessorAdapter) newProcessor;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public final void execute() {
		try {
			// check whether all conditions are met
			if (this.processor.checkConditions()) {
				// apply refactoring
				this
				.processor
				.createChange(new NullProgressMonitor())
						.perform(new NullProgressMonitor());
			} else {
				// TODO real error handling that gets displayed
				System.out.println("Checks failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Returns to the root EObject.
	 * @return Root EObject 
	 */
	protected final EObject getRoot() {
		return root;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		// do nothing
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#undo()
	 */
	@Override
	public void undo() {
		// do nothing
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 */
	@Override
	public final boolean canExecute() {
		return true;
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	@Override
	public final boolean canUndo() {
		return false;
	}

}