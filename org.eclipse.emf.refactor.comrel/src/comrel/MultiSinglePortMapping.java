/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Single Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.MultiSinglePortMapping#getSource <em>Source</em>}</li>
 *   <li>{@link comrel.MultiSinglePortMapping#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getMultiSinglePortMapping()
 * @model annotation="gmf.link source='source' target='target' style='dot' width='2' target.decoration='arrow' tool.small.bundle='name'"
 * @generated
 */
public interface MultiSinglePortMapping extends PortMapping {
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
	 * @see comrel.ComrelPackage#getMultiSinglePortMapping_Source()
	 * @model
	 * @generated
	 */
	MultiPort getSource();

	/**
	 * Sets the value of the '{@link comrel.MultiSinglePortMapping#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(SingleInputPort)
	 * @see comrel.ComrelPackage#getMultiSinglePortMapping_Target()
	 * @model
	 * @generated
	 */
	SingleInputPort getTarget();

	/**
	 * Sets the value of the '{@link comrel.MultiSinglePortMapping#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SingleInputPort value);

} // MultiSinglePortMapping
