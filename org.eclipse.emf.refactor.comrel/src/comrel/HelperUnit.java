/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.HelperUnit#getHelperUnitId <em>Helper Unit Id</em>}</li>
 *   <li>{@link comrel.HelperUnit#getNamespaceUri <em>Namespace Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getHelperUnit()
 * @model abstract="true"
 * @generated
 */
public interface HelperUnit extends NamedElement, DescribedElement {
	/**
	 * Returns the value of the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper Unit Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper Unit Id</em>' attribute.
	 * @see #setHelperUnitId(String)
	 * @see comrel.ComrelPackage#getHelperUnit_HelperUnitId()
	 * @model required="true"
	 * @generated
	 */
	String getHelperUnitId();

	/**
	 * Sets the value of the '{@link comrel.HelperUnit#getHelperUnitId <em>Helper Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper Unit Id</em>' attribute.
	 * @see #getHelperUnitId()
	 * @generated
	 */
	void setHelperUnitId(String value);

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
	 * @see comrel.ComrelPackage#getHelperUnit_NamespaceUri()
	 * @model required="true"
	 * @generated
	 */
	String getNamespaceUri();

	/**
	 * Sets the value of the '{@link comrel.HelperUnit#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	InputPort getInputPort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true"
	 * @generated
	 */
	OutputPort getOutputPort();

} // HelperUnit
