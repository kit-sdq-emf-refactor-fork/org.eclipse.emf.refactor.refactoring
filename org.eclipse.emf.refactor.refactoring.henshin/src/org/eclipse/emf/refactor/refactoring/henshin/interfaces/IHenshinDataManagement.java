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

import org.eclipse.emf.refactor.refactoring.interfaces.IDataManagement;

/**
 * Interface used for specific data concerning a model refactoring that
 * shall be executed by EMF model transformations using the Henshin 
 * interpreter. 
 * @generated NOT
 * @author Thorsten Arendt
 */
public interface IHenshinDataManagement extends IDataManagement {
	
	/**
	 * Gets a HenshinInformation object used for checking the initial
	 * conditions of the EMF model refactoring.
	 * @return HenshinInformation object used for checking the initial
	 * conditions of the EMF model refactoring.
	 */
	public IHenshinInformation getInitialConditionsHenshinInformation();
	
	/**
	 * Gets a HenshinInformation object used for checking the final
	 * conditions of the EMF model refactoring.
	 * @return HenshinInformation object used for checking the final
	 * conditions of the EMF model refactoring.
	 */
	public IHenshinInformation getFinalConditionsHenshinInformation();
	
	/**
	 * Gets a HenshinInformation object used for executing the EMF 
	 * model refactoring.
	 * @return HenshinInformation object used for executing the EMF 
	 * model refactoring.
	 */
	public IHenshinInformation getCreateChangeHenshinInformation();

}
