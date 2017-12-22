/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import comrel.AtomicUnit;
import comrel.CartesianQueuedUnit;
import comrel.CompositeRefactoring;
import comrel.CompositeUnit;
import comrel.ComrelFactory;
import comrel.ComrelPackage;
import comrel.ConditionCheck;
import comrel.ConditionalUnit;
import comrel.DescribedElement;
import comrel.FeatureHelper;
import comrel.FeatureUnit;
import comrel.FilterHelper;
import comrel.FilterUnit;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.MappingVisualization;
import comrel.ModelRefactoring;
import comrel.MultiFeatureHelper;
import comrel.MultiFeatureUnit;
import comrel.MultiFilterHelper;
import comrel.MultiFilterUnit;
import comrel.MultiInputPort;
import comrel.MultiOutputPort;
import comrel.MultiPort;
import comrel.MultiPortMapping;
import comrel.MultiSinglePortMapping;
import comrel.NamedElement;
import comrel.OutputPort;
import comrel.ParallelQueuedUnit;
import comrel.Port;
import comrel.PortMapping;
import comrel.QueuedUnit;
import comrel.RefactoringUnit;
import comrel.SequentialUnit;
import comrel.SingleFeatureHelper;
import comrel.SingleFeatureUnit;
import comrel.SingleFilterHelper;
import comrel.SingleFilterUnit;
import comrel.SingleInputPort;
import comrel.SingleOutputPort;
import comrel.SinglePort;
import comrel.SinglePortMapping;
import comrel.SingleQueuedUnit;
import comrel.TwicedQueuedUnit;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ComrelPackageImpl extends EPackageImpl implements ComrelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRefactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass describedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refactoringUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelRefactoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomicUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequentialUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionCheckEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queuedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleQueuedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass twicedQueuedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cartesianQueuedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelQueuedUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFeatureUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFeatureUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFilterUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFilterUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass helperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFeatureHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFeatureHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleFilterHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiFilterHelperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlePortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiInputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiOutputPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singlePortMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiPortMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiSinglePortMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingVisualizationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see comrel.ComrelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ComrelPackageImpl() {
		super(eNS_URI, ComrelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ComrelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ComrelPackage init() {
		if (isInited) return (ComrelPackage)EPackage.Registry.INSTANCE.getEPackage(ComrelPackage.eNS_URI);

		// Obtain or create and register package
		ComrelPackageImpl theComrelPackage = (ComrelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ComrelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ComrelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theComrelPackage.createPackageContents();

		// Initialize created meta-data
		theComrelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theComrelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ComrelPackage.eNS_URI, theComrelPackage);
		return theComrelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRefactoring() {
		return compositeRefactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRefactoring_MainRefactoringUnit() {
		return (EReference)compositeRefactoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRefactoring_PortMappings() {
		return (EReference)compositeRefactoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRefactoring_ModelRefactorings() {
		return (EReference)compositeRefactoringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRefactoring_Helper() {
		return (EReference)compositeRefactoringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeRefactoring_MappingVisualization() {
		return (EAttribute)compositeRefactoringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeRefactoring_CustomInitialCondition() {
		return (EAttribute)compositeRefactoringEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeRefactoring_CustomFinalCondition() {
		return (EAttribute)compositeRefactoringEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescribedElement() {
		return describedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescribedElement_Description() {
		return (EAttribute)describedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefactoringUnit() {
		return refactoringUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefactoringUnit_SeqExecutionOrder() {
		return (EAttribute)refactoringUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelRefactoring() {
		return modelRefactoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRefactoring_RefId() {
		return (EAttribute)modelRefactoringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRefactoring_Label() {
		return (EAttribute)modelRefactoringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelRefactoring_NamespaceUri() {
		return (EAttribute)modelRefactoringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelRefactoring_InputPorts() {
		return (EReference)modelRefactoringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicUnit() {
		return atomicUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicUnit_InputPorts() {
		return (EReference)atomicUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicUnit_UnitId() {
		return (EAttribute)atomicUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicUnit_Label() {
		return (EAttribute)atomicUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicUnit_NamespaceUri() {
		return (EAttribute)atomicUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicUnit_Type() {
		return (EAttribute)atomicUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicUnit_ModelRefactoring() {
		return (EReference)atomicUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicUnit_CheckInitialConditionFlag() {
		return (EAttribute)atomicUnitEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicUnit_CheckFinalConditionFlag() {
		return (EAttribute)atomicUnitEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeUnit() {
		return compositeUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequentialUnit() {
		return sequentialUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialUnit_HelperUnits() {
		return (EReference)sequentialUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialUnit_RefactoringUnits() {
		return (EReference)sequentialUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequentialUnit_InputPorts() {
		return (EReference)sequentialUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequentialUnit_Strict() {
		return (EAttribute)sequentialUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequentialUnit_Type() {
		return (EAttribute)sequentialUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequentialUnit_LblStrict() {
		return (EAttribute)sequentialUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionCheck() {
		return conditionCheckEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionCheck_Type() {
		return (EAttribute)conditionCheckEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionCheck_Spec() {
		return (EAttribute)conditionCheckEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalUnit() {
		return conditionalUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalUnit_If() {
		return (EReference)conditionalUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalUnit_HelperUnits() {
		return (EReference)conditionalUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalUnit_Then() {
		return (EReference)conditionalUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalUnit_Else() {
		return (EReference)conditionalUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalUnit_InputPorts() {
		return (EReference)conditionalUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalUnit_Type() {
		return (EAttribute)conditionalUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueuedUnit() {
		return queuedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueuedUnit_Strict() {
		return (EAttribute)queuedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleQueuedUnit() {
		return singleQueuedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleQueuedUnit_HelperUnits() {
		return (EReference)singleQueuedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleQueuedUnit_RefactoringUnit() {
		return (EReference)singleQueuedUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleQueuedUnit_SingleInputPorts() {
		return (EReference)singleQueuedUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleQueuedUnit_MultiInputPort() {
		return (EReference)singleQueuedUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleQueuedUnit_Type() {
		return (EAttribute)singleQueuedUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleQueuedUnit_LblStrict() {
		return (EAttribute)singleQueuedUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTwicedQueuedUnit() {
		return twicedQueuedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCartesianQueuedUnit() {
		return cartesianQueuedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianQueuedUnit_HelperUnits() {
		return (EReference)cartesianQueuedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianQueuedUnit_RefactoringUnit() {
		return (EReference)cartesianQueuedUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianQueuedUnit_SingleInputPorts() {
		return (EReference)cartesianQueuedUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCartesianQueuedUnit_MultiInputPorts() {
		return (EReference)cartesianQueuedUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianQueuedUnit_Type() {
		return (EAttribute)cartesianQueuedUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCartesianQueuedUnit_LblStrict() {
		return (EAttribute)cartesianQueuedUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelQueuedUnit() {
		return parallelQueuedUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelQueuedUnit_HelperUnits() {
		return (EReference)parallelQueuedUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelQueuedUnit_RefactoringUnits() {
		return (EReference)parallelQueuedUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelQueuedUnit_SingleInputPorts() {
		return (EReference)parallelQueuedUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParallelQueuedUnit_MultiInputPorts() {
		return (EReference)parallelQueuedUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallelQueuedUnit_Type() {
		return (EAttribute)parallelQueuedUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParallelQueuedUnit_LblStrict() {
		return (EAttribute)parallelQueuedUnitEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelperUnit() {
		return helperUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperUnit_HelperUnitId() {
		return (EAttribute)helperUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelperUnit_NamespaceUri() {
		return (EAttribute)helperUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureUnit() {
		return featureUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFeatureUnit() {
		return singleFeatureUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFeatureUnit_InputPort() {
		return (EReference)singleFeatureUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFeatureUnit_SecondaryInputPorts() {
		return (EReference)singleFeatureUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFeatureUnit_OutputPort() {
		return (EReference)singleFeatureUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFeatureUnit_SingleFeatureHelper() {
		return (EReference)singleFeatureUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleFeatureUnit_Type() {
		return (EAttribute)singleFeatureUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiFeatureUnit() {
		return multiFeatureUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFeatureUnit_InputPort() {
		return (EReference)multiFeatureUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFeatureUnit_SecondaryInputPorts() {
		return (EReference)multiFeatureUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFeatureUnit_OutputPort() {
		return (EReference)multiFeatureUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFeatureUnit_MultiFeatureHelper() {
		return (EReference)multiFeatureUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFeatureUnit_Type() {
		return (EAttribute)multiFeatureUnitEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterUnit() {
		return filterUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFilterUnit() {
		return singleFilterUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFilterUnit_InputPort() {
		return (EReference)singleFilterUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFilterUnit_OutputPort() {
		return (EReference)singleFilterUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFilterUnit_SingleFilterHelper() {
		return (EReference)singleFilterUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingleFilterUnit_Type() {
		return (EAttribute)singleFilterUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiFilterUnit() {
		return multiFilterUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFilterUnit_InputPort() {
		return (EReference)multiFilterUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFilterUnit_OutputPort() {
		return (EReference)multiFilterUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFilterUnit_MultiFilterHelper() {
		return (EReference)multiFilterUnitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiFilterUnit_Type() {
		return (EAttribute)multiFilterUnitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHelper() {
		return helperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelper_HelperId() {
		return (EAttribute)helperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHelper_NamespaceUri() {
		return (EAttribute)helperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeatureHelper() {
		return featureHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureHelper_InputPort() {
		return (EReference)featureHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeatureHelper_SecondaryInputPorts() {
		return (EReference)featureHelperEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFeatureHelper() {
		return singleFeatureHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFeatureHelper_OutputPort() {
		return (EReference)singleFeatureHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiFeatureHelper() {
		return multiFeatureHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFeatureHelper_OutputPort() {
		return (EReference)multiFeatureHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterHelper() {
		return filterHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilterHelper_InputPort() {
		return (EReference)filterHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleFilterHelper() {
		return singleFilterHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSingleFilterHelper_OutputPort() {
		return (EReference)singleFilterHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiFilterHelper() {
		return multiFilterHelperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiFilterHelper_OutputPort() {
		return (EReference)multiFilterHelperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_Type() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglePort() {
		return singlePortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSinglePort_Value() {
		return (EAttribute)singlePortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPort() {
		return multiPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiPort_Value() {
		return (EAttribute)multiPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPort() {
		return inputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPort() {
		return outputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleInputPort() {
		return singleInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiInputPort() {
		return multiInputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOutputPort() {
		return singleOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiOutputPort() {
		return multiOutputPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortMapping() {
		return portMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSinglePortMapping() {
		return singlePortMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSinglePortMapping_Source() {
		return (EReference)singlePortMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSinglePortMapping_Target() {
		return (EReference)singlePortMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiPortMapping() {
		return multiPortMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPortMapping_Source() {
		return (EReference)multiPortMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiPortMapping_Target() {
		return (EReference)multiPortMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiSinglePortMapping() {
		return multiSinglePortMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSinglePortMapping_Source() {
		return (EReference)multiSinglePortMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiSinglePortMapping_Target() {
		return (EReference)multiSinglePortMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMappingVisualization() {
		return mappingVisualizationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComrelFactory getComrelFactory() {
		return (ComrelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		compositeRefactoringEClass = createEClass(COMPOSITE_REFACTORING);
		createEReference(compositeRefactoringEClass, COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT);
		createEReference(compositeRefactoringEClass, COMPOSITE_REFACTORING__PORT_MAPPINGS);
		createEReference(compositeRefactoringEClass, COMPOSITE_REFACTORING__MODEL_REFACTORINGS);
		createEReference(compositeRefactoringEClass, COMPOSITE_REFACTORING__HELPER);
		createEAttribute(compositeRefactoringEClass, COMPOSITE_REFACTORING__MAPPING_VISUALIZATION);
		createEAttribute(compositeRefactoringEClass, COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION);
		createEAttribute(compositeRefactoringEClass, COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		describedElementEClass = createEClass(DESCRIBED_ELEMENT);
		createEAttribute(describedElementEClass, DESCRIBED_ELEMENT__DESCRIPTION);

		refactoringUnitEClass = createEClass(REFACTORING_UNIT);
		createEAttribute(refactoringUnitEClass, REFACTORING_UNIT__SEQ_EXECUTION_ORDER);

		modelRefactoringEClass = createEClass(MODEL_REFACTORING);
		createEAttribute(modelRefactoringEClass, MODEL_REFACTORING__REF_ID);
		createEAttribute(modelRefactoringEClass, MODEL_REFACTORING__LABEL);
		createEAttribute(modelRefactoringEClass, MODEL_REFACTORING__NAMESPACE_URI);
		createEReference(modelRefactoringEClass, MODEL_REFACTORING__INPUT_PORTS);

		atomicUnitEClass = createEClass(ATOMIC_UNIT);
		createEReference(atomicUnitEClass, ATOMIC_UNIT__INPUT_PORTS);
		createEAttribute(atomicUnitEClass, ATOMIC_UNIT__UNIT_ID);
		createEAttribute(atomicUnitEClass, ATOMIC_UNIT__LABEL);
		createEAttribute(atomicUnitEClass, ATOMIC_UNIT__NAMESPACE_URI);
		createEAttribute(atomicUnitEClass, ATOMIC_UNIT__TYPE);
		createEReference(atomicUnitEClass, ATOMIC_UNIT__MODEL_REFACTORING);
		createEAttribute(atomicUnitEClass, ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG);
		createEAttribute(atomicUnitEClass, ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG);

		compositeUnitEClass = createEClass(COMPOSITE_UNIT);

		sequentialUnitEClass = createEClass(SEQUENTIAL_UNIT);
		createEReference(sequentialUnitEClass, SEQUENTIAL_UNIT__HELPER_UNITS);
		createEReference(sequentialUnitEClass, SEQUENTIAL_UNIT__REFACTORING_UNITS);
		createEReference(sequentialUnitEClass, SEQUENTIAL_UNIT__INPUT_PORTS);
		createEAttribute(sequentialUnitEClass, SEQUENTIAL_UNIT__STRICT);
		createEAttribute(sequentialUnitEClass, SEQUENTIAL_UNIT__TYPE);
		createEAttribute(sequentialUnitEClass, SEQUENTIAL_UNIT__LBL_STRICT);

		conditionCheckEClass = createEClass(CONDITION_CHECK);
		createEAttribute(conditionCheckEClass, CONDITION_CHECK__TYPE);
		createEAttribute(conditionCheckEClass, CONDITION_CHECK__SPEC);

		conditionalUnitEClass = createEClass(CONDITIONAL_UNIT);
		createEReference(conditionalUnitEClass, CONDITIONAL_UNIT__IF);
		createEReference(conditionalUnitEClass, CONDITIONAL_UNIT__HELPER_UNITS);
		createEReference(conditionalUnitEClass, CONDITIONAL_UNIT__THEN);
		createEReference(conditionalUnitEClass, CONDITIONAL_UNIT__ELSE);
		createEReference(conditionalUnitEClass, CONDITIONAL_UNIT__INPUT_PORTS);
		createEAttribute(conditionalUnitEClass, CONDITIONAL_UNIT__TYPE);

		queuedUnitEClass = createEClass(QUEUED_UNIT);
		createEAttribute(queuedUnitEClass, QUEUED_UNIT__STRICT);

		singleQueuedUnitEClass = createEClass(SINGLE_QUEUED_UNIT);
		createEReference(singleQueuedUnitEClass, SINGLE_QUEUED_UNIT__HELPER_UNITS);
		createEReference(singleQueuedUnitEClass, SINGLE_QUEUED_UNIT__REFACTORING_UNIT);
		createEReference(singleQueuedUnitEClass, SINGLE_QUEUED_UNIT__SINGLE_INPUT_PORTS);
		createEReference(singleQueuedUnitEClass, SINGLE_QUEUED_UNIT__MULTI_INPUT_PORT);
		createEAttribute(singleQueuedUnitEClass, SINGLE_QUEUED_UNIT__TYPE);
		createEAttribute(singleQueuedUnitEClass, SINGLE_QUEUED_UNIT__LBL_STRICT);

		twicedQueuedUnitEClass = createEClass(TWICED_QUEUED_UNIT);

		cartesianQueuedUnitEClass = createEClass(CARTESIAN_QUEUED_UNIT);
		createEReference(cartesianQueuedUnitEClass, CARTESIAN_QUEUED_UNIT__HELPER_UNITS);
		createEReference(cartesianQueuedUnitEClass, CARTESIAN_QUEUED_UNIT__REFACTORING_UNIT);
		createEReference(cartesianQueuedUnitEClass, CARTESIAN_QUEUED_UNIT__SINGLE_INPUT_PORTS);
		createEReference(cartesianQueuedUnitEClass, CARTESIAN_QUEUED_UNIT__MULTI_INPUT_PORTS);
		createEAttribute(cartesianQueuedUnitEClass, CARTESIAN_QUEUED_UNIT__TYPE);
		createEAttribute(cartesianQueuedUnitEClass, CARTESIAN_QUEUED_UNIT__LBL_STRICT);

		parallelQueuedUnitEClass = createEClass(PARALLEL_QUEUED_UNIT);
		createEReference(parallelQueuedUnitEClass, PARALLEL_QUEUED_UNIT__HELPER_UNITS);
		createEReference(parallelQueuedUnitEClass, PARALLEL_QUEUED_UNIT__REFACTORING_UNITS);
		createEReference(parallelQueuedUnitEClass, PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS);
		createEReference(parallelQueuedUnitEClass, PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS);
		createEAttribute(parallelQueuedUnitEClass, PARALLEL_QUEUED_UNIT__TYPE);
		createEAttribute(parallelQueuedUnitEClass, PARALLEL_QUEUED_UNIT__LBL_STRICT);

		helperUnitEClass = createEClass(HELPER_UNIT);
		createEAttribute(helperUnitEClass, HELPER_UNIT__HELPER_UNIT_ID);
		createEAttribute(helperUnitEClass, HELPER_UNIT__NAMESPACE_URI);

		featureUnitEClass = createEClass(FEATURE_UNIT);

		singleFeatureUnitEClass = createEClass(SINGLE_FEATURE_UNIT);
		createEReference(singleFeatureUnitEClass, SINGLE_FEATURE_UNIT__INPUT_PORT);
		createEReference(singleFeatureUnitEClass, SINGLE_FEATURE_UNIT__SECONDARY_INPUT_PORTS);
		createEReference(singleFeatureUnitEClass, SINGLE_FEATURE_UNIT__OUTPUT_PORT);
		createEReference(singleFeatureUnitEClass, SINGLE_FEATURE_UNIT__SINGLE_FEATURE_HELPER);
		createEAttribute(singleFeatureUnitEClass, SINGLE_FEATURE_UNIT__TYPE);

		multiFeatureUnitEClass = createEClass(MULTI_FEATURE_UNIT);
		createEReference(multiFeatureUnitEClass, MULTI_FEATURE_UNIT__INPUT_PORT);
		createEReference(multiFeatureUnitEClass, MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS);
		createEReference(multiFeatureUnitEClass, MULTI_FEATURE_UNIT__OUTPUT_PORT);
		createEReference(multiFeatureUnitEClass, MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER);
		createEAttribute(multiFeatureUnitEClass, MULTI_FEATURE_UNIT__TYPE);

		filterUnitEClass = createEClass(FILTER_UNIT);

		singleFilterUnitEClass = createEClass(SINGLE_FILTER_UNIT);
		createEReference(singleFilterUnitEClass, SINGLE_FILTER_UNIT__INPUT_PORT);
		createEReference(singleFilterUnitEClass, SINGLE_FILTER_UNIT__OUTPUT_PORT);
		createEReference(singleFilterUnitEClass, SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER);
		createEAttribute(singleFilterUnitEClass, SINGLE_FILTER_UNIT__TYPE);

		multiFilterUnitEClass = createEClass(MULTI_FILTER_UNIT);
		createEReference(multiFilterUnitEClass, MULTI_FILTER_UNIT__INPUT_PORT);
		createEReference(multiFilterUnitEClass, MULTI_FILTER_UNIT__OUTPUT_PORT);
		createEReference(multiFilterUnitEClass, MULTI_FILTER_UNIT__MULTI_FILTER_HELPER);
		createEAttribute(multiFilterUnitEClass, MULTI_FILTER_UNIT__TYPE);

		helperEClass = createEClass(HELPER);
		createEAttribute(helperEClass, HELPER__HELPER_ID);
		createEAttribute(helperEClass, HELPER__NAMESPACE_URI);

		featureHelperEClass = createEClass(FEATURE_HELPER);
		createEReference(featureHelperEClass, FEATURE_HELPER__INPUT_PORT);
		createEReference(featureHelperEClass, FEATURE_HELPER__SECONDARY_INPUT_PORTS);

		singleFeatureHelperEClass = createEClass(SINGLE_FEATURE_HELPER);
		createEReference(singleFeatureHelperEClass, SINGLE_FEATURE_HELPER__OUTPUT_PORT);

		multiFeatureHelperEClass = createEClass(MULTI_FEATURE_HELPER);
		createEReference(multiFeatureHelperEClass, MULTI_FEATURE_HELPER__OUTPUT_PORT);

		filterHelperEClass = createEClass(FILTER_HELPER);
		createEReference(filterHelperEClass, FILTER_HELPER__INPUT_PORT);

		singleFilterHelperEClass = createEClass(SINGLE_FILTER_HELPER);
		createEReference(singleFilterHelperEClass, SINGLE_FILTER_HELPER__OUTPUT_PORT);

		multiFilterHelperEClass = createEClass(MULTI_FILTER_HELPER);
		createEReference(multiFilterHelperEClass, MULTI_FILTER_HELPER__OUTPUT_PORT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__TYPE);

		singlePortEClass = createEClass(SINGLE_PORT);
		createEAttribute(singlePortEClass, SINGLE_PORT__VALUE);

		multiPortEClass = createEClass(MULTI_PORT);
		createEAttribute(multiPortEClass, MULTI_PORT__VALUE);

		inputPortEClass = createEClass(INPUT_PORT);

		outputPortEClass = createEClass(OUTPUT_PORT);

		singleInputPortEClass = createEClass(SINGLE_INPUT_PORT);

		multiInputPortEClass = createEClass(MULTI_INPUT_PORT);

		singleOutputPortEClass = createEClass(SINGLE_OUTPUT_PORT);

		multiOutputPortEClass = createEClass(MULTI_OUTPUT_PORT);

		portMappingEClass = createEClass(PORT_MAPPING);

		singlePortMappingEClass = createEClass(SINGLE_PORT_MAPPING);
		createEReference(singlePortMappingEClass, SINGLE_PORT_MAPPING__SOURCE);
		createEReference(singlePortMappingEClass, SINGLE_PORT_MAPPING__TARGET);

		multiPortMappingEClass = createEClass(MULTI_PORT_MAPPING);
		createEReference(multiPortMappingEClass, MULTI_PORT_MAPPING__SOURCE);
		createEReference(multiPortMappingEClass, MULTI_PORT_MAPPING__TARGET);

		multiSinglePortMappingEClass = createEClass(MULTI_SINGLE_PORT_MAPPING);
		createEReference(multiSinglePortMappingEClass, MULTI_SINGLE_PORT_MAPPING__SOURCE);
		createEReference(multiSinglePortMappingEClass, MULTI_SINGLE_PORT_MAPPING__TARGET);

		// Create enums
		mappingVisualizationEEnum = createEEnum(MAPPING_VISUALIZATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		compositeRefactoringEClass.getESuperTypes().add(this.getModelRefactoring());
		refactoringUnitEClass.getESuperTypes().add(this.getNamedElement());
		modelRefactoringEClass.getESuperTypes().add(this.getNamedElement());
		modelRefactoringEClass.getESuperTypes().add(this.getDescribedElement());
		atomicUnitEClass.getESuperTypes().add(this.getRefactoringUnit());
		compositeUnitEClass.getESuperTypes().add(this.getRefactoringUnit());
		sequentialUnitEClass.getESuperTypes().add(this.getCompositeUnit());
		conditionCheckEClass.getESuperTypes().add(this.getNamedElement());
		conditionCheckEClass.getESuperTypes().add(this.getDescribedElement());
		conditionalUnitEClass.getESuperTypes().add(this.getCompositeUnit());
		queuedUnitEClass.getESuperTypes().add(this.getCompositeUnit());
		singleQueuedUnitEClass.getESuperTypes().add(this.getQueuedUnit());
		twicedQueuedUnitEClass.getESuperTypes().add(this.getQueuedUnit());
		cartesianQueuedUnitEClass.getESuperTypes().add(this.getTwicedQueuedUnit());
		parallelQueuedUnitEClass.getESuperTypes().add(this.getTwicedQueuedUnit());
		helperUnitEClass.getESuperTypes().add(this.getNamedElement());
		helperUnitEClass.getESuperTypes().add(this.getDescribedElement());
		featureUnitEClass.getESuperTypes().add(this.getHelperUnit());
		singleFeatureUnitEClass.getESuperTypes().add(this.getFeatureUnit());
		multiFeatureUnitEClass.getESuperTypes().add(this.getFeatureUnit());
		filterUnitEClass.getESuperTypes().add(this.getHelperUnit());
		singleFilterUnitEClass.getESuperTypes().add(this.getFilterUnit());
		multiFilterUnitEClass.getESuperTypes().add(this.getFilterUnit());
		helperEClass.getESuperTypes().add(this.getNamedElement());
		helperEClass.getESuperTypes().add(this.getDescribedElement());
		featureHelperEClass.getESuperTypes().add(this.getHelper());
		singleFeatureHelperEClass.getESuperTypes().add(this.getFeatureHelper());
		multiFeatureHelperEClass.getESuperTypes().add(this.getFeatureHelper());
		filterHelperEClass.getESuperTypes().add(this.getHelper());
		singleFilterHelperEClass.getESuperTypes().add(this.getFilterHelper());
		multiFilterHelperEClass.getESuperTypes().add(this.getFilterHelper());
		portEClass.getESuperTypes().add(this.getNamedElement());
		portEClass.getESuperTypes().add(this.getDescribedElement());
		singlePortEClass.getESuperTypes().add(this.getPort());
		multiPortEClass.getESuperTypes().add(this.getPort());
		inputPortEClass.getESuperTypes().add(this.getPort());
		outputPortEClass.getESuperTypes().add(this.getPort());
		singleInputPortEClass.getESuperTypes().add(this.getSinglePort());
		singleInputPortEClass.getESuperTypes().add(this.getInputPort());
		multiInputPortEClass.getESuperTypes().add(this.getMultiPort());
		multiInputPortEClass.getESuperTypes().add(this.getInputPort());
		singleOutputPortEClass.getESuperTypes().add(this.getSinglePort());
		singleOutputPortEClass.getESuperTypes().add(this.getOutputPort());
		multiOutputPortEClass.getESuperTypes().add(this.getMultiPort());
		multiOutputPortEClass.getESuperTypes().add(this.getOutputPort());
		singlePortMappingEClass.getESuperTypes().add(this.getPortMapping());
		multiPortMappingEClass.getESuperTypes().add(this.getPortMapping());
		multiSinglePortMappingEClass.getESuperTypes().add(this.getPortMapping());

		// Initialize classes and features; add operations and parameters
		initEClass(compositeRefactoringEClass, CompositeRefactoring.class, "CompositeRefactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositeRefactoring_MainRefactoringUnit(), this.getRefactoringUnit(), null, "mainRefactoringUnit", null, 1, 1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeRefactoring_PortMappings(), this.getPortMapping(), null, "portMappings", null, 0, -1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeRefactoring_ModelRefactorings(), this.getModelRefactoring(), null, "modelRefactorings", null, 0, -1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeRefactoring_Helper(), this.getHelper(), null, "helper", null, 0, -1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeRefactoring_MappingVisualization(), this.getMappingVisualization(), "mappingVisualization", "0", 1, 1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeRefactoring_CustomInitialCondition(), ecorePackage.getEString(), "customInitialCondition", null, 0, 1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompositeRefactoring_CustomFinalCondition(), ecorePackage.getEString(), "customFinalCondition", null, 0, 1, CompositeRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(describedElementEClass, DescribedElement.class, "DescribedElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDescribedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, DescribedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refactoringUnitEClass, RefactoringUnit.class, "RefactoringUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefactoringUnit_SeqExecutionOrder(), ecorePackage.getEInt(), "seqExecutionOrder", null, 0, 1, RefactoringUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(refactoringUnitEClass, this.getInputPort(), "getAllInputPorts", 0, -1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(refactoringUnitEClass, null, "setSeqExecutionOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "seqExecutionOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "superCall", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(refactoringUnitEClass, null, "setName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "newName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "updateContainer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelRefactoringEClass, ModelRefactoring.class, "ModelRefactoring", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelRefactoring_RefId(), ecorePackage.getEString(), "refId", null, 1, 1, ModelRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelRefactoring_Label(), ecorePackage.getEString(), "label", null, 1, 1, ModelRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelRefactoring_NamespaceUri(), ecorePackage.getEString(), "namespaceUri", null, 1, 1, ModelRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getModelRefactoring_InputPorts(), this.getSingleInputPort(), null, "inputPorts", null, 0, -1, ModelRefactoring.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicUnitEClass, AtomicUnit.class, "AtomicUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicUnit_InputPorts(), this.getSingleInputPort(), null, "inputPorts", null, 1, -1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicUnit_UnitId(), ecorePackage.getEString(), "unitId", null, 1, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicUnit_Label(), ecorePackage.getEString(), "label", null, 1, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicUnit_NamespaceUri(), ecorePackage.getEString(), "namespaceUri", null, 1, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicUnit_Type(), ecorePackage.getEString(), "type", "Atomic Unit", 0, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicUnit_ModelRefactoring(), this.getModelRefactoring(), null, "modelRefactoring", null, 1, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicUnit_CheckInitialConditionFlag(), ecorePackage.getEBoolean(), "checkInitialConditionFlag", "false", 0, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicUnit_CheckFinalConditionFlag(), ecorePackage.getEBoolean(), "checkFinalConditionFlag", "false", 0, 1, AtomicUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeUnitEClass, CompositeUnit.class, "CompositeUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequentialUnitEClass, SequentialUnit.class, "SequentialUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequentialUnit_HelperUnits(), this.getHelperUnit(), null, "helperUnits", null, 0, -1, SequentialUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialUnit_RefactoringUnits(), this.getRefactoringUnit(), null, "refactoringUnits", null, 1, -1, SequentialUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSequentialUnit_InputPorts(), this.getInputPort(), null, "inputPorts", null, 1, -1, SequentialUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequentialUnit_Strict(), ecorePackage.getEBoolean(), "strict", "true", 0, 1, SequentialUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequentialUnit_Type(), ecorePackage.getEString(), "type", "Sequential Unit", 0, 1, SequentialUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequentialUnit_LblStrict(), ecorePackage.getEString(), "lblStrict", "strict", 0, 1, SequentialUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sequentialUnitEClass, null, "updateSeqExecutionOrder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(conditionCheckEClass, ConditionCheck.class, "ConditionCheck", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConditionCheck_Type(), ecorePackage.getEString(), "type", "Condition Check", 0, 1, ConditionCheck.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionCheck_Spec(), ecorePackage.getEString(), "spec", null, 0, 1, ConditionCheck.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionalUnitEClass, ConditionalUnit.class, "ConditionalUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalUnit_If(), this.getConditionCheck(), null, "if", null, 1, 1, ConditionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalUnit_HelperUnits(), this.getHelperUnit(), null, "helperUnits", null, 0, -1, ConditionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalUnit_Then(), this.getRefactoringUnit(), null, "then", null, 1, 1, ConditionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalUnit_Else(), this.getRefactoringUnit(), null, "else", null, 0, 1, ConditionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConditionalUnit_InputPorts(), this.getInputPort(), null, "inputPorts", null, 1, -1, ConditionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConditionalUnit_Type(), ecorePackage.getEString(), "type", "Conditional Unit", 0, 1, ConditionalUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queuedUnitEClass, QueuedUnit.class, "QueuedUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueuedUnit_Strict(), ecorePackage.getEBoolean(), "strict", "true", 0, 1, QueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(queuedUnitEClass, null, "init", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singleQueuedUnitEClass, SingleQueuedUnit.class, "SingleQueuedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleQueuedUnit_HelperUnits(), this.getHelperUnit(), null, "helperUnits", null, 0, -1, SingleQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleQueuedUnit_RefactoringUnit(), this.getRefactoringUnit(), null, "refactoringUnit", null, 1, 1, SingleQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleQueuedUnit_SingleInputPorts(), this.getSingleInputPort(), null, "singleInputPorts", null, 0, -1, SingleQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleQueuedUnit_MultiInputPort(), this.getMultiInputPort(), null, "multiInputPort", null, 1, 1, SingleQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleQueuedUnit_Type(), ecorePackage.getEString(), "type", "Single Queued Unit", 0, 1, SingleQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleQueuedUnit_LblStrict(), ecorePackage.getEString(), "lblStrict", "strict", 0, 1, SingleQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(twicedQueuedUnitEClass, TwicedQueuedUnit.class, "TwicedQueuedUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cartesianQueuedUnitEClass, CartesianQueuedUnit.class, "CartesianQueuedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCartesianQueuedUnit_HelperUnits(), this.getHelperUnit(), null, "helperUnits", null, 0, -1, CartesianQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianQueuedUnit_RefactoringUnit(), this.getRefactoringUnit(), null, "refactoringUnit", null, 1, 1, CartesianQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianQueuedUnit_SingleInputPorts(), this.getSingleInputPort(), null, "singleInputPorts", null, 0, -1, CartesianQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCartesianQueuedUnit_MultiInputPorts(), this.getMultiInputPort(), null, "multiInputPorts", null, 2, 2, CartesianQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianQueuedUnit_Type(), ecorePackage.getEString(), "type", "Cartesian Queued Unit", 0, 1, CartesianQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCartesianQueuedUnit_LblStrict(), ecorePackage.getEString(), "lblStrict", "strict", 0, 1, CartesianQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parallelQueuedUnitEClass, ParallelQueuedUnit.class, "ParallelQueuedUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelQueuedUnit_HelperUnits(), this.getHelperUnit(), null, "helperUnits", null, 0, -1, ParallelQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParallelQueuedUnit_RefactoringUnits(), this.getRefactoringUnit(), null, "refactoringUnits", null, 1, 1, ParallelQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParallelQueuedUnit_SingleInputPorts(), this.getSingleInputPort(), null, "singleInputPorts", null, 0, -1, ParallelQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParallelQueuedUnit_MultiInputPorts(), this.getMultiInputPort(), null, "multiInputPorts", null, 2, 2, ParallelQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallelQueuedUnit_Type(), ecorePackage.getEString(), "type", "Parallel Queued Unit", 0, 1, ParallelQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParallelQueuedUnit_LblStrict(), ecorePackage.getEString(), "lblStrict", "strict", 0, 1, ParallelQueuedUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperUnitEClass, HelperUnit.class, "HelperUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelperUnit_HelperUnitId(), ecorePackage.getEString(), "helperUnitId", null, 1, 1, HelperUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelperUnit_NamespaceUri(), ecorePackage.getEString(), "namespaceUri", null, 1, 1, HelperUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(helperUnitEClass, this.getInputPort(), "getInputPort", 1, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(helperUnitEClass, this.getOutputPort(), "getOutputPort", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(featureUnitEClass, FeatureUnit.class, "FeatureUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleFeatureUnitEClass, SingleFeatureUnit.class, "SingleFeatureUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleFeatureUnit_InputPort(), this.getSingleInputPort(), null, "inputPort", null, 1, 1, SingleFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleFeatureUnit_SecondaryInputPorts(), this.getMultiInputPort(), null, "secondaryInputPorts", null, 0, -1, SingleFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleFeatureUnit_OutputPort(), this.getSingleOutputPort(), null, "outputPort", null, 1, 1, SingleFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleFeatureUnit_SingleFeatureHelper(), this.getSingleFeatureHelper(), null, "singleFeatureHelper", null, 1, 1, SingleFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleFeatureUnit_Type(), ecorePackage.getEString(), "type", "Single Feature Unit", 0, 1, SingleFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFeatureUnitEClass, MultiFeatureUnit.class, "MultiFeatureUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiFeatureUnit_InputPort(), this.getSingleInputPort(), null, "inputPort", null, 1, 1, MultiFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiFeatureUnit_SecondaryInputPorts(), this.getMultiInputPort(), null, "secondaryInputPorts", null, 0, -1, MultiFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiFeatureUnit_OutputPort(), this.getMultiOutputPort(), null, "outputPort", null, 1, 1, MultiFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiFeatureUnit_MultiFeatureHelper(), this.getMultiFeatureHelper(), null, "multiFeatureHelper", null, 1, 1, MultiFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFeatureUnit_Type(), ecorePackage.getEString(), "type", "Multi Feature Unit", 0, 1, MultiFeatureUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterUnitEClass, FilterUnit.class, "FilterUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleFilterUnitEClass, SingleFilterUnit.class, "SingleFilterUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleFilterUnit_InputPort(), this.getMultiInputPort(), null, "inputPort", null, 1, 1, SingleFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleFilterUnit_OutputPort(), this.getSingleOutputPort(), null, "outputPort", null, 1, 1, SingleFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSingleFilterUnit_SingleFilterHelper(), this.getSingleFilterHelper(), null, "singleFilterHelper", null, 1, 1, SingleFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSingleFilterUnit_Type(), ecorePackage.getEString(), "type", "Single Filter Unit", 0, 1, SingleFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFilterUnitEClass, MultiFilterUnit.class, "MultiFilterUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiFilterUnit_InputPort(), this.getMultiInputPort(), null, "inputPort", null, 1, 1, MultiFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiFilterUnit_OutputPort(), this.getMultiOutputPort(), null, "outputPort", null, 1, 1, MultiFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiFilterUnit_MultiFilterHelper(), this.getMultiFilterHelper(), null, "multiFilterHelper", null, 1, 1, MultiFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMultiFilterUnit_Type(), ecorePackage.getEString(), "type", "Multi Filter Unit", 0, 1, MultiFilterUnit.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(helperEClass, Helper.class, "Helper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHelper_HelperId(), ecorePackage.getEString(), "helperId", null, 1, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHelper_NamespaceUri(), ecorePackage.getEString(), "namespaceUri", null, 1, 1, Helper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(featureHelperEClass, FeatureHelper.class, "FeatureHelper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeatureHelper_InputPort(), this.getSingleInputPort(), null, "inputPort", null, 1, 1, FeatureHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFeatureHelper_SecondaryInputPorts(), this.getMultiInputPort(), null, "secondaryInputPorts", null, 0, -1, FeatureHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleFeatureHelperEClass, SingleFeatureHelper.class, "SingleFeatureHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleFeatureHelper_OutputPort(), this.getSingleOutputPort(), null, "outputPort", null, 1, 1, SingleFeatureHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFeatureHelperEClass, MultiFeatureHelper.class, "MultiFeatureHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiFeatureHelper_OutputPort(), this.getMultiOutputPort(), null, "outputPort", null, 1, 1, MultiFeatureHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterHelperEClass, FilterHelper.class, "FilterHelper", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFilterHelper_InputPort(), this.getMultiInputPort(), null, "inputPort", null, 1, 1, FilterHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleFilterHelperEClass, SingleFilterHelper.class, "SingleFilterHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleFilterHelper_OutputPort(), this.getSingleOutputPort(), null, "outputPort", null, 1, 1, SingleFilterHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiFilterHelperEClass, MultiFilterHelper.class, "MultiFilterHelper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiFilterHelper_OutputPort(), this.getMultiOutputPort(), null, "outputPort", null, 1, 1, MultiFilterHelper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portEClass, Port.class, "Port", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_Type(), ecorePackage.getEJavaClass(), "type", null, 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(portEClass, null, "setType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "newType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "initiator", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(portEClass, null, "updatePortName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "singularPortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portEClass, ecorePackage.getEString(), "getSingularPortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singlePortEClass, SinglePort.class, "SinglePort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSinglePort_Value(), ecorePackage.getEJavaObject(), "value", null, 0, 1, SinglePort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPortEClass, MultiPort.class, "MultiPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiPort_Value(), ecorePackage.getEJavaObject(), "value", null, 0, -1, MultiPort.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputPortEClass, InputPort.class, "InputPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(inputPortEClass, ecorePackage.getEBooleanObject(), "isMappingTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(inputPortEClass, ecorePackage.getEBooleanObject(), "isRootPort", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputPortEClass, OutputPort.class, "OutputPort", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleInputPortEClass, SingleInputPort.class, "SingleInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiInputPortEClass, MultiInputPort.class, "MultiInputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleOutputPortEClass, SingleOutputPort.class, "SingleOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(multiOutputPortEClass, MultiOutputPort.class, "MultiOutputPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portMappingEClass, PortMapping.class, "PortMapping", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(portMappingEClass, this.getPort(), "getSource", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portMappingEClass, this.getInputPort(), "getTarget", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(portMappingEClass, null, "updatePortTypesAndNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaClass(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "singularPortName", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portMappingEClass, null, "updateMappingNumber", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(portMappingEClass, null, "updateVisualization", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(singlePortMappingEClass, SinglePortMapping.class, "SinglePortMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSinglePortMapping_Source(), this.getSinglePort(), null, "source", null, 0, 1, SinglePortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSinglePortMapping_Target(), this.getSingleInputPort(), null, "target", null, 0, 1, SinglePortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiPortMappingEClass, MultiPortMapping.class, "MultiPortMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiPortMapping_Source(), this.getMultiPort(), null, "source", null, 0, 1, MultiPortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiPortMapping_Target(), this.getMultiInputPort(), null, "target", null, 0, 1, MultiPortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiSinglePortMappingEClass, MultiSinglePortMapping.class, "MultiSinglePortMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMultiSinglePortMapping_Source(), this.getMultiPort(), null, "source", null, 0, 1, MultiSinglePortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMultiSinglePortMapping_Target(), this.getSingleInputPort(), null, "target", null, 0, 1, MultiSinglePortMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mappingVisualizationEEnum, MappingVisualization.class, "MappingVisualization");
		addEEnumLiteral(mappingVisualizationEEnum, MappingVisualization.ARROWS);
		addEEnumLiteral(mappingVisualizationEEnum, MappingVisualization.COLORED_PORTS);
		addEEnumLiteral(mappingVisualizationEEnum, MappingVisualization.INDICES);
		addEEnumLiteral(mappingVisualizationEEnum, MappingVisualization.ARROWS_AND_COLORED_PORTS);
		addEEnumLiteral(mappingVisualizationEEnum, MappingVisualization.ARROWS_AND_INDICES);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf
		createGmfAnnotations();
		// gmf.diagram
		createGmf_1Annotations();
		// gmf.node
		createGmf_2Annotations();
		// gmf.affixed
		createGmf_3Annotations();
		// gmf.compartment
		createGmf_4Annotations();
		// gmf.link
		createGmf_5Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });																																																		
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.diagram";			
		addAnnotation
		  (compositeRefactoringEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "onefile", "false"
		   });																																																	
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.node";				
		addAnnotation
		  (atomicUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "label,type",
			 "label.pattern", "{0}:{1}"
		   });			
		addAnnotation
		  (sequentialUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type,lblStrict",
			 "label.pattern", "{0}:{1} -{2}-"
		   });					
		addAnnotation
		  (conditionCheckEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type,spec",
			 "label.pattern", "{0}:{1} -{2}-"
		   });		
		addAnnotation
		  (conditionalUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type",
			 "label.pattern", "{0}:{1}"
		   });							
		addAnnotation
		  (singleQueuedUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type,lblStrict",
			 "label.pattern", "{0}:{1} -{2}-"
		   });						
		addAnnotation
		  (cartesianQueuedUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type,lblStrict",
			 "label.pattern", "{0}:{1} -{2}-"
		   });						
		addAnnotation
		  (parallelQueuedUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type,lblStrict",
			 "label.pattern", "{0}:{1} -{2}-"
		   });						
		addAnnotation
		  (singleFeatureUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type",
			 "label.pattern", "{0}:{1}"
		   });					
		addAnnotation
		  (multiFeatureUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type",
			 "label.pattern", "{0}:{1}"
		   });					
		addAnnotation
		  (singleFilterUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type",
			 "label.pattern", "{0}:{1}"
		   });				
		addAnnotation
		  (multiFilterUnitEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label.icon", "false",
			 "label", "name,type",
			 "label.pattern", "{0}:{1}"
		   });				
		addAnnotation
		  (portEClass, 
		   source, 
		   new String[] {
			 "foo", "bar",
			 "label", "name,type",
			 "label.icon", "false",
			 "label.placement", "external",
			 "label.pattern", "{0}:{1}"
		   });		
		addAnnotation
		  (multiPortEClass, 
		   source, 
		   new String[] {
			 "border.color", "255,0,0",
			 "border.width", "10"
		   });		
		addAnnotation
		  (inputPortEClass, 
		   source, 
		   new String[] {
			 "figure", "rectangle",
			 "size", "20,20"
		   });		
		addAnnotation
		  (outputPortEClass, 
		   source, 
		   new String[] {
			 "figure", "ellipse",
			 "size", "20,20"
		   });			
	}

	/**
	 * Initializes the annotations for <b>gmf.affixed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.affixed";					
		addAnnotation
		  (getAtomicUnit_InputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getSequentialUnit_InputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });								
		addAnnotation
		  (getConditionalUnit_InputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getSingleQueuedUnit_SingleInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSingleQueuedUnit_MultiInputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getCartesianQueuedUnit_SingleInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getCartesianQueuedUnit_MultiInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getParallelQueuedUnit_SingleInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getParallelQueuedUnit_MultiInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });			
		addAnnotation
		  (getSingleFeatureUnit_InputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSingleFeatureUnit_SecondaryInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSingleFeatureUnit_OutputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });			
		addAnnotation
		  (getMultiFeatureUnit_InputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getMultiFeatureUnit_SecondaryInputPorts(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getMultiFeatureUnit_OutputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });			
		addAnnotation
		  (getSingleFilterUnit_InputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSingleFilterUnit_OutputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });			
		addAnnotation
		  (getMultiFilterUnit_InputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getMultiFilterUnit_OutputPort(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });							
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_4Annotations() {
		String source = "gmf.compartment";							
		addAnnotation
		  (getSequentialUnit_HelperUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSequentialUnit_RefactoringUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getConditionalUnit_If(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getConditionalUnit_HelperUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getConditionalUnit_Then(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getConditionalUnit_Else(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });				
		addAnnotation
		  (getSingleQueuedUnit_HelperUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getSingleQueuedUnit_RefactoringUnit(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getCartesianQueuedUnit_HelperUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getCartesianQueuedUnit_RefactoringUnit(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });					
		addAnnotation
		  (getParallelQueuedUnit_HelperUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });		
		addAnnotation
		  (getParallelQueuedUnit_RefactoringUnits(), 
		   source, 
		   new String[] {
			 "foo", "bar"
		   });																							
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_5Annotations() {
		String source = "gmf.link";																																																		
		addAnnotation
		  (singlePortMappingEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "arrow"
		   });		
		addAnnotation
		  (multiPortMappingEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "arrow"
		   });		
		addAnnotation
		  (multiSinglePortMappingEClass, 
		   source, 
		   new String[] {
			 "source", "source",
			 "target", "target",
			 "style", "dot",
			 "width", "2",
			 "target.decoration", "arrow",
			 "tool.small.bundle", "name"
		   });
	}

} //ComrelPackageImpl
