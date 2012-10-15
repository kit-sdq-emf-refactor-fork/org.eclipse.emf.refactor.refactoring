package org.eclipse.emf.refactor.refactoring.configuration.core;

import java.util.LinkedList;

import org.eclipse.emf.refactor.refactoring.core.Refactoring;

/**
 * Helper class for the property page providing a sorted list of the installed smells to be used
 * <br>- by the pages table.
 * 
 * @author Matthias Burhenne
 *
 */

public class SortedRefactoringList {
	private LinkedList<LinkedList<Refactoring>> refactoringList;

	public SortedRefactoringList(LinkedList<Refactoring> rawRefactoringList) {
		refactoringList = new LinkedList<LinkedList<Refactoring>>();
		for (int position = 0; position < rawRefactoringList.size(); position++) {
			addRefactoringToList(rawRefactoringList.get(position));
		}
	}

	public int getSize() {
		return refactoringList.size();
	}
	
	public LinkedList<Refactoring> get(int index){
		return refactoringList.get(index);
	}
	
	public LinkedList<LinkedList<Refactoring>> getRefactoringList() {
		return refactoringList;
	}

	private void addRefactoringToList(Refactoring refactoring) {
		final String metamodel = refactoring.getNamespaceUri();
		LinkedList<Refactoring> list = getMetamodelList(metamodel);
		if (list == null) {
			list = new LinkedList<Refactoring>();
			refactoringList.add(list);
		}
		list.add(refactoring);
	}

	public LinkedList<Refactoring> getMetamodelList(String metamodel) {
		for (LinkedList<Refactoring> list : refactoringList) {
			if (list.get(0).getNamespaceUri().equals(metamodel))
				return list;
		}
		return null;
	}
}
