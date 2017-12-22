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
 * A representation of the model object '<em><b>Cartesian Queued Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.CartesianQueuedUnit#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.CartesianQueuedUnit#getRefactoringUnit <em>Refactoring Unit</em>}</li>
 *   <li>{@link comrel.CartesianQueuedUnit#getSingleInputPorts <em>Single Input Ports</em>}</li>
 *   <li>{@link comrel.CartesianQueuedUnit#getMultiInputPorts <em>Multi Input Ports</em>}</li>
 *   <li>{@link comrel.CartesianQueuedUnit#getType <em>Type</em>}</li>
 *   <li>{@link comrel.CartesianQueuedUnit#getLblStrict <em>Lbl Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getCartesianQueuedUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type,lblStrict' label.pattern='{0}:{1} -{2}-'"
 * @generated
 */
public interface CartesianQueuedUnit extends TwicedQueuedUnit {
	/**
	 * Returns the value of the '<em><b>Helper Units</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.HelperUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper Units</em>' containment reference list.
	 * @see comrel.ComrelPackage#getCartesianQueuedUnit_HelperUnits()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<HelperUnit> getHelperUnits();

	/**
	 * Returns the value of the '<em><b>Refactoring Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactoring Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring Unit</em>' containment reference.
	 * @see #setRefactoringUnit(RefactoringUnit)
	 * @see comrel.ComrelPackage#getCartesianQueuedUnit_RefactoringUnit()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	RefactoringUnit getRefactoringUnit();

	/**
	 * Sets the value of the '{@link comrel.CartesianQueuedUnit#getRefactoringUnit <em>Refactoring Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refactoring Unit</em>' containment reference.
	 * @see #getRefactoringUnit()
	 * @generated
	 */
	void setRefactoringUnit(RefactoringUnit value);

	/**
	 * Returns the value of the '<em><b>Single Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.SingleInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Input Ports</em>' containment reference list.
	 * @see comrel.ComrelPackage#getCartesianQueuedUnit_SingleInputPorts()
	 * @model containment="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<SingleInputPort> getSingleInputPorts();

	/**
	 * Returns the value of the '<em><b>Multi Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.MultiInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Input Ports</em>' containment reference list.
	 * @see comrel.ComrelPackage#getCartesianQueuedUnit_MultiInputPorts()
	 * @model containment="true" lower="2" upper="2"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<MultiInputPort> getMultiInputPorts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Cartesian Queued Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getCartesianQueuedUnit_Type()
	 * @model default="Cartesian Queued Unit" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Lbl Strict</b></em>' attribute.
	 * The default value is <code>"strict"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lbl Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lbl Strict</em>' attribute.
	 * @see #setLblStrict(String)
	 * @see comrel.ComrelPackage#getCartesianQueuedUnit_LblStrict()
	 * @model default="strict"
	 * @generated
	 */
	String getLblStrict();

	/**
	 * Sets the value of the '{@link comrel.CartesianQueuedUnit#getLblStrict <em>Lbl Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Strict</em>' attribute.
	 * @see #getLblStrict()
	 * @generated
	 */
	void setLblStrict(String value);

} // CartesianQueuedUnit
