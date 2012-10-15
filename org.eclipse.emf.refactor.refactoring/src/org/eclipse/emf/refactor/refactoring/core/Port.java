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
package org.eclipse.emf.refactor.refactoring.core;

/**
 * Class used for model refactoring parameters with specific name, description,
 * value, and type.
 * @generated NOT
 * @author Florian Mantz
 */
@SuppressWarnings("rawtypes")
public class Port<T> implements Comparable<Port> {

	/**
	 * Name of the port.
	 */
	final private String name;
	
	/**
	 * Description of the port.
	 */
	final private String description;	
	
	/**
	 * Type of the port.
	 */
	final private Class<T> type;
	
	/**
	 * Value of the port.
	 */
	private T value;
	
	/**
	 * Default constructor.
	 * @param name Name of the port.
	 * @param type Type of the port.
	 * @param description Description of the port.
	 * @param initialValue Initial value of the port.
	 */
	public Port(String name, Class<T> type, String description, T initialValue) {
		this.name = name;
		this.type = type;
		this.description = description;
		this.value = initialValue;
	}
	
	/**
	 * Constructor without description.
	 * @param name Name of the port.
	 * @param type Type of the port.
	 * @param initial Initial value of the port.
	 */
	public Port(String name, Class<T> type, T initial) {
		this(name,type,"",initial);
	}

	/**
	 * Contructor without description and initial value,
	 * @param name Name of the port.
	 * @param type Type of the port.
	 */
	public Port(String name, Class<T> type) {
		this(name,type,"",null);
	}
	
	/**
	 * Gets the Name of the port.
	 * @return Name of the port.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the description of the port.
	 * @return Description of the port.
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Gets the value of the port.
	 * @return Value of the port.
	 */
	public T getValue() {
		return value;
	}
	
	/**
	 * Gets the type of the port.
	 * @return Type of the port.
	 */
	public Class<T> getType(){
		return type; 
	}
	
	/**
	 * Sets the value of the port.
	 * @param value Value of the port.
	 */
	public void setValue(T value) {
		this.value = value;
	}
	
	/**
	 * Connects two ports of equal types by setting the value of this to
	 * that of the given port.
	 * @param port Port whose value is the new value of this.
	 */
	public void connect(Port<T> port){
		if(! port.getType().equals(this.getType())){
			throw new IllegalArgumentException("Ports are not of equal type");
		}
		this.value = port.getValue();
	}

	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/**
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Port other = (Port) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Port port) {
		return port.name.compareTo(this.name);
	}

}
