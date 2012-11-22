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

import org.eclipse.emf.refactor.refactoring.henshin.managers.HenshinRuntimeManager;
import org.eclipse.emf.refactor.refactoring.interfaces.IController;

/**
 * Interface used for specifying the controller of a specific model 
 * refactoring that shall be executed using Henshin.
 * @generated NOT
 * @author Thorsten Arendt
 */
public interface IHenshinController extends IController {

	/**
	 * Gets a HenshinRunner that executes Henshin transformations using 
	 * the Henshin interpreter.
	 * @return HenshinRunner that executes Henshin transformations using 
	 * the Henshin interpreter.
	 */
	public HenshinRuntimeManager getHenshinRuntimeManager();
	
	/**
	 * @see org.eclipse.emf.refactor.common.core.IController#
	 * getDataManagementObject()
	 */
	@Override
	public IHenshinDataManagement getDataManagementObject();
	
}
