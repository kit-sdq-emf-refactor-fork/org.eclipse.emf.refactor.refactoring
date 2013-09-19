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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.refactor.refactoring.interfaces.IController;
import org.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler;

/**
 * Base class of a specific emf model refactoring.
 * @generated NOT
 * @author Florian Mantz
 */
public class Refactoring implements Comparable<Refactoring> {

	/**
	 * Id of the emf model refactoring.
	 */
	private final String id;
	
	/**
	 * Name of the emf model refactoring.
	 */
	private final String name;
	
	/**
	 * Namespace of the emf model refactoring.
	 */
	private final String namespaceUri;
	
	/**
	 * GuiHandler object of the emf model refactoring.
	 */
	private final IGuiHandler gui;
	
	/**
	 * Controller object of the emf model refactoring.
	 */
	private IController controller;
	
	/**
	 * ConfigurationElement object of the emf model refactoring used
	 * for lazy loading.
	 */
	private IConfigurationElement rawRefactoring;
	
	/**
	 * Contructs an emf model refactoring with GuiHandler object.
	 * @param id Id of the emf model refactoring.
	 * @param name Name of the emf model refactoring.
	 * @param namespaceUri Namespace of the emf model refactoring.
	 * @param gui GuiHandler object of the emf model refactoring.
	 */
	private Refactoring
		(String id, String name, String namespaceUri,IGuiHandler gui) {
		this.id = id;
		this.name = name;
		this.namespaceUri = namespaceUri;
		this.gui = gui;
		this.gui.setParent(this);
	}
	
	/**
	 * Contructs an emf model refactoring with GuiHandler and a controller
	 * object.
	 * @param id Id of the emf model refactoring.
	 * @param name Name of the emf model refactoring.
	 * @param namespaceUri Namespace of the emf model refactoring.
	 * @param gui GuiHandler object of the emf model refactoring.
	 * @param controller Controller object of the emf model refactoring.
	 */
	public Refactoring
		(String id, String name, String namespaceUri, 
				IGuiHandler gui, IController controller){
			this(id,name,namespaceUri,gui);
			this.controller = controller;
			this.controller.setParent(this);
	}
	
	/**
	 * Contructs an emf model refactoring with GuiHandler and a 
	 * ConfigurationElement object.
	 * @param id Id of the emf model refactoring.
	 * @param name Name of the emf model refactoring.
	 * @param namespaceUri Namespace of the emf model refactoring.
	 * @param gui GuiHandler object of the emf model refactoring.
	 * @param rawRefactoring ConfigurationElement object of the emf model 
	 * refactoring. 
	 */
	public Refactoring
		(String id, String name, String namespaceUri, 
				IGuiHandler gui, IConfigurationElement rawRefactoring){
			this(id,name,namespaceUri,gui);
			this.rawRefactoring = rawRefactoring;
	}
	
	/**
	 * Gets the namespace of the emf model refactoring.
	 * @return Namespace of the emf model refactoring.
	 */
	public String getNamespaceUri(){
		return namespaceUri;
	}
	
	/**
	 * Gets the id of the emf model refactoring.
	 * @return Id of the emf model refactoring.
	 */
	public String getId() {
		return id;
	}

	/**
	 * Gets the name of the emf model refactoring.
	 * @return Name of the emf model refactoring.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets the controller object of the emf model refactoring.
	 * @return Controller object of the emf model refactoring.
	 */
	public IController getController() {
		lazyLoadController();
		return controller;
	}
	
	private void lazyLoadController() {
		if(null == controller){
			try {
				this.controller = 
					(IController)rawRefactoring
							.createExecutableExtension("controller");
				this.controller.setParent(this);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Gets the guiHandler object of the emf model refactoring.
	 * @return GuiHandler object of the emf model refactoring.
	 */
	public IGuiHandler getGui() {
		return gui;
	}
	
	/**
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Refactoring other = (Refactoring) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Refactoring emfRefactoring) {
		if(this.equals(emfRefactoring))return 0;
		if(this.getName().equals(emfRefactoring.getName())){
			return emfRefactoring.id.hashCode() - this.id.hashCode();
		}else{
		    return this.getName().compareTo(emfRefactoring.getName());//emfRefactoring.getName().compareTo(this.getName());	
		}
	}

}
