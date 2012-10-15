package org.eclipse.emf.refactor.refactoring.configuration.core;

import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.RefactoringManager;

/**
 * This class provides a container for the project-specific metric configurations.
 * 
 * @author Pawel Stepien
 */
public class Configuration {

	private IProject project;
	private boolean[] selection = null;

	/**
	 * Constructor which creates a new configuration for a given project.
	 * 
	 * @param project
	 */
	public Configuration(IProject project) {
		this.project = project;
	}

	/**
	 * Sets the metric selection for this project.
	 * This method awaits a boolean array as parameter.
	 * 
	 * @param selection
	 */
	public void setSelection(boolean[] selection) {
		this.selection = selection;
	}
	
	/**
	 * Returns the the exact date of the calculation.
	 * This method awaits a <i>LinkedList</i> containing the ID's of the selected metrics 
	 * as parameter.
	 * 
	 * @param idList
	 */
	public void setSelection(LinkedList<String> idList) {
		this.selection = getSelection(idList);
	}

	/**
	 * Returns the the project for that this configuration has been made.
	 * 
	 * @return project
	 */
	public IProject getProject() {
		return project;
	}

	/**
	 * Returns a <i>LinkedList</i> containing all refactoring selected for this project..
	 * 
	 * @return selectedMetrics
	 */
	public LinkedList<Refactoring> getSelectedRefactorings() {
		if(selection==null)
			return new LinkedList<Refactoring>();
		final int nuberOfRefactorings = RefactoringManager.getAllRefactorings().size();
		LinkedList<Refactoring> selectedRefactorings = new LinkedList<Refactoring>();
		for (int index = 0; index < nuberOfRefactorings; index++) {
			if (selection[index] == true)
				selectedRefactorings.add(RefactoringManager.getAllRefactorings().get(index));
		}
		return selectedRefactorings;
	}
	
	private boolean[] getSelection(LinkedList<String> idList){
		final LinkedList<Refactoring> allRefactorings = RefactoringManager.getAllRefactorings();
		boolean[] selection = new boolean[allRefactorings.size()];
		for(int index=0; index<selection.length; index++)
			selection[index]=false;
		int index;
		for(String id : idList){
			index = isInList(id, allRefactorings);
			if (index>=0){
				selection[index]=true;
			}
		}
		return selection;
	}
	
	private int isInList(String id, LinkedList<Refactoring> refactorings){
		for(int index=0; index < refactorings.size(); index++){
			if(refactorings.get(index).getId().equals(id))
				return index;
		}	
		return -1;
	}
	
}
