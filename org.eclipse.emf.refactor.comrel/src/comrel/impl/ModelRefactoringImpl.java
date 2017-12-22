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
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import comrel.ComrelPackage;
import comrel.DescribedElement;
import comrel.ModelRefactoring;
import comrel.SingleInputPort;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.ModelRefactoringImpl#getName <em>Name</em>}</li>
 *   <li>{@link comrel.impl.ModelRefactoringImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link comrel.impl.ModelRefactoringImpl#getRefId <em>Ref Id</em>}</li>
 *   <li>{@link comrel.impl.ModelRefactoringImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link comrel.impl.ModelRefactoringImpl#getNamespaceUri <em>Namespace Uri</em>}</li>
 *   <li>{@link comrel.impl.ModelRefactoringImpl#getInputPorts <em>Input Ports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModelRefactoringImpl extends EObjectImpl implements ModelRefactoring {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefId() <em>Ref Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefId()
	 * @generated
	 * @ordered
	 */
	protected String refId = REF_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleInputPort> inputPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelRefactoringImpl() {
		super();
	}

	public ModelRefactoringImpl(String id) {
		super();
		this.refId = id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.MODEL_REFACTORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		if (ComrelUtil.objectIsSettable(this)) {
			String oldName = name;
			name = newName;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MODEL_REFACTORING__NAME, oldName, name));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MODEL_REFACTORING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefId() {
		return refId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefId(String newRefId) {
		if (ComrelUtil.objectIsSettable(this)) {
			String oldRefId = refId;
			refId = newRefId;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MODEL_REFACTORING__REF_ID, oldRefId, refId));
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
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MODEL_REFACTORING__LABEL, oldLabel, label));
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
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MODEL_REFACTORING__NAMESPACE_URI, oldNamespaceUri, namespaceUri));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleInputPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<SingleInputPort>(SingleInputPort.class, this, ComrelPackage.MODEL_REFACTORING__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.MODEL_REFACTORING__INPUT_PORTS:
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
			case ComrelPackage.MODEL_REFACTORING__NAME:
				return getName();
			case ComrelPackage.MODEL_REFACTORING__DESCRIPTION:
				return getDescription();
			case ComrelPackage.MODEL_REFACTORING__REF_ID:
				return getRefId();
			case ComrelPackage.MODEL_REFACTORING__LABEL:
				return getLabel();
			case ComrelPackage.MODEL_REFACTORING__NAMESPACE_URI:
				return getNamespaceUri();
			case ComrelPackage.MODEL_REFACTORING__INPUT_PORTS:
				return getInputPorts();
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
			case ComrelPackage.MODEL_REFACTORING__NAME:
				setName((String)newValue);
				return;
			case ComrelPackage.MODEL_REFACTORING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ComrelPackage.MODEL_REFACTORING__REF_ID:
				setRefId((String)newValue);
				return;
			case ComrelPackage.MODEL_REFACTORING__LABEL:
				setLabel((String)newValue);
				return;
			case ComrelPackage.MODEL_REFACTORING__NAMESPACE_URI:
				setNamespaceUri((String)newValue);
				return;
			case ComrelPackage.MODEL_REFACTORING__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends SingleInputPort>)newValue);
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
			case ComrelPackage.MODEL_REFACTORING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComrelPackage.MODEL_REFACTORING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ComrelPackage.MODEL_REFACTORING__REF_ID:
				setRefId(REF_ID_EDEFAULT);
				return;
			case ComrelPackage.MODEL_REFACTORING__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case ComrelPackage.MODEL_REFACTORING__NAMESPACE_URI:
				setNamespaceUri(NAMESPACE_URI_EDEFAULT);
				return;
			case ComrelPackage.MODEL_REFACTORING__INPUT_PORTS:
				getInputPorts().clear();
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
			case ComrelPackage.MODEL_REFACTORING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComrelPackage.MODEL_REFACTORING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ComrelPackage.MODEL_REFACTORING__REF_ID:
				return REF_ID_EDEFAULT == null ? refId != null : !REF_ID_EDEFAULT.equals(refId);
			case ComrelPackage.MODEL_REFACTORING__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case ComrelPackage.MODEL_REFACTORING__NAMESPACE_URI:
				return NAMESPACE_URI_EDEFAULT == null ? namespaceUri != null : !NAMESPACE_URI_EDEFAULT.equals(namespaceUri);
			case ComrelPackage.MODEL_REFACTORING__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == DescribedElement.class) {
			switch (derivedFeatureID) {
				case ComrelPackage.MODEL_REFACTORING__DESCRIPTION: return ComrelPackage.DESCRIBED_ELEMENT__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == DescribedElement.class) {
			switch (baseFeatureID) {
				case ComrelPackage.DESCRIBED_ELEMENT__DESCRIPTION: return ComrelPackage.MODEL_REFACTORING__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", refId: ");
		result.append(refId);
		result.append(", label: ");
		result.append(label);
		result.append(", namespaceUri: ");
		result.append(namespaceUri);
		result.append(')');
		return result.toString();
	}

} //ModelRefactoringImpl
