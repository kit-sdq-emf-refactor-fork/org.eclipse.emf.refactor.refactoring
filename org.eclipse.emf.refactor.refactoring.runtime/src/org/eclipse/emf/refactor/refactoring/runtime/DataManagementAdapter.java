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
package org.eclipse.emf.refactor.refactoring.runtime;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.refactor.refactoring.core.Port;
import org.eclipse.emf.refactor.refactoring.interfaces.IDataManagement;

/**
 * Adapter class implementing interface IDataManagement used for
 * EMF model refactorings.
 * @generated NOT
 * @author Florian Mantz
 */
public abstract class DataManagementAdapter implements IDataManagement {
	
	/**
	 * Set of EMF model refactoring input Ports.
	 */
	@SuppressWarnings("rawtypes")
	protected Set<Port> inPorts = new HashSet<Port>(); 
	
	/**
	 * Set of EMF model refactoring output Ports.
	 */
	@SuppressWarnings("rawtypes")
	protected Set<Port> outPorts = new HashSet<Port>(); 
	
	/**
	 * @see org.eclipse.emf.refactor.common.core.IDataManagement#
	 * getInPortByName(java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Port getInPortByName(String name) {
		return getPortByName(name,inPorts);
	}

	/**
	 * @see org.eclipse.emf.refactor.common.core.IDataManagement#
	 * getOutPortByName(java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Port getOutPortByName(String name) {
		return getPortByName(name,outPorts);
	}

	/**
	 * @see org.eclipse.emf.refactor.common.core.IDataManagement#
	 * getInPorts()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Set<Port> getInPorts() {
		return Collections.unmodifiableSet(inPorts);
	}

	/**
	 * @see org.eclipse.emf.refactor.common.core.IDataManagement#
	 * getOutPorts()
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Set<Port> getOutPorts() {
		return Collections.unmodifiableSet(outPorts);
	}

	/**
	 * @see org.eclipse.emf.refactor.common.core.IDataManagement#
	 * initOutPorts()
	 */
	@Override
	public void initOutPorts() {
		System.err.println("No Outports are provided!");
	}
	
	/**
	 * Gets the port with the given name from the given list of ports.
	 * @param name Name of the port to be returned.
	 * @param ports List of ports.
	 * @return Port with the given name from the given list of ports.
	 */
	@SuppressWarnings("rawtypes")
	private Port getPortByName(String name, Set<Port> ports) {
		for(Port p:ports){
			if(p.getName().equals(name)){
				return p;
			}
		}
		throw new IllegalArgumentException
					("Port with name '" + name + "' does not exits!");
	}

}
