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
 * A representation of the model object '<em><b>Feature Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.FeatureHelper#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.FeatureHelper#getSecondaryInputPorts <em>Secondary Input Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getFeatureHelper()
 * @model abstract="true"
 * @generated
 */
public interface FeatureHelper extends Helper {
	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' containment reference.
	 * @see #setInputPort(SingleInputPort)
	 * @see comrel.ComrelPackage#getFeatureHelper_InputPort()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SingleInputPort getInputPort();

	/**
	 * Sets the value of the '{@link comrel.FeatureHelper#getInputPort <em>Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' containment reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(SingleInputPort value);

	/**
	 * Returns the value of the '<em><b>Secondary Input Ports</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.MultiInputPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secondary Input Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secondary Input Ports</em>' containment reference list.
	 * @see comrel.ComrelPackage#getFeatureHelper_SecondaryInputPorts()
	 * @model containment="true"
	 * @generated
	 */
	EList<MultiInputPort> getSecondaryInputPorts();

} // FeatureHelper
