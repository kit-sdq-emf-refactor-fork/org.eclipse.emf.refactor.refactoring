/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queued Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.QueuedUnit#isStrict <em>Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getQueuedUnit()
 * @model abstract="true"
 * @generated
 */
public interface QueuedUnit extends CompositeUnit {
	/**
	 * Returns the value of the '<em><b>Strict</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Strict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strict</em>' attribute.
	 * @see #setStrict(boolean)
	 * @see comrel.ComrelPackage#getQueuedUnit_Strict()
	 * @model default="true"
	 * @generated
	 */
	boolean isStrict();

	/**
	 * Sets the value of the '{@link comrel.QueuedUnit#isStrict <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strict</em>' attribute.
	 * @see #isStrict()
	 * @generated
	 */
	void setStrict(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void init();

} // QueuedUnit
