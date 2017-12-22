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
 * A representation of the model object '<em><b>Sequential Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.SequentialUnit#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.SequentialUnit#getRefactoringUnits <em>Refactoring Units</em>}</li>
 *   <li>{@link comrel.SequentialUnit#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link comrel.SequentialUnit#isStrict <em>Strict</em>}</li>
 *   <li>{@link comrel.SequentialUnit#getType <em>Type</em>}</li>
 *   <li>{@link comrel.SequentialUnit#getLblStrict <em>Lbl Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getSequentialUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type,lblStrict' label.pattern='{0}:{1} -{2}-'"
 * @generated
 */
public interface SequentialUnit extends CompositeUnit {
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
	 * @see comrel.ComrelPackage#getSequentialUnit_HelperUnits()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<HelperUnit> getHelperUnits();

	/**
	 * Returns the value of the '<em><b>Refactoring Units</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.RefactoringUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refactoring Units</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refactoring Units</em>' containment reference list.
	 * @see comrel.ComrelPackage#getSequentialUnit_RefactoringUnits()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<RefactoringUnit> getRefactoringUnits();

	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.InputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see comrel.ComrelPackage#getSequentialUnit_InputPorts()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<InputPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(boolean)
	 * @see comrel.ComrelPackage#getSequentialUnit_Strict()
	 * @model default="true"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link comrel.SequentialUnit#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Sequential Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getSequentialUnit_Type()
	 * @model default="Sequential Unit" changeable="false"
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
	 * @see comrel.ComrelPackage#getSequentialUnit_LblStrict()
	 * @model default="strict"
	 * @generated
	 */
	String getLblStrict();

	/**
	 * Sets the value of the '{@link comrel.SequentialUnit#getLblStrict <em>Lbl Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lbl Strict</em>' attribute.
	 * @see #getLblStrict()
	 * @generated
	 */
	void setLblStrict(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateSeqExecutionOrder();

} // SequentialUnit
