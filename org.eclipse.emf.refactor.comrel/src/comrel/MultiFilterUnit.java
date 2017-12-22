/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Filter Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.MultiFilterUnit#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.MultiFilterUnit#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.MultiFilterUnit#getMultiFilterHelper <em>Multi Filter Helper</em>}</li>
 *   <li>{@link comrel.MultiFilterUnit#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getMultiFilterUnit()
 * @model annotation="gmf.node foo='bar' label.icon='false' label='name,type' label.pattern='{0}:{1}'"
 * @generated
 */
public interface MultiFilterUnit extends FilterUnit {
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
	 * @see comrel.ComrelPackage#getMultiFilterUnit_InputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	MultiInputPort getInputPort();

	/**
	 * Sets the value of the '{@link comrel.MultiFilterUnit#getInputPort <em>Input Port</em>}' containment reference.
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
	 * @see #setOutputPort(MultiOutputPort)
	 * @see comrel.ComrelPackage#getMultiFilterUnit_OutputPort()
	 * @model containment="true" required="true"
	 *        annotation="gmf.affixed foo='bar'"
	 * @generated
	 */
	MultiOutputPort getOutputPort();

	/**
	 * Sets the value of the '{@link comrel.MultiFilterUnit#getOutputPort <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Port</em>' containment reference.
	 * @see #getOutputPort()
	 * @generated
	 */
	void setOutputPort(MultiOutputPort value);

	/**
	 * Returns the value of the '<em><b>Multi Filter Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multi Filter Helper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multi Filter Helper</em>' reference.
	 * @see #setMultiFilterHelper(MultiFilterHelper)
	 * @see comrel.ComrelPackage#getMultiFilterUnit_MultiFilterHelper()
	 * @model required="true"
	 * @generated
	 */
	MultiFilterHelper getMultiFilterHelper();

	/**
	 * Sets the value of the '{@link comrel.MultiFilterUnit#getMultiFilterHelper <em>Multi Filter Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multi Filter Helper</em>' reference.
	 * @see #getMultiFilterHelper()
	 * @generated
	 */
	void setMultiFilterHelper(MultiFilterHelper value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Multi Filter Unit"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see comrel.ComrelPackage#getMultiFilterUnit_Type()
	 * @model default="Multi Filter Unit" changeable="false"
	 * @generated
	 */
	String getType();

} // MultiFilterUnit
