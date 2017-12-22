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
 * A representation of the model object '<em><b>Single Feature Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.SingleFeatureUnit#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.SingleFeatureUnit#getSecondaryInputPorts <em>Secondary Input Ports</em>}</li>
 *   <li>{@link comrel.SingleFeatureUnit#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.SingleFeatureUnit#getSingleFeatureHelper <em>Single Feature Helper</em>}</li>
 *   <li>{@link comrel.SingleFeatureUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getSingleFeatureUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type' label.pattern='{0}:{1}'"
 * @generated
 */
public interface SingleFeatureUnit extends FeatureUnit {
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
	 * @see comrel.ComrelPackage#getSingleFeatureUnit_InputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	SingleInputPort getInputPort();

	/**
	 * Sets the value of the '{@link comrel.SingleFeatureUnit#getInputPort <em>Input Port</em>}' containment reference.
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
	 * @see comrel.ComrelPackage#getSingleFeatureUnit_SecondaryInputPorts()
	 * @model containment="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	EList<MultiInputPort> getSecondaryInputPorts();

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
	 * @see comrel.ComrelPackage#getSingleFeatureUnit_OutputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	SingleOutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link comrel.SingleFeatureUnit#getOutputPort <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' containment reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(SingleOutputPort value);

	/**
	 * Returns the value of the '<em><b>Single Feature Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Feature Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Feature Helper</em>' reference.
	 * @see #setSingleFeatureHelper(SingleFeatureHelper)
	 * @see comrel.ComrelPackage#getSingleFeatureUnit_SingleFeatureHelper()
	 * @model required="true"
	 * @generated
	 */
	SingleFeatureHelper getSingleFeatureHelper();

	/**
	 * Sets the value of the '{@link comrel.SingleFeatureUnit#getSingleFeatureHelper <em>Single Feature Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Feature Helper</em>' reference.
	 * @see #getSingleFeatureHelper()
	 * @generated
	 */
	void setSingleFeatureHelper(SingleFeatureHelper value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Single Feature Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getSingleFeatureUnit_Type()
	 * @model default="Single Feature Unit" changeable="false"
	 * @generated
	 */
	String getType();

} // SingleFeatureUnit
