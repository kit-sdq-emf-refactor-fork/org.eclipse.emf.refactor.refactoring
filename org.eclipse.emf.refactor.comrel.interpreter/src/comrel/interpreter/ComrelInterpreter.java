package comrel.interpreter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.RefactoringManager;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.LtkEmfRefactoringProcessorAdapter;

import comrel.AtomicUnit;
import comrel.CompositeRefactoring;
import comrel.ComrelPackage;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.MultiFeatureHelper;
import comrel.MultiFeatureUnit;
import comrel.MultiFilterHelper;
import comrel.MultiFilterUnit;
import comrel.MultiInputPort;
import comrel.MultiPort;
import comrel.MultiPortMapping;
import comrel.Port;
import comrel.PortMapping;
import comrel.RefactoringUnit;
import comrel.SequentialUnit;
import comrel.SingleFeatureHelper;
import comrel.SingleFeatureUnit;
import comrel.SingleFilterHelper;
import comrel.SingleFilterUnit;
import comrel.SingleInputPort;
import comrel.SinglePort;
import comrel.SinglePortMapping;
import comrel.SingleQueuedUnit;
import comrel.extensions.IMultiFeatureHelper;
import comrel.extensions.IMultiFilterHelper;
import comrel.extensions.ISingleFeatureHelper;
import comrel.extensions.ISingleFilterHelper;
import comrel.util.ExtensionPointInfo;
import comrel.util.RegistryUtil;

public class ComrelInterpreter {
	
	private LinkedList<Refactoring> emfRefactorings = new LinkedList<Refactoring>();
	private Set<Helper> helper = new HashSet<Helper>();
	private CompositeRefactoring compositeRefactoring;
	private RefactoringUnit mainRefactoringUnit;
	private EObject rootObject;
	private boolean checkPreconditions = true;	

	public ComrelInterpreter(EObject eObject) {
		this.rootObject = EcoreUtil.getRootContainer(eObject);
		registerComrel();
		setEmfRefactorings();
		setHelper();
	}
	
	public RefactoringUnit getRootRefactoringUnit() {
		return mainRefactoringUnit;
	}
	
	public void loadComrelModel(String fileName) throws IOException {
		URI uri = URI.createFileURI(new File(fileName).getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		resource.load(Collections.EMPTY_MAP);
		compositeRefactoring = (CompositeRefactoring) resource.getContents().get(0);
		mainRefactoringUnit = compositeRefactoring.getMainRefactoringUnit();
		if ((compositeRefactoring.getCustomInitialCondition() == null 
				|| compositeRefactoring.getCustomInitialCondition().isEmpty())
			&& (compositeRefactoring.getCustomFinalCondition() == null 
				|| compositeRefactoring.getCustomFinalCondition().isEmpty())) {
			// There are no precondition checks for the composite refactoring:
			// set 'checkPreconditions' to true to check peconditions inside!
			checkPreconditions = true;
		} else {
			checkPreconditions = false;
		}
	}
	
	public void execute() {
		executeRefactoringUnit(this.mainRefactoringUnit);
	}
	
	// needed
	private void registerComrel() {
		EPackage.Registry.INSTANCE
			.put(ComrelPackage.eNS_URI, ComrelPackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
			.put("comrel", new XMIResourceFactoryImpl());
	}

	// needed
	private void setEmfRefactorings() {
		this.emfRefactorings = RefactoringManager.getAllRefactorings();
	}
	
	// needed
	private void setHelper() {
		helper.addAll(RegistryUtil.loadMultiFeatureHelper());
		helper.addAll(RegistryUtil.loadMultiFilterHelper());
		helper.addAll(RegistryUtil.loadSingleFeatureHelper());
		helper.addAll(RegistryUtil.loadSingleFilterHelper());
	}
	
	// needed
	private boolean executeRefactoringUnit(RefactoringUnit refactoringUnit) {
		boolean success = false;
		if (refactoringUnit instanceof AtomicUnit) {
			success = executeAtomicUnit((AtomicUnit) refactoringUnit);
		}
		if (refactoringUnit instanceof SingleQueuedUnit) {
			success = executeSingleQueuedUnit((SingleQueuedUnit)refactoringUnit);
		}
		if (refactoringUnit instanceof SequentialUnit) {
			success = executeSequentialUnit((SequentialUnit) refactoringUnit);
		}		
		return success;
	}
	
	private boolean executeAtomicUnit(AtomicUnit atomicUnit) {
		boolean success = false;
//		System.out.println("---------------------------");
//		System.out.println("Start execution of AtomicUnit");
//		System.out.println("1 - Load corresponding EmfRefactoring");
		Refactoring atomicRefactoring = getEmfRefactoringFromAtomicUnit(atomicUnit);
		if (atomicRefactoring == null) {
			System.out.println("Throw new EmfRefactoringNotFoundException()");
		} else {
//			System.out.println("EmfRefactoring: " + atomicRefactoring.getName());
		}
//		System.out.println("2 - Pass port values to EmfRefactoring");
		passPortValues(atomicUnit, atomicRefactoring);
//		System.out.println("3 - Check initial and final conditions");
//		System.out.println("Controller null?: " 
//				+ (atomicRefactoring.getController() == null));
//		System.out.println("Processor null?: " 
//				+ (atomicRefactoring.getController().getLtkRefactoringProcessor() == null));
//		System.out.println("SetSelection to initialize Processor");
		// new 
		List<EObject> selection = new ArrayList<EObject>();
		if (atomicRefactoring
				.getController()
				.getDataManagementObject()
				.getInPortByName("selectedEObject").getValue() 
				instanceof EObject) {
			selection.add((EObject) atomicRefactoring
					.getController()
					.getDataManagementObject()
					.getInPortByName("selectedEObject")
					.getValue());
		}
		if (atomicRefactoring
				.getController()
				.getDataManagementObject()
				.getInPortByName("selectedEObject").getValue() 
				instanceof IEObjectGetter) {
			selection.add(((IEObjectGetter) atomicRefactoring
					.getController()
					.getDataManagementObject()
					.getInPortByName("selectedEObject")
					.getValue()).getEObject());
		}		
		// end new
		atomicRefactoring.getController().setSelection(selection);
//		System.out.println("Processor null?: " 
//				+ (atomicRefactoring.getController().getLtkRefactoringProcessor() == null));
		LtkEmfRefactoringProcessorAdapter refactoringProcessor = 
			(LtkEmfRefactoringProcessorAdapter)
				atomicRefactoring.getController().getLtkRefactoringProcessor();
//		System.out.println("RefactoringProcessor: " + refactoringProcessor.toString());
		// NEW: check preconditions if specified by flag
		if (checkPreconditions) {
			if (! refactoringProcessor.checkConditions()) {
//				System.out.println("AtomicUnit was NOT executed successfully!");
				return success;
			}
		}	
		// either: no precondition check
		// or: successful precondition check
		// -> execute refactoring!
		try {
			refactoringProcessor.createChange
				(new NullProgressMonitor()).perform(new NullProgressMonitor());
		} catch (OperationCanceledException e) {
//			System.out.println("AtomicUnit was NOT executed successfully!");
			e.printStackTrace();
		} catch (CoreException e) {
//			System.out.println("AtomicUnit was NOT executed successfully!");
			e.printStackTrace();
		}
//		System.out.println("AtomicUnit was executed successfully!");
		success = true;
//		System.out.println("End execution of AtomicUnit");
//		System.out.println("---------------------------");
		return success;
	}
	
	private boolean executeSequentialUnit(SequentialUnit sequentialUnit) {
		boolean success = true;
//		System.out.println("---------------------------");
//		System.out.println("Start execution of SequentialUnit");
//		System.out.println("---------------------------");
//		System.out.println("1 - Set entire port values");
//		System.out.println("1 a - Do port mapping of each main input port");
		for (InputPort ip : sequentialUnit.getInputPorts()) {
//			System.out.println("1 a i  - Get port mapping from input port");
			List<PortMapping> pms = getPortMappingsFromSourcePort(sequentialUnit, ip);
			for (PortMapping pm : pms) {
//				System.out.println("       - PortMapping (source): " + pm.getSource());
//				System.out.println("       - PortMapping (target): " + pm.getTarget());
//				System.out.println("1 a ii - do port mapping");
				doPortMapping(pm);
//				System.out.println("       - PortMapping (source): " + pm.getSource());
//				System.out.println("       - PortMapping (target): " + pm.getTarget());
			}
		}
//		System.out.println("1 b - Execute each helper");
		int numberOfHelpers = sequentialUnit.getHelperUnits().size();
		boolean allHelpersExecuted = false;
		while(!allHelpersExecuted) {
			int numberOfExecutedHelpers = 0;
			for (HelperUnit hu : sequentialUnit.getHelperUnits()) {
//				System.out.println("1 b i - Execute helper with set input port");
				boolean helperInputPortsSet = checkPortValuesSetInHelperUnit(hu);
//				System.out.println("      - helperInputPortsSet: " + helperInputPortsSet);
				if (helperInputPortsSet) {
					executeHelperUnit(hu);
//					System.out.println("1 b iii - Do mappings from helper output ports");
//					System.out.println("        - Get port mapping from output port");
					List<PortMapping> pms = getPortMappingsFromSourcePort(sequentialUnit, hu.getOutputPort());
					for (PortMapping pm : pms) {
//						System.out.println("        - PortMapping (source): " + pm.getSource());
//						System.out.println("        - PortMapping (target): " + pm.getTarget());
//						System.out.println("        - do PortMapping");
						doPortMapping(pm);
//						System.out.println("        - PortMapping (source): " + pm.getSource());
//						System.out.println("        - PortMapping (target): " + pm.getTarget());
						
					}
					numberOfExecutedHelpers++;
				}
			}
			allHelpersExecuted = (numberOfExecutedHelpers == numberOfHelpers);
		}		
//		System.out.println("2 - Init variables");
//		System.out.println("2 a - Set flag with respect to a strict execution");
		final boolean strict = sequentialUnit.isStrict();
//		System.out.println("      Execution is strict: " + strict);
//		System.out.println("2 b - Set max number of child units");
		int max = sequentialUnit.getRefactoringUnits().size();
//		System.out.println("      Max number of child units: " + max);
//		System.out.println("3 - Execute child units");
		// prepare rollback
		ChangeRecorder changeRecorder = new ChangeRecorder(rootObject);
		for (int i = 1; i <= max; i++) {
//			System.out.println(" -> Execution no: " + i);
			RefactoringUnit ru = getRefactoringUnitByIndex(sequentialUnit, i);
//			System.out.println(" -  Execute child unit: " + ru);
			Boolean childSuccess = executeRefactoringUnit(ru);
//			System.out.println(" -  Result execution: " + childSuccess);
			if (strict && ! childSuccess) {
				// rollback
				ChangeDescription changeDescription = changeRecorder.endRecording();
				changeDescription.apply();
				// end rollback
				success = false;
				break;
			}
		}
		if (success) {
//			System.out.println("SequentialUnit was executed successfully!");
		} else {
//			System.out.println("SequentialUnit was NOT executed successfully!");
		}
//		System.out.println("---------------------------");
//		System.out.println("End execution of SequentialUnit");
//		System.out.println("---------------------------");
		return success;
	}
	
	private boolean executeSingleQueuedUnit(SingleQueuedUnit singleQueuedUnit) {
		boolean success = true;
//		System.out.println("---------------------------");
//		System.out.println("Start execution of SingleQueudUnit");
//		System.out.println("1 - Set flag with respect to a strict execution");
		final boolean strict = singleQueuedUnit.isStrict();
//		System.out.println("Execution is strict: " + strict);
//		System.out.println("2 - Set max number of child unit executions");
		int max = singleQueuedUnit.getMultiInputPort().getValue().size();
//		System.out.println("Max number of child unit executions: " + max);
		// prepare rollback
		ChangeRecorder changeRecorder = new ChangeRecorder(rootObject);
		for (int i = 0; i < max; i++) {
//			System.out.println("--- Execution no: " + i);
//			System.out.println("3 (a) - Pass port values to child unit");
//			System.out.println("- Get MultiInputPort from parent unit");
			MultiInputPort mip = singleQueuedUnit.getMultiInputPort();
//			System.out.println("- MultiInputPort (Name/Type): " + mip.getName() + "; " + mip.getType());
//			System.out.println("- Get corresponding PortMapping");
			PortMapping pm = getPortMappingFromSourcePort(singleQueuedUnit, mip);
//			System.out.println("- PortMapping (source): " + pm.getSource());
//			System.out.println("- PortMapping (target): " + pm.getTarget());
//			System.out.println("- Pass value " + i + " from MultiInputPort to SingleInputPort");
			if (mip.getValue().get(i) == null) {
//				System.out.println("-> null value on port position " + i + ": continue");
				continue;
			}
			if ((((EObject)mip.getValue().get(i)).eResource() == null)
					|| (((EObject)mip.getValue().get(i)).eResource().getResourceSet() == null)){
//				System.out.println("-> null ressource/ressourceset on port position " + i + ": continue");
				continue;
			}
			passValueFromMultiInputPortToSingleInputPort(pm, i);
//			System.out.println("- Get all InputPorts from childUnit");
			EList<InputPort> inputPorts = 
				singleQueuedUnit.getRefactoringUnit().getAllInputPorts();
//			System.out.println("- Total Number of InputPorts of childUnit: " + inputPorts.size());
//			System.out.println("- Pass value to secondary input ports");
			for (InputPort ip : inputPorts) {
				if (((SingleInputPort)ip).getValue() == null) {
//					System.out.println("- Get corresponding PortMapping");
					PortMapping pmTemp = getPortMappingFromTargetPort(singleQueuedUnit, ip);
//					System.out.println("- PortMapping (source): " + pmTemp.getSource());
//					System.out.println("- PortMapping (target): " + pmTemp.getTarget());
					doPortMapping(pmTemp);
				}
			}
//			System.out.println("-- Types and Values of all input ports of child unit:");
//			for (InputPort ip : singleQueuedUnit.getRefactoringUnit().getAllInputPorts()) {
//				System.out.print("-- " + ip.getName() + " / ");
//				if (ip instanceof SingleInputPort) {
//					System.out.println(((SingleInputPort)ip).getValue());
//				} else {
//					System.out.println(((MultiInputPort)ip).getValue());
//				}
//			}
//			System.out.println("---> CALL: Execute Child Unit");
			Boolean childSuccess = executeRefactoringUnit(singleQueuedUnit.getRefactoringUnit());
			if (strict && ! childSuccess) {
				// rollback
				ChangeDescription changeDescription = changeRecorder.endRecording();
				changeDescription.apply();
				// end rollback
				success = false;
				break;
			}
		}
//		if (success) {
//			System.out.println("SingleQueudUnit was executed successfully!");
//		} else {
//			System.out.println("SingleQueudUnit was NOT executed successfully!");
//		}
//		System.out.println("---------------------------");
//		System.out.println("End execution of SingleQueudUnit");
//		System.out.println("---------------------------");
		return success;
	}
	
	// needed
	private void doPortMapping(PortMapping pm) {
		if (pm instanceof SinglePortMapping) {
			SinglePort source = ((SinglePortMapping) pm).getSource();
			SinglePort target = ((SinglePortMapping) pm).getTarget();
			target.setValue(source.getValue());
		}
		if (pm instanceof MultiPortMapping) {
			MultiPort mip = ((MultiPortMapping) pm).getSource();
			MultiPort sip = ((MultiPortMapping) pm).getTarget();
			sip.getValue().clear();
			sip.getValue().addAll(mip.getValue());
		}
	}
	
	// needed
	private void runHelper(HelperUnit hu, Helper h) {
		if (h instanceof SingleFilterHelper) {
			ISingleFilterHelper isfih = getISingleFilterHelperFromSingleFilterHelper((SingleFilterHelper) h);
			if (isfih != null) {
//				System.out.println("       - output value before: " + isfih.getOutputPort().getValue());
				isfih.getInputPort().getValue().addAll(((SingleFilterUnit)hu).getInputPort().getValue());
				// TODO pass secondary port values -> change Interface ISingleFilterHelper...
				isfih.run();
//				System.out.println("       - output value after: " + isfih.getOutputPort().getValue());
//				System.out.println("       - set output value to helper unit");
				((SingleFilterUnit)hu).getOutputPort().setValue(isfih.getOutputPort().getValue());
			}
		}
		if (h instanceof MultiFeatureHelper) {
			IMultiFeatureHelper imfeh = getIMultiFeatureHelperFromMultiFeatureHelper((MultiFeatureHelper) h);
			if (imfeh != null) {
//				System.out.println("       - output value before: " + imfeh.getOutputPort().getValue());
				imfeh.getInputPort().setValue(((MultiFeatureUnit)hu).getInputPort().getValue());
				imfeh.run();
//				System.out.println("       - output value after: " + imfeh.getOutputPort().getValue());
//				System.out.println("       - set output value to helper unit");
				((MultiFeatureUnit)hu).getOutputPort().getValue().addAll(imfeh.getOutputPort().getValue());
			}
		}
		if (h instanceof SingleFeatureHelper) {
			ISingleFeatureHelper isfeh = getISingleFeatureHelperFromSingleFeatureHelper((SingleFeatureHelper) h);
			if (isfeh != null) {
//				System.out.println("       - output value before: " + isfeh.getOutputPort().getValue());
				isfeh.getInputPort().setValue(((SingleFeatureUnit)hu).getInputPort().getValue());
				isfeh.run();
//				System.out.println("       - output value after: " + isfeh.getOutputPort().getValue());
//				System.out.println("       - set output value to helper unit");
				((SingleFeatureUnit)hu).getOutputPort().setValue(isfeh.getOutputPort().getValue());
			}
		}
		if (h instanceof MultiFilterHelper) {
			IMultiFilterHelper imfih = getIMultiFilterHelperFromMultiFilterHelper((MultiFilterHelper) h);
			if (imfih != null) {
//				System.out.println("       - output value before: " + imfih.getOutputPort().getValue());
				imfih.getInputPort().getValue().addAll(((MultiFilterUnit)hu).getInputPort().getValue());
				// TODO pass secondary port values -> change Interface IMultiFilterHelper...
				imfih.run();
//				System.out.println("       - output value after: " + imfih.getOutputPort().getValue());
//				System.out.println("       - set output value to helper unit");
				((MultiFilterUnit)hu).getOutputPort().getValue().addAll(imfih.getOutputPort().getValue());
			}
		}
	}
	
	private IMultiFilterHelper getIMultiFilterHelperFromMultiFilterHelper(
			MultiFilterHelper h) {
//		System.out.println("1 b ii - Load Interface IMultiFilterHelper");
		IConfigurationElement[] iMultiFilterHelpers = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(ExtensionPointInfo.MULTIFILTER_EXTENSION_POINT);
//		System.out.println("       - Number of multifilters: " + iMultiFilterHelpers.length);
		IMultiFilterHelper imfih = null;
		for (IConfigurationElement ice : iMultiFilterHelpers) {
			try {
				String helperId = h.getHelperId();
				String id = ice.getAttribute("id");
//				System.out.println("       - id of helper: " + helperId);
//				System.out.println("       - id of interface: " + id);
				if (helperId.equals(id)) {
					imfih  = (IMultiFilterHelper) ice.createExecutableExtension("class");
					break;
				}				
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("       - class of multifilter: " + imfih.getClass().getName());
		return imfih;
	}

	// needed
	private ISingleFeatureHelper getISingleFeatureHelperFromSingleFeatureHelper(
			SingleFeatureHelper h) {
//		System.out.println("1 b ii - Load Interface ISingleFeatureHelper");
		IConfigurationElement[] iSingleFeatureHelpers = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(ExtensionPointInfo.SINGLEFEATURE_EXTENSION_POINT);
//		System.out.println("       - Number of singlefeatures: " + iSingleFeatureHelpers.length);
		ISingleFeatureHelper isfeh = null;
		for (IConfigurationElement ice : iSingleFeatureHelpers) {
			try {
				String helperId = h.getHelperId();
				String id = ice.getAttribute("id");
//				System.out.println("       - id of helper: " + helperId);
//				System.out.println("       - id of interface: " + id);
				if (helperId.equals(id)) {
					isfeh  = (ISingleFeatureHelper) ice.createExecutableExtension("class");
					break;
				}				
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("       - class of singlefeature: " + isfeh.getClass().getName());
		return isfeh;
	}

	// needed
	private PortMapping getPortMappingFromSourcePort(RefactoringUnit refactoringUnit, Port port) {
		EList<PortMapping> portMappings = compositeRefactoring.getPortMappings();
		for (PortMapping pm : portMappings) {
			if (pm.getSource() == port){
				return pm;
			}
		}
		return null;
	}
	
	// needed
	private PortMapping getPortMappingFromTargetPort(RefactoringUnit refactoringUnit, InputPort port) {
		EList<PortMapping> portMappings = compositeRefactoring.getPortMappings();
		for (PortMapping pm : portMappings) {
			if (pm.getTarget() == port){
				return pm;
			}
		}
		return null;
	}
	
	// needed
	private void passValueFromMultiInputPortToSingleInputPort(PortMapping pm, int i) {
		MultiInputPort mip = (MultiInputPort) pm.getSource();
		SingleInputPort sip = (SingleInputPort) pm.getTarget();
		sip.setValue(mip.getValue().get(i));
	}
	
	// needed
	@SuppressWarnings("unchecked")
	private void passPortValues(AtomicUnit atomicUnit,
			Refactoring atomicRefactoring) {
		for (SingleInputPort sip : atomicUnit.getInputPorts()) {
			String portName = sip.getName();
			atomicRefactoring
				.getController().getDataManagementObject()
				.getInPortByName(portName).setValue(sip.getValue());
		}
	}

	// needed
	private Refactoring getEmfRefactoringFromAtomicUnit(AtomicUnit atomicUnit) {
		for (Refactoring emfRef : emfRefactorings) {
			if (emfRef.getId().equals(atomicUnit.getModelRefactoring().getRefId())){
				return emfRef;
			}
		}
		return null;
	}

	// needed
	private RefactoringUnit getRefactoringUnitByIndex(
			SequentialUnit sequentialUnit, int i) {
		for (RefactoringUnit ru : sequentialUnit.getRefactoringUnits()) {
			if (ru.getSeqExecutionOrder() == i) {
				return ru;
			}
		}
		return null;
	}

	// needed
	private List<PortMapping> getPortMappingsFromSourcePort(RefactoringUnit refactoringUnit, Port port) {
		List<PortMapping> pms = new ArrayList<PortMapping>();
		EList<PortMapping> portMappings = compositeRefactoring.getPortMappings();
		for (PortMapping pm : portMappings) {
			if (pm.getSource() == port){
				pms.add(pm);
			}
		}
		return pms;
	}

	// needed
	private void executeHelperUnit(HelperUnit hu) {
//		System.out.println("      - execute Helper: " + hu.getHelperUnitId());
//		System.out.println("      - Load corresponding Helper");
		Helper h = getHelperFromHelperUnit(hu);
//		if (h == null) {
//			System.out.println("Throw new HelperNotFoundException()");
//		} else {
//			System.out.println("      - Helper: " + h.getName());
//		}
//		System.out.println("      - Run Helper");
		runHelper(hu, h);
	}
	
	// needed
	private IMultiFeatureHelper getIMultiFeatureHelperFromMultiFeatureHelper(
			MultiFeatureHelper h) {
//		System.out.println("1 b ii - Load Interface IMultiFeatureHelper");
		IConfigurationElement[] iMultiFeatureHelpers = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(ExtensionPointInfo.MULTIFEATURE_EXTENSION_POINT);
//		System.out.println("       - Number of multifeatures: " + iMultiFeatureHelpers.length);
		IMultiFeatureHelper imfeh = null;
		for (IConfigurationElement ice : iMultiFeatureHelpers) {
			try {
				String helperId = h.getHelperId();
				String id = ice.getAttribute("id");
//				System.out.println("       - id of helper: " + helperId);
//				System.out.println("       - id of interface: " + id);
				if (helperId.equals(id)) {
					imfeh  = (IMultiFeatureHelper) ice.createExecutableExtension("class");
					break;
				}				
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("       - class of multifeature: " + imfeh.getClass().getName());
		return imfeh;
	}

	// needed
	private ISingleFilterHelper getISingleFilterHelperFromSingleFilterHelper(
			SingleFilterHelper h) {
//		System.out.println("1 b ii - Load Interface ISingleFilterHelper");
		IConfigurationElement[] iSingleFilterHelpers = Platform.getExtensionRegistry()
			.getConfigurationElementsFor(ExtensionPointInfo.SINGLEFILTER_EXTENSION_POINT);
//		System.out.println("       - Number of singlefilters: " + iSingleFilterHelpers.length);
		ISingleFilterHelper isfh = null;
		for (IConfigurationElement ice : iSingleFilterHelpers) {
			try {
				String helperId = h.getHelperId();
				String id = ice.getAttribute("id");
//				System.out.println("       - id of helper: " + helperId);
//				System.out.println("       - id of interface: " + id);
				if (helperId.equals(id)) {
					isfh  = (ISingleFilterHelper) ice.createExecutableExtension("class");
					break;
				}				
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("       - class of singlefilter: " + isfh.getClass().getName());
		return isfh;
	}

	// needed
	private Helper getHelperFromHelperUnit(HelperUnit hu) {
		for (Helper h : this.helper) {
			if (h.getHelperId().equals(hu.getHelperUnitId())){
				return h;
			}
		}
		return null;
	}

	// needed
	private boolean checkPortValuesSetInHelperUnit(HelperUnit hu) {
		if (hu instanceof SingleFilterUnit) {
			if (((SingleFilterUnit) hu).getInputPort().getValue() == null) {
				return false;
			}
		}		
		if (hu instanceof MultiFilterUnit) {
			if (((MultiFilterUnit) hu).getInputPort().getValue() == null) {
				return false;
			}
		}
		if (hu instanceof SingleFeatureUnit) {
			if (((SingleFeatureUnit) hu).getInputPort().getValue() == null) {
				return false;
			}			
			for (MultiInputPort mip : ((SingleFeatureUnit) hu).getSecondaryInputPorts()) {
				if (mip.getValue() == null) {
					return false;
				}
			}
		}
		if (hu instanceof MultiFeatureUnit) {
			if (((MultiFeatureUnit) hu).getInputPort().getValue() == null) {
				return false;
			}			
			for (MultiInputPort mip : ((MultiFeatureUnit) hu).getSecondaryInputPorts()) {
				if (mip.getValue() == null) {
					return false;
				}
			}
		}
		return true;
	}

}
