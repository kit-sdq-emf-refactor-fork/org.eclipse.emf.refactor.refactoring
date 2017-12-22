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
 * A representation of the model object '<em><b>Multi Feature Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.MultiFeatureUnit#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.MultiFeatureUnit#getSecondaryInputPorts <em>Secondary Input Ports</em>}</li>
 *   <li>{@link comrel.MultiFeatureUnit#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.MultiFeatureUnit#getMultiFeatureHelper <em>Multi Feature Helper</em>}</li>
 *   <li>{@link comrel.MultiFeatureUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getMultiFeatureUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type' label.pattern='{0}:{1}'"
 * @generated
 */
public interface MultiFeatureUnit extends FeatureUnit {
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
	 * @see comrel.ComrelPackage#getMultiFeatureUnit_InputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	SingleInputPort getInputPort();

	/**
	 * Sets the value of the '{@link comrel.MultiFeatureUnit#getInputPort <em>Input Port</em>}' containment reference.
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
	 * @see comrel.ComrelPackage#getMultiFeatureUnit_SecondaryInputPorts()
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
	 * @see #setOutputPort(MultiOutputPort)
	 * @see comrel.ComrelPackage#getMultiFeatureUnit_OutputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	MultiOutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link comrel.MultiFeatureUnit#getOutputPort <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' containment reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(MultiOutputPort value);

	/**
	 * Returns the value of the '<em><b>Multi Feature Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Feature Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Feature Helper</em>' reference.
	 * @see #setMultiFeatureHelper(MultiFeatureHelper)
	 * @see comrel.ComrelPackage#getMultiFeatureUnit_MultiFeatureHelper()
	 * @model required="true"
	 * @generated
	 */
	MultiFeatureHelper getMultiFeatureHelper();

	/**
	 * Sets the value of the '{@link comrel.MultiFeatureUnit#getMultiFeatureHelper <em>Multi Feature Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Feature Helper</em>' reference.
	 * @see #getMultiFeatureHelper()
	 * @generated
	 */
	void setMultiFeatureHelper(MultiFeatureHelper value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Multi Feature Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getMultiFeatureUnit_Type()
	 * @model default="Multi Feature Unit" changeable="false"
	 * @generated
	 */
	String getType();

} // MultiFeatureUnit
