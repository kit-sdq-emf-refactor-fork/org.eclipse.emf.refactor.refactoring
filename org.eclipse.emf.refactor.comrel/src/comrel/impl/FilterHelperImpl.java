/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.ComrelPackage;
import comrel.FilterHelper;
import comrel.MultiInputPort;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.FilterHelperImpl#getInputPort <em>Input Port</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FilterHelperImpl extends HelperImpl implements FilterHelper {
	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected MultiInputPort inputPort;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.FILTER_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInputPort getInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPort(MultiInputPort newInputPort, NotificationChain msgs) {
		MultiInputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.FILTER_HELPER__INPUT_PORT, oldInputPort, newInputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(MultiInputPort newInputPort) {
		if (newInputPort != inputPort) {
			NotificationChain msgs = null;
			if (inputPort != null)
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.FILTER_HELPER__INPUT_PORT, null, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.FILTER_HELPER__INPUT_PORT, null, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.FILTER_HELPER__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.FILTER_HELPER__INPUT_PORT:
				return basicSetInputPort(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComrelPackage.FILTER_HELPER__INPUT_PORT:
				return getInputPort();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComrelPackage.FILTER_HELPER__INPUT_PORT:
				setInputPort((MultiInputPort)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComrelPackage.FILTER_HELPER__INPUT_PORT:
				setInputPort((MultiInputPort)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComrelPackage.FILTER_HELPER__INPUT_PORT:
				return inputPort != null;
		}
		return super.eIsSet(featureID);
	}

} //FilterHelperImpl
