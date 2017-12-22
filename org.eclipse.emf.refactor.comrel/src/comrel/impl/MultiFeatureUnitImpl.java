/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import comrel.ComrelFactory;
import comrel.ComrelPackage;
import comrel.MultiFeatureHelper;
import comrel.MultiFeatureUnit;
import comrel.MultiInputPort;
import comrel.MultiOutputPort;
import comrel.SingleInputPort;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Feature Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.MultiFeatureUnitImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.impl.MultiFeatureUnitImpl#getSecondaryInputPorts <em>Secondary Input Ports</em>}</li>
 *   <li>{@link comrel.impl.MultiFeatureUnitImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.impl.MultiFeatureUnitImpl#getMultiFeatureHelper <em>Multi Feature Helper</em>}</li>
 *   <li>{@link comrel.impl.MultiFeatureUnitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiFeatureUnitImpl extends FeatureUnitImpl implements MultiFeatureUnit {
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
	 * The cached value of the '{@link #getOutputPort() <em>Output Port</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputPort()
	 * @generated
	 * @ordered
	 */
	protected MultiOutputPort outputPort;

	/**
	 * The cached value of the '{@link #getMultiFeatureHelper() <em>Multi Feature Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiFeatureHelper()
	 * @generated
	 * @ordered
	 */
	protected MultiFeatureHelper multiFeatureHelper;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Multi Feature Unit";

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
	protected MultiFeatureUnitImpl() {
		super();
	}

	public MultiFeatureUnitImpl(MultiFeatureHelper helper) {
		this.multiFeatureHelper = helper;
		this.name = helper.getName();
		this.helperUnitId = helper.getHelperId();
		this.description = helper.getDescription();
		this.namespaceUri = helper.getNamespaceUri();
		SingleInputPort inputPort = ComrelFactory.eINSTANCE.createSingleInputPort();
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
		return ComrelPackage.Literals.MULTI_FEATURE_UNIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT, oldInputPort, newInputPort);
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
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT, null, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT, null, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiInputPort> getSecondaryInputPorts() {
		if (secondaryInputPorts == null) {
			secondaryInputPorts = new EObjectContainmentEList<MultiInputPort>(MultiInputPort.class, this, ComrelPackage.MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS);
		}
		return secondaryInputPorts;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT, oldOutputPort, newOutputPort);
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
				msgs = ((InternalEObject)outputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT, null, msgs);
			if (newOutputPort != null)
				msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT, null, msgs);
			msgs = basicSetOutputPort(newOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT, newOutputPort, newOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFeatureHelper getMultiFeatureHelper() {
		if (multiFeatureHelper != null && multiFeatureHelper.eIsProxy()) {
			InternalEObject oldMultiFeatureHelper = (InternalEObject)multiFeatureHelper;
			multiFeatureHelper = (MultiFeatureHelper)eResolveProxy(oldMultiFeatureHelper);
			if (multiFeatureHelper != oldMultiFeatureHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER, oldMultiFeatureHelper, multiFeatureHelper));
			}
		}
		return multiFeatureHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFeatureHelper basicGetMultiFeatureHelper() {
		return multiFeatureHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiFeatureHelper(MultiFeatureHelper newMultiFeatureHelper) {
		if(ComrelUtil.objectIsSettable(this) || multiFeatureHelper == null){
			MultiFeatureHelper oldMultiFeatureHelper = multiFeatureHelper;
			multiFeatureHelper = newMultiFeatureHelper;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER, oldMultiFeatureHelper, multiFeatureHelper));
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
			case ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT:
				return basicSetInputPort(null, msgs);
			case ComrelPackage.MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS:
				return ((InternalEList<?>)getSecondaryInputPorts()).basicRemove(otherEnd, msgs);
			case ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT:
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
			case ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT:
				return getInputPort();
			case ComrelPackage.MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS:
				return getSecondaryInputPorts();
			case ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT:
				return getOutputPort();
			case ComrelPackage.MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER:
				if (resolve) return getMultiFeatureHelper();
				return basicGetMultiFeatureHelper();
			case ComrelPackage.MULTI_FEATURE_UNIT__TYPE:
				return getType();
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
			case ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT:
				setInputPort((SingleInputPort)newValue);
				return;
			case ComrelPackage.MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS:
				getSecondaryInputPorts().clear();
				getSecondaryInputPorts().addAll((Collection<? extends MultiInputPort>)newValue);
				return;
			case ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT:
				setOutputPort((MultiOutputPort)newValue);
				return;
			case ComrelPackage.MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER:
				setMultiFeatureHelper((MultiFeatureHelper)newValue);
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
			case ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT:
				setInputPort((SingleInputPort)null);
				return;
			case ComrelPackage.MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS:
				getSecondaryInputPorts().clear();
				return;
			case ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT:
				setOutputPort((MultiOutputPort)null);
				return;
			case ComrelPackage.MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER:
				setMultiFeatureHelper((MultiFeatureHelper)null);
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
			case ComrelPackage.MULTI_FEATURE_UNIT__INPUT_PORT:
				return inputPort != null;
			case ComrelPackage.MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS:
				return secondaryInputPorts != null && !secondaryInputPorts.isEmpty();
			case ComrelPackage.MULTI_FEATURE_UNIT__OUTPUT_PORT:
				return outputPort != null;
			case ComrelPackage.MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER:
				return multiFeatureHelper != null;
			case ComrelPackage.MULTI_FEATURE_UNIT__TYPE:
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

} //MultiFeatureUnitImpl
