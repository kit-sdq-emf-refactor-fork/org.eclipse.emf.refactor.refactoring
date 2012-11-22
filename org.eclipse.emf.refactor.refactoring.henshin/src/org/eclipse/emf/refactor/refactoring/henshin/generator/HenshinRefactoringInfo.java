package org.eclipse.emf.refactor.refactoring.henshin.generator;

import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;

public class HenshinRefactoringInfo extends RefactoringInfo {
	
	public static final String TRAFODIR = "/transformation/";
	private final String TRANSFORMATIONDIRECTORY = "transformation/";
	private final String HENSHINEXTENSION = ".henshin";
	
	/**
	 * Name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 */
	private String checkInitialFileName;
	
	/**
	 * Name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 */
	private String checkFinalFileName;
	
	/**
	 * Name of the Henshin file used for executing the EMF model
	 * refactoring.
	 */
	private String createChangeFileName;
	
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
	 * @param createChangeFileName Name of the Henshin file used for 
	 * executing the EMF model refactoring.
	 */
	public HenshinRefactoringInfo(String projectName, String refactoringId, 
			String menuLabel, String namespaceURI, String createChangeFileName,
			String namespacePrefix, int numberOfTests) {
		super(projectName, refactoringId, menuLabel, 
				namespaceURI, namespacePrefix, numberOfTests);
		this.createChangeFileName = 
			     createChangeFileName.replaceAll(HENSHINEXTENSION, "");
		this.checkInitialFileName = "";
		this.checkFinalFileName = "";
	}
	
	/**
	 * Gets the name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 * @return Name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 */
	public String getCheckInitialFileName() {
		return checkInitialFileName;
	}

	/**
	 * Sets the name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 * @param checkInitialFileName Name of the Henshin file used for the 
	 * initial checking of the EMF model refactoring.
	 */
	public void setCheckInitialFileName(String checkInitialFileName) {
		this.checkInitialFileName = 
					checkInitialFileName.replaceAll(HENSHINEXTENSION, "");
	}

	/**
	 * Gets the name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 * @return Name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 */
	public String getCheckFinalFileName() {
		return checkFinalFileName;
	}

	/**
	 * Sets the name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 * @param checkFinalFileName Name of the Henshin file used for the final 
	 * checking of the EMF model refactoring.
	 */
	public void setCheckFinalFileName(String checkFinalFileName) {
		this.checkFinalFileName = 
					checkFinalFileName.replaceAll(HENSHINEXTENSION, "");
	}

	/**
	 * Gets the name of the Henshin file used for executing the EMF model
	 * refactoring.
	 * @return Name of the Henshin file used for executing the EMF model
	 * refactoring.
	 */
	public String getCreateChangeFileName() {
		return createChangeFileName;
	}

	/**
	 * Returns the root package name to generate the code in. This is the name
	 * of the project in lower case letters.
	 * @return Package name to generate the code in. This is the name
	 * of the project in lower case letters.
	 */
	public String getRootPackageName(){
		return this.projectName.toLowerCase();
	}
	
	/**
	 * Return the name of the transformations directory inside the plugin
	 * project.  
	 * @return Name of the transformations directory inside the plugin
	 * project.  
	 */
	public String getTransformationDirectory(){
		return TRANSFORMATIONDIRECTORY;
	}

}
