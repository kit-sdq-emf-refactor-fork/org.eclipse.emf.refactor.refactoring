/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import java.util.ArrayList;

import org.eclipse.draw2d.Shape;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.swt.graphics.Color;

import comrel.CompositeRefactoring;
import comrel.ComrelPackage;
import comrel.InputPort;
import comrel.MappingVisualization;
import comrel.Port;
import comrel.PortMapping;
import comrel.figures.InputPortFigure;
import comrel.figures.OutputPortFigure;
import comrel.figures.PortMappingFigure;
import comrel.util.ComrelUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PortMappingImpl extends EObjectImpl implements PortMapping {
	
	public boolean visible = true;

	public PortMappingFigure figure;

	public int mappingNumber = Integer.MAX_VALUE;
	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.PORT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port getSource() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPort getTarget() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updatePortTypesAndNames(Class type, String singularPortName) {
		if (type != null) {
			if (getSource() != null && getTarget() != null) {
				getSource().updatePortName(singularPortName);
				getTarget().updatePortName(singularPortName);
				if (getSource().getType() == null
						&& getTarget().getType() == null) {
					return;
				}
				boolean flag = false;
				if (!ComrelUtil.portIsSettable(getSource())) {
					if (getSource().getType() == null
							|| !getSource().getType().equals(type)) {
						updatePortTypesAndNames(getSource().getType(),
								getSource().getSingularPortName());
						return;
					}
				}
				if (!ComrelUtil.portIsSettable(getTarget())) {
					if (getTarget().getType() == null
							|| !getTarget().getType().equals(type)) {
						updatePortTypesAndNames(getTarget().getType(),
								getTarget().getSingularPortName());
						return;
					}
				}
				getSource().updatePortName(singularPortName);
				getTarget().updatePortName(singularPortName);
				if (getSource().getType() == null
						|| !getSource().getType().equals(type)) {
					getSource().setType(type, false);
					flag = true;
				}
				if (getTarget().getType() == null
						|| !getTarget().getType().equals(type)) {
					getTarget().setType(type, false);
					flag = true;
				}
				if (flag) {
					CompositeRefactoring refSys = ComrelUtil
							.getContainedCompositeRefactoring(getSource());

					boolean con;
					for (PortMapping map : refSys.getPortMappings()) {
						if (map != this) {
							con = map.getSource() == this.getSource();
							con |= map.getSource() == this.getTarget();
							con |= map.getTarget() == this.getSource();
							con |= map.getTarget() == this.getTarget();
							if (con) {
								map.updatePortTypesAndNames(type,
										singularPortName);
							}
						}
					}
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateMappingNumber() {
		int mNumber = Integer.MAX_VALUE;

		CompositeRefactoring cr = this.getCompositeRefactoring();
		if (cr == null) {
			this.setMappingNumber(Integer.MAX_VALUE);
			return;
		}
		boolean con;
		ArrayList<PortMapping> tMappings = new ArrayList<PortMapping>();
		if (cr.getPortMappings() != null) {

			for (PortMapping map : cr.getPortMappings()) {
				if (map != this) {
					con = map.getSource() == this.getSource();
					con |= map.getSource() == this.getTarget();
					con |= map.getTarget() == this.getSource();
					con |= map.getTarget() == this.getTarget();
					if (con) {
						mNumber = Math.min(mNumber, map.getMappingNumber());
						tMappings.add(map);
					}
				}
			}
		}
		if (mNumber == Integer.MAX_VALUE) {
			mNumber = 1;

			while (cr.getMappingNumbers().contains(mNumber)) {
				mNumber++;
			}
		}
		cr.getMappingNumbers().add(mNumber);
		this.setMappingNumber(mNumber);

		for (PortMapping m : tMappings) {
			if (m.getMappingNumber() != mNumber) {
				m.updateMappingNumber();
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void updateVisualization() {
		if (mappingNumber == Integer.MAX_VALUE)
			updateMappingNumber();
		if (figure == null) {
			return;
		}
		CompositeRefactoring refSys = this.getCompositeRefactoring();
		if (refSys == null) {
			return;
		}
		this.resetVisualization();
		MappingVisualization visualization = refSys.getMappingVisualization();
		Color bg;
		switch (visualization.getValue()) {
		case MappingVisualization.ARROWS_VALUE:
			this.figure.setVisible(true);
			this.setVisible(false);
			break;
		case MappingVisualization.COLORED_PORTS_VALUE:
			bg = ComrelUtil.getColor(this.getMappingNumber());
			this.figure.setVisible(false);
			this.setColoredPorts(bg);
			break;
		case MappingVisualization.INDICES_VALUE:
			this.figure.setVisible(false);
			this.setPortIndexVisualization(true);
			break;
		case MappingVisualization.ARROWS_AND_COLORED_PORTS_VALUE:
			bg = ComrelUtil.getColor(this.getMappingNumber());
			this.figure.setVisible(true);
			this.setColoredPorts(bg);
			break;
		case MappingVisualization.ARROWS_AND_INDICES_VALUE:
			this.figure.setVisible(true);
			this.setPortIndexVisualization(true);
			break;
		}
	}
	
	private CompositeRefactoring getCompositeRefactoring() {
		CompositeRefactoring cr = ComrelUtil.getContainedCompositeRefactoring(this);
		return cr;
	}
	
	public void setMappingNumber(int mappingNumber) {
		CompositeRefactoring cr = this.getCompositeRefactoring();
		this.mappingNumber = mappingNumber;
		if (cr != null) {
			cr.getMappingNumbers().add(mappingNumber);
		}
	}

	public int getMappingNumber() {
		return mappingNumber;
	}
	
	public void setFigure(PortMappingFigure figure) {
		this.figure = figure;
		this.updateVisualization();
	}

	public PortMappingFigure getFigure() {
		return figure;
	}
	
	private void setColoredPorts(Color bg) {
		if (this.getSource() != null) {
			if (this.getSource().getFigure() != null) {
				this.getSource().getFigure().setBackgroundColor(bg);
			}
		}
		if (this.getTarget() != null) {
			if (this.getTarget().getFigure() != null) {
				this.getTarget().getFigure().setBackgroundColor(bg);
			}
		}
	}

	protected void resetVisualization() {
		if (this.figure != null) {
			this.figure.setVisible(true);
			this.setVisible(true);
		}
		Color bg = new Color(null, 255, 255, 255);
		this.setColoredPorts(bg);
		setPortIndexVisualization(false);
	}

	private void setPortIndexVisualization(boolean visualization) {
		if (this.getSource() != null) {
			setPortIndexVisualization(this.getSource(), visualization);
		}
		if (this.getTarget() != null) {
			setPortIndexVisualization(this.getTarget(), visualization);
		}
	}

	private void setPortIndexVisualization(Port p, boolean visible) {
		Shape f = null;
		if (p.getFigure() != null) {
			f = p.getFigure();
			if (f instanceof InputPortFigure) {
				InputPortFigure i = ((InputPortFigure) f);
				i.setLabel("" + this.getMappingNumber());
				i.getLabel().setVisible(visible);
			}
			if (f instanceof OutputPortFigure) {
				OutputPortFigure o = ((OutputPortFigure) f);
				o.setLabel("" + this.getMappingNumber());
				o.getLabel().setVisible(visible);
			}
		}
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;

	}

	protected void updateCRVisualization() {
		CompositeRefactoring cr = ComrelUtil.getContainedCompositeRefactoring(this);
		if (cr != null) {
			cr.updateVisualization();
		}
	}	

} //PortMappingImpl
