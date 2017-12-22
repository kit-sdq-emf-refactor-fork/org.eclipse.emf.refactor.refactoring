/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comrel.ComrelPackage#getCompositeUnit()
 * @model abstract="true"
 * @generated
 */
public interface CompositeUnit extends RefactoringUnit {
	
	EList<HelperUnit> getHelperUnits();
	
} // CompositeUnit
