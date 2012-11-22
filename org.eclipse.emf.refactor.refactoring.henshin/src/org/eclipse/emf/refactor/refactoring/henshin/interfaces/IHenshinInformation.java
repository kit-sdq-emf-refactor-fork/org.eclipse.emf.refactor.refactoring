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
package org.eclipse.emf.refactor.refactoring.henshin.interfaces;

/**
 * Interface used for specifying a Henshin file that shall be used by
 * a specific EMF model refactoring.
 * @generated NOT
 * @author Thorsten Arendt
 */
public interface IHenshinInformation {
	
	/**
	 * Gets the HenshinDataManagement object of the specific EMF
	 * model refactoring. 
	 * @return HenshinDataManagement object of the specific EMF
	 * model refactoring. 
	 */
	public IHenshinDataManagement getHenshinDataManagement();

	/**
	 * Returns the name of the Henshin transformation file that 
	 * shall be used by a specific EMF model refactoring.
	 * @return Name of the Henshin transformation file that shall 
	 * be used by a specific EMF model refactoring.
	 */
	public String getTransformationFileName();
	
	/**
	 * Checks whether the Henshin transformation file is specified.
	 * @return true if the Henshin file is specified, false otherwise.
	 */
	public Boolean isTransformationFileSpecified();

}
