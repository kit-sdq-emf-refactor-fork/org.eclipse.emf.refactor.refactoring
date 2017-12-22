/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see comrel.ComrelFactory
 * @model kind="package"
 *        annotation="gmf foo='bar'"
 * @generated
 */
public interface ComrelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "comrel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://comrel/0.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "comrel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ComrelPackage eINSTANCE = comrel.impl.ComrelPackageImpl.init();

	/**
	 * The meta object id for the '{@link comrel.NamedElement <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.NamedElement
	 * @see comrel.impl.ComrelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link comrel.impl.ModelRefactoringImpl <em>Model Refactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.ModelRefactoringImpl
	 * @see comrel.impl.ComrelPackageImpl#getModelRefactoring()
	 * @generated
	 */
	int MODEL_REFACTORING = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING__REF_ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING__NAMESPACE_URI = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING__INPUT_PORTS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Model Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFACTORING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link comrel.impl.CompositeRefactoringImpl <em>Composite Refactoring</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.CompositeRefactoringImpl
	 * @see comrel.impl.ComrelPackageImpl#getCompositeRefactoring()
	 * @generated
	 */
	int COMPOSITE_REFACTORING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__NAME = MODEL_REFACTORING__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__DESCRIPTION = MODEL_REFACTORING__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Ref Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__REF_ID = MODEL_REFACTORING__REF_ID;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__LABEL = MODEL_REFACTORING__LABEL;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__NAMESPACE_URI = MODEL_REFACTORING__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__INPUT_PORTS = MODEL_REFACTORING__INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Main Refactoring Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT = MODEL_REFACTORING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__PORT_MAPPINGS = MODEL_REFACTORING_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Model Refactorings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__MODEL_REFACTORINGS = MODEL_REFACTORING_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Helper</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__HELPER = MODEL_REFACTORING_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Mapping Visualization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__MAPPING_VISUALIZATION = MODEL_REFACTORING_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Custom Initial Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION = MODEL_REFACTORING_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Custom Final Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION = MODEL_REFACTORING_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Composite Refactoring</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_REFACTORING_FEATURE_COUNT = MODEL_REFACTORING_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link comrel.DescribedElement <em>Described Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.DescribedElement
	 * @see comrel.impl.ComrelPackageImpl#getDescribedElement()
	 * @generated
	 */
	int DESCRIBED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT__DESCRIPTION = 0;

	/**
	 * The number of structural features of the '<em>Described Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DESCRIBED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link comrel.impl.RefactoringUnitImpl <em>Refactoring Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.RefactoringUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getRefactoringUnit()
	 * @generated
	 */
	int REFACTORING_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_UNIT__SEQ_EXECUTION_ORDER = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Refactoring Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFACTORING_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.AtomicUnitImpl <em>Atomic Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.AtomicUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getAtomicUnit()
	 * @generated
	 */
	int ATOMIC_UNIT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__NAME = REFACTORING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__SEQ_EXECUTION_ORDER = REFACTORING_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__INPUT_PORTS = REFACTORING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__UNIT_ID = REFACTORING_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__LABEL = REFACTORING_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__NAMESPACE_URI = REFACTORING_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__TYPE = REFACTORING_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Model Refactoring</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__MODEL_REFACTORING = REFACTORING_UNIT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Check Initial Condition Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG = REFACTORING_UNIT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Check Final Condition Flag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG = REFACTORING_UNIT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Atomic Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_UNIT_FEATURE_COUNT = REFACTORING_UNIT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link comrel.impl.CompositeUnitImpl <em>Composite Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.CompositeUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getCompositeUnit()
	 * @generated
	 */
	int COMPOSITE_UNIT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_UNIT__NAME = REFACTORING_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_UNIT__SEQ_EXECUTION_ORDER = REFACTORING_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The number of structural features of the '<em>Composite Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_UNIT_FEATURE_COUNT = REFACTORING_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.SequentialUnitImpl <em>Sequential Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SequentialUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getSequentialUnit()
	 * @generated
	 */
	int SEQUENTIAL_UNIT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__NAME = COMPOSITE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__SEQ_EXECUTION_ORDER = COMPOSITE_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Helper Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__HELPER_UNITS = COMPOSITE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refactoring Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__REFACTORING_UNITS = COMPOSITE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__INPUT_PORTS = COMPOSITE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__STRICT = COMPOSITE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__TYPE = COMPOSITE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lbl Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT__LBL_STRICT = COMPOSITE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Sequential Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENTIAL_UNIT_FEATURE_COUNT = COMPOSITE_UNIT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link comrel.impl.ConditionCheckImpl <em>Condition Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.ConditionCheckImpl
	 * @see comrel.impl.ComrelPackageImpl#getConditionCheck()
	 * @generated
	 */
	int CONDITION_CHECK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CHECK__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CHECK__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CHECK__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Spec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CHECK__SPEC = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Condition Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_CHECK_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link comrel.impl.ConditionalUnitImpl <em>Conditional Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.ConditionalUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getConditionalUnit()
	 * @generated
	 */
	int CONDITIONAL_UNIT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__NAME = COMPOSITE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__SEQ_EXECUTION_ORDER = COMPOSITE_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__IF = COMPOSITE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Helper Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__HELPER_UNITS = COMPOSITE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__THEN = COMPOSITE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__ELSE = COMPOSITE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__INPUT_PORTS = COMPOSITE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT__TYPE = COMPOSITE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Conditional Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_UNIT_FEATURE_COUNT = COMPOSITE_UNIT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link comrel.impl.QueuedUnitImpl <em>Queued Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.QueuedUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getQueuedUnit()
	 * @generated
	 */
	int QUEUED_UNIT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_UNIT__NAME = COMPOSITE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_UNIT__SEQ_EXECUTION_ORDER = COMPOSITE_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_UNIT__STRICT = COMPOSITE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Queued Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUED_UNIT_FEATURE_COUNT = COMPOSITE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleQueuedUnitImpl <em>Single Queued Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleQueuedUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleQueuedUnit()
	 * @generated
	 */
	int SINGLE_QUEUED_UNIT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__NAME = QUEUED_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__SEQ_EXECUTION_ORDER = QUEUED_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__STRICT = QUEUED_UNIT__STRICT;

	/**
	 * The feature id for the '<em><b>Helper Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__HELPER_UNITS = QUEUED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refactoring Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__REFACTORING_UNIT = QUEUED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Single Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__SINGLE_INPUT_PORTS = QUEUED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__MULTI_INPUT_PORT = QUEUED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__TYPE = QUEUED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lbl Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT__LBL_STRICT = QUEUED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Single Queued Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_QUEUED_UNIT_FEATURE_COUNT = QUEUED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link comrel.impl.TwicedQueuedUnitImpl <em>Twiced Queued Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.TwicedQueuedUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getTwicedQueuedUnit()
	 * @generated
	 */
	int TWICED_QUEUED_UNIT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWICED_QUEUED_UNIT__NAME = QUEUED_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWICED_QUEUED_UNIT__SEQ_EXECUTION_ORDER = QUEUED_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWICED_QUEUED_UNIT__STRICT = QUEUED_UNIT__STRICT;

	/**
	 * The number of structural features of the '<em>Twiced Queued Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TWICED_QUEUED_UNIT_FEATURE_COUNT = QUEUED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.CartesianQueuedUnitImpl <em>Cartesian Queued Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.CartesianQueuedUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getCartesianQueuedUnit()
	 * @generated
	 */
	int CARTESIAN_QUEUED_UNIT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__NAME = TWICED_QUEUED_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__SEQ_EXECUTION_ORDER = TWICED_QUEUED_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__STRICT = TWICED_QUEUED_UNIT__STRICT;

	/**
	 * The feature id for the '<em><b>Helper Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__HELPER_UNITS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refactoring Unit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__REFACTORING_UNIT = TWICED_QUEUED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Single Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__SINGLE_INPUT_PORTS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__MULTI_INPUT_PORTS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__TYPE = TWICED_QUEUED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lbl Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT__LBL_STRICT = TWICED_QUEUED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Cartesian Queued Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARTESIAN_QUEUED_UNIT_FEATURE_COUNT = TWICED_QUEUED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link comrel.impl.ParallelQueuedUnitImpl <em>Parallel Queued Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.ParallelQueuedUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getParallelQueuedUnit()
	 * @generated
	 */
	int PARALLEL_QUEUED_UNIT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__NAME = TWICED_QUEUED_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Seq Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__SEQ_EXECUTION_ORDER = TWICED_QUEUED_UNIT__SEQ_EXECUTION_ORDER;

	/**
	 * The feature id for the '<em><b>Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__STRICT = TWICED_QUEUED_UNIT__STRICT;

	/**
	 * The feature id for the '<em><b>Helper Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__HELPER_UNITS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Refactoring Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__REFACTORING_UNITS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Single Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS = TWICED_QUEUED_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__TYPE = TWICED_QUEUED_UNIT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Lbl Strict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT__LBL_STRICT = TWICED_QUEUED_UNIT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Parallel Queued Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_QUEUED_UNIT_FEATURE_COUNT = TWICED_QUEUED_UNIT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link comrel.impl.HelperUnitImpl <em>Helper Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.HelperUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getHelperUnit()
	 * @generated
	 */
	int HELPER_UNIT = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_UNIT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_UNIT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_UNIT__HELPER_UNIT_ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_UNIT__NAMESPACE_URI = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Helper Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_UNIT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link comrel.impl.FeatureUnitImpl <em>Feature Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.FeatureUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getFeatureUnit()
	 * @generated
	 */
	int FEATURE_UNIT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_UNIT__NAME = HELPER_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_UNIT__DESCRIPTION = HELPER_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_UNIT__HELPER_UNIT_ID = HELPER_UNIT__HELPER_UNIT_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_UNIT__NAMESPACE_URI = HELPER_UNIT__NAMESPACE_URI;

	/**
	 * The number of structural features of the '<em>Feature Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_UNIT_FEATURE_COUNT = HELPER_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleFeatureUnitImpl <em>Single Feature Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleFeatureUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleFeatureUnit()
	 * @generated
	 */
	int SINGLE_FEATURE_UNIT = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__NAME = FEATURE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__DESCRIPTION = FEATURE_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__HELPER_UNIT_ID = FEATURE_UNIT__HELPER_UNIT_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__NAMESPACE_URI = FEATURE_UNIT__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__INPUT_PORT = FEATURE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secondary Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__SECONDARY_INPUT_PORTS = FEATURE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__OUTPUT_PORT = FEATURE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Single Feature Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__SINGLE_FEATURE_HELPER = FEATURE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT__TYPE = FEATURE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Single Feature Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_UNIT_FEATURE_COUNT = FEATURE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiFeatureUnitImpl <em>Multi Feature Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiFeatureUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiFeatureUnit()
	 * @generated
	 */
	int MULTI_FEATURE_UNIT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__NAME = FEATURE_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__DESCRIPTION = FEATURE_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__HELPER_UNIT_ID = FEATURE_UNIT__HELPER_UNIT_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__NAMESPACE_URI = FEATURE_UNIT__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__INPUT_PORT = FEATURE_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secondary Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS = FEATURE_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__OUTPUT_PORT = FEATURE_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi Feature Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER = FEATURE_UNIT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT__TYPE = FEATURE_UNIT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Multi Feature Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_UNIT_FEATURE_COUNT = FEATURE_UNIT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link comrel.impl.FilterUnitImpl <em>Filter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.FilterUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getFilterUnit()
	 * @generated
	 */
	int FILTER_UNIT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__NAME = HELPER_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__DESCRIPTION = HELPER_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__HELPER_UNIT_ID = HELPER_UNIT__HELPER_UNIT_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT__NAMESPACE_URI = HELPER_UNIT__NAMESPACE_URI;

	/**
	 * The number of structural features of the '<em>Filter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_UNIT_FEATURE_COUNT = HELPER_UNIT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleFilterUnitImpl <em>Single Filter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleFilterUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleFilterUnit()
	 * @generated
	 */
	int SINGLE_FILTER_UNIT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__NAME = FILTER_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__DESCRIPTION = FILTER_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__HELPER_UNIT_ID = FILTER_UNIT__HELPER_UNIT_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__NAMESPACE_URI = FILTER_UNIT__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__INPUT_PORT = FILTER_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__OUTPUT_PORT = FILTER_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Single Filter Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER = FILTER_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT__TYPE = FILTER_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Single Filter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_UNIT_FEATURE_COUNT = FILTER_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiFilterUnitImpl <em>Multi Filter Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiFilterUnitImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiFilterUnit()
	 * @generated
	 */
	int MULTI_FILTER_UNIT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__NAME = FILTER_UNIT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__DESCRIPTION = FILTER_UNIT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Unit Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__HELPER_UNIT_ID = FILTER_UNIT__HELPER_UNIT_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__NAMESPACE_URI = FILTER_UNIT__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__INPUT_PORT = FILTER_UNIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__OUTPUT_PORT = FILTER_UNIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Filter Helper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__MULTI_FILTER_HELPER = FILTER_UNIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT__TYPE = FILTER_UNIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Multi Filter Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_UNIT_FEATURE_COUNT = FILTER_UNIT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link comrel.impl.HelperImpl <em>Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.HelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getHelper()
	 * @generated
	 */
	int HELPER = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__HELPER_ID = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER__NAMESPACE_URI = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link comrel.impl.FeatureHelperImpl <em>Feature Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.FeatureHelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getFeatureHelper()
	 * @generated
	 */
	int FEATURE_HELPER = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER__NAME = HELPER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER__DESCRIPTION = HELPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER__HELPER_ID = HELPER__HELPER_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER__NAMESPACE_URI = HELPER__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER__INPUT_PORT = HELPER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Secondary Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER__SECONDARY_INPUT_PORTS = HELPER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_HELPER_FEATURE_COUNT = HELPER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleFeatureHelperImpl <em>Single Feature Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleFeatureHelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleFeatureHelper()
	 * @generated
	 */
	int SINGLE_FEATURE_HELPER = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__NAME = FEATURE_HELPER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__DESCRIPTION = FEATURE_HELPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__HELPER_ID = FEATURE_HELPER__HELPER_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__NAMESPACE_URI = FEATURE_HELPER__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__INPUT_PORT = FEATURE_HELPER__INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Secondary Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__SECONDARY_INPUT_PORTS = FEATURE_HELPER__SECONDARY_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER__OUTPUT_PORT = FEATURE_HELPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Feature Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FEATURE_HELPER_FEATURE_COUNT = FEATURE_HELPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiFeatureHelperImpl <em>Multi Feature Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiFeatureHelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiFeatureHelper()
	 * @generated
	 */
	int MULTI_FEATURE_HELPER = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__NAME = FEATURE_HELPER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__DESCRIPTION = FEATURE_HELPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__HELPER_ID = FEATURE_HELPER__HELPER_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__NAMESPACE_URI = FEATURE_HELPER__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__INPUT_PORT = FEATURE_HELPER__INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Secondary Input Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__SECONDARY_INPUT_PORTS = FEATURE_HELPER__SECONDARY_INPUT_PORTS;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER__OUTPUT_PORT = FEATURE_HELPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Feature Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FEATURE_HELPER_FEATURE_COUNT = FEATURE_HELPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.FilterHelperImpl <em>Filter Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.FilterHelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getFilterHelper()
	 * @generated
	 */
	int FILTER_HELPER = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_HELPER__NAME = HELPER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_HELPER__DESCRIPTION = HELPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_HELPER__HELPER_ID = HELPER__HELPER_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_HELPER__NAMESPACE_URI = HELPER__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_HELPER__INPUT_PORT = HELPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Filter Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILTER_HELPER_FEATURE_COUNT = HELPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleFilterHelperImpl <em>Single Filter Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleFilterHelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleFilterHelper()
	 * @generated
	 */
	int SINGLE_FILTER_HELPER = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER__NAME = FILTER_HELPER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER__DESCRIPTION = FILTER_HELPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER__HELPER_ID = FILTER_HELPER__HELPER_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER__NAMESPACE_URI = FILTER_HELPER__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER__INPUT_PORT = FILTER_HELPER__INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER__OUTPUT_PORT = FILTER_HELPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Filter Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_FILTER_HELPER_FEATURE_COUNT = FILTER_HELPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiFilterHelperImpl <em>Multi Filter Helper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiFilterHelperImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiFilterHelper()
	 * @generated
	 */
	int MULTI_FILTER_HELPER = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER__NAME = FILTER_HELPER__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER__DESCRIPTION = FILTER_HELPER__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Helper Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER__HELPER_ID = FILTER_HELPER__HELPER_ID;

	/**
	 * The feature id for the '<em><b>Namespace Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER__NAMESPACE_URI = FILTER_HELPER__NAMESPACE_URI;

	/**
	 * The feature id for the '<em><b>Input Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER__INPUT_PORT = FILTER_HELPER__INPUT_PORT;

	/**
	 * The feature id for the '<em><b>Output Port</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER__OUTPUT_PORT = FILTER_HELPER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Filter Helper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_FILTER_HELPER_FEATURE_COUNT = FILTER_HELPER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.PortImpl
	 * @see comrel.impl.ComrelPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link comrel.impl.SinglePortImpl <em>Single Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SinglePortImpl
	 * @see comrel.impl.ComrelPackageImpl#getSinglePort()
	 * @generated
	 */
	int SINGLE_PORT = 30;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT__VALUE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiPortImpl <em>Multi Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiPort()
	 * @generated
	 */
	int MULTI_PORT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT__TYPE = PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT__VALUE = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link comrel.impl.InputPortImpl <em>Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.InputPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getInputPort()
	 * @generated
	 */
	int INPUT_PORT = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.OutputPortImpl <em>Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.OutputPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getOutputPort()
	 * @generated
	 */
	int OUTPUT_PORT = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__DESCRIPTION = PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT__TYPE = PORT__TYPE;

	/**
	 * The number of structural features of the '<em>Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleInputPortImpl <em>Single Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleInputPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleInputPort()
	 * @generated
	 */
	int SINGLE_INPUT_PORT = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT_PORT__NAME = SINGLE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT_PORT__DESCRIPTION = SINGLE_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT_PORT__TYPE = SINGLE_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT_PORT__VALUE = SINGLE_PORT__VALUE;

	/**
	 * The number of structural features of the '<em>Single Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_INPUT_PORT_FEATURE_COUNT = SINGLE_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiInputPortImpl <em>Multi Input Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiInputPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiInputPort()
	 * @generated
	 */
	int MULTI_INPUT_PORT = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INPUT_PORT__NAME = MULTI_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INPUT_PORT__DESCRIPTION = MULTI_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INPUT_PORT__TYPE = MULTI_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INPUT_PORT__VALUE = MULTI_PORT__VALUE;

	/**
	 * The number of structural features of the '<em>Multi Input Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_INPUT_PORT_FEATURE_COUNT = MULTI_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.SingleOutputPortImpl <em>Single Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SingleOutputPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getSingleOutputPort()
	 * @generated
	 */
	int SINGLE_OUTPUT_PORT = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OUTPUT_PORT__NAME = SINGLE_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OUTPUT_PORT__DESCRIPTION = SINGLE_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OUTPUT_PORT__TYPE = SINGLE_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OUTPUT_PORT__VALUE = SINGLE_PORT__VALUE;

	/**
	 * The number of structural features of the '<em>Single Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OUTPUT_PORT_FEATURE_COUNT = SINGLE_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiOutputPortImpl <em>Multi Output Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiOutputPortImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiOutputPort()
	 * @generated
	 */
	int MULTI_OUTPUT_PORT = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OUTPUT_PORT__NAME = MULTI_PORT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OUTPUT_PORT__DESCRIPTION = MULTI_PORT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OUTPUT_PORT__TYPE = MULTI_PORT__TYPE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OUTPUT_PORT__VALUE = MULTI_PORT__VALUE;

	/**
	 * The number of structural features of the '<em>Multi Output Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_OUTPUT_PORT_FEATURE_COUNT = MULTI_PORT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link comrel.impl.PortMappingImpl <em>Port Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.PortMappingImpl
	 * @see comrel.impl.ComrelPackageImpl#getPortMapping()
	 * @generated
	 */
	int PORT_MAPPING = 38;

	/**
	 * The number of structural features of the '<em>Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_MAPPING_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link comrel.impl.SinglePortMappingImpl <em>Single Port Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.SinglePortMappingImpl
	 * @see comrel.impl.ComrelPackageImpl#getSinglePortMapping()
	 * @generated
	 */
	int SINGLE_PORT_MAPPING = 39;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_MAPPING__SOURCE = PORT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_MAPPING__TARGET = PORT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Single Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_PORT_MAPPING_FEATURE_COUNT = PORT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiPortMappingImpl <em>Multi Port Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiPortMappingImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiPortMapping()
	 * @generated
	 */
	int MULTI_PORT_MAPPING = 40;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_MAPPING__SOURCE = PORT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_MAPPING__TARGET = PORT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_PORT_MAPPING_FEATURE_COUNT = PORT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link comrel.impl.MultiSinglePortMappingImpl <em>Multi Single Port Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.impl.MultiSinglePortMappingImpl
	 * @see comrel.impl.ComrelPackageImpl#getMultiSinglePortMapping()
	 * @generated
	 */
	int MULTI_SINGLE_PORT_MAPPING = 41;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SINGLE_PORT_MAPPING__SOURCE = PORT_MAPPING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SINGLE_PORT_MAPPING__TARGET = PORT_MAPPING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Multi Single Port Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_SINGLE_PORT_MAPPING_FEATURE_COUNT = PORT_MAPPING_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link comrel.MappingVisualization <em>Mapping Visualization</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see comrel.MappingVisualization
	 * @see comrel.impl.ComrelPackageImpl#getMappingVisualization()
	 * @generated
	 */
	int MAPPING_VISUALIZATION = 42;


	/**
	 * Returns the meta object for class '{@link comrel.CompositeRefactoring <em>Composite Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Refactoring</em>'.
	 * @see comrel.CompositeRefactoring
	 * @generated
	 */
	EClass getCompositeRefactoring();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.CompositeRefactoring#getMainRefactoringUnit <em>Main Refactoring Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Main Refactoring Unit</em>'.
	 * @see comrel.CompositeRefactoring#getMainRefactoringUnit()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EReference getCompositeRefactoring_MainRefactoringUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.CompositeRefactoring#getPortMappings <em>Port Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Port Mappings</em>'.
	 * @see comrel.CompositeRefactoring#getPortMappings()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EReference getCompositeRefactoring_PortMappings();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.CompositeRefactoring#getModelRefactorings <em>Model Refactorings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Model Refactorings</em>'.
	 * @see comrel.CompositeRefactoring#getModelRefactorings()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EReference getCompositeRefactoring_ModelRefactorings();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.CompositeRefactoring#getHelper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper</em>'.
	 * @see comrel.CompositeRefactoring#getHelper()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EReference getCompositeRefactoring_Helper();

	/**
	 * Returns the meta object for the attribute '{@link comrel.CompositeRefactoring#getMappingVisualization <em>Mapping Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mapping Visualization</em>'.
	 * @see comrel.CompositeRefactoring#getMappingVisualization()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EAttribute getCompositeRefactoring_MappingVisualization();

	/**
	 * Returns the meta object for the attribute '{@link comrel.CompositeRefactoring#getCustomInitialCondition <em>Custom Initial Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Initial Condition</em>'.
	 * @see comrel.CompositeRefactoring#getCustomInitialCondition()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EAttribute getCompositeRefactoring_CustomInitialCondition();

	/**
	 * Returns the meta object for the attribute '{@link comrel.CompositeRefactoring#getCustomFinalCondition <em>Custom Final Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Final Condition</em>'.
	 * @see comrel.CompositeRefactoring#getCustomFinalCondition()
	 * @see #getCompositeRefactoring()
	 * @generated
	 */
	EAttribute getCompositeRefactoring_CustomFinalCondition();

	/**
	 * Returns the meta object for class '{@link comrel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see comrel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link comrel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see comrel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link comrel.DescribedElement <em>Described Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Described Element</em>'.
	 * @see comrel.DescribedElement
	 * @generated
	 */
	EClass getDescribedElement();

	/**
	 * Returns the meta object for the attribute '{@link comrel.DescribedElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see comrel.DescribedElement#getDescription()
	 * @see #getDescribedElement()
	 * @generated
	 */
	EAttribute getDescribedElement_Description();

	/**
	 * Returns the meta object for class '{@link comrel.RefactoringUnit <em>Refactoring Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Refactoring Unit</em>'.
	 * @see comrel.RefactoringUnit
	 * @generated
	 */
	EClass getRefactoringUnit();

	/**
	 * Returns the meta object for the attribute '{@link comrel.RefactoringUnit#getSeqExecutionOrder <em>Seq Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Seq Execution Order</em>'.
	 * @see comrel.RefactoringUnit#getSeqExecutionOrder()
	 * @see #getRefactoringUnit()
	 * @generated
	 */
	EAttribute getRefactoringUnit_SeqExecutionOrder();

	/**
	 * Returns the meta object for class '{@link comrel.ModelRefactoring <em>Model Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Refactoring</em>'.
	 * @see comrel.ModelRefactoring
	 * @generated
	 */
	EClass getModelRefactoring();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ModelRefactoring#getRefId <em>Ref Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Id</em>'.
	 * @see comrel.ModelRefactoring#getRefId()
	 * @see #getModelRefactoring()
	 * @generated
	 */
	EAttribute getModelRefactoring_RefId();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ModelRefactoring#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see comrel.ModelRefactoring#getLabel()
	 * @see #getModelRefactoring()
	 * @generated
	 */
	EAttribute getModelRefactoring_Label();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ModelRefactoring#getNamespaceUri <em>Namespace Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Uri</em>'.
	 * @see comrel.ModelRefactoring#getNamespaceUri()
	 * @see #getModelRefactoring()
	 * @generated
	 */
	EAttribute getModelRefactoring_NamespaceUri();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.ModelRefactoring#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see comrel.ModelRefactoring#getInputPorts()
	 * @see #getModelRefactoring()
	 * @generated
	 */
	EReference getModelRefactoring_InputPorts();

	/**
	 * Returns the meta object for class '{@link comrel.AtomicUnit <em>Atomic Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Unit</em>'.
	 * @see comrel.AtomicUnit
	 * @generated
	 */
	EClass getAtomicUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.AtomicUnit#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see comrel.AtomicUnit#getInputPorts()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EReference getAtomicUnit_InputPorts();

	/**
	 * Returns the meta object for the attribute '{@link comrel.AtomicUnit#getUnitId <em>Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Id</em>'.
	 * @see comrel.AtomicUnit#getUnitId()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EAttribute getAtomicUnit_UnitId();

	/**
	 * Returns the meta object for the attribute '{@link comrel.AtomicUnit#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see comrel.AtomicUnit#getLabel()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EAttribute getAtomicUnit_Label();

	/**
	 * Returns the meta object for the attribute '{@link comrel.AtomicUnit#getNamespaceUri <em>Namespace Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Uri</em>'.
	 * @see comrel.AtomicUnit#getNamespaceUri()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EAttribute getAtomicUnit_NamespaceUri();

	/**
	 * Returns the meta object for the attribute '{@link comrel.AtomicUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.AtomicUnit#getType()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EAttribute getAtomicUnit_Type();

	/**
	 * Returns the meta object for the reference '{@link comrel.AtomicUnit#getModelRefactoring <em>Model Refactoring</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model Refactoring</em>'.
	 * @see comrel.AtomicUnit#getModelRefactoring()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EReference getAtomicUnit_ModelRefactoring();

	/**
	 * Returns the meta object for the attribute '{@link comrel.AtomicUnit#isCheckInitialConditionFlag <em>Check Initial Condition Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Initial Condition Flag</em>'.
	 * @see comrel.AtomicUnit#isCheckInitialConditionFlag()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EAttribute getAtomicUnit_CheckInitialConditionFlag();

	/**
	 * Returns the meta object for the attribute '{@link comrel.AtomicUnit#isCheckFinalConditionFlag <em>Check Final Condition Flag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Final Condition Flag</em>'.
	 * @see comrel.AtomicUnit#isCheckFinalConditionFlag()
	 * @see #getAtomicUnit()
	 * @generated
	 */
	EAttribute getAtomicUnit_CheckFinalConditionFlag();

	/**
	 * Returns the meta object for class '{@link comrel.CompositeUnit <em>Composite Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Unit</em>'.
	 * @see comrel.CompositeUnit
	 * @generated
	 */
	EClass getCompositeUnit();

	/**
	 * Returns the meta object for class '{@link comrel.SequentialUnit <em>Sequential Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequential Unit</em>'.
	 * @see comrel.SequentialUnit
	 * @generated
	 */
	EClass getSequentialUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.SequentialUnit#getHelperUnits <em>Helper Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Units</em>'.
	 * @see comrel.SequentialUnit#getHelperUnits()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EReference getSequentialUnit_HelperUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.SequentialUnit#getRefactoringUnits <em>Refactoring Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refactoring Units</em>'.
	 * @see comrel.SequentialUnit#getRefactoringUnits()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EReference getSequentialUnit_RefactoringUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.SequentialUnit#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see comrel.SequentialUnit#getInputPorts()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EReference getSequentialUnit_InputPorts();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SequentialUnit#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see comrel.SequentialUnit#isStrict()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EAttribute getSequentialUnit_Strict();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SequentialUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.SequentialUnit#getType()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EAttribute getSequentialUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SequentialUnit#getLblStrict <em>Lbl Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Strict</em>'.
	 * @see comrel.SequentialUnit#getLblStrict()
	 * @see #getSequentialUnit()
	 * @generated
	 */
	EAttribute getSequentialUnit_LblStrict();

	/**
	 * Returns the meta object for class '{@link comrel.ConditionCheck <em>Condition Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Check</em>'.
	 * @see comrel.ConditionCheck
	 * @generated
	 */
	EClass getConditionCheck();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ConditionCheck#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.ConditionCheck#getType()
	 * @see #getConditionCheck()
	 * @generated
	 */
	EAttribute getConditionCheck_Type();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ConditionCheck#getSpec <em>Spec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spec</em>'.
	 * @see comrel.ConditionCheck#getSpec()
	 * @see #getConditionCheck()
	 * @generated
	 */
	EAttribute getConditionCheck_Spec();

	/**
	 * Returns the meta object for class '{@link comrel.ConditionalUnit <em>Conditional Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Unit</em>'.
	 * @see comrel.ConditionalUnit
	 * @generated
	 */
	EClass getConditionalUnit();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.ConditionalUnit#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see comrel.ConditionalUnit#getIf()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_If();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.ConditionalUnit#getHelperUnits <em>Helper Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Units</em>'.
	 * @see comrel.ConditionalUnit#getHelperUnits()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_HelperUnits();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.ConditionalUnit#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see comrel.ConditionalUnit#getThen()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_Then();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.ConditionalUnit#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see comrel.ConditionalUnit#getElse()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_Else();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.ConditionalUnit#getInputPorts <em>Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Ports</em>'.
	 * @see comrel.ConditionalUnit#getInputPorts()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EReference getConditionalUnit_InputPorts();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ConditionalUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.ConditionalUnit#getType()
	 * @see #getConditionalUnit()
	 * @generated
	 */
	EAttribute getConditionalUnit_Type();

	/**
	 * Returns the meta object for class '{@link comrel.QueuedUnit <em>Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queued Unit</em>'.
	 * @see comrel.QueuedUnit
	 * @generated
	 */
	EClass getQueuedUnit();

	/**
	 * Returns the meta object for the attribute '{@link comrel.QueuedUnit#isStrict <em>Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Strict</em>'.
	 * @see comrel.QueuedUnit#isStrict()
	 * @see #getQueuedUnit()
	 * @generated
	 */
	EAttribute getQueuedUnit_Strict();

	/**
	 * Returns the meta object for class '{@link comrel.SingleQueuedUnit <em>Single Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Queued Unit</em>'.
	 * @see comrel.SingleQueuedUnit
	 * @generated
	 */
	EClass getSingleQueuedUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.SingleQueuedUnit#getHelperUnits <em>Helper Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Units</em>'.
	 * @see comrel.SingleQueuedUnit#getHelperUnits()
	 * @see #getSingleQueuedUnit()
	 * @generated
	 */
	EReference getSingleQueuedUnit_HelperUnits();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleQueuedUnit#getRefactoringUnit <em>Refactoring Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refactoring Unit</em>'.
	 * @see comrel.SingleQueuedUnit#getRefactoringUnit()
	 * @see #getSingleQueuedUnit()
	 * @generated
	 */
	EReference getSingleQueuedUnit_RefactoringUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.SingleQueuedUnit#getSingleInputPorts <em>Single Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Input Ports</em>'.
	 * @see comrel.SingleQueuedUnit#getSingleInputPorts()
	 * @see #getSingleQueuedUnit()
	 * @generated
	 */
	EReference getSingleQueuedUnit_SingleInputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleQueuedUnit#getMultiInputPort <em>Multi Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multi Input Port</em>'.
	 * @see comrel.SingleQueuedUnit#getMultiInputPort()
	 * @see #getSingleQueuedUnit()
	 * @generated
	 */
	EReference getSingleQueuedUnit_MultiInputPort();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SingleQueuedUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.SingleQueuedUnit#getType()
	 * @see #getSingleQueuedUnit()
	 * @generated
	 */
	EAttribute getSingleQueuedUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SingleQueuedUnit#getLblStrict <em>Lbl Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Strict</em>'.
	 * @see comrel.SingleQueuedUnit#getLblStrict()
	 * @see #getSingleQueuedUnit()
	 * @generated
	 */
	EAttribute getSingleQueuedUnit_LblStrict();

	/**
	 * Returns the meta object for class '{@link comrel.TwicedQueuedUnit <em>Twiced Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Twiced Queued Unit</em>'.
	 * @see comrel.TwicedQueuedUnit
	 * @generated
	 */
	EClass getTwicedQueuedUnit();

	/**
	 * Returns the meta object for class '{@link comrel.CartesianQueuedUnit <em>Cartesian Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cartesian Queued Unit</em>'.
	 * @see comrel.CartesianQueuedUnit
	 * @generated
	 */
	EClass getCartesianQueuedUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.CartesianQueuedUnit#getHelperUnits <em>Helper Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Units</em>'.
	 * @see comrel.CartesianQueuedUnit#getHelperUnits()
	 * @see #getCartesianQueuedUnit()
	 * @generated
	 */
	EReference getCartesianQueuedUnit_HelperUnits();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.CartesianQueuedUnit#getRefactoringUnit <em>Refactoring Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refactoring Unit</em>'.
	 * @see comrel.CartesianQueuedUnit#getRefactoringUnit()
	 * @see #getCartesianQueuedUnit()
	 * @generated
	 */
	EReference getCartesianQueuedUnit_RefactoringUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.CartesianQueuedUnit#getSingleInputPorts <em>Single Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Input Ports</em>'.
	 * @see comrel.CartesianQueuedUnit#getSingleInputPorts()
	 * @see #getCartesianQueuedUnit()
	 * @generated
	 */
	EReference getCartesianQueuedUnit_SingleInputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.CartesianQueuedUnit#getMultiInputPorts <em>Multi Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Input Ports</em>'.
	 * @see comrel.CartesianQueuedUnit#getMultiInputPorts()
	 * @see #getCartesianQueuedUnit()
	 * @generated
	 */
	EReference getCartesianQueuedUnit_MultiInputPorts();

	/**
	 * Returns the meta object for the attribute '{@link comrel.CartesianQueuedUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.CartesianQueuedUnit#getType()
	 * @see #getCartesianQueuedUnit()
	 * @generated
	 */
	EAttribute getCartesianQueuedUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link comrel.CartesianQueuedUnit#getLblStrict <em>Lbl Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Strict</em>'.
	 * @see comrel.CartesianQueuedUnit#getLblStrict()
	 * @see #getCartesianQueuedUnit()
	 * @generated
	 */
	EAttribute getCartesianQueuedUnit_LblStrict();

	/**
	 * Returns the meta object for class '{@link comrel.ParallelQueuedUnit <em>Parallel Queued Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Queued Unit</em>'.
	 * @see comrel.ParallelQueuedUnit
	 * @generated
	 */
	EClass getParallelQueuedUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.ParallelQueuedUnit#getHelperUnits <em>Helper Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Helper Units</em>'.
	 * @see comrel.ParallelQueuedUnit#getHelperUnits()
	 * @see #getParallelQueuedUnit()
	 * @generated
	 */
	EReference getParallelQueuedUnit_HelperUnits();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.ParallelQueuedUnit#getRefactoringUnits <em>Refactoring Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refactoring Units</em>'.
	 * @see comrel.ParallelQueuedUnit#getRefactoringUnits()
	 * @see #getParallelQueuedUnit()
	 * @generated
	 */
	EReference getParallelQueuedUnit_RefactoringUnits();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.ParallelQueuedUnit#getSingleInputPorts <em>Single Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Single Input Ports</em>'.
	 * @see comrel.ParallelQueuedUnit#getSingleInputPorts()
	 * @see #getParallelQueuedUnit()
	 * @generated
	 */
	EReference getParallelQueuedUnit_SingleInputPorts();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.ParallelQueuedUnit#getMultiInputPorts <em>Multi Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Multi Input Ports</em>'.
	 * @see comrel.ParallelQueuedUnit#getMultiInputPorts()
	 * @see #getParallelQueuedUnit()
	 * @generated
	 */
	EReference getParallelQueuedUnit_MultiInputPorts();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ParallelQueuedUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.ParallelQueuedUnit#getType()
	 * @see #getParallelQueuedUnit()
	 * @generated
	 */
	EAttribute getParallelQueuedUnit_Type();

	/**
	 * Returns the meta object for the attribute '{@link comrel.ParallelQueuedUnit#getLblStrict <em>Lbl Strict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lbl Strict</em>'.
	 * @see comrel.ParallelQueuedUnit#getLblStrict()
	 * @see #getParallelQueuedUnit()
	 * @generated
	 */
	EAttribute getParallelQueuedUnit_LblStrict();

	/**
	 * Returns the meta object for class '{@link comrel.HelperUnit <em>Helper Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Unit</em>'.
	 * @see comrel.HelperUnit
	 * @generated
	 */
	EClass getHelperUnit();

	/**
	 * Returns the meta object for the attribute '{@link comrel.HelperUnit#getHelperUnitId <em>Helper Unit Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper Unit Id</em>'.
	 * @see comrel.HelperUnit#getHelperUnitId()
	 * @see #getHelperUnit()
	 * @generated
	 */
	EAttribute getHelperUnit_HelperUnitId();

	/**
	 * Returns the meta object for the attribute '{@link comrel.HelperUnit#getNamespaceUri <em>Namespace Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Uri</em>'.
	 * @see comrel.HelperUnit#getNamespaceUri()
	 * @see #getHelperUnit()
	 * @generated
	 */
	EAttribute getHelperUnit_NamespaceUri();

	/**
	 * Returns the meta object for class '{@link comrel.FeatureUnit <em>Feature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Unit</em>'.
	 * @see comrel.FeatureUnit
	 * @generated
	 */
	EClass getFeatureUnit();

	/**
	 * Returns the meta object for class '{@link comrel.SingleFeatureUnit <em>Single Feature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Feature Unit</em>'.
	 * @see comrel.SingleFeatureUnit
	 * @generated
	 */
	EClass getSingleFeatureUnit();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleFeatureUnit#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see comrel.SingleFeatureUnit#getInputPort()
	 * @see #getSingleFeatureUnit()
	 * @generated
	 */
	EReference getSingleFeatureUnit_InputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.SingleFeatureUnit#getSecondaryInputPorts <em>Secondary Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Input Ports</em>'.
	 * @see comrel.SingleFeatureUnit#getSecondaryInputPorts()
	 * @see #getSingleFeatureUnit()
	 * @generated
	 */
	EReference getSingleFeatureUnit_SecondaryInputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleFeatureUnit#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.SingleFeatureUnit#getOutputPort()
	 * @see #getSingleFeatureUnit()
	 * @generated
	 */
	EReference getSingleFeatureUnit_OutputPort();

	/**
	 * Returns the meta object for the reference '{@link comrel.SingleFeatureUnit#getSingleFeatureHelper <em>Single Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Feature Helper</em>'.
	 * @see comrel.SingleFeatureUnit#getSingleFeatureHelper()
	 * @see #getSingleFeatureUnit()
	 * @generated
	 */
	EReference getSingleFeatureUnit_SingleFeatureHelper();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SingleFeatureUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.SingleFeatureUnit#getType()
	 * @see #getSingleFeatureUnit()
	 * @generated
	 */
	EAttribute getSingleFeatureUnit_Type();

	/**
	 * Returns the meta object for class '{@link comrel.MultiFeatureUnit <em>Multi Feature Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Feature Unit</em>'.
	 * @see comrel.MultiFeatureUnit
	 * @generated
	 */
	EClass getMultiFeatureUnit();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.MultiFeatureUnit#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see comrel.MultiFeatureUnit#getInputPort()
	 * @see #getMultiFeatureUnit()
	 * @generated
	 */
	EReference getMultiFeatureUnit_InputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.MultiFeatureUnit#getSecondaryInputPorts <em>Secondary Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Input Ports</em>'.
	 * @see comrel.MultiFeatureUnit#getSecondaryInputPorts()
	 * @see #getMultiFeatureUnit()
	 * @generated
	 */
	EReference getMultiFeatureUnit_SecondaryInputPorts();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.MultiFeatureUnit#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.MultiFeatureUnit#getOutputPort()
	 * @see #getMultiFeatureUnit()
	 * @generated
	 */
	EReference getMultiFeatureUnit_OutputPort();

	/**
	 * Returns the meta object for the reference '{@link comrel.MultiFeatureUnit#getMultiFeatureHelper <em>Multi Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Feature Helper</em>'.
	 * @see comrel.MultiFeatureUnit#getMultiFeatureHelper()
	 * @see #getMultiFeatureUnit()
	 * @generated
	 */
	EReference getMultiFeatureUnit_MultiFeatureHelper();

	/**
	 * Returns the meta object for the attribute '{@link comrel.MultiFeatureUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.MultiFeatureUnit#getType()
	 * @see #getMultiFeatureUnit()
	 * @generated
	 */
	EAttribute getMultiFeatureUnit_Type();

	/**
	 * Returns the meta object for class '{@link comrel.FilterUnit <em>Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Unit</em>'.
	 * @see comrel.FilterUnit
	 * @generated
	 */
	EClass getFilterUnit();

	/**
	 * Returns the meta object for class '{@link comrel.SingleFilterUnit <em>Single Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Filter Unit</em>'.
	 * @see comrel.SingleFilterUnit
	 * @generated
	 */
	EClass getSingleFilterUnit();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleFilterUnit#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see comrel.SingleFilterUnit#getInputPort()
	 * @see #getSingleFilterUnit()
	 * @generated
	 */
	EReference getSingleFilterUnit_InputPort();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleFilterUnit#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.SingleFilterUnit#getOutputPort()
	 * @see #getSingleFilterUnit()
	 * @generated
	 */
	EReference getSingleFilterUnit_OutputPort();

	/**
	 * Returns the meta object for the reference '{@link comrel.SingleFilterUnit#getSingleFilterHelper <em>Single Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Single Filter Helper</em>'.
	 * @see comrel.SingleFilterUnit#getSingleFilterHelper()
	 * @see #getSingleFilterUnit()
	 * @generated
	 */
	EReference getSingleFilterUnit_SingleFilterHelper();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SingleFilterUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.SingleFilterUnit#getType()
	 * @see #getSingleFilterUnit()
	 * @generated
	 */
	EAttribute getSingleFilterUnit_Type();

	/**
	 * Returns the meta object for class '{@link comrel.MultiFilterUnit <em>Multi Filter Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Filter Unit</em>'.
	 * @see comrel.MultiFilterUnit
	 * @generated
	 */
	EClass getMultiFilterUnit();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.MultiFilterUnit#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see comrel.MultiFilterUnit#getInputPort()
	 * @see #getMultiFilterUnit()
	 * @generated
	 */
	EReference getMultiFilterUnit_InputPort();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.MultiFilterUnit#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.MultiFilterUnit#getOutputPort()
	 * @see #getMultiFilterUnit()
	 * @generated
	 */
	EReference getMultiFilterUnit_OutputPort();

	/**
	 * Returns the meta object for the reference '{@link comrel.MultiFilterUnit#getMultiFilterHelper <em>Multi Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Multi Filter Helper</em>'.
	 * @see comrel.MultiFilterUnit#getMultiFilterHelper()
	 * @see #getMultiFilterUnit()
	 * @generated
	 */
	EReference getMultiFilterUnit_MultiFilterHelper();

	/**
	 * Returns the meta object for the attribute '{@link comrel.MultiFilterUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.MultiFilterUnit#getType()
	 * @see #getMultiFilterUnit()
	 * @generated
	 */
	EAttribute getMultiFilterUnit_Type();

	/**
	 * Returns the meta object for class '{@link comrel.Helper <em>Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper</em>'.
	 * @see comrel.Helper
	 * @generated
	 */
	EClass getHelper();

	/**
	 * Returns the meta object for the attribute '{@link comrel.Helper#getHelperId <em>Helper Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Helper Id</em>'.
	 * @see comrel.Helper#getHelperId()
	 * @see #getHelper()
	 * @generated
	 */
	EAttribute getHelper_HelperId();

	/**
	 * Returns the meta object for the attribute '{@link comrel.Helper#getNamespaceUri <em>Namespace Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace Uri</em>'.
	 * @see comrel.Helper#getNamespaceUri()
	 * @see #getHelper()
	 * @generated
	 */
	EAttribute getHelper_NamespaceUri();

	/**
	 * Returns the meta object for class '{@link comrel.FeatureHelper <em>Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Helper</em>'.
	 * @see comrel.FeatureHelper
	 * @generated
	 */
	EClass getFeatureHelper();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.FeatureHelper#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see comrel.FeatureHelper#getInputPort()
	 * @see #getFeatureHelper()
	 * @generated
	 */
	EReference getFeatureHelper_InputPort();

	/**
	 * Returns the meta object for the containment reference list '{@link comrel.FeatureHelper#getSecondaryInputPorts <em>Secondary Input Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Secondary Input Ports</em>'.
	 * @see comrel.FeatureHelper#getSecondaryInputPorts()
	 * @see #getFeatureHelper()
	 * @generated
	 */
	EReference getFeatureHelper_SecondaryInputPorts();

	/**
	 * Returns the meta object for class '{@link comrel.SingleFeatureHelper <em>Single Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Feature Helper</em>'.
	 * @see comrel.SingleFeatureHelper
	 * @generated
	 */
	EClass getSingleFeatureHelper();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleFeatureHelper#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.SingleFeatureHelper#getOutputPort()
	 * @see #getSingleFeatureHelper()
	 * @generated
	 */
	EReference getSingleFeatureHelper_OutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.MultiFeatureHelper <em>Multi Feature Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Feature Helper</em>'.
	 * @see comrel.MultiFeatureHelper
	 * @generated
	 */
	EClass getMultiFeatureHelper();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.MultiFeatureHelper#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.MultiFeatureHelper#getOutputPort()
	 * @see #getMultiFeatureHelper()
	 * @generated
	 */
	EReference getMultiFeatureHelper_OutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.FilterHelper <em>Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Filter Helper</em>'.
	 * @see comrel.FilterHelper
	 * @generated
	 */
	EClass getFilterHelper();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.FilterHelper#getInputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Input Port</em>'.
	 * @see comrel.FilterHelper#getInputPort()
	 * @see #getFilterHelper()
	 * @generated
	 */
	EReference getFilterHelper_InputPort();

	/**
	 * Returns the meta object for class '{@link comrel.SingleFilterHelper <em>Single Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Filter Helper</em>'.
	 * @see comrel.SingleFilterHelper
	 * @generated
	 */
	EClass getSingleFilterHelper();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.SingleFilterHelper#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.SingleFilterHelper#getOutputPort()
	 * @see #getSingleFilterHelper()
	 * @generated
	 */
	EReference getSingleFilterHelper_OutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.MultiFilterHelper <em>Multi Filter Helper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Filter Helper</em>'.
	 * @see comrel.MultiFilterHelper
	 * @generated
	 */
	EClass getMultiFilterHelper();

	/**
	 * Returns the meta object for the containment reference '{@link comrel.MultiFilterHelper#getOutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Output Port</em>'.
	 * @see comrel.MultiFilterHelper#getOutputPort()
	 * @see #getMultiFilterHelper()
	 * @generated
	 */
	EReference getMultiFilterHelper_OutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see comrel.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '{@link comrel.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see comrel.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for class '{@link comrel.SinglePort <em>Single Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Port</em>'.
	 * @see comrel.SinglePort
	 * @generated
	 */
	EClass getSinglePort();

	/**
	 * Returns the meta object for the attribute '{@link comrel.SinglePort#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see comrel.SinglePort#getValue()
	 * @see #getSinglePort()
	 * @generated
	 */
	EAttribute getSinglePort_Value();

	/**
	 * Returns the meta object for class '{@link comrel.MultiPort <em>Multi Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port</em>'.
	 * @see comrel.MultiPort
	 * @generated
	 */
	EClass getMultiPort();

	/**
	 * Returns the meta object for the attribute list '{@link comrel.MultiPort#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see comrel.MultiPort#getValue()
	 * @see #getMultiPort()
	 * @generated
	 */
	EAttribute getMultiPort_Value();

	/**
	 * Returns the meta object for class '{@link comrel.InputPort <em>Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Port</em>'.
	 * @see comrel.InputPort
	 * @generated
	 */
	EClass getInputPort();

	/**
	 * Returns the meta object for class '{@link comrel.OutputPort <em>Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Port</em>'.
	 * @see comrel.OutputPort
	 * @generated
	 */
	EClass getOutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.SingleInputPort <em>Single Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Input Port</em>'.
	 * @see comrel.SingleInputPort
	 * @generated
	 */
	EClass getSingleInputPort();

	/**
	 * Returns the meta object for class '{@link comrel.MultiInputPort <em>Multi Input Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Input Port</em>'.
	 * @see comrel.MultiInputPort
	 * @generated
	 */
	EClass getMultiInputPort();

	/**
	 * Returns the meta object for class '{@link comrel.SingleOutputPort <em>Single Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Output Port</em>'.
	 * @see comrel.SingleOutputPort
	 * @generated
	 */
	EClass getSingleOutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.MultiOutputPort <em>Multi Output Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Output Port</em>'.
	 * @see comrel.MultiOutputPort
	 * @generated
	 */
	EClass getMultiOutputPort();

	/**
	 * Returns the meta object for class '{@link comrel.PortMapping <em>Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Mapping</em>'.
	 * @see comrel.PortMapping
	 * @generated
	 */
	EClass getPortMapping();

	/**
	 * Returns the meta object for class '{@link comrel.SinglePortMapping <em>Single Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Port Mapping</em>'.
	 * @see comrel.SinglePortMapping
	 * @generated
	 */
	EClass getSinglePortMapping();

	/**
	 * Returns the meta object for the reference '{@link comrel.SinglePortMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see comrel.SinglePortMapping#getSource()
	 * @see #getSinglePortMapping()
	 * @generated
	 */
	EReference getSinglePortMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link comrel.SinglePortMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see comrel.SinglePortMapping#getTarget()
	 * @see #getSinglePortMapping()
	 * @generated
	 */
	EReference getSinglePortMapping_Target();

	/**
	 * Returns the meta object for class '{@link comrel.MultiPortMapping <em>Multi Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Port Mapping</em>'.
	 * @see comrel.MultiPortMapping
	 * @generated
	 */
	EClass getMultiPortMapping();

	/**
	 * Returns the meta object for the reference '{@link comrel.MultiPortMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see comrel.MultiPortMapping#getSource()
	 * @see #getMultiPortMapping()
	 * @generated
	 */
	EReference getMultiPortMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link comrel.MultiPortMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see comrel.MultiPortMapping#getTarget()
	 * @see #getMultiPortMapping()
	 * @generated
	 */
	EReference getMultiPortMapping_Target();

	/**
	 * Returns the meta object for class '{@link comrel.MultiSinglePortMapping <em>Multi Single Port Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Single Port Mapping</em>'.
	 * @see comrel.MultiSinglePortMapping
	 * @generated
	 */
	EClass getMultiSinglePortMapping();

	/**
	 * Returns the meta object for the reference '{@link comrel.MultiSinglePortMapping#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see comrel.MultiSinglePortMapping#getSource()
	 * @see #getMultiSinglePortMapping()
	 * @generated
	 */
	EReference getMultiSinglePortMapping_Source();

	/**
	 * Returns the meta object for the reference '{@link comrel.MultiSinglePortMapping#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see comrel.MultiSinglePortMapping#getTarget()
	 * @see #getMultiSinglePortMapping()
	 * @generated
	 */
	EReference getMultiSinglePortMapping_Target();

	/**
	 * Returns the meta object for enum '{@link comrel.MappingVisualization <em>Mapping Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Visualization</em>'.
	 * @see comrel.MappingVisualization
	 * @generated
	 */
	EEnum getMappingVisualization();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComrelFactory getComrelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link comrel.impl.CompositeRefactoringImpl <em>Composite Refactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.CompositeRefactoringImpl
		 * @see comrel.impl.ComrelPackageImpl#getCompositeRefactoring()
		 * @generated
		 */
		EClass COMPOSITE_REFACTORING = eINSTANCE.getCompositeRefactoring();

		/**
		 * The meta object literal for the '<em><b>Main Refactoring Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT = eINSTANCE.getCompositeRefactoring_MainRefactoringUnit();

		/**
		 * The meta object literal for the '<em><b>Port Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_REFACTORING__PORT_MAPPINGS = eINSTANCE.getCompositeRefactoring_PortMappings();

		/**
		 * The meta object literal for the '<em><b>Model Refactorings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_REFACTORING__MODEL_REFACTORINGS = eINSTANCE.getCompositeRefactoring_ModelRefactorings();

		/**
		 * The meta object literal for the '<em><b>Helper</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_REFACTORING__HELPER = eINSTANCE.getCompositeRefactoring_Helper();

		/**
		 * The meta object literal for the '<em><b>Mapping Visualization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_REFACTORING__MAPPING_VISUALIZATION = eINSTANCE.getCompositeRefactoring_MappingVisualization();

		/**
		 * The meta object literal for the '<em><b>Custom Initial Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION = eINSTANCE.getCompositeRefactoring_CustomInitialCondition();

		/**
		 * The meta object literal for the '<em><b>Custom Final Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION = eINSTANCE.getCompositeRefactoring_CustomFinalCondition();

		/**
		 * The meta object literal for the '{@link comrel.NamedElement <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.NamedElement
		 * @see comrel.impl.ComrelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link comrel.DescribedElement <em>Described Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.DescribedElement
		 * @see comrel.impl.ComrelPackageImpl#getDescribedElement()
		 * @generated
		 */
		EClass DESCRIBED_ELEMENT = eINSTANCE.getDescribedElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DESCRIBED_ELEMENT__DESCRIPTION = eINSTANCE.getDescribedElement_Description();

		/**
		 * The meta object literal for the '{@link comrel.impl.RefactoringUnitImpl <em>Refactoring Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.RefactoringUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getRefactoringUnit()
		 * @generated
		 */
		EClass REFACTORING_UNIT = eINSTANCE.getRefactoringUnit();

		/**
		 * The meta object literal for the '<em><b>Seq Execution Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFACTORING_UNIT__SEQ_EXECUTION_ORDER = eINSTANCE.getRefactoringUnit_SeqExecutionOrder();

		/**
		 * The meta object literal for the '{@link comrel.impl.ModelRefactoringImpl <em>Model Refactoring</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.ModelRefactoringImpl
		 * @see comrel.impl.ComrelPackageImpl#getModelRefactoring()
		 * @generated
		 */
		EClass MODEL_REFACTORING = eINSTANCE.getModelRefactoring();

		/**
		 * The meta object literal for the '<em><b>Ref Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFACTORING__REF_ID = eINSTANCE.getModelRefactoring_RefId();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFACTORING__LABEL = eINSTANCE.getModelRefactoring_Label();

		/**
		 * The meta object literal for the '<em><b>Namespace Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFACTORING__NAMESPACE_URI = eINSTANCE.getModelRefactoring_NamespaceUri();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL_REFACTORING__INPUT_PORTS = eINSTANCE.getModelRefactoring_InputPorts();

		/**
		 * The meta object literal for the '{@link comrel.impl.AtomicUnitImpl <em>Atomic Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.AtomicUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getAtomicUnit()
		 * @generated
		 */
		EClass ATOMIC_UNIT = eINSTANCE.getAtomicUnit();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_UNIT__INPUT_PORTS = eINSTANCE.getAtomicUnit_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Unit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_UNIT__UNIT_ID = eINSTANCE.getAtomicUnit_UnitId();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_UNIT__LABEL = eINSTANCE.getAtomicUnit_Label();

		/**
		 * The meta object literal for the '<em><b>Namespace Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_UNIT__NAMESPACE_URI = eINSTANCE.getAtomicUnit_NamespaceUri();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_UNIT__TYPE = eINSTANCE.getAtomicUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Model Refactoring</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_UNIT__MODEL_REFACTORING = eINSTANCE.getAtomicUnit_ModelRefactoring();

		/**
		 * The meta object literal for the '<em><b>Check Initial Condition Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_UNIT__CHECK_INITIAL_CONDITION_FLAG = eINSTANCE.getAtomicUnit_CheckInitialConditionFlag();

		/**
		 * The meta object literal for the '<em><b>Check Final Condition Flag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_UNIT__CHECK_FINAL_CONDITION_FLAG = eINSTANCE.getAtomicUnit_CheckFinalConditionFlag();

		/**
		 * The meta object literal for the '{@link comrel.impl.CompositeUnitImpl <em>Composite Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.CompositeUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getCompositeUnit()
		 * @generated
		 */
		EClass COMPOSITE_UNIT = eINSTANCE.getCompositeUnit();

		/**
		 * The meta object literal for the '{@link comrel.impl.SequentialUnitImpl <em>Sequential Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SequentialUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getSequentialUnit()
		 * @generated
		 */
		EClass SEQUENTIAL_UNIT = eINSTANCE.getSequentialUnit();

		/**
		 * The meta object literal for the '<em><b>Helper Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_UNIT__HELPER_UNITS = eINSTANCE.getSequentialUnit_HelperUnits();

		/**
		 * The meta object literal for the '<em><b>Refactoring Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_UNIT__REFACTORING_UNITS = eINSTANCE.getSequentialUnit_RefactoringUnits();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENTIAL_UNIT__INPUT_PORTS = eINSTANCE.getSequentialUnit_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENTIAL_UNIT__STRICT = eINSTANCE.getSequentialUnit_Strict();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENTIAL_UNIT__TYPE = eINSTANCE.getSequentialUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Lbl Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENTIAL_UNIT__LBL_STRICT = eINSTANCE.getSequentialUnit_LblStrict();

		/**
		 * The meta object literal for the '{@link comrel.impl.ConditionCheckImpl <em>Condition Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.ConditionCheckImpl
		 * @see comrel.impl.ComrelPackageImpl#getConditionCheck()
		 * @generated
		 */
		EClass CONDITION_CHECK = eINSTANCE.getConditionCheck();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CHECK__TYPE = eINSTANCE.getConditionCheck_Type();

		/**
		 * The meta object literal for the '<em><b>Spec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_CHECK__SPEC = eINSTANCE.getConditionCheck_Spec();

		/**
		 * The meta object literal for the '{@link comrel.impl.ConditionalUnitImpl <em>Conditional Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.ConditionalUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getConditionalUnit()
		 * @generated
		 */
		EClass CONDITIONAL_UNIT = eINSTANCE.getConditionalUnit();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_UNIT__IF = eINSTANCE.getConditionalUnit_If();

		/**
		 * The meta object literal for the '<em><b>Helper Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_UNIT__HELPER_UNITS = eINSTANCE.getConditionalUnit_HelperUnits();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_UNIT__THEN = eINSTANCE.getConditionalUnit_Then();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_UNIT__ELSE = eINSTANCE.getConditionalUnit_Else();

		/**
		 * The meta object literal for the '<em><b>Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_UNIT__INPUT_PORTS = eINSTANCE.getConditionalUnit_InputPorts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITIONAL_UNIT__TYPE = eINSTANCE.getConditionalUnit_Type();

		/**
		 * The meta object literal for the '{@link comrel.impl.QueuedUnitImpl <em>Queued Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.QueuedUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getQueuedUnit()
		 * @generated
		 */
		EClass QUEUED_UNIT = eINSTANCE.getQueuedUnit();

		/**
		 * The meta object literal for the '<em><b>Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUED_UNIT__STRICT = eINSTANCE.getQueuedUnit_Strict();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleQueuedUnitImpl <em>Single Queued Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleQueuedUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleQueuedUnit()
		 * @generated
		 */
		EClass SINGLE_QUEUED_UNIT = eINSTANCE.getSingleQueuedUnit();

		/**
		 * The meta object literal for the '<em><b>Helper Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_QUEUED_UNIT__HELPER_UNITS = eINSTANCE.getSingleQueuedUnit_HelperUnits();

		/**
		 * The meta object literal for the '<em><b>Refactoring Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_QUEUED_UNIT__REFACTORING_UNIT = eINSTANCE.getSingleQueuedUnit_RefactoringUnit();

		/**
		 * The meta object literal for the '<em><b>Single Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_QUEUED_UNIT__SINGLE_INPUT_PORTS = eINSTANCE.getSingleQueuedUnit_SingleInputPorts();

		/**
		 * The meta object literal for the '<em><b>Multi Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_QUEUED_UNIT__MULTI_INPUT_PORT = eINSTANCE.getSingleQueuedUnit_MultiInputPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_QUEUED_UNIT__TYPE = eINSTANCE.getSingleQueuedUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Lbl Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_QUEUED_UNIT__LBL_STRICT = eINSTANCE.getSingleQueuedUnit_LblStrict();

		/**
		 * The meta object literal for the '{@link comrel.impl.TwicedQueuedUnitImpl <em>Twiced Queued Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.TwicedQueuedUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getTwicedQueuedUnit()
		 * @generated
		 */
		EClass TWICED_QUEUED_UNIT = eINSTANCE.getTwicedQueuedUnit();

		/**
		 * The meta object literal for the '{@link comrel.impl.CartesianQueuedUnitImpl <em>Cartesian Queued Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.CartesianQueuedUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getCartesianQueuedUnit()
		 * @generated
		 */
		EClass CARTESIAN_QUEUED_UNIT = eINSTANCE.getCartesianQueuedUnit();

		/**
		 * The meta object literal for the '<em><b>Helper Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_QUEUED_UNIT__HELPER_UNITS = eINSTANCE.getCartesianQueuedUnit_HelperUnits();

		/**
		 * The meta object literal for the '<em><b>Refactoring Unit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_QUEUED_UNIT__REFACTORING_UNIT = eINSTANCE.getCartesianQueuedUnit_RefactoringUnit();

		/**
		 * The meta object literal for the '<em><b>Single Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_QUEUED_UNIT__SINGLE_INPUT_PORTS = eINSTANCE.getCartesianQueuedUnit_SingleInputPorts();

		/**
		 * The meta object literal for the '<em><b>Multi Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARTESIAN_QUEUED_UNIT__MULTI_INPUT_PORTS = eINSTANCE.getCartesianQueuedUnit_MultiInputPorts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_QUEUED_UNIT__TYPE = eINSTANCE.getCartesianQueuedUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Lbl Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARTESIAN_QUEUED_UNIT__LBL_STRICT = eINSTANCE.getCartesianQueuedUnit_LblStrict();

		/**
		 * The meta object literal for the '{@link comrel.impl.ParallelQueuedUnitImpl <em>Parallel Queued Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.ParallelQueuedUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getParallelQueuedUnit()
		 * @generated
		 */
		EClass PARALLEL_QUEUED_UNIT = eINSTANCE.getParallelQueuedUnit();

		/**
		 * The meta object literal for the '<em><b>Helper Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_QUEUED_UNIT__HELPER_UNITS = eINSTANCE.getParallelQueuedUnit_HelperUnits();

		/**
		 * The meta object literal for the '<em><b>Refactoring Units</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_QUEUED_UNIT__REFACTORING_UNITS = eINSTANCE.getParallelQueuedUnit_RefactoringUnits();

		/**
		 * The meta object literal for the '<em><b>Single Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_QUEUED_UNIT__SINGLE_INPUT_PORTS = eINSTANCE.getParallelQueuedUnit_SingleInputPorts();

		/**
		 * The meta object literal for the '<em><b>Multi Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLEL_QUEUED_UNIT__MULTI_INPUT_PORTS = eINSTANCE.getParallelQueuedUnit_MultiInputPorts();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_QUEUED_UNIT__TYPE = eINSTANCE.getParallelQueuedUnit_Type();

		/**
		 * The meta object literal for the '<em><b>Lbl Strict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARALLEL_QUEUED_UNIT__LBL_STRICT = eINSTANCE.getParallelQueuedUnit_LblStrict();

		/**
		 * The meta object literal for the '{@link comrel.impl.HelperUnitImpl <em>Helper Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.HelperUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getHelperUnit()
		 * @generated
		 */
		EClass HELPER_UNIT = eINSTANCE.getHelperUnit();

		/**
		 * The meta object literal for the '<em><b>Helper Unit Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_UNIT__HELPER_UNIT_ID = eINSTANCE.getHelperUnit_HelperUnitId();

		/**
		 * The meta object literal for the '<em><b>Namespace Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER_UNIT__NAMESPACE_URI = eINSTANCE.getHelperUnit_NamespaceUri();

		/**
		 * The meta object literal for the '{@link comrel.impl.FeatureUnitImpl <em>Feature Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.FeatureUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getFeatureUnit()
		 * @generated
		 */
		EClass FEATURE_UNIT = eINSTANCE.getFeatureUnit();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleFeatureUnitImpl <em>Single Feature Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleFeatureUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleFeatureUnit()
		 * @generated
		 */
		EClass SINGLE_FEATURE_UNIT = eINSTANCE.getSingleFeatureUnit();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FEATURE_UNIT__INPUT_PORT = eINSTANCE.getSingleFeatureUnit_InputPort();

		/**
		 * The meta object literal for the '<em><b>Secondary Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FEATURE_UNIT__SECONDARY_INPUT_PORTS = eINSTANCE.getSingleFeatureUnit_SecondaryInputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FEATURE_UNIT__OUTPUT_PORT = eINSTANCE.getSingleFeatureUnit_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Single Feature Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FEATURE_UNIT__SINGLE_FEATURE_HELPER = eINSTANCE.getSingleFeatureUnit_SingleFeatureHelper();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_FEATURE_UNIT__TYPE = eINSTANCE.getSingleFeatureUnit_Type();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiFeatureUnitImpl <em>Multi Feature Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiFeatureUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiFeatureUnit()
		 * @generated
		 */
		EClass MULTI_FEATURE_UNIT = eINSTANCE.getMultiFeatureUnit();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FEATURE_UNIT__INPUT_PORT = eINSTANCE.getMultiFeatureUnit_InputPort();

		/**
		 * The meta object literal for the '<em><b>Secondary Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FEATURE_UNIT__SECONDARY_INPUT_PORTS = eINSTANCE.getMultiFeatureUnit_SecondaryInputPorts();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FEATURE_UNIT__OUTPUT_PORT = eINSTANCE.getMultiFeatureUnit_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Multi Feature Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FEATURE_UNIT__MULTI_FEATURE_HELPER = eINSTANCE.getMultiFeatureUnit_MultiFeatureHelper();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FEATURE_UNIT__TYPE = eINSTANCE.getMultiFeatureUnit_Type();

		/**
		 * The meta object literal for the '{@link comrel.impl.FilterUnitImpl <em>Filter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.FilterUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getFilterUnit()
		 * @generated
		 */
		EClass FILTER_UNIT = eINSTANCE.getFilterUnit();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleFilterUnitImpl <em>Single Filter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleFilterUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleFilterUnit()
		 * @generated
		 */
		EClass SINGLE_FILTER_UNIT = eINSTANCE.getSingleFilterUnit();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FILTER_UNIT__INPUT_PORT = eINSTANCE.getSingleFilterUnit_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FILTER_UNIT__OUTPUT_PORT = eINSTANCE.getSingleFilterUnit_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Single Filter Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FILTER_UNIT__SINGLE_FILTER_HELPER = eINSTANCE.getSingleFilterUnit_SingleFilterHelper();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_FILTER_UNIT__TYPE = eINSTANCE.getSingleFilterUnit_Type();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiFilterUnitImpl <em>Multi Filter Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiFilterUnitImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiFilterUnit()
		 * @generated
		 */
		EClass MULTI_FILTER_UNIT = eINSTANCE.getMultiFilterUnit();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FILTER_UNIT__INPUT_PORT = eINSTANCE.getMultiFilterUnit_InputPort();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FILTER_UNIT__OUTPUT_PORT = eINSTANCE.getMultiFilterUnit_OutputPort();

		/**
		 * The meta object literal for the '<em><b>Multi Filter Helper</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FILTER_UNIT__MULTI_FILTER_HELPER = eINSTANCE.getMultiFilterUnit_MultiFilterHelper();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_FILTER_UNIT__TYPE = eINSTANCE.getMultiFilterUnit_Type();

		/**
		 * The meta object literal for the '{@link comrel.impl.HelperImpl <em>Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.HelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getHelper()
		 * @generated
		 */
		EClass HELPER = eINSTANCE.getHelper();

		/**
		 * The meta object literal for the '<em><b>Helper Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER__HELPER_ID = eINSTANCE.getHelper_HelperId();

		/**
		 * The meta object literal for the '<em><b>Namespace Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HELPER__NAMESPACE_URI = eINSTANCE.getHelper_NamespaceUri();

		/**
		 * The meta object literal for the '{@link comrel.impl.FeatureHelperImpl <em>Feature Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.FeatureHelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getFeatureHelper()
		 * @generated
		 */
		EClass FEATURE_HELPER = eINSTANCE.getFeatureHelper();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_HELPER__INPUT_PORT = eINSTANCE.getFeatureHelper_InputPort();

		/**
		 * The meta object literal for the '<em><b>Secondary Input Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_HELPER__SECONDARY_INPUT_PORTS = eINSTANCE.getFeatureHelper_SecondaryInputPorts();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleFeatureHelperImpl <em>Single Feature Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleFeatureHelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleFeatureHelper()
		 * @generated
		 */
		EClass SINGLE_FEATURE_HELPER = eINSTANCE.getSingleFeatureHelper();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FEATURE_HELPER__OUTPUT_PORT = eINSTANCE.getSingleFeatureHelper_OutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiFeatureHelperImpl <em>Multi Feature Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiFeatureHelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiFeatureHelper()
		 * @generated
		 */
		EClass MULTI_FEATURE_HELPER = eINSTANCE.getMultiFeatureHelper();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FEATURE_HELPER__OUTPUT_PORT = eINSTANCE.getMultiFeatureHelper_OutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.FilterHelperImpl <em>Filter Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.FilterHelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getFilterHelper()
		 * @generated
		 */
		EClass FILTER_HELPER = eINSTANCE.getFilterHelper();

		/**
		 * The meta object literal for the '<em><b>Input Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILTER_HELPER__INPUT_PORT = eINSTANCE.getFilterHelper_InputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleFilterHelperImpl <em>Single Filter Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleFilterHelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleFilterHelper()
		 * @generated
		 */
		EClass SINGLE_FILTER_HELPER = eINSTANCE.getSingleFilterHelper();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_FILTER_HELPER__OUTPUT_PORT = eINSTANCE.getSingleFilterHelper_OutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiFilterHelperImpl <em>Multi Filter Helper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiFilterHelperImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiFilterHelper()
		 * @generated
		 */
		EClass MULTI_FILTER_HELPER = eINSTANCE.getMultiFilterHelper();

		/**
		 * The meta object literal for the '<em><b>Output Port</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_FILTER_HELPER__OUTPUT_PORT = eINSTANCE.getMultiFilterHelper_OutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.PortImpl
		 * @see comrel.impl.ComrelPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '{@link comrel.impl.SinglePortImpl <em>Single Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SinglePortImpl
		 * @see comrel.impl.ComrelPackageImpl#getSinglePort()
		 * @generated
		 */
		EClass SINGLE_PORT = eINSTANCE.getSinglePort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SINGLE_PORT__VALUE = eINSTANCE.getSinglePort_Value();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiPortImpl <em>Multi Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiPort()
		 * @generated
		 */
		EClass MULTI_PORT = eINSTANCE.getMultiPort();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_PORT__VALUE = eINSTANCE.getMultiPort_Value();

		/**
		 * The meta object literal for the '{@link comrel.impl.InputPortImpl <em>Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.InputPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getInputPort()
		 * @generated
		 */
		EClass INPUT_PORT = eINSTANCE.getInputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.OutputPortImpl <em>Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.OutputPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getOutputPort()
		 * @generated
		 */
		EClass OUTPUT_PORT = eINSTANCE.getOutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleInputPortImpl <em>Single Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleInputPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleInputPort()
		 * @generated
		 */
		EClass SINGLE_INPUT_PORT = eINSTANCE.getSingleInputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiInputPortImpl <em>Multi Input Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiInputPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiInputPort()
		 * @generated
		 */
		EClass MULTI_INPUT_PORT = eINSTANCE.getMultiInputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.SingleOutputPortImpl <em>Single Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SingleOutputPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getSingleOutputPort()
		 * @generated
		 */
		EClass SINGLE_OUTPUT_PORT = eINSTANCE.getSingleOutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiOutputPortImpl <em>Multi Output Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiOutputPortImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiOutputPort()
		 * @generated
		 */
		EClass MULTI_OUTPUT_PORT = eINSTANCE.getMultiOutputPort();

		/**
		 * The meta object literal for the '{@link comrel.impl.PortMappingImpl <em>Port Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.PortMappingImpl
		 * @see comrel.impl.ComrelPackageImpl#getPortMapping()
		 * @generated
		 */
		EClass PORT_MAPPING = eINSTANCE.getPortMapping();

		/**
		 * The meta object literal for the '{@link comrel.impl.SinglePortMappingImpl <em>Single Port Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.SinglePortMappingImpl
		 * @see comrel.impl.ComrelPackageImpl#getSinglePortMapping()
		 * @generated
		 */
		EClass SINGLE_PORT_MAPPING = eINSTANCE.getSinglePortMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_PORT_MAPPING__SOURCE = eINSTANCE.getSinglePortMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_PORT_MAPPING__TARGET = eINSTANCE.getSinglePortMapping_Target();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiPortMappingImpl <em>Multi Port Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiPortMappingImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiPortMapping()
		 * @generated
		 */
		EClass MULTI_PORT_MAPPING = eINSTANCE.getMultiPortMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_MAPPING__SOURCE = eINSTANCE.getMultiPortMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_PORT_MAPPING__TARGET = eINSTANCE.getMultiPortMapping_Target();

		/**
		 * The meta object literal for the '{@link comrel.impl.MultiSinglePortMappingImpl <em>Multi Single Port Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.impl.MultiSinglePortMappingImpl
		 * @see comrel.impl.ComrelPackageImpl#getMultiSinglePortMapping()
		 * @generated
		 */
		EClass MULTI_SINGLE_PORT_MAPPING = eINSTANCE.getMultiSinglePortMapping();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_SINGLE_PORT_MAPPING__SOURCE = eINSTANCE.getMultiSinglePortMapping_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_SINGLE_PORT_MAPPING__TARGET = eINSTANCE.getMultiSinglePortMapping_Target();

		/**
		 * The meta object literal for the '{@link comrel.MappingVisualization <em>Mapping Visualization</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see comrel.MappingVisualization
		 * @see comrel.impl.ComrelPackageImpl#getMappingVisualization()
		 * @generated
		 */
		EEnum MAPPING_VISUALIZATION = eINSTANCE.getMappingVisualization();

	}

} //ComrelPackage
