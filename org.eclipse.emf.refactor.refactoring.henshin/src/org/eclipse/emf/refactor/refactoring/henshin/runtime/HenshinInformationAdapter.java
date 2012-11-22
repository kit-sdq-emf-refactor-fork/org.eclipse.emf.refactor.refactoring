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

import org.eclipse.emf.refactor.refactoring.henshin.interfaces.IHenshinInformation;

/**
 * Adapter implementation of the IHenshinInformation interface used 
 * for specifying a Henshin file that shall be used by a specific 
 * EMF model refactoring.
 * @generated NOT
 * @author Thorsten Arendt
 */
public abstract class HenshinInformationAdapter implements IHenshinInformation {
	
	private final String UNSPECIFIED = "unspecified";
	
	/**
	 * Default name of the Henshin transformation file that shall 
	 * be used by a specific EMF model refactoring.
	 */
	protected String transformationFileName = UNSPECIFIED;

	/**
	 * Sets the the name of the Henshin transformation file that 
	 * shall be used by a specific EMF model refactoring.
	 * @param transformationFileName Name of the Henshin transformation 
	 * file that shall be used by a specific EMF model refactoring.
	 */
	public void setTransformationFileName(String transformationFileName) {
		if (transformationFileName == null 
				|| transformationFileName.isEmpty()){
			this.transformationFileName = UNSPECIFIED;
		}
		this.transformationFileName = transformationFileName;
	}

	/**
	 * @see org.eclipse.emf.refactor.henshin.core.IHenshinInformation#
	 * getTransformationFileName()
	 */
	@Override
	public String getTransformationFileName() {
		return this.transformationFileName;
	}

	/**
	 * @see org.eclipse.emf.refactor.henshin.core.IHenshinInformation#
	 * isTransformationFileSpecified()
	 */
	@Override
	public Boolean isTransformationFileSpecified() {
		return !this.transformationFileName.endsWith(UNSPECIFIED);
	}

}
