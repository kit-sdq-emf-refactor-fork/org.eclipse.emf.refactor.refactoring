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
 * A representation of the model object '<em><b>Multi Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.MultiPort#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getMultiPort()
 * @model abstract="true"
 *        annotation="gmf.node border.color='255,0,0' border.width='10'"
 * @generated
 */
public interface MultiPort extends Port {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see comrel.ComrelPackage#getMultiPort_Value()
	 * @model
	 * @generated
	 */
	EList<Object> getValue();

} // MultiPort
