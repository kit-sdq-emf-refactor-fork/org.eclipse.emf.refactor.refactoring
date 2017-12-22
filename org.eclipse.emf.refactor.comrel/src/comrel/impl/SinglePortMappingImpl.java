/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.ComrelPackage;
import comrel.SingleInputPort;
import comrel.SinglePort;
import comrel.SinglePortMapping;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.SinglePortMappingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link comrel.impl.SinglePortMappingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SinglePortMappingImpl extends PortMappingImpl implements SinglePortMapping {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SinglePort source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SingleInputPort target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SinglePortMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.SINGLE_PORT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SinglePort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.SINGLE_PORT_MAPPING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SinglePort newSource) {
		this.resetVisualization();
		SinglePort oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_PORT_MAPPING__SOURCE, oldSource, source));
		if(source != null && target != null){
			if (source.getType() != null) {
				updatePortTypesAndNames(source.getType(),source.getSingularPortName());
			} else {
				updatePortTypesAndNames(target.getType(),target.getSingularPortName());
			}
			updateMappingNumber();
		}
		else {
			this.updateCRVisualization();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleInputPort getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SingleInputPort)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.SINGLE_PORT_MAPPING__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleInputPort basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SingleInputPort newTarget) {
		this.resetVisualization();
		SingleInputPort oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.SINGLE_PORT_MAPPING__TARGET, oldTarget, target));
		if(source != null && target != null){
			if (target.getType() != null) {
				updatePortTypesAndNames(target.getType(),target.getSingularPortName());
			} else {
				updatePortTypesAndNames(source.getType(),source.getSingularPortName());
			}
			updateMappingNumber();
		}
		else {
			this.updateCRVisualization();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComrelPackage.SINGLE_PORT_MAPPING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ComrelPackage.SINGLE_PORT_MAPPING__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case ComrelPackage.SINGLE_PORT_MAPPING__SOURCE:
				setSource((SinglePort)newValue);
				return;
			case ComrelPackage.SINGLE_PORT_MAPPING__TARGET:
				setTarget((SingleInputPort)newValue);
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
			case ComrelPackage.SINGLE_PORT_MAPPING__SOURCE:
				setSource((SinglePort)null);
				return;
			case ComrelPackage.SINGLE_PORT_MAPPING__TARGET:
				setTarget((SingleInputPort)null);
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
			case ComrelPackage.SINGLE_PORT_MAPPING__SOURCE:
				return source != null;
			case ComrelPackage.SINGLE_PORT_MAPPING__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //SinglePortMappingImpl
