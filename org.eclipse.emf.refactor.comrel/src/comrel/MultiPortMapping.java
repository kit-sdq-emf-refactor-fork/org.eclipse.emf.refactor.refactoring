/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.MultiPortMapping#getSource <em>Source</em>}</li>
 *   <li>{@link comrel.MultiPortMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getMultiPortMapping()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='2' target.decoration='arrow'"
 * @generated
 */
public interface MultiPortMapping extends PortMapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(MultiPort)
	 * @see comrel.ComrelPackage#getMultiPortMapping_Source()
	 * @model
	 * @generated
	 */
	MultiPort getSource();

	/**
	 * Sets the value of the '{@link comrel.MultiPortMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(MultiPort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(MultiInputPort)
	 * @see comrel.ComrelPackage#getMultiPortMapping_Target()
	 * @model
	 * @generated
	 */
	MultiInputPort getTarget();

	/**
	 * Sets the value of the '{@link comrel.MultiPortMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(MultiInputPort value);

} // MultiPortMapping
