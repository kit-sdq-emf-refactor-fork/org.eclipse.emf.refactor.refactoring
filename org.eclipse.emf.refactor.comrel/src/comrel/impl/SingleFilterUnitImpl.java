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
import comrel.MultiInputPort;
import comrel.SingleFilterHelper;
import comrel.SingleFilterUnit;
import comrel.SingleOutputPort;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Filter Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.SingleFilterUnitImpl#getInputPort <em>Input Port</em>}</li>
 *   <li>{@link comrel.impl.SingleFilterUnitImpl#getOutputPort <em>Output Port</em>}</li>
 *   <li>{@link comrel.impl.SingleFilterUnitImpl#getSingleFilterHelper <em>Single Filter Helper</em>}</li>
 *   <li>{@link comrel.impl.SingleFilterUnitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SingleFilterUnitImpl extends FilterUnitImpl implements SingleFilterUnit {
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
	protected SingleOutputPort outputPort;

	/**
	 * The cached value of the '{@link #getSingleFilterHelper() <em>Single Filter Helper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleFilterHelper()
	 * @generated
	 * @ordered
	 */
	protected SingleFilterHelper singleFilterHelper;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Single Filter Unit";

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
	protected SingleFilterUnitImpl() {
		super();
	}

	public SingleFilterUnitImpl(SingleFilterHelper helper) {
		this.singleFilterHelper = helper;
		this.helperUnitId = helper.getHelperId();
		this.name = helper.getName();
		this.description = helper.getDescription();
		this.namespaceUri = helper.getNamespaceUri();
		SingleOutputPort outPort = ComrelFactory.eINSTANCE.createSingleOutputPort();
		MultiInputPort inPort = ComrelFactory.eINSTANCE.createMultiInputPort();
		inPort.setDescription(helper.getInputPort().getDescription());
		inPort.setName(helper.getInputPort().getName());
		inPort.setType(helper.getInputPort().getType());

		this.setInputPort(inPort);
		outPort.setDescription(helper.getOutputPort().getDescription());
		outPort.setName(helper.getOutputPort().getName());
		outPort.setType(helper.getOutputPort().getType());

		this.setOutputPort(outPort);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.SINGLE_FILTER_UNIT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT, oldInputPort, newInputPort);
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
				msgs = ((InternalEObject)inputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT, null, msgs);
			if (newInputPort != null)
				msgs = ((InternalEObject)newInputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT, null, msgs);
			msgs = basicSetInputPort(newInputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT, newInputPort, newInputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOutputPort getOutputPort() {
		return outputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutputPort(SingleOutputPort newOutputPort, NotificationChain msgs) {
		SingleOutputPort oldOutputPort = outputPort;
		outputPort = newOutputPort;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT, oldOutputPort, newOutputPort);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputPort(SingleOutputPort newOutputPort) {
		if (newOutputPort != outputPort) {
			NotificationChain msgs = null;
			if (outputPort != null)
				msgs = ((InternalEObject)outputPort).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT, null, msgs);
			if (newOutputPort != null)
				msgs = ((InternalEObject)newOutputPort).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT, null, msgs);
			msgs = basicSetOutputPort(newOutputPort, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT, newOutputPort, newOutputPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFilterHelper getSingleFilterHelper() {
		if (singleFilterHelper != null && singleFilterHelper.eIsProxy()) {
			InternalEObject oldSingleFilterHelper = (InternalEObject)singleFilterHelper;
			singleFilterHelper = (SingleFilterHelper)eResolveProxy(oldSingleFilterHelper);
			if (singleFilterHelper != oldSingleFilterHelper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER, oldSingleFilterHelper, singleFilterHelper));
			}
		}
		return singleFilterHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFilterHelper basicGetSingleFilterHelper() {
		return singleFilterHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleFilterHelper(SingleFilterHelper newSingleFilterHelper) {
		if(ComrelUtil.objectIsSettable(this) || singleFilterHelper == null){
			SingleFilterHelper oldSingleFilterHelper = singleFilterHelper;
			singleFilterHelper = newSingleFilterHelper;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER, oldSingleFilterHelper, singleFilterHelper));
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
			case ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT:
				return basicSetInputPort(null, msgs);
			case ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT:
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
			case ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT:
				return getInputPort();
			case ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT:
				return getOutputPort();
			case ComrelPackage.SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER:
				if (resolve) return getSingleFilterHelper();
				return basicGetSingleFilterHelper();
			case ComrelPackage.SINGLE_FILTER_UNIT__TYPE:
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
			case ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT:
				setInputPort((MultiInputPort)newValue);
				return;
			case ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT:
				setOutputPort((SingleOutputPort)newValue);
				return;
			case ComrelPackage.SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER:
				setSingleFilterHelper((SingleFilterHelper)newValue);
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
			case ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT:
				setInputPort((MultiInputPort)null);
				return;
			case ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT:
				setOutputPort((SingleOutputPort)null);
				return;
			case ComrelPackage.SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER:
				setSingleFilterHelper((SingleFilterHelper)null);
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
			case ComrelPackage.SINGLE_FILTER_UNIT__INPUT_PORT:
				return inputPort != null;
			case ComrelPackage.SINGLE_FILTER_UNIT__OUTPUT_PORT:
				return outputPort != null;
			case ComrelPackage.SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER:
				return singleFilterHelper != null;
			case ComrelPackage.SINGLE_FILTER_UNIT__TYPE:
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

} //SingleFilterUnitImpl
