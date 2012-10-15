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
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.core.Port;

/**
 * Interface used for specific data concerning a model refactoring.
 * @generated NOT
 * @author Florian Mantz
 */
public interface IDataManagement {
	
	/**
	 * Method for preselecting port values.
	 * @param selection Invocation context of the model refactoring.
	 */
	public void preselect(List<EObject> selection);
	
	/**
	 * Gets the input model refactoring port with the given name.
	 * @param name Name of the input port to be returned.
	 * @return Input model refactoring port with the given name.
	 */
	@SuppressWarnings("rawtypes")
	public Port getInPortByName(String name);
		
	/**
	 * Gets the output model refactoring port with the given name.
	 * @param name Name of the output port to be returned.
	 * @return Output model refactoring port with the given name.
	 */
	@SuppressWarnings("rawtypes")
	public Port getOutPortByName(String name);

	/**
	 * Gets the input ports of the model refactoring.
	 * @return Input ports of the model refactoring.
	 */
	@SuppressWarnings("rawtypes")
	public Set<Port> getInPorts();
	
	/**
	 * Gets the output ports of the model refactoring.
	 * @return Output ports of the model refactoring.
	 */
	@SuppressWarnings("rawtypes")
	public Set<Port> getOutPorts();
		
	/**
	 * Initializes the output ports of the model refactoring.
	 */
	public void initOutPorts();

}
