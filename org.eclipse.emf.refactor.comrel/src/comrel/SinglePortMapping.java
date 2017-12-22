/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.SinglePortMapping#getSource <em>Source</em>}</li>
 *   <li>{@link comrel.SinglePortMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getSinglePortMapping()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='2' target.decoration='arrow'"
 * @generated
 */
public interface SinglePortMapping extends PortMapping {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SinglePort)
	 * @see comrel.ComrelPackage#getSinglePortMapping_Source()
	 * @model
	 * @generated
	 */
	SinglePort getSource();

	/**
	 * Sets the value of the '{@link comrel.SinglePortMapping#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SinglePort value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SingleInputPort)
	 * @see comrel.ComrelPackage#getSinglePortMapping_Target()
	 * @model
	 * @generated
	 */
	SingleInputPort getTarget();

	/**
	 * Sets the value of the '{@link comrel.SinglePortMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SingleInputPort value);

} // SinglePortMapping
