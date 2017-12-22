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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import comrel.AtomicUnit;
import comrel.ComrelFactory;
import comrel.ComrelPackage;
import comrel.InputPort;
import comrel.ModelRefactoring;
import comrel.SingleInputPort;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.AtomicUnitImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#getUnitId <em>Unit Id</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#getModelRefactoring <em>Model Refactoring</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#isCheckInitialConditionFlag <em>Check Initial Condition Flag</em>}</li>
 *   <li>{@link comrel.impl.AtomicUnitImpl#isCheckFinalConditionFlag <em>Check Final Condition Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicUnitImpl extends RefactoringUnitImpl implements AtomicUnit {
	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleInputPort> inputPorts;

	/**
	 * The default value of the '{@link #getUnitId() <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitId() <em>Unit Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitId()
	 * @generated
	 * @ordered
	 */
	protected String unitId = UNIT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespaceUri() <em>Namespace Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaceUri()
	 * @generated
	 * @ordered
	 */
	protected String namespaceUri = NAMESPACE_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Atomic Unit";

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
	 * The cached value of the '{@link #getModelRefactoring() <em>Model Refactoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRefactoring()
	 * @generated
	 * @ordered
	 */
	protected ModelRefactoring modelRefactoring;

	/**
	 * The default value of the '{@link #isCheckInitialConditionFlag() <em>Check Initial Condition Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckInitialConditionFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_INITIAL_CONDITION_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckInitialConditionFlag() <em>Check Initial Condition Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckInitialConditionFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean checkInitialConditionFlag = CHECK_INITIAL_CONDITION_FLAG_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckFinalConditionFlag() <em>Check Final Condition Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckFinalConditionFlag()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECK_FINAL_CONDITION_FLAG_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckFinalConditionFlag() <em>Check Final Condition Flag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCheckFinalConditionFlag()
	 * @generated
	 * @ordered
	 */
	protected boolean checkFinalConditionFlag = CHECK_FINAL_CONDITION_FLAG_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtomicUnitImpl() {
		super();
	}

	public AtomicUnitImpl(ModelRefactoring refactoring) {
		super();
		System.out.println("Konstruktor: AtomicUnitImpl(ModelRefactoring refactoring)");
		ComrelFactory factory = ComrelFactory.eINSTANCE;

		this.modelRefactoring = refactoring;
		System.out.println("modelRefactoring: " + modelRefactoring);
		this.unitId = new String(refactoring.getRefId());
		this.name = new String(refactoring.getName());
		this.label = new String(refactoring.getName());
		this.namespaceUri = refactoring.getNamespaceUri();
		SingleInputPort tempPort;

		for(SingleInputPort inPort : refactoring.getInputPorts()){
			tempPort = factory.createSingleInputPort();
			tempPort.setDescription(inPort.getDescription());
			tempPort.setName(inPort.getName());
			tempPort.setType(inPort.getType());

			this.getInputPorts().add(tempPort);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.ATOMIC_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleInputPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<SingleInputPort>(SingleInputPort.class, this, ComrelPackage.ATOMIC_UNIT__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitId() {
		return unitId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitId(String newUnitId) {
		if (ComrelUtil.objectIsSettable(this)) {
			String oldUnitId = unitId;
			unitId = newUnitId;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.ATOMIC_UNIT__UNIT_ID, oldUnitId, unitId));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		if (ComrelUtil.objectIsSettable(this)) {
			String oldLabel = label;
			label = newLabel;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.ATOMIC_UNIT__LABEL, oldLabel, label));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespaceUri() {
		return namespaceUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespaceUri(String newNamespaceUri) {
		if (ComrelUtil.objectIsSettable(this)) {
			String oldNamespaceUri = namespaceUri;
			namespaceUri = newNamespaceUri;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.ATOMIC_UNIT__NAMESPACE_URI, oldNamespaceUri, namespaceUri));
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
	public ModelRefactoring getModelRefactoring() {
		if (modelRefactoring != null && modelRefactoring.eIsProxy()) {
			InternalEObject oldModelRefactoring = (InternalEObject)modelRefactoring;
			modelRefactoring = (ModelRefactoring)eResolveProxy(oldModelRefactoring);
			if (modelRefactoring != oldModelRefactoring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.ATOMIC_UNIT__MODEL_REFACTORING, oldModelRefactoring, modelRefactoring));
			}
		}
		return modelRefactoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRefactoring basicGetModelRefactoring() {
		return modelRefactoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelRefactoring(ModelRefactoring newModelRefactoring) {
//		System.out.println("begin AtomicUnit::setModelRefactoring(ModelRefactoring newModelRefactoring)");
//		System.out.println("vorher: " + this.getModelRefactoring());
//		System.out.println("zu setzen: " + newModelRefactoring);
		if (ComrelUtil.objectIsSettable(this) || modelRefactoring == null){
			ModelRefactoring oldModelRefactoring = modelRefactoring;
			modelRefactoring = newModelRefactoring;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.ATOMIC_UNIT__MODEL_REFACTORING, oldModelRefactoring, modelRefactoring));
		}
//		System.out.println("nachher: " + this.getModelRefactoring());
//		System.out.println("ende AtomicUnit::setModelRefactoring(ModelRefactoring newModelRefactoring)");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckInitialConditionFlag() {
		return checkInitialConditionFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInitialConditionFlag(boolean newCheckInitialConditionFlag) {
		boolean oldCheckInitialConditionFlag = checkInitialConditionFlag;
		checkInitialConditionFlag = newCheckInitialConditionFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG, oldCheckInitialConditionFlag, checkInitialConditionFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckFinalConditionFlag() {
		return checkFinalConditionFlag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckFinalConditionFlag(boolean newCheckFinalConditionFlag) {
		boolean oldCheckFinalConditionFlag = checkFinalConditionFlag;
		checkFinalConditionFlag = newCheckFinalConditionFlag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG, oldCheckFinalConditionFlag, checkFinalConditionFlag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.ATOMIC_UNIT__INPUT_PORTS:
				return ((InternalEList<?>)getInputPorts()).basicRemove(otherEnd, msgs);
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
			case ComrelPackage.ATOMIC_UNIT__INPUT_PORTS:
				return getInputPorts();
			case ComrelPackage.ATOMIC_UNIT__UNIT_ID:
				return getUnitId();
			case ComrelPackage.ATOMIC_UNIT__LABEL:
				return getLabel();
			case ComrelPackage.ATOMIC_UNIT__NAMESPACE_URI:
				return getNamespaceUri();
			case ComrelPackage.ATOMIC_UNIT__TYPE:
				return getType();
			case ComrelPackage.ATOMIC_UNIT__MODEL_REFACTORING:
				if (resolve) return getModelRefactoring();
				return basicGetModelRefactoring();
			case ComrelPackage.ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG:
				return isCheckInitialConditionFlag();
			case ComrelPackage.ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG:
				return isCheckFinalConditionFlag();
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
			case ComrelPackage.ATOMIC_UNIT__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends SingleInputPort>)newValue);
				return;
			case ComrelPackage.ATOMIC_UNIT__UNIT_ID:
				setUnitId((String)newValue);
				return;
			case ComrelPackage.ATOMIC_UNIT__LABEL:
				setLabel((String)newValue);
				return;
			case ComrelPackage.ATOMIC_UNIT__NAMESPACE_URI:
				setNamespaceUri((String)newValue);
				return;
			case ComrelPackage.ATOMIC_UNIT__MODEL_REFACTORING:
				setModelRefactoring((ModelRefactoring)newValue);
				return;
			case ComrelPackage.ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG:
				setCheckInitialConditionFlag((Boolean)newValue);
				return;
			case ComrelPackage.ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG:
				setCheckFinalConditionFlag((Boolean)newValue);
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
			case ComrelPackage.ATOMIC_UNIT__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case ComrelPackage.ATOMIC_UNIT__UNIT_ID:
				setUnitId(UNIT_ID_EDEFAULT);
				return;
			case ComrelPackage.ATOMIC_UNIT__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ComrelPackage.ATOMIC_UNIT__NAMESPACE_URI:
				setNamespaceUri(NAMESPACE_URI_EDEFAULT);
				return;
			case ComrelPackage.ATOMIC_UNIT__MODEL_REFACTORING:
				setModelRefactoring((ModelRefactoring)null);
				return;
			case ComrelPackage.ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG:
				setCheckInitialConditionFlag(CHECK_INITIAL_CONDITION_FLAG_EDEFAULT);
				return;
			case ComrelPackage.ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG:
				setCheckFinalConditionFlag(CHECK_FINAL_CONDITION_FLAG_EDEFAULT);
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
			case ComrelPackage.ATOMIC_UNIT__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case ComrelPackage.ATOMIC_UNIT__UNIT_ID:
				return UNIT_ID_EDEFAULT == null ? unitId != null : !UNIT_ID_EDEFAULT.equals(unitId);
			case ComrelPackage.ATOMIC_UNIT__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ComrelPackage.ATOMIC_UNIT__NAMESPACE_URI:
				return NAMESPACE_URI_EDEFAULT == null ? namespaceUri != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceUri);
			case ComrelPackage.ATOMIC_UNIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComrelPackage.ATOMIC_UNIT__MODEL_REFACTORING:
				return modelRefactoring != null;
			case ComrelPackage.ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG:
				return checkInitialConditionFlag != CHECK_INITIAL_CONDITION_FLAG_EDEFAULT;
			case ComrelPackage.ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG:
				return checkFinalConditionFlag != CHECK_FINAL_CONDITION_FLAG_EDEFAULT;
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
		result.append(" (unitId: ");
		result.append(unitId);
		result.append(", label: ");
		result.append(label);
		result.append(", namespaceUri: ");
		result.append(namespaceUri);
		result.append(", type: ");
		result.append(type);
		result.append(", checkInitialConditionFlag: ");
		result.append(checkInitialConditionFlag);
		result.append(", checkFinalConditionFlag: ");
		result.append(checkFinalConditionFlag);
		result.append(')');
		return result.toString();
	}
	
	public EList<InputPort> getAllInputPorts() {
		EList<InputPort> result = new BasicEList<InputPort>();
		result.addAll(this.getInputPorts());
		return result;
	}

} //AtomicUnitImpl
