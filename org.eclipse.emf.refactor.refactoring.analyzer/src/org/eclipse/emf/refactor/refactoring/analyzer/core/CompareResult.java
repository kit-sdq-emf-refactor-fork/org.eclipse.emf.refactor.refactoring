package org.eclipse.emf.refactor.refactoring.analyzer.core;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.refactor.smells.core.ModelSmell;

/**
 * Data class representing the result of comparing two ResultModels during a quantitative analysis.
 * The data is comprise of Maps containing counts of smell occurences which can be compared.
 * 
 * @author Matthias Burhenne
 *
 */
public class CompareResult {
	
	private final HashMap<ModelSmell, Integer> occurencesInOriginalModel;
	private final HashMap<ModelSmell, Integer> occurencesInChangedModel;
	
	CompareResult(HashMap<ModelSmell, Integer> occurencesInOriginalModel, HashMap<ModelSmell, Integer> occurencesInChangedModel){
		this.occurencesInOriginalModel = occurencesInOriginalModel;
		this.occurencesInChangedModel = occurencesInChangedModel;
	}

	/**
	 * Getter for the field occurencesInOriginalModel
	 * 
	 * @return - Map<ModelSmell, Integer>
	 */
	public HashMap<ModelSmell, Integer> getOccurencesInOriginalModel() {
		return occurencesInOriginalModel;
	}

	/**
	 * Getter for the field occurencesInChangedModel
	 * 
	 * @return - Map<ModelSmell, Integer>
	 */
	public HashMap<ModelSmell, Integer> getOccurencesInChangedModel() {
		return occurencesInChangedModel;
	}
	
	/**
	 * Compares the numbers of occurences in the original model and the changed model
	 * and returns the differences as a map
	 * 
	 * @return - Map<ModelSmell, Integer>
	 */
	public Map<ModelSmell, Integer> getDifferences(){
		HashMap<ModelSmell, Integer> result = new HashMap<ModelSmell, Integer>();
		for(ModelSmell smell : occurencesInOriginalModel.keySet()){
			Integer numberInOriginal = occurencesInOriginalModel.get(smell);
			Integer numberInChanged = occurencesInChangedModel.get(smell);
			if(numberInChanged != null){
				result.put(smell, numberInChanged - numberInOriginal);
			}else{
				result.put(smell, 0 - numberInOriginal);
			}
		}
		return result;
	}
	
}
