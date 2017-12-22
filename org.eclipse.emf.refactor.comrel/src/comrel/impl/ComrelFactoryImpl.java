/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComrelFactoryImpl extends EFactoryImpl implements ComrelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ComrelFactory init() {
		try {
			ComrelFactory theComrelFactory = (ComrelFactory)EPackage.Registry.INSTANCE.getEFactory("http://comrel/0.1"); 
			if (theComrelFactory != null) {
				return theComrelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComrelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComrelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ComrelPackage.COMPOSITE_REFACTORING: return createCompositeRefactoring();
			case ComrelPackage.MODEL_REFACTORING: return createModelRefactoring();
			case ComrelPackage.ATOMIC_UNIT: return createAtomicUnit();
			case ComrelPackage.SEQUENTIAL_UNIT: return createSequentialUnit();
			case ComrelPackage.CONDITION_CHECK: return createConditionCheck();
			case ComrelPackage.CONDITIONAL_UNIT: return createConditionalUnit();
			case ComrelPackage.SINGLE_QUEUED_UNIT: return createSingleQueuedUnit();
			case ComrelPackage.CARTESIAN_QUEUED_UNIT: return createCartesianQueuedUnit();
			case ComrelPackage.PARALLEL_QUEUED_UNIT: return createParallelQueuedUnit();
			case ComrelPackage.SINGLE_FEATURE_UNIT: return createSingleFeatureUnit();
			case ComrelPackage.MULTI_FEATURE_UNIT: return createMultiFeatureUnit();
			case ComrelPackage.SINGLE_FILTER_UNIT: return createSingleFilterUnit();
			case ComrelPackage.MULTI_FILTER_UNIT: return createMultiFilterUnit();
			case ComrelPackage.SINGLE_FEATURE_HELPER: return createSingleFeatureHelper();
			case ComrelPackage.MULTI_FEATURE_HELPER: return createMultiFeatureHelper();
			case ComrelPackage.SINGLE_FILTER_HELPER: return createSingleFilterHelper();
			case ComrelPackage.MULTI_FILTER_HELPER: return createMultiFilterHelper();
			case ComrelPackage.SINGLE_INPUT_PORT: return createSingleInputPort();
			case ComrelPackage.MULTI_INPUT_PORT: return createMultiInputPort();
			case ComrelPackage.SINGLE_OUTPUT_PORT: return createSingleOutputPort();
			case ComrelPackage.MULTI_OUTPUT_PORT: return createMultiOutputPort();
			case ComrelPackage.SINGLE_PORT_MAPPING: return createSinglePortMapping();
			case ComrelPackage.MULTI_PORT_MAPPING: return createMultiPortMapping();
			case ComrelPackage.MULTI_SINGLE_PORT_MAPPING: return createMultiSinglePortMapping();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ComrelPackage.MAPPING_VISUALIZATION:
				return createMappingVisualizationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ComrelPackage.MAPPING_VISUALIZATION:
				return convertMappingVisualizationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRefactoring createCompositeRefactoring() {
		CompositeRefactoringImpl compositeRefactoring = new CompositeRefactoringImpl();
		return compositeRefactoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelRefactoring createModelRefactoring() {
		ModelRefactoringImpl modelRefactoring = new ModelRefactoringImpl();
		return modelRefactoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicUnit createAtomicUnit() {
		AtomicUnitImpl atomicUnit = new AtomicUnitImpl();
		return atomicUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SequentialUnit createSequentialUnit() {
		SequentialUnitImpl sequentialUnit = new SequentialUnitImpl();
		return sequentialUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionCheck createConditionCheck() {
		ConditionCheckImpl conditionCheck = new ConditionCheckImpl();
		return conditionCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalUnit createConditionalUnit() {
		ConditionalUnitImpl conditionalUnit = new ConditionalUnitImpl();
		return conditionalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleQueuedUnit createSingleQueuedUnit() {
		SingleQueuedUnitImpl singleQueuedUnit = new SingleQueuedUnitImpl();
		singleQueuedUnit.setMultiInputPort(new MultiInputPortImpl());
		return singleQueuedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianQueuedUnit createCartesianQueuedUnit() {
		CartesianQueuedUnitImpl cartesianQueuedUnit = new CartesianQueuedUnitImpl();
		// TODO
		return cartesianQueuedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParallelQueuedUnit createParallelQueuedUnit() {
		ParallelQueuedUnitImpl parallelQueuedUnit = new ParallelQueuedUnitImpl();
		// TODO
		return parallelQueuedUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFeatureUnit createSingleFeatureUnit() {
		SingleFeatureUnitImpl singleFeatureUnit = new SingleFeatureUnitImpl();
		
		SingleInputPort inPort = this.createSingleInputPort();
		inPort.setName("Dummy");
		inPort.setDescription("Dummy");
		inPort.setType(String.class);
		inPort.setValue(new String("Dummy"));
		singleFeatureUnit.setInputPort(inPort);
		
		SingleOutputPort outPort = this.createSingleOutputPort();
		outPort.setName("Dummy");
		outPort.setDescription("Dummy");
		outPort.setType(String.class);
		outPort.setValue(new String("Dummy"));
		singleFeatureUnit.setOutputPort(outPort);
		
		return singleFeatureUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFeatureUnit createMultiFeatureUnit() {
		MultiFeatureUnitImpl multiFeatureUnit = new MultiFeatureUnitImpl();
		
		SingleInputPort inPort = this.createSingleInputPort();
		inPort.setName("Dummy");
		inPort.setDescription("Dummy");
		inPort.setType(String.class);
		inPort.setValue(new String("Dummy"));
		multiFeatureUnit.setInputPort(inPort);
		
		MultiOutputPort outPort = this.createMultiOutputPort();
		outPort.setName("Dummy");
		outPort.setDescription("Dummy");
		outPort.setType(String.class);
		outPort.getValue().add("Dummy");
		multiFeatureUnit.setOutputPort(outPort);
		
		return multiFeatureUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFilterUnit createSingleFilterUnit() {
		SingleFilterUnitImpl singleFilterUnit = new SingleFilterUnitImpl();
		return singleFilterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFilterUnit createMultiFilterUnit() {
		MultiFilterUnitImpl multiFilterUnit = new MultiFilterUnitImpl();
		return multiFilterUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFeatureHelper createSingleFeatureHelper() {
		SingleFeatureHelperImpl singleFeatureHelper = new SingleFeatureHelperImpl();
		return singleFeatureHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFeatureHelper createMultiFeatureHelper() {
		MultiFeatureHelperImpl multiFeatureHelper = new MultiFeatureHelperImpl();
		return multiFeatureHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleFilterHelper createSingleFilterHelper() {
		SingleFilterHelperImpl singleFilterHelper = new SingleFilterHelperImpl();
		return singleFilterHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiFilterHelper createMultiFilterHelper() {
		MultiFilterHelperImpl multiFilterHelper = new MultiFilterHelperImpl();
		return multiFilterHelper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleInputPort createSingleInputPort() {
		SingleInputPortImpl singleInputPort = new SingleInputPortImpl();
		return singleInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiInputPort createMultiInputPort() {
		MultiInputPortImpl multiInputPort = new MultiInputPortImpl();
		return multiInputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOutputPort createSingleOutputPort() {
		SingleOutputPortImpl singleOutputPort = new SingleOutputPortImpl();
		return singleOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiOutputPort createMultiOutputPort() {
		MultiOutputPortImpl multiOutputPort = new MultiOutputPortImpl();
		return multiOutputPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SinglePortMapping createSinglePortMapping() {
		SinglePortMappingImpl singlePortMapping = new SinglePortMappingImpl();
		return singlePortMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiPortMapping createMultiPortMapping() {
		MultiPortMappingImpl multiPortMapping = new MultiPortMappingImpl();
		return multiPortMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiSinglePortMapping createMultiSinglePortMapping() {
		MultiSinglePortMappingImpl multiSinglePortMapping = new MultiSinglePortMappingImpl();
		return multiSinglePortMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingVisualization createMappingVisualizationFromString(EDataType eDataType, String initialValue) {
		MappingVisualization result = MappingVisualization.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMappingVisualizationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComrelPackage getComrelPackage() {
		return (ComrelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComrelPackage getPackage() {
		return ComrelPackage.eINSTANCE;
	}

	@Override
	public ModelRefactoring createModelRefactoring(String id) {
		ModelRefactoring modelRefactoring = new ModelRefactoringImpl(id);
		if(modelRefactoring.getInputPorts().size()==0) {
			SingleInputPort port = new SingleInputPortImpl();
			port.setName("Dummy");
			port.setDescription("Dummy");
			port.setType(String.class);
			port.setValue("Dummy");
		}
		return modelRefactoring;
	}

	@Override
	public AtomicUnit createAtomicUnit(ModelRefactoring refactoring) {
		AtomicUnit atomicUnit = new AtomicUnitImpl(refactoring);
		return atomicUnit;
	}

	@Override
	public SingleFeatureUnit createSingleFeatureUnit(SingleFeatureHelper helper) {
		SingleFeatureUnitImpl singleFeatureUnit = new SingleFeatureUnitImpl(helper);
		if(singleFeatureUnit.getInputPort() == null) {
			SingleInputPort inPort = this.createSingleInputPort();
			inPort.setName("Dummy");
			inPort.setDescription("Dummy");
			inPort.setType(String.class);
			inPort.setValue(new String("Dummy"));
			singleFeatureUnit.setInputPort(inPort);
		}
		if(singleFeatureUnit.getOutputPort() == null) {
			SingleOutputPort outPort = this.createSingleOutputPort();
			outPort.setName("Dummy");
			outPort.setDescription("Dummy");
			outPort.setType(String.class);
			outPort.setValue(new String("Dummy"));
			singleFeatureUnit.setOutputPort(outPort);
		}
		
		return singleFeatureUnit;
	}

	@Override
	public MultiFeatureUnit createMultiFeatureUnit(MultiFeatureHelper helper) {
		MultiFeatureUnitImpl multiFeatureUnit = new MultiFeatureUnitImpl(helper);
		
		if(multiFeatureUnit.getInputPort() == null) {
			SingleInputPort inPort = this.createSingleInputPort();
			inPort.setName("Dummy");
			inPort.setDescription("Dummy");
			inPort.setType(String.class);
			inPort.setValue(new String("Dummy"));
			multiFeatureUnit.setInputPort(inPort);
		}
		if(multiFeatureUnit.getOutputPort() == null) {
			MultiOutputPort outPort = this.createMultiOutputPort();
			outPort.setName("Dummy");
			outPort.setDescription("Dummy");
			outPort.setType(String.class);
			outPort.getValue().add(new String("Dummy"));
			multiFeatureUnit.setOutputPort(outPort);
		}
		
		return multiFeatureUnit;
	}

	@Override
	public SingleFilterUnit createSingleFilterUnit(SingleFilterHelper helper) {
		SingleFilterUnitImpl filterUnit = new SingleFilterUnitImpl(helper);
		
		if(filterUnit.getInputPort() == null) {
			MultiInputPort inPort = this.createMultiInputPort();
			inPort.setName("Dummy");
			inPort.setDescription("Dummy");
			inPort.setType(String.class);
			inPort.getValue().add(new String("Dummy"));
			filterUnit.setInputPort(inPort);
		}
		if(filterUnit.getOutputPort() == null) {
			SingleOutputPort outPort = this.createSingleOutputPort();
			outPort.setName("Dummy");
			outPort.setDescription("Dummy");
			outPort.setType(String.class);
			outPort.setValue(new String("Dummy"));
			filterUnit.setOutputPort(outPort);
		}
		return filterUnit;
	}

	@Override
	public MultiFilterUnit createMultiFilterUnit(MultiFilterHelper helper) {
		MultiFilterUnitImpl filterUnit = new MultiFilterUnitImpl(helper);
		
		if(filterUnit.getInputPort() == null) {
			MultiInputPort inPort = this.createMultiInputPort();
			inPort.setName("Dummy");
			inPort.setDescription("Dummy");
			inPort.setType(String.class);
			inPort.getValue().add(new String("Dummy"));
			filterUnit.setInputPort(inPort);
		}
		if(filterUnit.getOutputPort() == null) {
			MultiOutputPort outPort = this.createMultiOutputPort();
			outPort.setName("Dummy");
			outPort.setDescription("Dummy");
			outPort.setType(String.class);
			outPort.getValue().add(new String("Dummy"));
			filterUnit.setOutputPort(outPort);
		}
		
		return filterUnit;
	}

} //ComrelFactoryImpl
