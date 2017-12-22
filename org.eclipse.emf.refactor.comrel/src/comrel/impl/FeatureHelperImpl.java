/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.ComrelPackage;
import comrel.FeatureHelper;
import comrel.MultiInputPort;
import comrel.SingleInputPort;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Helper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.FeatureHelperImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.impl.FeatureHelperImpl#getSecondaryInputPorts <em>Secondary Input Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FeatureHelperImpl extends HelperImpl implements FeatureHelper {
	/**
	 * The cached value of the '{@link #getInputPort() <em>Input Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPort()
	 * @generated
	 * @ordered
	 */
	protected SingleInputPort inputPort;

	/**
	 * The cached value of the '{@link #getSecondaryInputPorts() <em>Secondary Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecondaryInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiInputPort> secondaryInputPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.FEATURE_HELPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleInputPort getInputPort() {
		return inputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputPort(SingleInputPort newInputPort, NotificationChain msgs) {
		SingleInputPort oldInputPort = inputPort;
		inputPort = newInputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.FEATURE_HELPER__INPUT_PORT, oldInputPort, newInputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPort(SingleInputPort newInputPort) {
		if (newInputPort != inputPort) {
			NotificationChain msgs = null;
			if (inputPort != null)
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.FEATURE_HELPER__INPUT_PORT, null, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.FEATURE_HELPER__INPUT_PORT, null, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.FEATURE_HELPER__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiInputPort> getSecondaryInputPorts() {
		if (secondaryInputPorts == null) {
			secondaryInputPorts = new EObjectContainmentEList<MultiInputPort>(MultiInputPort.class, this, ComrelPackage.FEATURE_HELPER__SECONDARY_INPUT_PORTS);
		}
		return secondaryInputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.FEATURE_HELPER__INPUT_PORT:
				return basicSetInputPort(null, msgs);
			case ComrelPackage.FEATURE_HELPER__SECONDARY_INPUT_PORTS:
				return ((InternalEList<?>)getSecondaryInputPorts()).basicRemove(otherEnd, msgs);
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
			case ComrelPackage.FEATURE_HELPER__INPUT_PORT:
				return getInputPort();
			case ComrelPackage.FEATURE_HELPER__SECONDARY_INPUT_PORTS:
				return getSecondaryInputPorts();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComrelPackage.FEATURE_HELPER__INPUT_PORT:
				setInputPort((SingleInputPort)newValue);
				return;
			case ComrelPackage.FEATURE_HELPER__SECONDARY_INPUT_PORTS:
				getSecondaryInputPorts().clear();
				getSecondaryInputPorts().addAll((Collection<? extends MultiInputPort>)newValue);
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
			case ComrelPackage.FEATURE_HELPER__INPUT_PORT:
				setInputPort((SingleInputPort)null);
				return;
			case ComrelPackage.FEATURE_HELPER__SECONDARY_INPUT_PORTS:
				getSecondaryInputPorts().clear();
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
			case ComrelPackage.FEATURE_HELPER__INPUT_PORT:
				return inputPort != null;
			case ComrelPackage.FEATURE_HELPER__SECONDARY_INPUT_PORTS:
				return secondaryInputPorts != null && !secondaryInputPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FeatureHelperImpl
