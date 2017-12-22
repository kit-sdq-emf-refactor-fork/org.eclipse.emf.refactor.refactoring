/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import org.eclipse.draw2d.Shape;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import comrel.CompositeRefactoring;
import comrel.ComrelPackage;
import comrel.DescribedElement;
import comrel.InputPort;
import comrel.OutputPort;
import comrel.Port;
import comrel.PortMapping;
import comrel.SinglePort;
import comrel.figures.InputPortFigure;
import comrel.figures.OutputPortFigure;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link comrel.impl.PortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link comrel.impl.PortImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PortImpl extends EObjectImpl implements Port {
	
	public Shape figure;

	public Shape getFigure() {
		return figure;
	}

	public void setFigure(Shape figure) {
		this.figure = figure;
	}
	
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Class type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.PORT;
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
		if (ComrelUtil.portIsSettable(this)) {
			String oldName = name;
			name = newName;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.PORT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.PORT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class newType) {
		this.setType(newType, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Class newType, boolean initiator) {
		if (ComrelUtil.portIsSettable(this)) {
			Class oldType = type;
			type = newType;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET,
						ComrelPackage.PORT__TYPE, oldType, type));
			if (initiator && this.eContainer() != null) {
				CompositeRefactoring cr = ComrelUtil.getContainedCompositeRefactoring(this);
				for (PortMapping pm : cr.getPortMappings()) {
					if (pm.getSource() == this || pm.getTarget() == this) {
						pm.updatePortTypesAndNames(newType, this
								.getSingularPortName());
						return;
					}
				}
			}
		}
//		updateFigure();
	}

	private void updateFigure() {
		if (this.getFigure() != null) {
			if (this instanceof InputPort) {
				InputPortFigure f = (InputPortFigure) this.getFigure();
				f.updateFigure();
			} else if (this instanceof OutputPort) {
				OutputPortFigure f = (OutputPortFigure) this.getFigure();
				f.updateFigure();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePortName(String singularPortName) {
		// new
		if (this.name != null && ! this.name.isEmpty()) return;
		// end new
		if (this instanceof SinglePort) {
			this.setName(singularPortName);
		} else {
			String pluralPortName = ComrelUtil
					.convertSingularToPluralPortName(singularPortName);
			this.setName(pluralPortName);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSingularPortName() {
		if (getName() == null) {
			return "";
		}
		if (this instanceof SinglePort) {
			return this.getName();
		} else {
			String singularPortName = ComrelUtil.convertPluralToSingularPortName(this
					.getName());
			return singularPortName;
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
			case ComrelPackage.PORT__NAME:
				return getName();
			case ComrelPackage.PORT__DESCRIPTION:
				return getDescription();
			case ComrelPackage.PORT__TYPE:
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
			case ComrelPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case ComrelPackage.PORT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ComrelPackage.PORT__TYPE:
				setType((Class)newValue);
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
			case ComrelPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComrelPackage.PORT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ComrelPackage.PORT__TYPE:
				setType((Class)null);
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
			case ComrelPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComrelPackage.PORT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ComrelPackage.PORT__TYPE:
				return type != null;
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
				case ComrelPackage.PORT__DESCRIPTION: return ComrelPackage.DESCRIBED_ELEMENT__DESCRIPTION;
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
				case ComrelPackage.DESCRIBED_ELEMENT__DESCRIPTION: return ComrelPackage.PORT__DESCRIPTION;
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
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //PortImpl
