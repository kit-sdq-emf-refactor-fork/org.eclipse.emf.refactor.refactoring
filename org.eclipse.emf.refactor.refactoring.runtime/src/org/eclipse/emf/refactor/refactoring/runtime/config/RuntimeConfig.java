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
package org.eclipse.emf.refactor.refactoring.runtime.config;

import org.eclipse.core.resources.IProject;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;

/**
 * Configuration class of the runtime module of EMF Refactor.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class RuntimeConfig {
	
	/**
	 * Flag for supporting EMF model refactoring on GMF generated 
	 * graphical editors. Default = true.
	 * TODO Configurable in Settings:
	 */
	private boolean supportGmfDiagramEditors = true;
	
	/**
	 * Flag for indicating whether the namespaceUri of the model
	 * has to be checked against the namespaceUri of the EMF model
	 * refactoring. Default = true.
	 * TODO Configurable in Settings:
	 */
	private boolean checkEmfVersion = true;
	
	/**
	 * Returns whether the namespaceUri of the model has to be checked 
	 * against the namespaceUri of the EMF model refactoring.
	 * @return true if the namespaceUri of the model has to be checked 
	 * against the namespaceUri of the EMF model refactoring, false
	 * otherwise.
	 */
	public boolean isCheckEmfVersion() {
		return checkEmfVersion;
	}

	/**
	 * Sets whether the namespaceUri of the model has to be checked 
	 * against the namespaceUri of the EMF model refactoring.
	 * @param checkEmfVersion Flag for indicating whether the namespaceUri 
	 * of the model has to be checked against the namespaceUri of the EMF 
	 * model refactoring.
	 */
	public void setCheckEmfVersion(boolean checkEmfVersion) {
		this.checkEmfVersion = checkEmfVersion;
	}
	
	/**
	 * Returns whether GMF generated graphical editors are supported
	 * by EMF model refactorings.
	 * @return true if GMF generated graphical editors are supported,
	 * false otherwise.
	 */
	public boolean isSupportGmfDiagramEditors() {
		return supportGmfDiagramEditors;
	}

	/**
	 * Sets whether GMF generated graphical editors shall be supported
	 * by EMF model refactorings.
	 * @param supportUML2Tools Flag for supporting EMF model refactorings 
	 * on GMF generated graphical editors.
	 */
	public void setSupportGmfDiagramEditors(boolean supportUML2Tools) {
		this.supportGmfDiagramEditors = supportUML2Tools;
	}
	
	/**
	 * Static method that returns the project in the workspace
	 * according to the actual editor in the workbench. 
	 * @return Project in the workspace according to the actual 
	 * editor in the workbench. 
	 */
	@SuppressWarnings("finally")
	public static IProject getActualProject(){
		IProject actualProject = null;
		IWorkbenchWindow window = 
						PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		try {
			IEditorPart  editorPart = window.getActivePage().getActiveEditor();
			if ( editorPart != null ) {
				IEditorInput input = editorPart.getEditorInput();
				if (input instanceof IFileEditorInput) {
					IFileEditorInput fileInput = (IFileEditorInput) input;
					actualProject = fileInput.getFile().getProject();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return actualProject;
		}
	}
	
	/**
	 * Checks whether the given class has the given name or whether one
	 * of its interfaces has the given name. This method is expensive! 
	 * Do not use it to often!
	 * @param cl Class to be checked.
	 * @param iname Name to be checked.
	 * @param isInterface Flag that indicates that the given name is a
	 * name of an interface.
	 * @return true if the given class has the given name or if one
	 * of its interfaces has the given name, false otherwise.
	 */
	public static boolean checkIsTypeOf
					(Class<?> cl, String iname, boolean isInterface){
		Class<?> superclass = null;
		if(cl.getName().equals(iname)){
			return true;
		}else if(isInterface){
			for(Class<?> c:cl.getInterfaces()){
				if(checkIsTypeOf(c, iname, isInterface)){
					return true;
				}
			}
		}
		if(null != (superclass = cl.getSuperclass())){
			return checkIsTypeOf(superclass, iname, isInterface);
		}else{
			return false;
		}
	}

}
