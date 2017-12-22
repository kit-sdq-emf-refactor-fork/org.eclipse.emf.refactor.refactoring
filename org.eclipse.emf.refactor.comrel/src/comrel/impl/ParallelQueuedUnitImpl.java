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

import comrel.ComrelFactory;
import comrel.ComrelPackage;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.MultiInputPort;
import comrel.ParallelQueuedUnit;
import comrel.RefactoringUnit;
import comrel.SingleInputPort;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parallel Queued Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.ParallelQueuedUnitImpl#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.impl.ParallelQueuedUnitImpl#getRefactoringUnits <em>Refactoring Units</em>}</li>
 *   <li>{@link comrel.impl.ParallelQueuedUnitImpl#getSingleInputPorts <em>Single Input Ports</em>}</li>
 *   <li>{@link comrel.impl.ParallelQueuedUnitImpl#getMultiInputPorts <em>Multi Input Ports</em>}</li>
 *   <li>{@link comrel.impl.ParallelQueuedUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link comrel.impl.ParallelQueuedUnitImpl#getLblStrict <em>Lbl Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParallelQueuedUnitImpl extends TwicedQueuedUnitImpl implements ParallelQueuedUnit {
	/**
	 * The cached value of the '{@link #getHelperUnits() <em>Helper Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelperUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<HelperUnit> helperUnits;

	/**
	 * The cached value of the '{@link #getRefactoringUnits() <em>Refactoring Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefactoringUnits()
	 * @generated
	 * @ordered
	 */
	protected RefactoringUnit refactoringUnits;

	/**
	 * The cached value of the '{@link #getSingleInputPorts() <em>Single Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSingleInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleInputPort> singleInputPorts;

	/**
	 * The cached value of the '{@link #getMultiInputPorts() <em>Multi Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<MultiInputPort> multiInputPorts;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Parallel Queued Unit";

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
	 * The default value of the '{@link #getLblStrict() <em>Lbl Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblStrict()
	 * @generated
	 * @ordered
	 */
	protected static final String LBL_STRICT_EDEFAULT = "strict";

	/**
	 * The cached value of the '{@link #getLblStrict() <em>Lbl Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLblStrict()
	 * @generated
	 * @ordered
	 */
	protected String lblStrict = LBL_STRICT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParallelQueuedUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.PARALLEL_QUEUED_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelperUnit> getHelperUnits() {
		if (helperUnits == null) {
			helperUnits = new EObjectContainmentEList<HelperUnit>(HelperUnit.class, this, ComrelPackage.PARALLEL_QUEUED_UNIT__HELPER_UNITS);
		}
		return helperUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringUnit getRefactoringUnits() {
		return refactoringUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefactoringUnits(RefactoringUnit newRefactoringUnits, NotificationChain msgs) {
		RefactoringUnit oldRefactoringUnits = refactoringUnits;
		refactoringUnits = newRefactoringUnits;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS, oldRefactoringUnits, newRefactoringUnits);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefactoringUnits(RefactoringUnit newRefactoringUnits) {
		if (newRefactoringUnits != refactoringUnits) {
			NotificationChain msgs = null;
			if (refactoringUnits != null)
				msgs = ((InternalEObject)refactoringUnits).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS, null, msgs);
			if (newRefactoringUnits != null)
				msgs = ((InternalEObject)newRefactoringUnits).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS, null, msgs);
			msgs = basicSetRefactoringUnits(newRefactoringUnits, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS, newRefactoringUnits, newRefactoringUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleInputPort> getSingleInputPorts() {
		if (singleInputPorts == null) {
			singleInputPorts = new EObjectContainmentEList<SingleInputPort>(SingleInputPort.class, this, ComrelPackage.PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS);
		}
		return singleInputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MultiInputPort> getMultiInputPorts() {
		if (multiInputPorts == null) {
			multiInputPorts = new EObjectContainmentEList<MultiInputPort>(MultiInputPort.class, this, ComrelPackage.PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS);
		}
		return multiInputPorts;
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
	public String getLblStrict() {
		return lblStrict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLblStrict(String newLblStrict) {
		String oldLblStrict = lblStrict;
		lblStrict = newLblStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.PARALLEL_QUEUED_UNIT__LBL_STRICT, oldLblStrict, lblStrict));
	}
	
	@Override
	public void setStrict(boolean newStrict) {
		super.setStrict(newStrict);
		if (newStrict) setLblStrict("strict");
		else setLblStrict("non strict");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.PARALLEL_QUEUED_UNIT__HELPER_UNITS:
				return ((InternalEList<?>)getHelperUnits()).basicRemove(otherEnd, msgs);
			case ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS:
				return basicSetRefactoringUnits(null, msgs);
			case ComrelPackage.PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS:
				return ((InternalEList<?>)getSingleInputPorts()).basicRemove(otherEnd, msgs);
			case ComrelPackage.PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS:
				return ((InternalEList<?>)getMultiInputPorts()).basicRemove(otherEnd, msgs);
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
			case ComrelPackage.PARALLEL_QUEUED_UNIT__HELPER_UNITS:
				return getHelperUnits();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS:
				return getRefactoringUnits();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS:
				return getSingleInputPorts();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS:
				return getMultiInputPorts();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__TYPE:
				return getType();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__LBL_STRICT:
				return getLblStrict();
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
			case ComrelPackage.PARALLEL_QUEUED_UNIT__HELPER_UNITS:
				getHelperUnits().clear();
				getHelperUnits().addAll((Collection<? extends HelperUnit>)newValue);
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS:
				setRefactoringUnits((RefactoringUnit)newValue);
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS:
				getSingleInputPorts().clear();
				getSingleInputPorts().addAll((Collection<? extends SingleInputPort>)newValue);
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS:
				getMultiInputPorts().clear();
				getMultiInputPorts().addAll((Collection<? extends MultiInputPort>)newValue);
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__LBL_STRICT:
				setLblStrict((String)newValue);
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
			case ComrelPackage.PARALLEL_QUEUED_UNIT__HELPER_UNITS:
				getHelperUnits().clear();
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS:
				setRefactoringUnits((RefactoringUnit)null);
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS:
				getSingleInputPorts().clear();
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS:
				getMultiInputPorts().clear();
				return;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__LBL_STRICT:
				setLblStrict(LBL_STRICT_EDEFAULT);
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
			case ComrelPackage.PARALLEL_QUEUED_UNIT__HELPER_UNITS:
				return helperUnits != null && !helperUnits.isEmpty();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__REFACTORING_UNITS:
				return refactoringUnits != null;
			case ComrelPackage.PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS:
				return singleInputPorts != null && !singleInputPorts.isEmpty();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS:
				return multiInputPorts != null && !multiInputPorts.isEmpty();
			case ComrelPackage.PARALLEL_QUEUED_UNIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComrelPackage.PARALLEL_QUEUED_UNIT__LBL_STRICT:
				return LBL_STRICT_EDEFAULT == null ? lblStrict != null : !LBL_STRICT_EDEFAULT.equals(lblStrict);
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
		result.append(", lblStrict: ");
		result.append(lblStrict);
		result.append(')');
		return result.toString();
	}
	
	public void init(){
		ComrelFactory factory = ComrelFactory.eINSTANCE;
		MultiInputPort one = factory.createMultiInputPort();
		MultiInputPort two = factory.createMultiInputPort();
		this.getMultiInputPorts().add(one);
		this.getMultiInputPorts().add(two);
	}
	
	public EList<InputPort> getAllInputPorts() {
		EList<InputPort> inputPorts = new BasicEList<InputPort>();
		inputPorts.addAll(this.getSingleInputPorts());
		inputPorts.addAll(this.getMultiInputPorts());
		return inputPorts;
	}
	
	

} //ParallelQueuedUnitImpl
