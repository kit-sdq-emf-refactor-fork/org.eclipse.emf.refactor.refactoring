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

import java.util.ArrayList;
import java.util.List;

/**
 * Class for a model refactoring configuration used to generate code from.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class RefactoringInfo {
	
	/**
	 * Name of the project the model refactoring code has to be generated to.
	 */
	protected String projectName;
	
	/**
	 * Id of the model refactoring that has to be generated.
	 */
	private String refactoringId;
	
	/**
	 * The label that shall appear before applying the model refactoring.
	 */
	private String menuLabel;
	
	/**
	 * Namespace of the models the model refactoring has to be generated for.
	 */
	private String namespaceUri;
	
	/**
	 * Class of the model element that will be the selected EObject when
	 * applying the refactoring (context). Used in JET templates.
	 */
	private String selectedEObjectClass;	

	/**
	 * Jar file owning the class specified in 'selectedEObjectClass'.
	 */
	private String selectedEObjectJar;	
	
	/**
	 * Name of the Controller class of the model refactoring specified in 
	 * the extension point (default value: "RefactoringController").
	 */
	private String controller;
	
	/**
	 * Name of the GuiHandler class of the model refactoring specified in 
	 * the extension point (default value: "RefactoringGuiHandler").
	 */
	private String guiHandler;
	
	/**
	 * List of parameters of the model refactoring to be generated.
	 */
	private List<ParameterInfo> parameters;

	/**
	 * Name of the package the model refactoring code has to be 
	 * generated into.
	 */
	private String packageName;
	
	/**
	 * Namespace prefix of the models the model refactoring has to be generated for.
	 */
	private String namespacePrefix;
	 
	/**
	 * Name of the meta model the model refactoring has to be generated for.
	 */
	private String metaModelName;
	
	/**
	 * Number of tests to be generated for the model refactoring.
	 */
	private int numberOfTests;
	
	/**
	 * Default constructor (private).
	 */
	public RefactoringInfo(){
		this.controller = "RefactoringController";
		this.guiHandler  = "RefactoringGuiHandler";
		this.parameters = new ArrayList<ParameterInfo>();
	}

	/**
	 * Constructor used for existing model refactorings.
	 * @param controller Controller class of the model refactoring 
	 * specified in the extension point.
	 * @param guiHandler GuiHandler class of the model refactoring 
	 * specified in the extension point.
	 * @param refactoringId Id of the model refactoring specified 
	 * in the extension point.
	 * @param menuLabel Menu label of the model refactoring 
	 * specified in the extension point.
	 * @param namespaceURI Namespace of the model refactoring 
	 * specified in the extension point.
	 */
	public RefactoringInfo(String controller, String guiHandler, 
			String refactoringId, String menuLabel, String namespaceURI) {
		this();
		this.controller = controller;
		this.guiHandler = guiHandler;
		this.refactoringId = refactoringId;
		this.menuLabel = menuLabel;
		this.namespaceUri = namespaceURI;
	}
	
	/**
	 * Constructor used for the new model refactoring to be generated.
	 * @param projectName Name of the project the model refactoring code 
	 * has to be generated to.
	 * @param refactoringId Id of the model refactoring that has to be 
	 * generated.
	 * @param menuLabel The label that shall appear before applying the 
	 * model refactoring.
	 * @param namespaceURI Namespace of the models the model refactoring 
	 * has to be generated for.
	 * @param namespacePrefix 
	 * @param numberOfTests 
	 */
	public RefactoringInfo(String projectName, String refactoringId, 
			String menuLabel, String namespaceURI, 
			String namespacePrefix, int numberOfTests) {
		this();
		this.projectName = projectName;
		this.refactoringId = refactoringId;
		this.menuLabel = menuLabel;
		this.namespaceUri = namespaceURI;
		this.packageName = projectName.toLowerCase().replaceAll(" ", "_") 
								+ "." + refactoringId.toLowerCase();
		this.namespacePrefix = namespacePrefix;
		this.numberOfTests = numberOfTests;
	}
	
	/**
	 * Constructor used for the new model refactoring to be generated.
	 * @param projectName Name of the project the model refactoring code 
	 * has to be generated to.
	 * @param refactoringId Id of the model refactoring that has to be 
	 * generated.
	 * @param menuLabel The label that shall appear before applying the 
	 * model refactoring.
	 * @param namespaceURI Namespace of the models the model refactoring 
	 * has to be generated for.
	 * @param namespacePrefix 
	 * @param numberOfTests 
	 */
	public RefactoringInfo(String projectName, String refactoringId, 
			String menuLabel, String namespaceURI) {
		this();
		this.projectName = projectName;
		this.refactoringId = refactoringId;
		this.menuLabel = menuLabel;
		this.namespaceUri = namespaceURI;
		this.packageName = projectName.toLowerCase().replaceAll(" ", "_") 
								+ "." + refactoringId.toLowerCase();
	}	
	
	/**
	 * Sets the list of parameters of the model refactoring to be 
	 * generated.
	 * @param params List of parameters of the model refactoring to be 
	 * generated.
	 */
	public void setParameters(List<ParameterInfo> params){
		this.parameters = params;
	}
	
	/**
	 * Gets the list of parameters of the model refactoring to be 
	 * generated.
	 * @return List of parameters of the model refactoring to be 
	 * generated.
	 */
	public List<ParameterInfo> getParameters() {
		return parameters;
	}
	
	/**
	 * Gets the name of the project the model refactoring code 
	 * has to be generated to.
	 * @return Name of the project the model refactoring code 
	 * has to be generated to.
	 */
	public String getProjectName() {
		return projectName;
	}
	
	/**
	 * Gets the id of the model refactoring that has to be 
	 * generated.
	 * @return Id of the model refactoring that has to be 
	 * generated.
	 */
	public String getRefactoringId() {
		return refactoringId;
	}

	/**
	 * Gets the label that shall appear before applying the 
	 * model refactoring.
	 * @return Label that shall appear before applying the 
	 * model refactoring.
	 */
	public String getMenuLabel() {
		return menuLabel;
	}

	/**
	 * Gets the namespace of the models the model refactoring 
	 * has to be generated for.
	 * @return Namespace of the models the model refactoring 
	 * has to be generated for.
	 */
	public String getNamespaceUri() {
		return namespaceUri;
	}

	/**
	 * Sets the class of the model element that will be the 
	 * selected EObject when applying the refactoring (context).
	 * @param selectedEObjectClass Class of the model element 
	 * that will be the selected EObject when applying the 
	 * refactoring (context).
	 */
	public void setSelectedEObjectClass(String selectedEObjectClass) {
		this.selectedEObjectClass = selectedEObjectClass;
	}
	
	/**
	 * Gets the class of the model element that will be the 
	 * selected EObject when applying the refactoring (context).
	 * @return Class of the model element that will be the selected 
	 * EObject when applying the refactoring (context).
	 */
	public String getSelectedEObjectClass() {
		return selectedEObjectClass;
	}

	/**
	 * Gets the jar file owning the class specified in 
	 * 'selectedEObjectClass'.
	 * @return Jar file owning the class specified in 
	 * 'selectedEObjectClass'.
	 */
	public String getJar() {
		return selectedEObjectJar;
	}

	/**
	 * Sets the jar file owning the class specified in 
	 * 'selectedEObjectClass'.
	 * @param selectedEObjectJar Jar file owning the class specified in 
	 * 'selectedEObjectClass'.
	 */
	public void setSelectedEObjectJar(String selectedEObjectJar) {
		this.selectedEObjectJar = selectedEObjectJar;
	}
	
	/**
	 * Gets the name of the GuiHandler class of the model refactoring 
	 * specified in the extension point.
	 * @return Name of the GuiHandler class of the model refactoring 
	 * specified in the extension point.
	 */
	public String getGuiHandler() {
		return guiHandler;
	}
	
	/**
	 * Gets the name of the Controller class of the model refactoring 
	 * specified in the extension point.
	 * @return Name of the Controller class of the model refactoring 
	 * specified in the extension point.
	 */
	public String getController(){
		return this.controller;
	}
	
	/**
	 * Gets the name of the package the model refactoring code 
	 * has to be generated into.
	 * @return Name of the package the model refactoring code 
	 * has to be generated into.
	 */
	public String getPackageName(){
		return packageName;
	}
	
	/**
	 * Gets the namespace prefix of the models the model
	 * refactoring has to be generated for.
	 * @return Namespace prefix of the models the model
	 * refactoring has to be generated for.
	 */
	public String getNamespacePrefix() {
		return namespacePrefix;
	}
	 
	/**
	 * Gets the name of the meta model the model refactoring
	 * has to be generated for.
	 * @return Name of the meta model the model refactoring
	 * has to be generated for.
	 */
	public String getMetaModelName() {
		return metaModelName;
	}
	 
	/**
	 * Sets the name of the meta model the model refactoring
	 * has to be generated for.
	 * @param metaModelName Name of the meta model the model refactoring
	 * has to be generated for.
	 */
	public void setMetaModelName(String metaModelName) {
		this.metaModelName = metaModelName;
	}
	 
	/**
	 * Builds the correctly capitalized meta model name from the given
	 * lower case meta model name.
	 * @param metaModelName Name of the meta model the model refactoring
	 * has to be generated for.
	 * @return Correctly capitalized name of the meta model the model
	 * refactoring has to be generated for.
	 */
//	private String buildMetaModelName(String metaModelName) {
//		String result = metaModelName
//						.substring(metaModelName.lastIndexOf('.'));
//		result = result.substring(1, result.lastIndexOf("PackageImpl"));
//		return result;
//	}
	
	/**
	 * Gets the numbers of tests to be generated for the model refactoring.
	 * @return Number of tests to be generated for the model refactoring
	 */
	public int getNumberOfTests(){
		return numberOfTests;
	}

	@Override
	public String toString() {
		return "RefactoringInfo [projectName=" + projectName
				+ ", refactoringId=" + refactoringId + ", menuLabel="
				+ menuLabel + ", namespaceUri=" + namespaceUri
				+ ", selectedEObjectClass=" + selectedEObjectClass
				+ ", selectedEObjectJar=" + selectedEObjectJar
				+ ", controller=" + controller + ", guiHandler=" + guiHandler
				+ ", parameters=" + parameters + ", packageName=" + packageName
				+ ", namespacePrefix=" + namespacePrefix + ", metaModelName="
				+ metaModelName + ", numberOfTests=" + numberOfTests + "]";
	}
	
	
}
