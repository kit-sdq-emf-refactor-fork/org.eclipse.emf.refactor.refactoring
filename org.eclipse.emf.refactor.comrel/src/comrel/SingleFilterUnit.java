/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Filter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.SingleFilterUnit#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.SingleFilterUnit#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.SingleFilterUnit#getSingleFilterHelper <em>Single Filter Helper</em>}</li>
 *   <li>{@link comrel.SingleFilterUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getSingleFilterUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type' label.pattern='{0}:{1}'"
 * @generated
 */
public interface SingleFilterUnit extends FilterUnit {
	/**
	 * Returns the value of the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Port</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Port</em>' containment reference.
	 * @see #setInputPort(MultiInputPort)
	 * @see comrel.ComrelPackage#getSingleFilterUnit_InputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	MultiInputPort getInputPort();

	/**
	 * Sets the value of the '{@link comrel.SingleFilterUnit#getInputPort <em>Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Port</em>' containment reference.
	 * @see #getInputPort()
	 * @generated
	 */
	void setInputPort(MultiInputPort value);

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
	 * @see comrel.ComrelPackage#getSingleFilterUnit_OutputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	SingleOutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link comrel.SingleFilterUnit#getOutputPort <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' containment reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(SingleOutputPort value);

	/**
	 * Returns the value of the '<em><b>Single Filter Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Filter Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Filter Helper</em>' reference.
	 * @see #setSingleFilterHelper(SingleFilterHelper)
	 * @see comrel.ComrelPackage#getSingleFilterUnit_SingleFilterHelper()
	 * @model required="true"
	 * @generated
	 */
	SingleFilterHelper getSingleFilterHelper();

	/**
	 * Sets the value of the '{@link comrel.SingleFilterUnit#getSingleFilterHelper <em>Single Filter Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Filter Helper</em>' reference.
	 * @see #getSingleFilterHelper()
	 * @generated
	 */
	void setSingleFilterHelper(SingleFilterHelper value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Single Filter Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getSingleFilterUnit_Type()
	 * @model default="Single Filter Unit" changeable="false"
	 * @generated
	 */
	String getType();

} // SingleFilterUnit
