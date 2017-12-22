/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Feature Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.MultiFeatureHelper#getOutputPort <em>Output Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getMultiFeatureHelper()
 * @model
 * @generated
 */
public interface MultiFeatureHelper extends FeatureHelper {
	/**
	 * Returns the value of the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Port</em>' containment reference.
	 * @see #setOutputPort(MultiOutputPort)
	 * @see comrel.ComrelPackage#getMultiFeatureHelper_OutputPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	MultiOutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link comrel.MultiFeatureHelper#getOutputPort <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' containment reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(MultiOutputPort value);

} // MultiFeatureHelper
