/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

import comrel.CompositeRefactoring;
import comrel.ComrelPackage;
import comrel.InputPort;
import comrel.RefactoringUnit;
import comrel.SequentialUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refactoring Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.RefactoringUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link comrel.impl.RefactoringUnitImpl#getSeqExecutionOrder <em>Seq Execution Order</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RefactoringUnitImpl extends EObjectImpl implements RefactoringUnit {
	
	public RoundedRectangle figure;
	
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
	 * The default value of the '{@link #getSeqExecutionOrder() <em>Seq Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqExecutionOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int SEQ_EXECUTION_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSeqExecutionOrder() <em>Seq Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeqExecutionOrder()
	 * @generated
	 * @ordered
	 */
	protected int seqExecutionOrder = SEQ_EXECUTION_ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefactoringUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.REFACTORING_UNIT;
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
		this.setName(newName, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSeqExecutionOrder() {
		return seqExecutionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqExecutionOrder(int newSeqExecutionOrder) {
		int oldSeqExecutionOrder = seqExecutionOrder;
		this.setSeqExecutionOrder(newSeqExecutionOrder,
				this.eContainer() instanceof SequentialUnit);


		// seqExecutionOrder = newSeqExecutionOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(
					this,
					Notification.SET,
					ComrelPackage.REFACTORING_UNIT__SEQ_EXECUTION_ORDER,
					oldSeqExecutionOrder, seqExecutionOrder));
		if(figure != null) {
			setFigureLabel(":"+this.getName() + " - #" + this.getSeqExecutionOrder());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPort> getAllInputPorts() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeqExecutionOrder(int seqExecutionOrder, boolean superCall) {
		if (superCall) {
			SequentialUnit seqUnit = null;
			if (this.eContainer() instanceof SequentialUnit) {
				seqUnit = (SequentialUnit) this.eContainer();
			}

			if (seqUnit != null) {
				int lastIndex = seqUnit.getRefactoringUnits().size();
				boolean condition = seqExecutionOrder > 0;

				condition &= lastIndex >= seqExecutionOrder;
				if (condition) {
					seqUnit.getRefactoringUnits().move(seqExecutionOrder - 1,
							this);
				} else {
					if (seqExecutionOrder <= 0) {
						seqUnit.getRefactoringUnits().move(0, this);
					} else {
						seqUnit.getRefactoringUnits().move(lastIndex - 1, this);
					}
				}
				seqUnit.updateSeqExecutionOrder();
			}
		} else {
			this.seqExecutionOrder = seqExecutionOrder;
		}
		if(figure != null) {
			setFigureLabel(":"+this.getName() + " - #" + this.getSeqExecutionOrder());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName, boolean updateContainer) {
		String oldName = name;
		name = newName;
		if (updateContainer) {
			if (this.eContainer() != null) {
				if (this.eContainer() instanceof CompositeRefactoring) {
					((CompositeRefactoring) this.eContainer()).setName(newName,
							false);
				}
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComrelPackage.REFACTORING_UNIT__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComrelPackage.REFACTORING_UNIT__NAME:
				return getName();
			case ComrelPackage.REFACTORING_UNIT__SEQ_EXECUTION_ORDER:
				return getSeqExecutionOrder();
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
			case ComrelPackage.REFACTORING_UNIT__NAME:
				setName((String)newValue);
				return;
			case ComrelPackage.REFACTORING_UNIT__SEQ_EXECUTION_ORDER:
				setSeqExecutionOrder((Integer)newValue);
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
			case ComrelPackage.REFACTORING_UNIT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ComrelPackage.REFACTORING_UNIT__SEQ_EXECUTION_ORDER:
				setSeqExecutionOrder(SEQ_EXECUTION_ORDER_EDEFAULT);
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
			case ComrelPackage.REFACTORING_UNIT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ComrelPackage.REFACTORING_UNIT__SEQ_EXECUTION_ORDER:
				return seqExecutionOrder != SEQ_EXECUTION_ORDER_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", seqExecutionOrder: ");
		result.append(seqExecutionOrder);
		result.append(')');
		return result.toString();
	}
	
	public RoundedRectangle getFigure() {
		return figure;
	}

	public void setFigure(RoundedRectangle figure) {
		this.figure = figure;
		setFigureLabel(":"+this.getDesc() + " - #" + this.getSeqExecutionOrder());
	}
	
	public String getDesc(){
		return "";
	}
	
	public void setFigureLabel(String text) {
		if(figure!=null){
		WrappingLabel label = (WrappingLabel) figure.getChildren().get(0);
		label.setText(text);
		}
	}

} //RefactoringUnitImpl
