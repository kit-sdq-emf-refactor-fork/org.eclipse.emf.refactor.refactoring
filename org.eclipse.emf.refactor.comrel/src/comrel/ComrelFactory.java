/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see comrel.ComrelPackage
 * @generated
 */
public interface ComrelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComrelFactory eINSTANCE = comrel.impl.ComrelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Composite Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Composite Refactoring</em>'.
	 * @generated
	 */
	CompositeRefactoring createCompositeRefactoring();

	/**
	 * Returns a new object of class '<em>Model Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Refactoring</em>'.
	 * @generated
	 */
	ModelRefactoring createModelRefactoring();
	
	/**
	 * Returns a new object of class '<em>Model Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model Refactoring</em>'.
	 */
	ModelRefactoring createModelRefactoring(String id);

	/**
	 * Returns a new object of class '<em>Atomic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Unit</em>'.
	 * @generated
	 */
	AtomicUnit createAtomicUnit();
	
	/**
	 * Returns a new object of class '<em>Atomic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atomic Unit</em>'.
	 */
	AtomicUnit createAtomicUnit(ModelRefactoring refactoring);

	/**
	 * Returns a new object of class '<em>Sequential Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequential Unit</em>'.
	 * @generated
	 */
	SequentialUnit createSequentialUnit();

	/**
	 * Returns a new object of class '<em>Condition Check</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Check</em>'.
	 * @generated
	 */
	ConditionCheck createConditionCheck();

	/**
	 * Returns a new object of class '<em>Conditional Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Unit</em>'.
	 * @generated
	 */
	ConditionalUnit createConditionalUnit();

	/**
	 * Returns a new object of class '<em>Single Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Queued Unit</em>'.
	 * @generated
	 */
	SingleQueuedUnit createSingleQueuedUnit();

	/**
	 * Returns a new object of class '<em>Cartesian Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cartesian Queued Unit</em>'.
	 * @generated
	 */
	CartesianQueuedUnit createCartesianQueuedUnit();

	/**
	 * Returns a new object of class '<em>Parallel Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Queued Unit</em>'.
	 * @generated
	 */
	ParallelQueuedUnit createParallelQueuedUnit();

	/**
	 * Returns a new object of class '<em>Single Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Feature Unit</em>'.
	 * @generated
	 */
	SingleFeatureUnit createSingleFeatureUnit();
	
	/**
	 * Returns a new object of class '<em>Single Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Feature Unit</em>'.
	 */
	SingleFeatureUnit createSingleFeatureUnit(SingleFeatureHelper helper);

	/**
	 * Returns a new object of class '<em>Multi Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Feature Unit</em>'.
	 * @generated
	 */
	MultiFeatureUnit createMultiFeatureUnit();
	
	/**
	 * Returns a new object of class '<em>Multi Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Feature Unit</em>'.
	 */
	MultiFeatureUnit createMultiFeatureUnit(MultiFeatureHelper helper);

	/**
	 * Returns a new object of class '<em>Single Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Filter Unit</em>'.
	 * @generated
	 */
	SingleFilterUnit createSingleFilterUnit();
	
	/**
	 * Returns a new object of class '<em>Single Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Filter Unit</em>'.
	 * @generated
	 */
	SingleFilterUnit createSingleFilterUnit(SingleFilterHelper helper);

	/**
	 * Returns a new object of class '<em>Multi Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Filter Unit</em>'.
	 * @generated
	 */
	MultiFilterUnit createMultiFilterUnit();
	
	/**
	 * Returns a new object of class '<em>Multi Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Filter Unit</em>'.
	 * @generated
	 */
	MultiFilterUnit createMultiFilterUnit(MultiFilterHelper helper);

	/**
	 * Returns a new object of class '<em>Single Feature Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Feature Helper</em>'.
	 * @generated
	 */
	SingleFeatureHelper createSingleFeatureHelper();

	/**
	 * Returns a new object of class '<em>Multi Feature Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Feature Helper</em>'.
	 * @generated
	 */
	MultiFeatureHelper createMultiFeatureHelper();

	/**
	 * Returns a new object of class '<em>Single Filter Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Filter Helper</em>'.
	 * @generated
	 */
	SingleFilterHelper createSingleFilterHelper();

	/**
	 * Returns a new object of class '<em>Multi Filter Helper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Filter Helper</em>'.
	 * @generated
	 */
	MultiFilterHelper createMultiFilterHelper();

	/**
	 * Returns a new object of class '<em>Single Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Input Port</em>'.
	 * @generated
	 */
	SingleInputPort createSingleInputPort();

	/**
	 * Returns a new object of class '<em>Multi Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Input Port</em>'.
	 * @generated
	 */
	MultiInputPort createMultiInputPort();

	/**
	 * Returns a new object of class '<em>Single Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Output Port</em>'.
	 * @generated
	 */
	SingleOutputPort createSingleOutputPort();

	/**
	 * Returns a new object of class '<em>Multi Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Output Port</em>'.
	 * @generated
	 */
	MultiOutputPort createMultiOutputPort();

	/**
	 * Returns a new object of class '<em>Single Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Port Mapping</em>'.
	 * @generated
	 */
	SinglePortMapping createSinglePortMapping();

	/**
	 * Returns a new object of class '<em>Multi Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Port Mapping</em>'.
	 * @generated
	 */
	MultiPortMapping createMultiPortMapping();

	/**
	 * Returns a new object of class '<em>Multi Single Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Multi Single Port Mapping</em>'.
	 * @generated
	 */
	MultiSinglePortMapping createMultiSinglePortMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ComrelPackage getComrelPackage();

} //ComrelFactory
