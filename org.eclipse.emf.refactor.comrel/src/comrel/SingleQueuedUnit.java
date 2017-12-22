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
 * A representation of the model object '<em><b>Single Queued Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.SingleQueuedUnit#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.SingleQueuedUnit#getRefactoringUnit <em>Refactoring Unit</em>}</li>
 *   <li>{@link comrel.SingleQueuedUnit#getSingleInputPorts <em>Single Input Ports</em>}</li>
 *   <li>{@link comrel.SingleQueuedUnit#getMultiInputPort <em>Multi Input Port</em>}</li>
 *   <li>{@link comrel.SingleQueuedUnit#getType <em>Type</em>}</li>
 *   <li>{@link comrel.SingleQueuedUnit#getLblStrict <em>Lbl Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getSingleQueuedUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type,lblStrict' label.pattern='{0}:{1} -{2}-'"
 * @generated
 */
public interface SingleQueuedUnit extends QueuedUnit {
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
	 * @see comrel.ComrelPackage#getSingleQueuedUnit_HelperUnits()
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
	 * @see comrel.ComrelPackage#getSingleQueuedUnit_RefactoringUnit()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	RefactoringUnit getRefactoringUnit();

	/**
	 * Sets the value of the '{@link comrel.SingleQueuedUnit#getRefactoringUnit <em>Refactoring Unit</em>}' containment reference.
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
	 * @see comrel.ComrelPackage#getSingleQueuedUnit_SingleInputPorts()
	 * @model containment="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<SingleInputPort> getSingleInputPorts();

	/**
	 * Returns the value of the '<em><b>Multi Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Input Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Input Port</em>' containment reference.
	 * @see #setMultiInputPort(MultiInputPort)
	 * @see comrel.ComrelPackage#getSingleQueuedUnit_MultiInputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	MultiInputPort getMultiInputPort();

	/**
	 * Sets the value of the '{@link comrel.SingleQueuedUnit#getMultiInputPort <em>Multi Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Input Port</em>' containment reference.
	 * @see #getMultiInputPort()
	 * @generated
	 */
	void setMultiInputPort(MultiInputPort value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Single Queued Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getSingleQueuedUnit_Type()
	 * @model default="Single Queued Unit" changeable="false"
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
	 * @see comrel.ComrelPackage#getSingleQueuedUnit_LblStrict()
	 * @model default="strict"
	 * @generated
	 */
	String getLblStrict();

	/**
	 * Sets the value of the '{@link comrel.SingleQueuedUnit#getLblStrict <em>Lbl Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Strict</em>' attribute.
	 * @see #getLblStrict()
	 * @generated
	 */
	void setLblStrict(String value);

} // SingleQueuedUnit
