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
 * A representation of the model object '<em><b>Atomic Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.AtomicUnit#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link comrel.AtomicUnit#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link comrel.AtomicUnit#getLabel <em>Label</em>}</li>
 *   <li>{@link comrel.AtomicUnit#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link comrel.AtomicUnit#getType <em>Type</em>}</li>
 *   <li>{@link comrel.AtomicUnit#getModelRefactoring <em>Model Refactoring</em>}</li>
 *   <li>{@link comrel.AtomicUnit#isCheckInitialConditionFlag <em>Check Initial Condition Flag</em>}</li>
 *   <li>{@link comrel.AtomicUnit#isCheckFinalConditionFlag <em>Check Final Condition Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getAtomicUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='label,type' label.pattern='{0}:{1}'"
 * @generated
 */
public interface AtomicUnit extends RefactoringUnit {
	/**
	 * Returns the value of the '<em><b>Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.SingleInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ports</em>' containment reference list.
	 * @see comrel.ComrelPackage#getAtomicUnit_InputPorts()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<SingleInputPort> getInputPorts();

	/**
	 * Returns the value of the '<em><b>Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Id</em>' attribute.
	 * @see #setUnitId(String)
	 * @see comrel.ComrelPackage#getAtomicUnit_UnitId()
	 * @model required="true"
	 * @generated
	 */
	String getUnitId();

	/**
	 * Sets the value of the '{@link comrel.AtomicUnit#getUnitId <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Id</em>' attribute.
	 * @see #getUnitId()
	 * @generated
	 */
	void setUnitId(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see comrel.ComrelPackage#getAtomicUnit_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link comrel.AtomicUnit#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace Uri</em>' attribute.
	 * @see #setNamespaceUri(String)
	 * @see comrel.ComrelPackage#getAtomicUnit_NamespaceUri()
	 * @model required="true"
	 * @generated
	 */
	String getNamespaceUri();

	/**
	 * Sets the value of the '{@link comrel.AtomicUnit#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Atomic Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getAtomicUnit_Type()
	 * @model default="Atomic Unit" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Model Refactoring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Refactoring</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Refactoring</em>' reference.
	 * @see #setModelRefactoring(ModelRefactoring)
	 * @see comrel.ComrelPackage#getAtomicUnit_ModelRefactoring()
	 * @model required="true"
	 * @generated
	 */
	ModelRefactoring getModelRefactoring();

	/**
	 * Sets the value of the '{@link comrel.AtomicUnit#getModelRefactoring <em>Model Refactoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Refactoring</em>' reference.
	 * @see #getModelRefactoring()
	 * @generated
	 */
	void setModelRefactoring(ModelRefactoring value);

	/**
	 * Returns the value of the '<em><b>Check Initial Condition Flag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Initial Condition Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Initial Condition Flag</em>' attribute.
	 * @see #setCheckInitialConditionFlag(boolean)
	 * @see comrel.ComrelPackage#getAtomicUnit_CheckInitialConditionFlag()
	 * @model default="false"
	 * @generated
	 */
	boolean isCheckInitialConditionFlag();

	/**
	 * Sets the value of the '{@link comrel.AtomicUnit#isCheckInitialConditionFlag <em>Check Initial Condition Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Initial Condition Flag</em>' attribute.
	 * @see #isCheckInitialConditionFlag()
	 * @generated
	 */
	void setCheckInitialConditionFlag(boolean value);

	/**
	 * Returns the value of the '<em><b>Check Final Condition Flag</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Final Condition Flag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Final Condition Flag</em>' attribute.
	 * @see #setCheckFinalConditionFlag(boolean)
	 * @see comrel.ComrelPackage#getAtomicUnit_CheckFinalConditionFlag()
	 * @model default="false"
	 * @generated
	 */
	boolean isCheckFinalConditionFlag();

	/**
	 * Sets the value of the '{@link comrel.AtomicUnit#isCheckFinalConditionFlag <em>Check Final Condition Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Final Condition Flag</em>' attribute.
	 * @see #isCheckFinalConditionFlag()
	 * @generated
	 */
	void setCheckFinalConditionFlag(boolean value);

} // AtomicUnit
