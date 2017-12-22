/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import java.util.Collection;
import java.util.Set;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Refactoring</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link comrel.CompositeRefactoring#getMainRefactoringUnit <em>Main Refactoring Unit</em>}</li>
 *   <li>{@link comrel.CompositeRefactoring#getPortMappings <em>Port Mappings</em>}</li>
 *   <li>{@link comrel.CompositeRefactoring#getModelRefactorings <em>Model Refactorings</em>}</li>
 *   <li>{@link comrel.CompositeRefactoring#getHelper <em>Helper</em>}</li>
 *   <li>{@link comrel.CompositeRefactoring#getMappingVisualization <em>Mapping Visualization</em>}</li>
 *   <li>{@link comrel.CompositeRefactoring#getCustomInitialCondition <em>Custom Initial Condition</em>}</li>
 *   <li>{@link comrel.CompositeRefactoring#getCustomFinalCondition <em>Custom Final Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see comrel.ComrelPackage#getCompositeRefactoring()
 * @model annotation="gmf.diagram foo='bar' onefile='false'"
 * @generated
 */
public interface CompositeRefactoring extends ModelRefactoring {
	/**
	 * Returns the value of the '<em><b>Main Refactoring Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Refactoring Unit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Refactoring Unit</em>' containment reference.
	 * @see #setMainRefactoringUnit(RefactoringUnit)
	 * @see comrel.ComrelPackage#getCompositeRefactoring_MainRefactoringUnit()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RefactoringUnit getMainRefactoringUnit();

	/**
	 * Sets the value of the '{@link comrel.CompositeRefactoring#getMainRefactoringUnit <em>Main Refactoring Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Refactoring Unit</em>' containment reference.
	 * @see #getMainRefactoringUnit()
	 * @generated
	 */
	void setMainRefactoringUnit(RefactoringUnit value);

	/**
	 * Returns the value of the '<em><b>Port Mappings</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.PortMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Mappings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port Mappings</em>' containment reference list.
	 * @see comrel.ComrelPackage#getCompositeRefactoring_PortMappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<PortMapping> getPortMappings();

	/**
	 * Returns the value of the '<em><b>Model Refactorings</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.ModelRefactoring}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model Refactorings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model Refactorings</em>' containment reference list.
	 * @see comrel.ComrelPackage#getCompositeRefactoring_ModelRefactorings()
	 * @model containment="true"
	 * @generated
	 */
	EList<ModelRefactoring> getModelRefactorings();

	/**
	 * Returns the value of the '<em><b>Helper</b></em>' containment reference list.
	 * The list contents are of type {@link comrel.Helper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Helper</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Helper</em>' containment reference list.
	 * @see comrel.ComrelPackage#getCompositeRefactoring_Helper()
	 * @model containment="true"
	 * @generated
	 */
	EList<Helper> getHelper();

	/**
	 * Returns the value of the '<em><b>Mapping Visualization</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link comrel.MappingVisualization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping Visualization</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Visualization</em>' attribute.
	 * @see comrel.MappingVisualization
	 * @see #setMappingVisualization(MappingVisualization)
	 * @see comrel.ComrelPackage#getCompositeRefactoring_MappingVisualization()
	 * @model default="0" required="true"
	 * @generated
	 */
	MappingVisualization getMappingVisualization();

	/**
	 * Sets the value of the '{@link comrel.CompositeRefactoring#getMappingVisualization <em>Mapping Visualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping Visualization</em>' attribute.
	 * @see comrel.MappingVisualization
	 * @see #getMappingVisualization()
	 * @generated
	 */
	void setMappingVisualization(MappingVisualization value);

	/**
	 * Returns the value of the '<em><b>Custom Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Initial Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Initial Condition</em>' attribute.
	 * @see #setCustomInitialCondition(String)
	 * @see comrel.ComrelPackage#getCompositeRefactoring_CustomInitialCondition()
	 * @model
	 * @generated
	 */
	String getCustomInitialCondition();

	/**
	 * Sets the value of the '{@link comrel.CompositeRefactoring#getCustomInitialCondition <em>Custom Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Initial Condition</em>' attribute.
	 * @see #getCustomInitialCondition()
	 * @generated
	 */
	void setCustomInitialCondition(String value);

	/**
	 * Returns the value of the '<em><b>Custom Final Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Final Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Final Condition</em>' attribute.
	 * @see #setCustomFinalCondition(String)
	 * @see comrel.ComrelPackage#getCompositeRefactoring_CustomFinalCondition()
	 * @model
	 * @generated
	 */
	String getCustomFinalCondition();

	/**
	 * Sets the value of the '{@link comrel.CompositeRefactoring#getCustomFinalCondition <em>Custom Final Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Final Condition</em>' attribute.
	 * @see #getCustomFinalCondition()
	 * @generated
	 */
	void setCustomFinalCondition(String value);
	
	public ModelRefactoring getModelRefactoring(String id);
	
	public Helper getHelper(String id);

	public SingleFeatureHelper getSingleFeatureHelper(String id);
	
	public MultiFeatureHelper getMultiFeatureHelper(String id);
	
	public Collection<ModelRefactoring> getEmfRefactoringsAsModelRefactorings();
	
	public ModelRefactoring getEmfRefactoringAsModelRefactoring(String id);	
	
	public MultiFilterHelper getMultiFilterHelper(String id);

	public SingleFilterHelper getSingleFilterHelper(String id);

	public boolean modelRefactoringInUse(ModelRefactoring ref, AtomicUnit context);

	public boolean helperInUse(Helper helper, HelperUnit context);

	public void removeUnusedModelRefactorings();

	public void removeUnusedHelper();

	public void setName(String newName, boolean updateRootUnit);

	public void setMappingNumbers(Set<Integer> mappingNumbers);

	public Set<Integer> getMappingNumbers();

	public void cleanUpMappingNumbers();

	public void updateVisualization();

} // CompositeRefactoring
