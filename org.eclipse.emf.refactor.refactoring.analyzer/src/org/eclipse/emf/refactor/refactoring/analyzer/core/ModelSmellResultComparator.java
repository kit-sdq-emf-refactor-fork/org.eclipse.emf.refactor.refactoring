package org.eclipse.emf.refactor.refactoring.analyzer.core;

import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.refactor.smells.core.ModelSmell;
import org.eclipse.emf.refactor.smells.runtime.core.Result;

/**
 * Utility class providing functionality to compare the results of two model smell searches.
 * 
 * @author Matthias Burhenne
 *
 */
public class ModelSmellResultComparator {
	
	/**
	 * Compares the two lists of Result objects and creates a wrapping CompareResult with the numbers of occurences
	 * 
	 * @param resultsFromOriginalModel - Map<ModelSmell, Integer> the number of search results before the change
	 * @param resultsFromChangedModel - Map<ModelSmell, Integer> the number of search results after the change
	 * @return CompareResult
	 */
	public static CompareResult compareModelSmellSearchResults(List<Result> resultsFromOriginalModel, List<Result> resultsFromChangedModel){
		HashMap<ModelSmell, Integer> occurencesInOriginalModel = new HashMap<ModelSmell, Integer>();
		HashMap<ModelSmell, Integer> occurencesInChangedModel = new HashMap<ModelSmell, Integer>();
		
		for(Result result : resultsFromOriginalModel){
			occurencesInOriginalModel.put(result.getSmell(), result.getModelelements().size());
		}

		for(Result result : resultsFromChangedModel){
			occurencesInChangedModel.put(result.getSmell(), result.getModelelements().size());
		}
		
		return new CompareResult(occurencesInOriginalModel, occurencesInChangedModel);
	}
}
