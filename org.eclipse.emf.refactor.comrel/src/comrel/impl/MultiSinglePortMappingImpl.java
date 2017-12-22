/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.ComrelPackage;
import comrel.MultiPort;
import comrel.MultiSinglePortMapping;
import comrel.SingleInputPort;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multi Single Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.MultiSinglePortMappingImpl#getSource <em>Source</em>}</li>
 *   <li>{@link comrel.impl.MultiSinglePortMappingImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MultiSinglePortMappingImpl extends PortMappingImpl implements MultiSinglePortMapping {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected MultiPort source;

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
	protected MultiSinglePortMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.MULTI_SINGLE_PORT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPort getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (MultiPort)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.MULTI_SINGLE_PORT_MAPPING__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPort basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(MultiPort newSource) {
		this.resetVisualization();
		MultiPort oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_SINGLE_PORT_MAPPING__SOURCE, oldSource, source));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComrelPackage.MULTI_SINGLE_PORT_MAPPING__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.MULTI_SINGLE_PORT_MAPPING__TARGET, oldTarget, target));
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
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__TARGET:
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
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__SOURCE:
				setSource((MultiPort)newValue);
				return;
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__TARGET:
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
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__SOURCE:
				setSource((MultiPort)null);
				return;
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__TARGET:
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
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__SOURCE:
				return source != null;
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //MultiSinglePortMappingImpl
