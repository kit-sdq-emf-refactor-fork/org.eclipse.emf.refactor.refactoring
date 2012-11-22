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

import org.eclipse.emf.common.command.AbstractCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.refactor.refactoring.henshin.interfaces.IHenshinInformation;
import org.eclipse.emf.refactor.refactoring.henshin.managers.HenshinRuntimeManager;

/**
 * Class used for checking initial an final conditions of
 * a EMF model refactoring using Henshin transformations.
 * @generated NOT
 * @author Florian Mantz
 */
public class CheckConditionsCommand extends AbstractCommand {
	
	/**
	 *  Root of the corresponding EMF model.
	 */
	private final EObject root;
	
	/**
	 * Corresponding HenshinInformation object providing the
	 * name of the Henshin transformation to be used. 
	 */
	private final IHenshinInformation henshinInformation;
	
	/**
	 * List of messages indication errors which occur during
	 * conditions checking.
	 */
	private List<String> messages;
	
	/**
	 * Default constructor using the corresponding HenshinInformation
	 * object and the root of the corresponding EMF model.
	 * @param henshinInformation Corresponding HenshinInformation object 
	 * providing the name of the Henshin transformation to be used. 
	 * @param root Root of the corresponding EMF model.
	 */
	public CheckConditionsCommand
			(IHenshinInformation henshinInformation, EObject root) {
		super();
		this.root = root; 
		this.henshinInformation = henshinInformation;
	}
	
	/**
	 * Gets a list of messages indicating errors which occur during
	 * conditions checking.
	 * @return List of messages indicating errors which occur during
	 * conditions checking.
	 */
	public List<String> getMessages() {
		return messages;
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#execute()
	 */
	@Override
	public void execute() {
		//Start Recorder:
		ChangeRecorder changeRecorder = new ChangeRecorder(root);		
		this.messages = HenshinRuntimeManager.checkConditions
							(this.henshinInformation, this.root);		
		//Undo
		changeRecorder.endRecording().applyAndReverse();	
	}

	/**
	 * @see org.eclipse.emf.common.command.Command#redo()
	 */
	@Override
	public void redo() {
		//do nothing
	}
	
	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canExecute()
	 */
	public boolean canExecute() {
		return true;
	}

	/**
	 * @see org.eclipse.emf.common.command.AbstractCommand#canUndo()
	 */
	public boolean canUndo() {
		return false;//Important
	}

}
