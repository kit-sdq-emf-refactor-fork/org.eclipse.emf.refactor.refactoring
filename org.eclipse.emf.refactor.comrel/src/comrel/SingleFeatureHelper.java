/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Feature Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.SingleFeatureHelper#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getSingleFeatureHelper()
 * @model
 * @generated
 */
public interface SingleFeatureHelper extends FeatureHelper {
	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' containment reference.
	 * @see #setOutputPort(SingleOutputPort)
	 * @see comrel.ComrelPackage#getSingleFeatureHelper_OutputPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleOutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link comrel.SingleFeatureHelper#getOutputPort <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' containment reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(SingleOutputPort value);

} // SingleFeatureHelper
