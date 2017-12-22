/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import comrel.ComrelFactory;
import comrel.ComrelPackage;
import comrel.MultiFilterHelper;
import comrel.MultiFilterUnit;
import comrel.MultiInputPort;
import comrel.MultiOutputPort;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Filter Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.MultiFilterUnitImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.impl.MultiFilterUnitImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.impl.MultiFilterUnitImpl#getMultiFilterHelper <em>Multi Filter Helper</em>}</li>
 *   <li>{@link comrel.impl.MultiFilterUnitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiFilterUnitImpl extends FilterUnitImpl implements MultiFilterUnit {
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
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected MultiOutputPort outputPort;

	/**
	 * The cached value of the '{@link #getMultiFilterHelper() <em>Multi Filter Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiFilterHelper()
	 * @generated
	 * @ordered
	 */
	protected MultiFilterHelper multiFilterHelper;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Multi Filter Unit";

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiFilterUnitImpl() {
		super();
	}

	public MultiFilterUnitImpl(MultiFilterHelper helper) {
		this.multiFilterHelper = helper;
		this.helperUnitId = helper.getHelperId();
		this.name = helper.getName();
		this.description = helper.getDescription();
		this.namespaceUri = helper.getNamespaceUri();
		MultiInputPort inputPort = ComrelFactory.eINSTANCE.createMultiInputPort();
		MultiOutputPort outputPort = ComrelFactory.eINSTANCE.createMultiOutputPort();
		inputPort.setDescription(helper.getInputPort().getDescription());
		inputPort.setName(helper.getInputPort().getName());
		inputPort.setType(helper.getInputPort().getType());

		this.setInputPort(inputPort);
		outputPort.setDescription(helper.getOutputPort().getDescription());
		outputPort.setName(helper.getOutputPort().getName());
		outputPort.setType(helper.getOutputPort().getType());

		this.setOutputPort(outputPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.MULTI_FILTER_UNIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT, oldInputPort, newInputPort);
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
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT, null, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT, null, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiOutputPort getOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPort(MultiOutputPort newOutputPort, NotificationChain msgs) {
		MultiOutputPort oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT, oldOutputPort, newOutputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPort(MultiOutputPort newOutputPort) {
		if (newOutputPort != outputPort) {
			NotificationChain msgs = null;
			if (outputPort != null)
				msgs = ((InternalEObject)outputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT, null, msgs);
			if (newOutputPort != null)
				msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT, null, msgs);
			msgs = basicSetOutputPort(newOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT, newOutputPort, newOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFilterHelper getMultiFilterHelper() {
		if (multiFilterHelper != null && multiFilterHelper.eIsProxy()) {
			InternalEObject oldMultiFilterHelper = (InternalEObject)multiFilterHelper;
			multiFilterHelper = (MultiFilterHelper)eResolveProxy(oldMultiFilterHelper);
			if (multiFilterHelper != oldMultiFilterHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.MULTI_FILTER_UNIT__MULTI_FILTER_HELPER, oldMultiFilterHelper, multiFilterHelper));
			}
		}
		return multiFilterHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFilterHelper basicGetMultiFilterHelper() {
		return multiFilterHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiFilterHelper(MultiFilterHelper newMultiFilterHelper) {
		if(ComrelUtil.objectIsSettable(this) || multiFilterHelper == null){
			MultiFilterHelper oldMultiFilterHelper = multiFilterHelper;
			multiFilterHelper = newMultiFilterHelper;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FILTER_UNIT__MULTI_FILTER_HELPER, oldMultiFilterHelper, multiFilterHelper));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT:
				return basicSetInputPort(null, msgs);
			case ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT:
				return basicSetOutputPort(null, msgs);
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
			case ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT:
				return getInputPort();
			case ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT:
				return getOutputPort();
			case ComrelPackage.MULTI_FILTER_UNIT__MULTI_FILTER_HELPER:
				if (resolve) return getMultiFilterHelper();
				return basicGetMultiFilterHelper();
			case ComrelPackage.MULTI_FILTER_UNIT__TYPE:
				return getType();
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
			case ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT:
				setInputPort((MultiInputPort)newValue);
				return;
			case ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT:
				setOutputPort((MultiOutputPort)newValue);
				return;
			case ComrelPackage.MULTI_FILTER_UNIT__MULTI_FILTER_HELPER:
				setMultiFilterHelper((MultiFilterHelper)newValue);
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
			case ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT:
				setInputPort((MultiInputPort)null);
				return;
			case ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT:
				setOutputPort((MultiOutputPort)null);
				return;
			case ComrelPackage.MULTI_FILTER_UNIT__MULTI_FILTER_HELPER:
				setMultiFilterHelper((MultiFilterHelper)null);
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
			case ComrelPackage.MULTI_FILTER_UNIT__INPUT_PORT:
				return inputPort != null;
			case ComrelPackage.MULTI_FILTER_UNIT__OUTPUT_PORT:
				return outputPort != null;
			case ComrelPackage.MULTI_FILTER_UNIT__MULTI_FILTER_HELPER:
				return multiFilterHelper != null;
			case ComrelPackage.MULTI_FILTER_UNIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //MultiFilterUnitImpl
