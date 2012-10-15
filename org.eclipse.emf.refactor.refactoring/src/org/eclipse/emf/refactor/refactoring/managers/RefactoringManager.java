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
package org.eclipse.emf.refactor.refactoring.managers;

import java.util.LinkedList;

import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.core.RefactoringLoader;

/**
 * Main manager class of EMF Refactor wrt model refactorings.
 * @generated NOT
 * @author Florian Mantz
 */
public final class RefactoringManager {
	
	/**
	 * Singleton instance. 
	 */
	private static RefactoringManager instance;
		
	/**
	 * Set of all registered emf model refactorings. 
	 */
	private static LinkedList<Refactoring> refactorings = null;
	
	/**
	 * Private constructor.
	 */
	private RefactoringManager() {	
		refactorings = RefactoringLoader.loadRefactorings();
		System.out.println("RefactoringManager initialized!");
	}
	
	/**
	 * Returns the singleton instance.
	 * @return
	 */
	public static RefactoringManager getInstance() {
		if(null == instance ) {
			instance = new RefactoringManager();
		}
		return instance;
	}
	
	/**
	 * Gets a set of all registered emf model refactorings. 
	 * @return Set of all registered emf model refactorings. 
	 */
	public static LinkedList<Refactoring> getAllRefactorings() {
		return refactorings;
	}
	
	/**
	 * Returns the emf model refactoring with the specified id.
	 * @param id Id of the emf model refactoring to be returned.
	 * @return Emf model refactoring with the specified id.
	 */
	public static Refactoring getById(String id){
		for (Refactoring r : refactorings){
			if(r.getId().equals(id)) {
				return r;
			}
		}
		throw 
			new IllegalArgumentException("Refactoring id does not exist!");
	}
	
}
