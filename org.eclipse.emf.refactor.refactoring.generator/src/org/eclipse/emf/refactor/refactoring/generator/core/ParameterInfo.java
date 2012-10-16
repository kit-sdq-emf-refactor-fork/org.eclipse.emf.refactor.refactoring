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
package org.eclipse.emf.refactor.refactoring.generator.core;

/**
 * Class for a model refactoring parameter configuration including a name 
 * and a description.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class ParameterInfo {
	
	/**
	 * Name of the model refactoring parameter.
	 */
	private String name;
	
	/**
	 * Description of the model refactoring parameter.
	 */
	private String description;
	
	/**
	 * Default constructor.
	 * @param name Name of the model refactoring parameter.
	 */
	public ParameterInfo(String name){
		this.name = name;
	}
	
	/**
	 * Gets the description of the model refactoring parameter.
	 * @return Description of the model refactoring parameter.
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description of the model refactoring parameter.
	 * @param description Description of the model refactoring parameter.
	 */
	public void setDescription(String description) {
		if (null == description || description.isEmpty()){
			this.description = "Value of parameter '" + this.name + "'";
		} else {
			this.description = description;
		}
	}

	/**
	 * Gets the name of the model refactoring parameter.
	 * @return Name of the model refactoring parameter.
	 */
	public String getName() {
		return name;
	}

}
