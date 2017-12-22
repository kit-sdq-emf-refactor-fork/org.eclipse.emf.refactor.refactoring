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

import comrel.ComrelPackage;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.RefactoringUnit;
import comrel.SequentialUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequential Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.SequentialUnitImpl#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.impl.SequentialUnitImpl#getRefactoringUnits <em>Refactoring Units</em>}</li>
 *   <li>{@link comrel.impl.SequentialUnitImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link comrel.impl.SequentialUnitImpl#isStrict <em>Strict</em>}</li>
 *   <li>{@link comrel.impl.SequentialUnitImpl#getType <em>Type</em>}</li>
 *   <li>{@link comrel.impl.SequentialUnitImpl#getLblStrict <em>Lbl Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequentialUnitImpl extends CompositeUnitImpl implements SequentialUnit {
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
	 * The cached value of the '{@link #getRefactoringUnits() <em>Refactoring Units</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefactoringUnits()
	 * @generated
	 * @ordered
	 */
	protected EList<RefactoringUnit> refactoringUnits;

	/**
	 * The cached value of the '{@link #getInputPorts() <em>Input Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPort> inputPorts;

	/**
	 * The default value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STRICT_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isStrict() <em>Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean strict = STRICT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Sequential Unit";

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
	protected SequentialUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.SEQUENTIAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelperUnit> getHelperUnits() {
		if (helperUnits == null) {
			helperUnits = new EObjectContainmentEList<HelperUnit>(HelperUnit.class, this, ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS);
		}
		return helperUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefactoringUnit> getRefactoringUnits() {
		if (refactoringUnits == null) {
			refactoringUnits = new EObjectContainmentEList<RefactoringUnit>(RefactoringUnit.class, this, ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS);
		}
		return refactoringUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<InputPort>(InputPort.class, this, ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS);
		}
		return inputPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		return strict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setStrict(boolean newStrict) {
		boolean oldStrict = strict;
		strict = newStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SEQUENTIAL_UNIT__STRICT, oldStrict, strict));
		if (newStrict) setLblStrict("strict");
		else setLblStrict("non strict");
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SEQUENTIAL_UNIT__LBL_STRICT, oldLblStrict, lblStrict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateSeqExecutionOrder() {
		int index;
		for(RefactoringUnit unit : this.getRefactoringUnits()) {
			index = this.getRefactoringUnits().indexOf(unit)+1;
			unit.setSeqExecutionOrder(index,false);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS:
				return ((InternalEList<?>)getHelperUnits()).basicRemove(otherEnd, msgs);
			case ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS:
				return ((InternalEList<?>)getRefactoringUnits()).basicRemove(otherEnd, msgs);
			case ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS:
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
			case ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS:
				return getHelperUnits();
			case ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS:
				return getRefactoringUnits();
			case ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS:
				return getInputPorts();
			case ComrelPackage.SEQUENTIAL_UNIT__STRICT:
				return isStrict();
			case ComrelPackage.SEQUENTIAL_UNIT__TYPE:
				return getType();
			case ComrelPackage.SEQUENTIAL_UNIT__LBL_STRICT:
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
			case ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS:
				getHelperUnits().clear();
				getHelperUnits().addAll((Collection<? extends HelperUnit>)newValue);
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS:
				getRefactoringUnits().clear();
				getRefactoringUnits().addAll((Collection<? extends RefactoringUnit>)newValue);
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends InputPort>)newValue);
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__STRICT:
				setStrict((Boolean)newValue);
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__LBL_STRICT:
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
			case ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS:
				getHelperUnits().clear();
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS:
				getRefactoringUnits().clear();
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS:
				getInputPorts().clear();
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__STRICT:
				setStrict(STRICT_EDEFAULT);
				return;
			case ComrelPackage.SEQUENTIAL_UNIT__LBL_STRICT:
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
			case ComrelPackage.SEQUENTIAL_UNIT__HELPER_UNITS:
				return helperUnits != null && !helperUnits.isEmpty();
			case ComrelPackage.SEQUENTIAL_UNIT__REFACTORING_UNITS:
				return refactoringUnits != null && !refactoringUnits.isEmpty();
			case ComrelPackage.SEQUENTIAL_UNIT__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case ComrelPackage.SEQUENTIAL_UNIT__STRICT:
				return strict != STRICT_EDEFAULT;
			case ComrelPackage.SEQUENTIAL_UNIT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case ComrelPackage.SEQUENTIAL_UNIT__LBL_STRICT:
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
		result.append(" (strict: ");
		result.append(strict);
		result.append(", type: ");
		result.append(type);
		result.append(", lblStrict: ");
		result.append(lblStrict);
		result.append(')');
		return result.toString();
	}
	
	public EList<InputPort> getAllInputPorts() {
		return this.getInputPorts();
	}

} //SequentialUnitImpl
