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
 * A representation of the model object '<em><b>Model Refactoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.ModelRefactoring#getRefId <em>Ref Id</em>}</li>
 *   <li>{@link comrel.ModelRefactoring#getLabel <em>Label</em>}</li>
 *   <li>{@link comrel.ModelRefactoring#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link comrel.ModelRefactoring#getInputPorts <em>Input Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getModelRefactoring()
 * @model
 * @generated
 */
public interface ModelRefactoring extends NamedElement, DescribedElement {
	/**
	 * Returns the value of the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Id</em>' attribute.
	 * @see #setRefId(String)
	 * @see comrel.ComrelPackage#getModelRefactoring_RefId()
	 * @model required="true"
	 * @generated
	 */
	String getRefId();

	/**
	 * Sets the value of the '{@link comrel.ModelRefactoring#getRefId <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Id</em>' attribute.
	 * @see #getRefId()
	 * @generated
	 */
	void setRefId(String value);

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
	 * @see comrel.ComrelPackage#getModelRefactoring_Label()
	 * @model required="true"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link comrel.ModelRefactoring#getLabel <em>Label</em>}' attribute.
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
	 * @see comrel.ComrelPackage#getModelRefactoring_NamespaceUri()
	 * @model required="true"
	 * @generated
	 */
	String getNamespaceUri();

	/**
	 * Sets the value of the '{@link comrel.ModelRefactoring#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(String value);

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
	 * @see comrel.ComrelPackage#getModelRefactoring_InputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<SingleInputPort> getInputPorts();

} // ModelRefactoring
