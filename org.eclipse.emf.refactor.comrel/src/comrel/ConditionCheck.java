/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Check</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.ConditionCheck#getType <em>Type</em>}</li>
 *   <li>{@link comrel.ConditionCheck#getSpec <em>Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getConditionCheck()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type,spec' label.pattern='{0}:{1} -{2}-'"
 * @generated
 */
public interface ConditionCheck extends NamedElement, DescribedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Condition Check"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getConditionCheck_Type()
	 * @model default="Condition Check" changeable="false"
	 * @generated
	 */
	String getType();

	/**
	 * Returns the value of the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec</em>' attribute.
	 * @see #setSpec(String)
	 * @see comrel.ComrelPackage#getConditionCheck_Spec()
	 * @model
	 * @generated
	 */
	String getSpec();

	/**
	 * Sets the value of the '{@link comrel.ConditionCheck#getSpec <em>Spec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec</em>' attribute.
	 * @see #getSpec()
	 * @generated
	 */
	void setSpec(String value);

} // ConditionCheck
