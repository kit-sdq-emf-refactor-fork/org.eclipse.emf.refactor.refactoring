/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import org.eclipse.draw2d.Shape;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.Port#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getPort()
 * @model abstract="true"
 *        annotation="gmf.node foo='bar' label='name,type' label.icon='false' label.placement='external' label.pattern='{0}:{1}'"
 * @generated
 */
public interface Port extends NamedElement, DescribedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(Class)
	 * @see comrel.ComrelPackage#getPort_Type()
	 * @model required="true"
	 * @generated
	 */
	Class getType();

	/**
	 * Sets the value of the '{@link comrel.Port#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(Class value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setType(Class newType, boolean initiator);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updatePortName(String singularPortName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getSingularPortName();
	
	public Shape getFigure();

	public void setFigure(Shape figure);

} // Port
