/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Refactoring Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.RefactoringUnit#getSeqExecutionOrder <em>Seq Execution Order</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getRefactoringUnit()
 * @model abstract="true"
 * @generated
 */
public interface RefactoringUnit extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq Execution Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq Execution Order</em>' attribute.
	 * @see #setSeqExecutionOrder(int)
	 * @see comrel.ComrelPackage#getRefactoringUnit_SeqExecutionOrder()
	 * @model
	 * @generated
	 */
	int getSeqExecutionOrder();

	/**
	 * Sets the value of the '{@link comrel.RefactoringUnit#getSeqExecutionOrder <em>Seq Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Execution Order</em>' attribute.
	 * @see #getSeqExecutionOrder()
	 * @generated
	 */
	void setSeqExecutionOrder(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<InputPort> getAllInputPorts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSeqExecutionOrder(int seqExecutionOrder, boolean superCall);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName(String newName, boolean updateContainer);
	
	public RoundedRectangle getFigure();

	public void setFigure(RoundedRectangle figure);

} // RefactoringUnit
