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

import java.util.SortedSet;
import java.util.TreeSet;

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
	private final SortedSet<Refactoring> refactorings = 
									new TreeSet<Refactoring>();
	
	/**
	 * Private constructor.
	 */
	private RefactoringManager() {	
		this.refactorings.addAll(RefactoringLoader.loadRefactorings());
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
	public SortedSet<Refactoring> getRefactorings() {
		return refactorings;
	}
	
}
