/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.util;

import comrel.*;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see comrel.ComrelPackage
 * @generated
 */
public class ComrelSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ComrelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComrelSwitch() {
		if (modelPackage == null) {
			modelPackage = ComrelPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ComrelPackage.COMPOSITE_REFACTORING: {
				CompositeRefactoring compositeRefactoring = (CompositeRefactoring)theEObject;
				T result = caseCompositeRefactoring(compositeRefactoring);
				if (result == null) result = caseModelRefactoring(compositeRefactoring);
				if (result == null) result = caseNamedElement(compositeRefactoring);
				if (result == null) result = caseDescribedElement(compositeRefactoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.DESCRIBED_ELEMENT: {
				DescribedElement describedElement = (DescribedElement)theEObject;
				T result = caseDescribedElement(describedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.REFACTORING_UNIT: {
				RefactoringUnit refactoringUnit = (RefactoringUnit)theEObject;
				T result = caseRefactoringUnit(refactoringUnit);
				if (result == null) result = caseNamedElement(refactoringUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MODEL_REFACTORING: {
				ModelRefactoring modelRefactoring = (ModelRefactoring)theEObject;
				T result = caseModelRefactoring(modelRefactoring);
				if (result == null) result = caseNamedElement(modelRefactoring);
				if (result == null) result = caseDescribedElement(modelRefactoring);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.ATOMIC_UNIT: {
				AtomicUnit atomicUnit = (AtomicUnit)theEObject;
				T result = caseAtomicUnit(atomicUnit);
				if (result == null) result = caseRefactoringUnit(atomicUnit);
				if (result == null) result = caseNamedElement(atomicUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.COMPOSITE_UNIT: {
				CompositeUnit compositeUnit = (CompositeUnit)theEObject;
				T result = caseCompositeUnit(compositeUnit);
				if (result == null) result = caseRefactoringUnit(compositeUnit);
				if (result == null) result = caseNamedElement(compositeUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SEQUENTIAL_UNIT: {
				SequentialUnit sequentialUnit = (SequentialUnit)theEObject;
				T result = caseSequentialUnit(sequentialUnit);
				if (result == null) result = caseCompositeUnit(sequentialUnit);
				if (result == null) result = caseRefactoringUnit(sequentialUnit);
				if (result == null) result = caseNamedElement(sequentialUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.CONDITION_CHECK: {
				ConditionCheck conditionCheck = (ConditionCheck)theEObject;
				T result = caseConditionCheck(conditionCheck);
				if (result == null) result = caseNamedElement(conditionCheck);
				if (result == null) result = caseDescribedElement(conditionCheck);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.CONDITIONAL_UNIT: {
				ConditionalUnit conditionalUnit = (ConditionalUnit)theEObject;
				T result = caseConditionalUnit(conditionalUnit);
				if (result == null) result = caseCompositeUnit(conditionalUnit);
				if (result == null) result = caseRefactoringUnit(conditionalUnit);
				if (result == null) result = caseNamedElement(conditionalUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.QUEUED_UNIT: {
				QueuedUnit queuedUnit = (QueuedUnit)theEObject;
				T result = caseQueuedUnit(queuedUnit);
				if (result == null) result = caseCompositeUnit(queuedUnit);
				if (result == null) result = caseRefactoringUnit(queuedUnit);
				if (result == null) result = caseNamedElement(queuedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_QUEUED_UNIT: {
				SingleQueuedUnit singleQueuedUnit = (SingleQueuedUnit)theEObject;
				T result = caseSingleQueuedUnit(singleQueuedUnit);
				if (result == null) result = caseQueuedUnit(singleQueuedUnit);
				if (result == null) result = caseCompositeUnit(singleQueuedUnit);
				if (result == null) result = caseRefactoringUnit(singleQueuedUnit);
				if (result == null) result = caseNamedElement(singleQueuedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.TWICED_QUEUED_UNIT: {
				TwicedQueuedUnit twicedQueuedUnit = (TwicedQueuedUnit)theEObject;
				T result = caseTwicedQueuedUnit(twicedQueuedUnit);
				if (result == null) result = caseQueuedUnit(twicedQueuedUnit);
				if (result == null) result = caseCompositeUnit(twicedQueuedUnit);
				if (result == null) result = caseRefactoringUnit(twicedQueuedUnit);
				if (result == null) result = caseNamedElement(twicedQueuedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.CARTESIAN_QUEUED_UNIT: {
				CartesianQueuedUnit cartesianQueuedUnit = (CartesianQueuedUnit)theEObject;
				T result = caseCartesianQueuedUnit(cartesianQueuedUnit);
				if (result == null) result = caseTwicedQueuedUnit(cartesianQueuedUnit);
				if (result == null) result = caseQueuedUnit(cartesianQueuedUnit);
				if (result == null) result = caseCompositeUnit(cartesianQueuedUnit);
				if (result == null) result = caseRefactoringUnit(cartesianQueuedUnit);
				if (result == null) result = caseNamedElement(cartesianQueuedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.PARALLEL_QUEUED_UNIT: {
				ParallelQueuedUnit parallelQueuedUnit = (ParallelQueuedUnit)theEObject;
				T result = caseParallelQueuedUnit(parallelQueuedUnit);
				if (result == null) result = caseTwicedQueuedUnit(parallelQueuedUnit);
				if (result == null) result = caseQueuedUnit(parallelQueuedUnit);
				if (result == null) result = caseCompositeUnit(parallelQueuedUnit);
				if (result == null) result = caseRefactoringUnit(parallelQueuedUnit);
				if (result == null) result = caseNamedElement(parallelQueuedUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.HELPER_UNIT: {
				HelperUnit helperUnit = (HelperUnit)theEObject;
				T result = caseHelperUnit(helperUnit);
				if (result == null) result = caseNamedElement(helperUnit);
				if (result == null) result = caseDescribedElement(helperUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.FEATURE_UNIT: {
				FeatureUnit featureUnit = (FeatureUnit)theEObject;
				T result = caseFeatureUnit(featureUnit);
				if (result == null) result = caseHelperUnit(featureUnit);
				if (result == null) result = caseNamedElement(featureUnit);
				if (result == null) result = caseDescribedElement(featureUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_FEATURE_UNIT: {
				SingleFeatureUnit singleFeatureUnit = (SingleFeatureUnit)theEObject;
				T result = caseSingleFeatureUnit(singleFeatureUnit);
				if (result == null) result = caseFeatureUnit(singleFeatureUnit);
				if (result == null) result = caseHelperUnit(singleFeatureUnit);
				if (result == null) result = caseNamedElement(singleFeatureUnit);
				if (result == null) result = caseDescribedElement(singleFeatureUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_FEATURE_UNIT: {
				MultiFeatureUnit multiFeatureUnit = (MultiFeatureUnit)theEObject;
				T result = caseMultiFeatureUnit(multiFeatureUnit);
				if (result == null) result = caseFeatureUnit(multiFeatureUnit);
				if (result == null) result = caseHelperUnit(multiFeatureUnit);
				if (result == null) result = caseNamedElement(multiFeatureUnit);
				if (result == null) result = caseDescribedElement(multiFeatureUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.FILTER_UNIT: {
				FilterUnit filterUnit = (FilterUnit)theEObject;
				T result = caseFilterUnit(filterUnit);
				if (result == null) result = caseHelperUnit(filterUnit);
				if (result == null) result = caseNamedElement(filterUnit);
				if (result == null) result = caseDescribedElement(filterUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_FILTER_UNIT: {
				SingleFilterUnit singleFilterUnit = (SingleFilterUnit)theEObject;
				T result = caseSingleFilterUnit(singleFilterUnit);
				if (result == null) result = caseFilterUnit(singleFilterUnit);
				if (result == null) result = caseHelperUnit(singleFilterUnit);
				if (result == null) result = caseNamedElement(singleFilterUnit);
				if (result == null) result = caseDescribedElement(singleFilterUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_FILTER_UNIT: {
				MultiFilterUnit multiFilterUnit = (MultiFilterUnit)theEObject;
				T result = caseMultiFilterUnit(multiFilterUnit);
				if (result == null) result = caseFilterUnit(multiFilterUnit);
				if (result == null) result = caseHelperUnit(multiFilterUnit);
				if (result == null) result = caseNamedElement(multiFilterUnit);
				if (result == null) result = caseDescribedElement(multiFilterUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.HELPER: {
				Helper helper = (Helper)theEObject;
				T result = caseHelper(helper);
				if (result == null) result = caseNamedElement(helper);
				if (result == null) result = caseDescribedElement(helper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.FEATURE_HELPER: {
				FeatureHelper featureHelper = (FeatureHelper)theEObject;
				T result = caseFeatureHelper(featureHelper);
				if (result == null) result = caseHelper(featureHelper);
				if (result == null) result = caseNamedElement(featureHelper);
				if (result == null) result = caseDescribedElement(featureHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_FEATURE_HELPER: {
				SingleFeatureHelper singleFeatureHelper = (SingleFeatureHelper)theEObject;
				T result = caseSingleFeatureHelper(singleFeatureHelper);
				if (result == null) result = caseFeatureHelper(singleFeatureHelper);
				if (result == null) result = caseHelper(singleFeatureHelper);
				if (result == null) result = caseNamedElement(singleFeatureHelper);
				if (result == null) result = caseDescribedElement(singleFeatureHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_FEATURE_HELPER: {
				MultiFeatureHelper multiFeatureHelper = (MultiFeatureHelper)theEObject;
				T result = caseMultiFeatureHelper(multiFeatureHelper);
				if (result == null) result = caseFeatureHelper(multiFeatureHelper);
				if (result == null) result = caseHelper(multiFeatureHelper);
				if (result == null) result = caseNamedElement(multiFeatureHelper);
				if (result == null) result = caseDescribedElement(multiFeatureHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.FILTER_HELPER: {
				FilterHelper filterHelper = (FilterHelper)theEObject;
				T result = caseFilterHelper(filterHelper);
				if (result == null) result = caseHelper(filterHelper);
				if (result == null) result = caseNamedElement(filterHelper);
				if (result == null) result = caseDescribedElement(filterHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_FILTER_HELPER: {
				SingleFilterHelper singleFilterHelper = (SingleFilterHelper)theEObject;
				T result = caseSingleFilterHelper(singleFilterHelper);
				if (result == null) result = caseFilterHelper(singleFilterHelper);
				if (result == null) result = caseHelper(singleFilterHelper);
				if (result == null) result = caseNamedElement(singleFilterHelper);
				if (result == null) result = caseDescribedElement(singleFilterHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_FILTER_HELPER: {
				MultiFilterHelper multiFilterHelper = (MultiFilterHelper)theEObject;
				T result = caseMultiFilterHelper(multiFilterHelper);
				if (result == null) result = caseFilterHelper(multiFilterHelper);
				if (result == null) result = caseHelper(multiFilterHelper);
				if (result == null) result = caseNamedElement(multiFilterHelper);
				if (result == null) result = caseDescribedElement(multiFilterHelper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseNamedElement(port);
				if (result == null) result = caseDescribedElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_PORT: {
				SinglePort singlePort = (SinglePort)theEObject;
				T result = caseSinglePort(singlePort);
				if (result == null) result = casePort(singlePort);
				if (result == null) result = caseNamedElement(singlePort);
				if (result == null) result = caseDescribedElement(singlePort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_PORT: {
				MultiPort multiPort = (MultiPort)theEObject;
				T result = caseMultiPort(multiPort);
				if (result == null) result = casePort(multiPort);
				if (result == null) result = caseNamedElement(multiPort);
				if (result == null) result = caseDescribedElement(multiPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.INPUT_PORT: {
				InputPort inputPort = (InputPort)theEObject;
				T result = caseInputPort(inputPort);
				if (result == null) result = casePort(inputPort);
				if (result == null) result = caseNamedElement(inputPort);
				if (result == null) result = caseDescribedElement(inputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.OUTPUT_PORT: {
				OutputPort outputPort = (OutputPort)theEObject;
				T result = caseOutputPort(outputPort);
				if (result == null) result = casePort(outputPort);
				if (result == null) result = caseNamedElement(outputPort);
				if (result == null) result = caseDescribedElement(outputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_INPUT_PORT: {
				SingleInputPort singleInputPort = (SingleInputPort)theEObject;
				T result = caseSingleInputPort(singleInputPort);
				if (result == null) result = caseSinglePort(singleInputPort);
				if (result == null) result = caseInputPort(singleInputPort);
				if (result == null) result = casePort(singleInputPort);
				if (result == null) result = caseNamedElement(singleInputPort);
				if (result == null) result = caseDescribedElement(singleInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_INPUT_PORT: {
				MultiInputPort multiInputPort = (MultiInputPort)theEObject;
				T result = caseMultiInputPort(multiInputPort);
				if (result == null) result = caseMultiPort(multiInputPort);
				if (result == null) result = caseInputPort(multiInputPort);
				if (result == null) result = casePort(multiInputPort);
				if (result == null) result = caseNamedElement(multiInputPort);
				if (result == null) result = caseDescribedElement(multiInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_OUTPUT_PORT: {
				SingleOutputPort singleOutputPort = (SingleOutputPort)theEObject;
				T result = caseSingleOutputPort(singleOutputPort);
				if (result == null) result = caseSinglePort(singleOutputPort);
				if (result == null) result = caseOutputPort(singleOutputPort);
				if (result == null) result = casePort(singleOutputPort);
				if (result == null) result = caseNamedElement(singleOutputPort);
				if (result == null) result = caseDescribedElement(singleOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_OUTPUT_PORT: {
				MultiOutputPort multiOutputPort = (MultiOutputPort)theEObject;
				T result = caseMultiOutputPort(multiOutputPort);
				if (result == null) result = caseMultiPort(multiOutputPort);
				if (result == null) result = caseOutputPort(multiOutputPort);
				if (result == null) result = casePort(multiOutputPort);
				if (result == null) result = caseNamedElement(multiOutputPort);
				if (result == null) result = caseDescribedElement(multiOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.PORT_MAPPING: {
				PortMapping portMapping = (PortMapping)theEObject;
				T result = casePortMapping(portMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.SINGLE_PORT_MAPPING: {
				SinglePortMapping singlePortMapping = (SinglePortMapping)theEObject;
				T result = caseSinglePortMapping(singlePortMapping);
				if (result == null) result = casePortMapping(singlePortMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_PORT_MAPPING: {
				MultiPortMapping multiPortMapping = (MultiPortMapping)theEObject;
				T result = caseMultiPortMapping(multiPortMapping);
				if (result == null) result = casePortMapping(multiPortMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING: {
				MultiSinglePortMapping multiSinglePortMapping = (MultiSinglePortMapping)theEObject;
				T result = caseMultiSinglePortMapping(multiSinglePortMapping);
				if (result == null) result = casePortMapping(multiSinglePortMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Refactoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeRefactoring(CompositeRefactoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Described Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescribedElement(DescribedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refactoring Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refactoring Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefactoringUnit(RefactoringUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Refactoring</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Refactoring</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelRefactoring(ModelRefactoring object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicUnit(AtomicUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeUnit(CompositeUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequential Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequential Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequentialUnit(SequentialUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionCheck(ConditionCheck object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionalUnit(ConditionalUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queued Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueuedUnit(QueuedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Queued Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleQueuedUnit(SingleQueuedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Twiced Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Twiced Queued Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTwicedQueuedUnit(TwicedQueuedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cartesian Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cartesian Queued Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCartesianQueuedUnit(CartesianQueuedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Queued Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Queued Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelQueuedUnit(ParallelQueuedUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelperUnit(HelperUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureUnit(FeatureUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Feature Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleFeatureUnit(SingleFeatureUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Feature Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Feature Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiFeatureUnit(MultiFeatureUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterUnit(FilterUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Filter Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleFilterUnit(SingleFilterUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Filter Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Filter Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiFilterUnit(MultiFilterUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHelper(Helper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeatureHelper(FeatureHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Feature Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Feature Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleFeatureHelper(SingleFeatureHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Feature Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Feature Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiFeatureHelper(MultiFeatureHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterHelper(FilterHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Filter Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Filter Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleFilterHelper(SingleFilterHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Filter Helper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Filter Helper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiFilterHelper(MultiFilterHelper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglePort(SinglePort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPort(MultiPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputPort(InputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputPort(OutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleInputPort(SingleInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiInputPort(MultiInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleOutputPort(SingleOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiOutputPort(MultiOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortMapping(PortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Port Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSinglePortMapping(SinglePortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Port Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiPortMapping(MultiPortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multi Single Port Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multi Single Port Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiSinglePortMapping(MultiSinglePortMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //ComrelSwitch
