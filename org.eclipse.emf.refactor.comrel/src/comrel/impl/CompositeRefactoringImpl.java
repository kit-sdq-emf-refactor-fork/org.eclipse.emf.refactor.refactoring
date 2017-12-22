/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package comrel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import comrel.AtomicUnit;
import comrel.CartesianQueuedUnit;
import comrel.CompositeRefactoring;
import comrel.CompositeUnit;
import comrel.ComrelPackage;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.MappingVisualization;
import comrel.ModelRefactoring;
import comrel.MultiFeatureHelper;
import comrel.MultiFilterHelper;
import comrel.ParallelQueuedUnit;
import comrel.PortMapping;
import comrel.RefactoringUnit;
import comrel.SequentialUnit;
import comrel.SingleFeatureHelper;
import comrel.SingleFilterHelper;
import comrel.SingleQueuedUnit;
import comrel.util.RegistryUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Refactoring</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getMainRefactoringUnit <em>Main Refactoring Unit</em>}</li>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getPortMappings <em>Port Mappings</em>}</li>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getModelRefactorings <em>Model Refactorings</em>}</li>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getHelper <em>Helper</em>}</li>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getMappingVisualization <em>Mapping Visualization</em>}</li>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getCustomInitialCondition <em>Custom Initial Condition</em>}</li>
 *   <li>{@link comrel.impl.CompositeRefactoringImpl#getCustomFinalCondition <em>Custom Final Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeRefactoringImpl extends ModelRefactoringImpl implements CompositeRefactoring {
	
	public Set<Integer> mappingNumbers = new HashSet<Integer>();

	public static String nsUri = "";
	
	/**
	 * The cached value of the '{@link #getMainRefactoringUnit() <em>Main Refactoring Unit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainRefactoringUnit()
	 * @generated
	 * @ordered
	 */
	protected RefactoringUnit mainRefactoringUnit;

	/**
	 * The cached value of the '{@link #getPortMappings() <em>Port Mappings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortMappings()
	 * @generated
	 * @ordered
	 */
	protected EList<PortMapping> portMappings;

	/**
	 * The cached value of the '{@link #getModelRefactorings() <em>Model Refactorings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelRefactorings()
	 * @generated
	 * @ordered
	 */
	protected EList<ModelRefactoring> modelRefactorings;

	/**
	 * The cached value of the '{@link #getHelper() <em>Helper</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelper()
	 * @generated
	 * @ordered
	 */
	protected EList<Helper> helper;

	/**
	 * The default value of the '{@link #getMappingVisualization() <em>Mapping Visualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingVisualization()
	 * @generated
	 * @ordered
	 */
	protected static final MappingVisualization MAPPING_VISUALIZATION_EDEFAULT = MappingVisualization.ARROWS;

	/**
	 * The cached value of the '{@link #getMappingVisualization() <em>Mapping Visualization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingVisualization()
	 * @generated
	 * @ordered
	 */
	protected MappingVisualization mappingVisualization = MAPPING_VISUALIZATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomInitialCondition() <em>Custom Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_INITIAL_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomInitialCondition() <em>Custom Initial Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomInitialCondition()
	 * @generated
	 * @ordered
	 */
	protected String customInitialCondition = CUSTOM_INITIAL_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomFinalCondition() <em>Custom Final Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomFinalCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_FINAL_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomFinalCondition() <em>Custom Final Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomFinalCondition()
	 * @generated
	 * @ordered
	 */
	protected String customFinalCondition = CUSTOM_FINAL_CONDITION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeRefactoringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComrelPackage.Literals.COMPOSITE_REFACTORING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefactoringUnit getMainRefactoringUnit() {
		return mainRefactoringUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMainRefactoringUnit(RefactoringUnit newMainRefactoringUnit, NotificationChain msgs) {
		RefactoringUnit oldMainRefactoringUnit = mainRefactoringUnit;
		mainRefactoringUnit = newMainRefactoringUnit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT, oldMainRefactoringUnit, newMainRefactoringUnit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		if (this.getMainRefactoringUnit() != null) {
			this.getMainRefactoringUnit().setName(this.getName(), false);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainRefactoringUnit(RefactoringUnit newMainRefactoringUnit) {
		if (newMainRefactoringUnit != mainRefactoringUnit) {
			NotificationChain msgs = null;
			if (mainRefactoringUnit != null)
				msgs = ((InternalEObject)mainRefactoringUnit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT, null, msgs);
			if (newMainRefactoringUnit != null)
				msgs = ((InternalEObject)newMainRefactoringUnit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT, null, msgs);
			msgs = basicSetMainRefactoringUnit(newMainRefactoringUnit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT, newMainRefactoringUnit, newMainRefactoringUnit));
		if (this.getMainRefactoringUnit() != null) {
			this.getMainRefactoringUnit().setName(this.getName(), false);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortMapping> getPortMappings() {
		if (portMappings == null) {
			portMappings = new EObjectContainmentEList<PortMapping>(PortMapping.class, this, ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS);
		}
		return portMappings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ModelRefactoring> getModelRefactorings() {
		if (modelRefactorings == null) {
			modelRefactorings = new EObjectContainmentEList<ModelRefactoring>(ModelRefactoring.class, this, ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS);
		}
		return modelRefactorings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Helper> getHelper() {
		if (helper == null) {
			helper = new EObjectContainmentEList<Helper>(Helper.class, this, ComrelPackage.COMPOSITE_REFACTORING__HELPER);
		}
		return helper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingVisualization getMappingVisualization() {
		return mappingVisualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMappingVisualization(MappingVisualization newMappingVisualization) {
		MappingVisualization oldMappingVisualization = mappingVisualization;
		mappingVisualization = newMappingVisualization == null ? MAPPING_VISUALIZATION_EDEFAULT : newMappingVisualization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION, oldMappingVisualization, mappingVisualization));
		for (PortMapping mapping : this.getPortMappings()) {
			mapping.updateVisualization();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomInitialCondition() {
		return customInitialCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomInitialCondition(String newCustomInitialCondition) {
		String oldCustomInitialCondition = customInitialCondition;
		customInitialCondition = newCustomInitialCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION, oldCustomInitialCondition, customInitialCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomFinalCondition() {
		return customFinalCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomFinalCondition(String newCustomFinalCondition) {
		String oldCustomFinalCondition = customFinalCondition;
		customFinalCondition = newCustomFinalCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION, oldCustomFinalCondition, customFinalCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT:
				return basicSetMainRefactoringUnit(null, msgs);
			case ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS:
				return ((InternalEList<?>)getPortMappings()).basicRemove(otherEnd, msgs);
			case ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS:
				return ((InternalEList<?>)getModelRefactorings()).basicRemove(otherEnd, msgs);
			case ComrelPackage.COMPOSITE_REFACTORING__HELPER:
				return ((InternalEList<?>)getHelper()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT:
				return getMainRefactoringUnit();
			case ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS:
				return getPortMappings();
			case ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS:
				return getModelRefactorings();
			case ComrelPackage.COMPOSITE_REFACTORING__HELPER:
				return getHelper();
			case ComrelPackage.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION:
				return getMappingVisualization();
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION:
				return getCustomInitialCondition();
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION:
				return getCustomFinalCondition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT:
				setMainRefactoringUnit((RefactoringUnit)newValue);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS:
				getPortMappings().clear();
				getPortMappings().addAll((Collection<? extends PortMapping>)newValue);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS:
				getModelRefactorings().clear();
				getModelRefactorings().addAll((Collection<? extends ModelRefactoring>)newValue);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__HELPER:
				getHelper().clear();
				getHelper().addAll((Collection<? extends Helper>)newValue);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION:
				setMappingVisualization((MappingVisualization)newValue);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION:
				setCustomInitialCondition((String)newValue);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION:
				setCustomFinalCondition((String)newValue);
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
			case ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT:
				setMainRefactoringUnit((RefactoringUnit)null);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS:
				getPortMappings().clear();
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS:
				getModelRefactorings().clear();
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__HELPER:
				getHelper().clear();
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION:
				setMappingVisualization(MAPPING_VISUALIZATION_EDEFAULT);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION:
				setCustomInitialCondition(CUSTOM_INITIAL_CONDITION_EDEFAULT);
				return;
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION:
				setCustomFinalCondition(CUSTOM_FINAL_CONDITION_EDEFAULT);
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
			case ComrelPackage.COMPOSITE_REFACTORING__MAIN_REFACTORING_UNIT:
				return mainRefactoringUnit != null;
			case ComrelPackage.COMPOSITE_REFACTORING__PORT_MAPPINGS:
				return portMappings != null && !portMappings.isEmpty();
			case ComrelPackage.COMPOSITE_REFACTORING__MODEL_REFACTORINGS:
				return modelRefactorings != null && !modelRefactorings.isEmpty();
			case ComrelPackage.COMPOSITE_REFACTORING__HELPER:
				return helper != null && !helper.isEmpty();
			case ComrelPackage.COMPOSITE_REFACTORING__MAPPING_VISUALIZATION:
				return mappingVisualization != MAPPING_VISUALIZATION_EDEFAULT;
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_INITIAL_CONDITION:
				return CUSTOM_INITIAL_CONDITION_EDEFAULT == null ? customInitialCondition != null : !CUSTOM_INITIAL_CONDITION_EDEFAULT.equals(customInitialCondition);
			case ComrelPackage.COMPOSITE_REFACTORING__CUSTOM_FINAL_CONDITION:
				return CUSTOM_FINAL_CONDITION_EDEFAULT == null ? customFinalCondition != null : !CUSTOM_FINAL_CONDITION_EDEFAULT.equals(customFinalCondition);
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
		result.append(" (mappingVisualization: ");
		result.append(mappingVisualization);
		result.append(", customInitialCondition: ");
		result.append(customInitialCondition);
		result.append(", customFinalCondition: ");
		result.append(customFinalCondition);
		result.append(')');
		return result.toString();
	}
	
	public void setName(String newName) {
		this.setName(newName, true);
	}

	public void setName(String newName, boolean updateRootUnit) {
		String oldName = name;
		name = newName;
		if (updateRootUnit) {
			if (this.getMainRefactoringUnit() != null) {
				this.getMainRefactoringUnit().setName(newName, false);
			}
		}
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComrelPackage.COMPOSITE_REFACTORING__NAME, oldName,
					name));

	}
	
	public void setNamespaceUri(String newNamespaceUri) {
		if (namespaceUri == null) {
			String oldNamespaceUri = namespaceUri;
			namespaceUri = newNamespaceUri;
			nsUri = namespaceUri;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(
						this,
						Notification.SET,
						ComrelPackage.COMPOSITE_REFACTORING__NAMESPACE_URI,
						oldNamespaceUri, namespaceUri));
		}
	}
	
	/**
	 * @param id
	 * @return ModelRefactoring oder null, falls nicht existent
	 */
	public ModelRefactoring getModelRefactoring(String id) {
		for (ModelRefactoring ref : this.getModelRefactorings()) {
			if (ref.getRefId().equals(id)) {
				return ref;
			}
		}
		return null;
	}

	/**
	 * @param id
	 *            des Helpers
	 * @return Helper oder null, falls nicht existent
	 */
	public Helper getHelper(String id) {
		for (Helper h : this.getHelper()) {
			if (h.getHelperId().equals(id)) {
				return h;
			}
		}
		return null;
	}

	/**
	 * @param id
	 * @return Helper oder null, falls nicht existent
	 */
	public SingleFeatureHelper getSingleFeatureHelper(String id) {
		Helper h = this.getHelper(id);
		if (h != null && h instanceof SingleFeatureHelper) {
			return (SingleFeatureHelper) h;
		} else {
			for (SingleFeatureHelper helper : RegistryUtil
					.loadSingleFeatureHelper()) {
				if (helper.getHelperId().equals(id))
					return helper;
			}
		}
		return null;
	}

	/**
	 * @param id
	 * @return Helper oder null, falls nicht existent
	 */
	public MultiFeatureHelper getMultiFeatureHelper(String id) {
		Helper h = this.getHelper(id);
		if (h != null && h instanceof MultiFeatureHelper) {
			return (MultiFeatureHelper) h;
		} else {
			for (MultiFeatureHelper helper : RegistryUtil
					.loadMultiFeatureHelper()) {
				if (helper.getHelperId().equals(id))
					return helper;
			}
		}
		return null;
	}

	/**
	 * @param id
	 * @return Helper oder null, falls nicht existent
	 */
	public SingleFilterHelper getSingleFilterHelper(String id) {
		Helper h = this.getHelper(id);
		if (h != null && h instanceof SingleFilterHelper) {
			return (SingleFilterHelper) h;
		} else {
			for (SingleFilterHelper helper : RegistryUtil
					.loadSingleFilterHelper()) {
				if (helper.getHelperId().equals(id))
					return helper;
			}
		}
		return null;
	}

	/**
	 * @param id
	 * @return Helper oder null, falls nicht existent
	 */
	public MultiFilterHelper getMultiFilterHelper(String id) {
		Helper h = this.getHelper(id);
		if (h != null && h instanceof MultiFilterHelper) {
			return (MultiFilterHelper) h;
		} else {
			for (MultiFilterHelper helper : RegistryUtil
					.loadMultiFilterHelper()) {
				if (helper.getHelperId().equals(id))
					return helper;
			}
		}
		return null;
	}

	/**
	 * Liefert alle ModelRefactorings useses EmfRefactor-ExtensionPoint
	 */
	public Collection<ModelRefactoring> getEmfRefactoringsAsModelRefactorings() {
		return RegistryUtil.getEmfRefactoringsAsModelRefactorings();
	}

	/**
	 * Liefert das ModelRefactoring zur gegebener ID
	 */
	public ModelRefactoring getEmfRefactoringAsModelRefactoring(String id) {
		for (ModelRefactoring ref : this.getModelRefactorings()) {
			if (ref.getRefId().equals(id)) {
				return ref;
			}
		}
		for (ModelRefactoring ref : this.getEmfRefactoringsAsModelRefactorings()) {
			if (ref.getRefId().equals(id)) {
				return ref;
			}
		}
		return null;
	}

	/**
	 * Look up, if the ModelRefactoring in use
	 */
	public boolean modelRefactoringInUse(ModelRefactoring ref,
			AtomicUnit context) {
		AtomicUnit atomicUnit;
		for (RefactoringUnit refUnit : this.getAllRefactoringUnits()) {
			if (refUnit instanceof AtomicUnit) {
				atomicUnit = (AtomicUnit) refUnit;
				if (atomicUnit.getModelRefactoring() == ref
						&& !(context == atomicUnit)) {
					return true;
				}
			}

		}
		return false;
	}

	/**
	 * Look up, if the helper in use
	 */
	public boolean helperInUse(Helper helper, HelperUnit context) {
		for (HelperUnit helperUnit : this.getAllHelperUnits()) {
			if (this.getHelper(helperUnit.getHelperUnitId()) == helper
					&& helperUnit != context) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Liefert alle direkten und indirekten RefactoringUnits
	 * 
	 * @return RefactoringUnits
	 */
	private List<RefactoringUnit> getAllRefactoringUnits() {
		ArrayList<RefactoringUnit> result = new ArrayList<RefactoringUnit>();
		Stack<RefactoringUnit> stack = new Stack<RefactoringUnit>();
		RefactoringUnit refUnit;
		refUnit = this.getMainRefactoringUnit();

		SequentialUnit seqUnit;
		if (refUnit != null) {
			stack.push(refUnit);
		}
		while (!stack.isEmpty()) {
			refUnit = stack.pop();
			result.add(refUnit);
			if (refUnit instanceof SequentialUnit) {
				seqUnit = (SequentialUnit) refUnit;
				for (RefactoringUnit rU : seqUnit.getRefactoringUnits()) {
					stack.push(rU);
				}
			}
			if (refUnit instanceof SingleQueuedUnit) {
				SingleQueuedUnit queuedUnit = (SingleQueuedUnit) refUnit;
				stack.push(queuedUnit.getRefactoringUnit());
			}
			if (refUnit instanceof ParallelQueuedUnit) {
				ParallelQueuedUnit queuedUnit = (ParallelQueuedUnit) refUnit;
				stack.push(queuedUnit.getRefactoringUnits());
			}
			if (refUnit instanceof CartesianQueuedUnit) {
				CartesianQueuedUnit queuedUnit = (CartesianQueuedUnit) refUnit;
				stack.push(queuedUnit.getRefactoringUnit());
			}
		}
		return result;
	}

	/**
	 * Liefert alle direkten und indirekten HelperUnits
	 * 
	 * @return HelperUnits
	 */
	private List<HelperUnit> getAllHelperUnits() {
		ArrayList<HelperUnit> result = new ArrayList<HelperUnit>();
		CompositeUnit compositeUnit;
		for (RefactoringUnit unit : this.getAllRefactoringUnits()) {
			if (unit instanceof CompositeUnit) {
				compositeUnit = (CompositeUnit) unit;
				result.addAll(compositeUnit.getHelperUnits());
			}
		}
		return result;
	}

	/**
	 * Liefert alle unbenutzten ModelRefactorings
	 * 
	 * @return
	 */
	public List<ModelRefactoring> getUnusedModelRefactorings() {
		ArrayList<ModelRefactoring> result = new ArrayList<ModelRefactoring>();
		for (ModelRefactoring mr : this.getModelRefactorings()) {
			if (!(modelRefactoringInUse(mr, null))) {
				result.add(mr);
			}
		}
		return result;
	}

	/**
	 * Liefert alle unbenutzten Helper
	 * 
	 * @return
	 */
	public List<Helper> getUnusedHelper() {
		ArrayList<Helper> result = new ArrayList<Helper>();
		for (Helper helper : this.getHelper()) {
			if (!helperInUse(helper, null)) {
				result.add(helper);
			}
		}
		return result;
	}

	/**
	 * Entfernt alle unbenutzten ModelRefactorings
	 */
	public void removeUnusedModelRefactorings() {
		this.getModelRefactorings().removeAll(
				this.getUnusedModelRefactorings());
	}

	/**
	 * Entfernt alle unbentzten Helper
	 */
	public void removeUnusedHelper() {
		this.getHelper().removeAll(this.getUnusedHelper());
	}

	public void setMappingNumbers(Set<Integer> mappingNumbers) {
		this.mappingNumbers = mappingNumbers;
	}

	public Set<Integer> getMappingNumbers() {
		return mappingNumbers;
	}

	public void cleanUpMappingNumbers() {
		Set<Integer> set = new HashSet<Integer>();
		for (PortMapping mapping : this.getPortMappings()) {
			set.add(mapping.getMappingNumber());
		}
		this.setMappingNumbers(set);
	}

	public void updateVisualization() {
		this.cleanUpMappingNumbers();
		for (PortMapping mapping : this.getPortMappings()) {
			if(mapping.getMappingNumber() == Integer.MAX_VALUE) {
				mapping.updateMappingNumber();
			}
			mapping.updateVisualization();
		}
		updateSequentialOrderVisualization();
	}
	
	private void updateSequentialOrderVisualization(){
		SequentialUnit seq;
		for(RefactoringUnit unit : this.getAllRefactoringUnits()) {
			if(unit instanceof SequentialUnit) {
				seq = (SequentialUnit) unit;
				seq.updateSeqExecutionOrder();
			}
		}
	}

} //CompositeRefactoringImpl
