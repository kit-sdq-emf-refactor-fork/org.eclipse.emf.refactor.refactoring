package org.eclipse.emf.refactor.refactoring.configuration.managers;

import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.refactor.refactoring.configuration.core.Configuration;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.RefactoringManager;


/**
 * This class is the main controller. It provides Methods needed to coordinate all 
 * EMFMetrics system tasks. 
 * 
 * @author Pawel Stepien
 */
public class ConfigurationManager {

	private static LinkedList<Configuration> configurations;
	private static LinkedList<Refactoring> allRefactorings = null;
	
	private static ConfigurationManager instance;
	
	private ConfigurationManager() {
		configurations = new LinkedList<Configuration>();
		allRefactorings = RefactoringManager.getAllRefactorings();
		System.out.println("ConfigurationManager initialized!");
	}
	
	public static ConfigurationManager getInstance() {
		if (instance == null) {
			instance = new ConfigurationManager();
		}
		return instance;
	}
	
	private static LinkedList<Refactoring> getAllRefactorings() {
		if (allRefactorings == null)
			allRefactorings = RefactoringManager.getAllRefactorings();
		return allRefactorings;
	}		
	
	/**
	 * Saves the actual Refactoring configuration for a given project into a File.
	 * 
	 * @param project
	 */
	public static void saveConfiguration(IProject project) {
		XMLProjectFileManager.saveConfiguration(getConfiguration(project));
	}
	
	private static Configuration loadConfiguration(IProject project) {
		return XMLProjectFileManager.loadConfiguration(project);
	}
	
	/**
	 * Returns a LinkedList containing all selected Refactorings for a given project.
	 * 
	 * @param project
	 * 
	 * @return selectedRefactorings
	 */
	public static LinkedList<Refactoring> getSelectedRefactorings(IProject project){
		Configuration configuration = getConfiguration(project);
		return configuration.getSelectedRefactorings();
	}
	
	/**
	 * Saves a Refactoring selection for a given project.
	 * 
	 * @param project
	 * @param Refactorings selection
	 */
	public static void setConfiguration(IProject project, boolean[] selection){
		Configuration configuration = getConfiguration(project);
		configuration.setSelection(selection);
	}

	public static Configuration getConfiguration(IProject project) {
		Configuration configuration = null;
		if(! configurations.isEmpty()) {
			for (Configuration tempConfiguration : configurations) {
				if (tempConfiguration.getProject().equals(project))
					configuration = tempConfiguration;
			}
		}
		if(configuration == null) {
			configuration = loadConfiguration(project);
		}
		if(configuration == null) {
			configuration = new Configuration(project);	
			LinkedList<String> refactoringIdList = new LinkedList<String>();
			if (allRefactorings == null) getAllRefactorings();
			for (Refactoring refactoring : allRefactorings) {
				refactoringIdList.add(refactoring.getId());
				System.out.println("add: " + refactoring.getId());
			}
			configuration.setSelection(refactoringIdList);
		}
		configurations.add(configuration);
		return configuration;
	}

}
