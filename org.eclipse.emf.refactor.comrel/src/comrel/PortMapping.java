/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import org.eclipse.emf.ecore.EObject;

import comrel.figures.PortMappingFigure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see comrel.ComrelPackage#getPortMapping()
 * @model abstract="true"
 * @generated
 */
public interface PortMapping extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Port getSource();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	InputPort getTarget();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updatePortTypesAndNames(Class type, String singularPortName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateMappingNumber();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void updateVisualization();
	
	public void setMappingNumber(int mappingNumber);

	public int getMappingNumber();
	
	public void setFigure(PortMappingFigure figure);

	public PortMappingFigure getFigure();
	
	public boolean isVisible();

	public void setVisible(boolean visible);

} // PortMapping
