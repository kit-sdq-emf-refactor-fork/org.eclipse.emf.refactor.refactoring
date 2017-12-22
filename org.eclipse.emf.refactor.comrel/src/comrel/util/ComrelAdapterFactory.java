/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.util;

import comrel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see comrel.ComrelPackage
 * @generated
 */
public class ComrelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComrelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComrelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ComrelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComrelSwitch<Adapter> modelSwitch =
		new ComrelSwitch<Adapter>() {
			@Override
			public Adapter caseCompositeRefactoring(CompositeRefactoring object) {
				return createCompositeRefactoringAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseDescribedElement(DescribedElement object) {
				return createDescribedElementAdapter();
			}
			@Override
			public Adapter caseRefactoringUnit(RefactoringUnit object) {
				return createRefactoringUnitAdapter();
			}
			@Override
			public Adapter caseModelRefactoring(ModelRefactoring object) {
				return createModelRefactoringAdapter();
			}
			@Override
			public Adapter caseAtomicUnit(AtomicUnit object) {
				return createAtomicUnitAdapter();
			}
			@Override
			public Adapter caseCompositeUnit(CompositeUnit object) {
				return createCompositeUnitAdapter();
			}
			@Override
			public Adapter caseSequentialUnit(SequentialUnit object) {
				return createSequentialUnitAdapter();
			}
			@Override
			public Adapter caseConditionCheck(ConditionCheck object) {
				return createConditionCheckAdapter();
			}
			@Override
			public Adapter caseConditionalUnit(ConditionalUnit object) {
				return createConditionalUnitAdapter();
			}
			@Override
			public Adapter caseQueuedUnit(QueuedUnit object) {
				return createQueuedUnitAdapter();
			}
			@Override
			public Adapter caseSingleQueuedUnit(SingleQueuedUnit object) {
				return createSingleQueuedUnitAdapter();
			}
			@Override
			public Adapter caseTwicedQueuedUnit(TwicedQueuedUnit object) {
				return createTwicedQueuedUnitAdapter();
			}
			@Override
			public Adapter caseCartesianQueuedUnit(CartesianQueuedUnit object) {
				return createCartesianQueuedUnitAdapter();
			}
			@Override
			public Adapter caseParallelQueuedUnit(ParallelQueuedUnit object) {
				return createParallelQueuedUnitAdapter();
			}
			@Override
			public Adapter caseHelperUnit(HelperUnit object) {
				return createHelperUnitAdapter();
			}
			@Override
			public Adapter caseFeatureUnit(FeatureUnit object) {
				return createFeatureUnitAdapter();
			}
			@Override
			public Adapter caseSingleFeatureUnit(SingleFeatureUnit object) {
				return createSingleFeatureUnitAdapter();
			}
			@Override
			public Adapter caseMultiFeatureUnit(MultiFeatureUnit object) {
				return createMultiFeatureUnitAdapter();
			}
			@Override
			public Adapter caseFilterUnit(FilterUnit object) {
				return createFilterUnitAdapter();
			}
			@Override
			public Adapter caseSingleFilterUnit(SingleFilterUnit object) {
				return createSingleFilterUnitAdapter();
			}
			@Override
			public Adapter caseMultiFilterUnit(MultiFilterUnit object) {
				return createMultiFilterUnitAdapter();
			}
			@Override
			public Adapter caseHelper(Helper object) {
				return createHelperAdapter();
			}
			@Override
			public Adapter caseFeatureHelper(FeatureHelper object) {
				return createFeatureHelperAdapter();
			}
			@Override
			public Adapter caseSingleFeatureHelper(SingleFeatureHelper object) {
				return createSingleFeatureHelperAdapter();
			}
			@Override
			public Adapter caseMultiFeatureHelper(MultiFeatureHelper object) {
				return createMultiFeatureHelperAdapter();
			}
			@Override
			public Adapter caseFilterHelper(FilterHelper object) {
				return createFilterHelperAdapter();
			}
			@Override
			public Adapter caseSingleFilterHelper(SingleFilterHelper object) {
				return createSingleFilterHelperAdapter();
			}
			@Override
			public Adapter caseMultiFilterHelper(MultiFilterHelper object) {
				return createMultiFilterHelperAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseSinglePort(SinglePort object) {
				return createSinglePortAdapter();
			}
			@Override
			public Adapter caseMultiPort(MultiPort object) {
				return createMultiPortAdapter();
			}
			@Override
			public Adapter caseInputPort(InputPort object) {
				return createInputPortAdapter();
			}
			@Override
			public Adapter caseOutputPort(OutputPort object) {
				return createOutputPortAdapter();
			}
			@Override
			public Adapter caseSingleInputPort(SingleInputPort object) {
				return createSingleInputPortAdapter();
			}
			@Override
			public Adapter caseMultiInputPort(MultiInputPort object) {
				return createMultiInputPortAdapter();
			}
			@Override
			public Adapter caseSingleOutputPort(SingleOutputPort object) {
				return createSingleOutputPortAdapter();
			}
			@Override
			public Adapter caseMultiOutputPort(MultiOutputPort object) {
				return createMultiOutputPortAdapter();
			}
			@Override
			public Adapter casePortMapping(PortMapping object) {
				return createPortMappingAdapter();
			}
			@Override
			public Adapter caseSinglePortMapping(SinglePortMapping object) {
				return createSinglePortMappingAdapter();
			}
			@Override
			public Adapter caseMultiPortMapping(MultiPortMapping object) {
				return createMultiPortMappingAdapter();
			}
			@Override
			public Adapter caseMultiSinglePortMapping(MultiSinglePortMapping object) {
				return createMultiSinglePortMappingAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link comrel.CompositeRefactoring <em>Composite Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.CompositeRefactoring
	 * @generated
	 */
	public Adapter createCompositeRefactoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.DescribedElement
	 * @generated
	 */
	public Adapter createDescribedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.RefactoringUnit <em>Refactoring Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.RefactoringUnit
	 * @generated
	 */
	public Adapter createRefactoringUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.ModelRefactoring <em>Model Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.ModelRefactoring
	 * @generated
	 */
	public Adapter createModelRefactoringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.AtomicUnit <em>Atomic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.AtomicUnit
	 * @generated
	 */
	public Adapter createAtomicUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.CompositeUnit <em>Composite Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.CompositeUnit
	 * @generated
	 */
	public Adapter createCompositeUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SequentialUnit <em>Sequential Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SequentialUnit
	 * @generated
	 */
	public Adapter createSequentialUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.ConditionCheck <em>Condition Check</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.ConditionCheck
	 * @generated
	 */
	public Adapter createConditionCheckAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.ConditionalUnit <em>Conditional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.ConditionalUnit
	 * @generated
	 */
	public Adapter createConditionalUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.QueuedUnit <em>Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.QueuedUnit
	 * @generated
	 */
	public Adapter createQueuedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleQueuedUnit <em>Single Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleQueuedUnit
	 * @generated
	 */
	public Adapter createSingleQueuedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.TwicedQueuedUnit <em>Twiced Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.TwicedQueuedUnit
	 * @generated
	 */
	public Adapter createTwicedQueuedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.CartesianQueuedUnit <em>Cartesian Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.CartesianQueuedUnit
	 * @generated
	 */
	public Adapter createCartesianQueuedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.ParallelQueuedUnit <em>Parallel Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.ParallelQueuedUnit
	 * @generated
	 */
	public Adapter createParallelQueuedUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.HelperUnit <em>Helper Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.HelperUnit
	 * @generated
	 */
	public Adapter createHelperUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.FeatureUnit <em>Feature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.FeatureUnit
	 * @generated
	 */
	public Adapter createFeatureUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleFeatureUnit <em>Single Feature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleFeatureUnit
	 * @generated
	 */
	public Adapter createSingleFeatureUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiFeatureUnit <em>Multi Feature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiFeatureUnit
	 * @generated
	 */
	public Adapter createMultiFeatureUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.FilterUnit <em>Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.FilterUnit
	 * @generated
	 */
	public Adapter createFilterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleFilterUnit <em>Single Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleFilterUnit
	 * @generated
	 */
	public Adapter createSingleFilterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiFilterUnit <em>Multi Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiFilterUnit
	 * @generated
	 */
	public Adapter createMultiFilterUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.Helper
	 * @generated
	 */
	public Adapter createHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.FeatureHelper <em>Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.FeatureHelper
	 * @generated
	 */
	public Adapter createFeatureHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleFeatureHelper <em>Single Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleFeatureHelper
	 * @generated
	 */
	public Adapter createSingleFeatureHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiFeatureHelper <em>Multi Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiFeatureHelper
	 * @generated
	 */
	public Adapter createMultiFeatureHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.FilterHelper <em>Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.FilterHelper
	 * @generated
	 */
	public Adapter createFilterHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleFilterHelper <em>Single Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleFilterHelper
	 * @generated
	 */
	public Adapter createSingleFilterHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiFilterHelper <em>Multi Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiFilterHelper
	 * @generated
	 */
	public Adapter createMultiFilterHelperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SinglePort <em>Single Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SinglePort
	 * @generated
	 */
	public Adapter createSinglePortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiPort <em>Multi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiPort
	 * @generated
	 */
	public Adapter createMultiPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.InputPort
	 * @generated
	 */
	public Adapter createInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.OutputPort
	 * @generated
	 */
	public Adapter createOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleInputPort <em>Single Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleInputPort
	 * @generated
	 */
	public Adapter createSingleInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiInputPort <em>Multi Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiInputPort
	 * @generated
	 */
	public Adapter createMultiInputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SingleOutputPort <em>Single Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SingleOutputPort
	 * @generated
	 */
	public Adapter createSingleOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiOutputPort <em>Multi Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiOutputPort
	 * @generated
	 */
	public Adapter createMultiOutputPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.PortMapping <em>Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.PortMapping
	 * @generated
	 */
	public Adapter createPortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.SinglePortMapping <em>Single Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.SinglePortMapping
	 * @generated
	 */
	public Adapter createSinglePortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiPortMapping <em>Multi Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiPortMapping
	 * @generated
	 */
	public Adapter createMultiPortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link comrel.MultiSinglePortMapping <em>Multi Single Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see comrel.MultiSinglePortMapping
	 * @generated
	 */
	public Adapter createMultiSinglePortMappingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ComrelAdapterFactory
