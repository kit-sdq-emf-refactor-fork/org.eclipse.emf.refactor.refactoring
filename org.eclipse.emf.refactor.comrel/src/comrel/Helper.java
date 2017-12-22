/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.Helper#getHelperId <em>Helper Id</em>}</li>
 *   <li>{@link comrel.Helper#getNamespaceUri <em>Namespace Uri</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getHelper()
 * @model abstract="true"
 * @generated
 */
public interface Helper extends NamedElement, DescribedElement {
	/**
	 * Returns the value of the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper Id</em>' attribute.
	 * @see #setHelperId(String)
	 * @see comrel.ComrelPackage#getHelper_HelperId()
	 * @model required="true"
	 * @generated
	 */
	String getHelperId();

	/**
	 * Sets the value of the '{@link comrel.Helper#getHelperId <em>Helper Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Helper Id</em>' attribute.
	 * @see #getHelperId()
	 * @generated
	 */
	void setHelperId(String value);

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
	 * @see comrel.ComrelPackage#getHelper_NamespaceUri()
	 * @model required="true"
	 * @generated
	 */
	String getNamespaceUri();

	/**
	 * Sets the value of the '{@link comrel.Helper#getNamespaceUri <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace Uri</em>' attribute.
	 * @see #getNamespaceUri()
	 * @generated
	 */
	void setNamespaceUri(String value);

} // Helper
