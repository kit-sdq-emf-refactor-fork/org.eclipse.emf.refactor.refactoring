/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.ComrelPackage;
import comrel.ConditionCheck;
import comrel.ConditionalUnit;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.RefactoringUnit;

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
 * An implementation of the model object '<em><b>Conditional Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.ConditionalUnitImpl#getIf <em>If</em>}</li>
 *   <li>{@link comrel.impl.ConditionalUnitImpl#getHelperUnits <em>Helper Units</em>}</li>
 *   <li>{@link comrel.impl.ConditionalUnitImpl#getThen <em>Then</em>}</li>
 *   <li>{@link comrel.impl.ConditionalUnitImpl#getElse <em>Else</em>}</li>
 *   <li>{@link comrel.impl.ConditionalUnitImpl#getInputPorts <em>Input Ports</em>}</li>
 *   <li>{@link comrel.impl.ConditionalUnitImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalUnitImpl extends CompositeUnitImpl implements ConditionalUnit {
	/**
	 * The cached value of the '{@link #getIf() <em>If</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf()
	 * @generated
	 * @ordered
	 */
	protected ConditionCheck if_;

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
	 * The cached value of the '{@link #getThen() <em>Then</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThen()
	 * @generated
	 * @ordered
	 */
	protected RefactoringUnit then;

	/**
	 * The cached value of the '{@link #getElse() <em>Else</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElse()
	 * @generated
	 * @ordered
	 */
	protected RefactoringUnit else_;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = "Conditional Unit";

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
	protected ConditionalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.CONDITIONAL_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionCheck getIf() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf(ConditionCheck newIf, NotificationChain msgs) {
		ConditionCheck oldIf = if_;
		if_ = newIf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.CONDITIONAL_UNIT__IF, oldIf, newIf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIf(ConditionCheck newIf) {
		if (newIf != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.CONDITIONAL_UNIT__IF, null, msgs);
			if (newIf != null)
				msgs = ((InternalEObject)newIf).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.CONDITIONAL_UNIT__IF, null, msgs);
			msgs = basicSetIf(newIf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.CONDITIONAL_UNIT__IF, newIf, newIf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HelperUnit> getHelperUnits() {
		if (helperUnits == null) {
			helperUnits = new EObjectContainmentEList<HelperUnit>(HelperUnit.class, this, ComrelPackage.CONDITIONAL_UNIT__HELPER_UNITS);
		}
		return helperUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringUnit getThen() {
		return then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThen(RefactoringUnit newThen, NotificationChain msgs) {
		RefactoringUnit oldThen = then;
		then = newThen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.CONDITIONAL_UNIT__THEN, oldThen, newThen);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThen(RefactoringUnit newThen) {
		if (newThen != then) {
			NotificationChain msgs = null;
			if (then != null)
				msgs = ((InternalEObject)then).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.CONDITIONAL_UNIT__THEN, null, msgs);
			if (newThen != null)
				msgs = ((InternalEObject)newThen).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.CONDITIONAL_UNIT__THEN, null, msgs);
			msgs = basicSetThen(newThen, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.CONDITIONAL_UNIT__THEN, newThen, newThen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringUnit getElse() {
		return else_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElse(RefactoringUnit newElse, NotificationChain msgs) {
		RefactoringUnit oldElse = else_;
		else_ = newElse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.CONDITIONAL_UNIT__ELSE, oldElse, newElse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElse(RefactoringUnit newElse) {
		if (newElse != else_) {
			NotificationChain msgs = null;
			if (else_ != null)
				msgs = ((InternalEObject)else_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.CONDITIONAL_UNIT__ELSE, null, msgs);
			if (newElse != null)
				msgs = ((InternalEObject)newElse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.CONDITIONAL_UNIT__ELSE, null, msgs);
			msgs = basicSetElse(newElse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.CONDITIONAL_UNIT__ELSE, newElse, newElse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getInputPorts() {
		if (inputPorts == null) {
			inputPorts = new EObjectContainmentEList<InputPort>(InputPort.class, this, ComrelPackage.CONDITIONAL_UNIT__INPUT_PORTS);
		}
		return inputPorts;
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
			case ComrelPackage.CONDITIONAL_UNIT__IF:
				return basicSetIf(null, msgs);
			case ComrelPackage.CONDITIONAL_UNIT__HELPER_UNITS:
				return ((InternalEList<?>)getHelperUnits()).basicRemove(otherEnd, msgs);
			case ComrelPackage.CONDITIONAL_UNIT__THEN:
				return basicSetThen(null, msgs);
			case ComrelPackage.CONDITIONAL_UNIT__ELSE:
				return basicSetElse(null, msgs);
			case ComrelPackage.CONDITIONAL_UNIT__INPUT_PORTS:
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
			case ComrelPackage.CONDITIONAL_UNIT__IF:
				return getIf();
			case ComrelPackage.CONDITIONAL_UNIT__HELPER_UNITS:
				return getHelperUnits();
			case ComrelPackage.CONDITIONAL_UNIT__THEN:
				return getThen();
			case ComrelPackage.CONDITIONAL_UNIT__ELSE:
				return getElse();
			case ComrelPackage.CONDITIONAL_UNIT__INPUT_PORTS:
				return getInputPorts();
			case ComrelPackage.CONDITIONAL_UNIT__TYPE:
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
			case ComrelPackage.CONDITIONAL_UNIT__IF:
				setIf((ConditionCheck)newValue);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__HELPER_UNITS:
				getHelperUnits().clear();
				getHelperUnits().addAll((Collection<? extends HelperUnit>)newValue);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__THEN:
				setThen((RefactoringUnit)newValue);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__ELSE:
				setElse((RefactoringUnit)newValue);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__INPUT_PORTS:
				getInputPorts().clear();
				getInputPorts().addAll((Collection<? extends InputPort>)newValue);
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
			case ComrelPackage.CONDITIONAL_UNIT__IF:
				setIf((ConditionCheck)null);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__HELPER_UNITS:
				getHelperUnits().clear();
				return;
			case ComrelPackage.CONDITIONAL_UNIT__THEN:
				setThen((RefactoringUnit)null);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__ELSE:
				setElse((RefactoringUnit)null);
				return;
			case ComrelPackage.CONDITIONAL_UNIT__INPUT_PORTS:
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
			case ComrelPackage.CONDITIONAL_UNIT__IF:
				return if_ != null;
			case ComrelPackage.CONDITIONAL_UNIT__HELPER_UNITS:
				return helperUnits != null && !helperUnits.isEmpty();
			case ComrelPackage.CONDITIONAL_UNIT__THEN:
				return then != null;
			case ComrelPackage.CONDITIONAL_UNIT__ELSE:
				return else_ != null;
			case ComrelPackage.CONDITIONAL_UNIT__INPUT_PORTS:
				return inputPorts != null && !inputPorts.isEmpty();
			case ComrelPackage.CONDITIONAL_UNIT__TYPE:
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

} //ConditionalUnitImpl
