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
 * A representation of the model object '<em><b>Conditional Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.ConditionalUnit#getIf <em>If</em>}</li>
 *   <li>{@link comrel.ConditionalUnit#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.ConditionalUnit#getThen <em>Then</em>}</li>
 *   <li>{@link comrel.ConditionalUnit#getElse <em>Else</em>}</li>
 *   <li>{@link comrel.ConditionalUnit#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link comrel.ConditionalUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getConditionalUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type' label.pattern='{0}:{1}'"
 * @generated
 */
public interface ConditionalUnit extends CompositeUnit {
	/**
	 * Returns the value of the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>If</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If</em>' containment reference.
	 * @see #setIf(ConditionCheck)
	 * @see comrel.ComrelPackage#getConditionalUnit_If()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	ConditionCheck getIf();

	/**
	 * Sets the value of the '{@link comrel.ConditionalUnit#getIf <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>If</em>' containment reference.
	 * @see #getIf()
	 * @generated
	 */
	void setIf(ConditionCheck value);

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
	 * @see comrel.ComrelPackage#getConditionalUnit_HelperUnits()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	EList<HelperUnit> getHelperUnits();

	/**
	 * Returns the value of the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Then</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then</em>' containment reference.
	 * @see #setThen(RefactoringUnit)
	 * @see comrel.ComrelPackage#getConditionalUnit_Then()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	RefactoringUnit getThen();

	/**
	 * Sets the value of the '{@link comrel.ConditionalUnit#getThen <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then</em>' containment reference.
	 * @see #getThen()
	 * @generated
	 */
	void setThen(RefactoringUnit value);

	/**
	 * Returns the value of the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Else</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else</em>' containment reference.
	 * @see #setElse(RefactoringUnit)
	 * @see comrel.ComrelPackage#getConditionalUnit_Else()
	 * @model containment="true"
	 *        annotation="gmf.compartment foo='bar'"
	 * @generated
	 */
	RefactoringUnit getElse();

	/**
	 * Sets the value of the '{@link comrel.ConditionalUnit#getElse <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else</em>' containment reference.
	 * @see #getElse()
	 * @generated
	 */
	void setElse(RefactoringUnit value);

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
	 * @see comrel.ComrelPackage#getConditionalUnit_InputPorts()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<InputPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Conditional Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getConditionalUnit_Type()
	 * @model default="Conditional Unit" changeable="false"
	 * @generated
	 */
	String getType();

} // ConditionalUnit
