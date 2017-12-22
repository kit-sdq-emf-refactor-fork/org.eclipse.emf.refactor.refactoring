package comrel.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.RefactoringManager;

import comrel.ComrelFactory;
import comrel.Helper;
import comrel.ModelRefactoring;
import comrel.MultiFeatureHelper;
import comrel.MultiFilterHelper;
import comrel.MultiInputPort;
import comrel.MultiOutputPort;
import comrel.Port;
import comrel.SingleFeatureHelper;
import comrel.SingleFilterHelper;
import comrel.SingleInputPort;
import comrel.SingleOutputPort;
import comrel.extensions.IMultiFeatureHelper;
import comrel.extensions.IMultiFilterHelper;
import comrel.extensions.ISingleFeatureHelper;
import comrel.extensions.ISingleFilterHelper;

public class RegistryUtil {
//	private static final String SINGLEFILTER_EXTENSION_POINT = "org.eclipse.emf.refactor.singlefilter";
//	private static final String MULTIFILTER_EXTENSION_POINT = "org.eclipse.emf.refactor.multifilter";
//	private static final String SINGLEFEATURE_EXTENSION_POINT = "org.eclipse.emf.refactor.singlefeature";
//	private static final String MULTIFEATURE_EXTENSION_POINT = "org.eclipse.emf.refactor.multifeature";
//
//	private static final String SINGLEFEATURE_SEARCH_STRING = "singlefeature";
//	private static final String MULTIFEATURE_SEARCH_STRING = "multifeature";
//	private static final String SINGLEFILTER_SEARCH_STRING = "singlefilter";
//	private static final String MULTIFILTER_SEARCH_STRING = "multifilter";

	/**
	 * lädt die Helper, gefiltert nach der namespaceUri
	 * 
	 * @param namespaceURI
	 *            nach der gefiltert werden soll
	 * @return Set der gefilterten Helper
	 */
	public static Set<SingleFilterHelper> loadSingleFilterHelper(
			String namespaceURI) {
		Set<SingleFilterHelper> result = new HashSet<SingleFilterHelper>();
		for (SingleFilterHelper h : loadSingleFilterHelper()) {
			if (h.getNamespaceUri().equals(namespaceURI)) {
				result.add(h);
			}
		}
		return result;
	}

	/**
	 * lädt die Helper
	 * 
	 * @return Set der Helper
	 */
	public static Set<SingleFilterHelper> loadSingleFilterHelper() {
		return castSet(loadHelper(ExtensionPointInfo.SINGLEFILTER_EXTENSION_POINT));
	}

	/**
	 * lädt die Helper, gefiltert nach der namespaceUri
	 * 
	 * @param namespaceURI
	 *            nach der gefiltert werden soll
	 * @return Set der gefilterten Helper
	 */
	public static Set<MultiFilterHelper> loadMultiFilterHelper(
			String namespaceURI) {
		Set<MultiFilterHelper> result = new HashSet<MultiFilterHelper>();
		for (MultiFilterHelper h : loadMultiFilterHelper()) {
			if (h.getNamespaceUri().equals(namespaceURI)) {
				result.add(h);
			}
		}
		return result;
	}

	/**
	 * lädt die Helper
	 * 
	 * @return Set der Helper
	 */
	public static Set<MultiFilterHelper> loadMultiFilterHelper() {
		return castSet(loadHelper(ExtensionPointInfo.MULTIFILTER_EXTENSION_POINT));
	}

	/**
	 * lädt die Helper, gefiltert nach der namespaceUri
	 * 
	 * @param namespaceURI
	 *            nach der gefiltert werden soll
	 * @return Set der gefilterten Helper
	 */
	public static Set<SingleFeatureHelper> loadSingleFeatureHelper(
			String namespaceURI) {
		Set<SingleFeatureHelper> result = new HashSet<SingleFeatureHelper>();
		for (SingleFeatureHelper h : loadSingleFeatureHelper()) {
			if (h.getNamespaceUri().equals(namespaceURI)) {
				result.add(h);
			}
		}
		return result;
	}

	/**
	 * lädt die Helper
	 * 
	 * @return Set der Helper
	 */
	public static Set<SingleFeatureHelper> loadSingleFeatureHelper() {
		return castSet(loadHelper(ExtensionPointInfo.SINGLEFEATURE_EXTENSION_POINT));
	}

	/**
	 * lädt die Helper, gefiltert nach der namespaceUri
	 * 
	 * @param namespaceURI
	 *            nach der gefiltert werden soll
	 * @return Set der gefilterten Helper
	 */
	public static Set<MultiFeatureHelper> loadMultiFeatureHelper(
			String namespaceURI) {
		Set<MultiFeatureHelper> result = new HashSet<MultiFeatureHelper>();
		for (MultiFeatureHelper h : loadMultiFeatureHelper()) {
			if (h.getNamespaceUri().equals(namespaceURI)) {
				result.add(h);
			}
		}
		return result;
	}

	/**
	 * lädt die Helper
	 * 
	 * @return Set der Helper
	 */
	public static Set<MultiFeatureHelper> loadMultiFeatureHelper() {
		return castSet(loadHelper(ExtensionPointInfo.MULTIFEATURE_EXTENSION_POINT));
	}

	/**
	 * Lädt anhand des Extension Points die entsprechenden Helper
	 * 
	 * @param extensionPoint
	 *            zu durchszuchender Extension Point
	 * @return Helper
	 */
	private static Set<Helper> loadHelper(String extensionPoint) {
		Set<Helper> result = new HashSet<Helper>();
		IConfigurationElement[] helper = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(extensionPoint);
		for (IConfigurationElement e : helper) {
			try {

				Helper h = createHelper(e);
				if (null != h)
					result.add(h);

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * Erstellt anhand des e-Elementes den entsprechenden Helper
	 * 
	 * @param e
	 *            IConfigurableElement
	 * @return Helper
	 */
	private static Helper createHelper(IConfigurationElement e) {
		if (e.getName().equals(ExtensionPointInfo.SINGLEFEATURE)) {
			return createSingleFeatureHelper(e);
		}
		if (e.getName().equals(ExtensionPointInfo.MULTIFEATURE)) {
			return createMultiFeatureHelper(e);
		}
		if (e.getName().equals(ExtensionPointInfo.SINGLEFILTER)) {
			return createSingleFilterHelper(e);
		}
		if (e.getName().equals(ExtensionPointInfo.MULTIFILTER)) {
			return createMultiFilterHelper(e);
		}
		return null;
	}

	/**
	 * Casted ein Set
	 * 
	 * @param <E>
	 * @param set
	 * @return
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static <E> Set<E> castSet(Set set) {
		Set<E> result = new HashSet<E>();
		for (Object o : set) {
			try {
				result.add((E) o);
			} catch (Exception e) {
			}
		}
		return result;
	}

	/**
	 * Erstellt einen Helper
	 * 
	 * @param e
	 *            IConfigurableElement
	 * @return Helper
	 */
	private static SingleFilterHelper createSingleFilterHelper(
			IConfigurationElement e) {
		SingleFilterHelper helper = null;
		try {
			ComrelFactory factory = ComrelFactory.eINSTANCE;
			ISingleFilterHelper i = (ISingleFilterHelper) e
					.createExecutableExtension("class");

			// Helper und Port erstellen
			MultiInputPort inPort = factory.createMultiInputPort();
			SingleOutputPort outPort = factory.createSingleOutputPort();
			helper = factory.createSingleFilterHelper();

			// Helper und Ports configurieren
			helper = configureHelperUnit(helper, e);
			inPort = configurePort(inPort, i.getInputPort());
			outPort = configurePort(outPort, i.getOutputPort());
			helper.setInputPort(inPort);
			helper.setOutputPort(outPort);

			return helper;
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Erstellt einen Helper
	 * 
	 * @param e
	 *            IConfigurableElement
	 * @return Helper
	 */
	private static MultiFilterHelper createMultiFilterHelper(
			IConfigurationElement e) {
		MultiFilterHelper helper = null;
		try {
			ComrelFactory factory = ComrelFactory.eINSTANCE;
			IMultiFilterHelper i = (IMultiFilterHelper) e
					.createExecutableExtension("class");

			// Helper und Port erstellen
			MultiInputPort inPort = factory.createMultiInputPort();
			MultiOutputPort outPort = factory.createMultiOutputPort();
			helper = factory.createMultiFilterHelper();

			// Helper und Ports configurieren
			helper = configureHelperUnit(helper, e);
			inPort = configurePort(inPort, i.getInputPort());
			outPort = configurePort(outPort, i.getOutputPort());
			helper.setInputPort(inPort);
			helper.setOutputPort(outPort);

			return helper;
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Erstellt einen Helper
	 * 
	 * @param e
	 *            IConfigurableElement
	 * @return Helper
	 */
	private static SingleFeatureHelper createSingleFeatureHelper(
			IConfigurationElement e) {
		SingleFeatureHelper helper = null;
		try {
			ComrelFactory factory = ComrelFactory.eINSTANCE;
			ISingleFeatureHelper i = (ISingleFeatureHelper) e
					.createExecutableExtension("class");

			// Helper und Port erstellen
			SingleInputPort inPort = factory.createSingleInputPort();
			SingleOutputPort outPort = factory.createSingleOutputPort();
			helper = factory.createSingleFeatureHelper();

			// Helper und Ports configurieren
			helper = configureHelperUnit(helper, e);
			inPort = configurePort(inPort, i.getInputPort());
			outPort = configurePort(outPort, i.getOutputPort());
			helper.setInputPort(inPort);
			helper.setOutputPort(outPort);

			return helper;
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Erstellt einen Helper
	 * 
	 * @param e
	 *            IConfigurableElement
	 * @return Helper
	 */
	private static MultiFeatureHelper createMultiFeatureHelper(
			IConfigurationElement e) {
		MultiFeatureHelper helper = null;
		try {
			ComrelFactory factory = ComrelFactory.eINSTANCE;
			IMultiFeatureHelper i = (IMultiFeatureHelper) e
					.createExecutableExtension("class");

			// Helper und Port erstellen
			SingleInputPort inPort = factory.createSingleInputPort();
			MultiOutputPort outPort = factory.createMultiOutputPort();
			helper = factory.createMultiFeatureHelper();

			// Helper und Ports configurieren
			helper = configureHelperUnit(helper, e);
			inPort = configurePort(inPort, i.getInputPort());
			outPort = configurePort(outPort, i.getOutputPort());
			helper.setInputPort(inPort);
			helper.setOutputPort(outPort);

			return helper;
		} catch (Exception ex) {
			ex.printStackTrace();

		}
		return null;
	}

	/**
	 * Konfiguriert einen Helper
	 * 
	 * @param <H>
	 * @param helper
	 * @param e
	 * @return
	 */
	private static <H extends Helper> H configureHelperUnit(H helper,
			IConfigurationElement e) {
		String id = e.getAttribute("id");
		String name = e.getAttribute("name");
		String namespaceUri = e.getAttribute("namespaceUri");
		helper.setHelperId(id);
		helper.setName(name);
		helper.setNamespaceUri(namespaceUri);
		return helper;
	}

	/**
	 * Konfiguriert einen Port
	 * 
	 * @param <P>
	 * @param configurablePort
	 *            der zu konfigurierende Port
	 * @param originalPort
	 *            der originalPort
	 * @return configurierter Port
	 */
	@SuppressWarnings("rawtypes")
	private static <P extends Port> P configurePort(P configurablePort,
			Port originalPort) {
		String name = originalPort.getName();
		Class type = originalPort.getType();
		String description = originalPort.getDescription();
		configurablePort.setName(name);
		configurablePort.setType(type);
		configurablePort.setDescription(description);
		return configurablePort;
	}

	/**
	 * Liefert alle EmfRefactorings
	 * @return
	 */
	public static Collection<ModelRefactoring> getEmfRefactoringsAsModelRefactorings() {
		return getEmfRefactoringsAsModelRefactorings("");
	}

	/**
	 * Liefert alle ModelRefactorings useses EmfRefactor-ExtensionPoint
	 */
	@SuppressWarnings("rawtypes")
	public static Collection<ModelRefactoring> getEmfRefactoringsAsModelRefactorings(
			String namespaceURI) {
		ComrelFactory comrelFactory = ComrelFactory.eINSTANCE;
//			(ComrelFactory) EPackage.Registry.INSTANCE
//				.getEFactory("comrel");
		List<Refactoring> refactorings = RefactoringManager.getAllRefactorings();
		Map<String, ModelRefactoring> atomics = new HashMap<String, ModelRefactoring>();
		ModelRefactoring atomic;
		Set<org.eclipse.emf.refactor.refactoring.core.Port> ports;
		SingleInputPort inputPort;
		if (namespaceURI == null) {
			namespaceURI = "";
		}
		for (Refactoring ref : refactorings) {
			// getInitialConditions(ref);
			if (namespaceURI.equals("")
					|| namespaceURI.equals(ref.getNamespaceUri())) {
				atomic = comrelFactory.createModelRefactoring(ref.getId());
				atomic.setName(ref.getName());
				atomic.setLabel(ref.getName());
				atomic.setNamespaceUri(ref.getNamespaceUri());
				ports = ref.getController().getDataManagementObject()
						.getInPorts();
				for (org.eclipse.emf.refactor.refactoring.core.Port p : ports) {
					inputPort = comrelFactory.createSingleInputPort();
					inputPort.setName(p.getName());
					inputPort.setType(p.getType());
					inputPort.setDescription(p.getDescription());

					atomic.getInputPorts().add(inputPort);
				}

				atomics.put(ref.getId(), atomic);
			}
		}
		return atomics.values();
	}

	/**
	 * Liefert alle NamespaceUris, gesammelt aus den emfRefactorings
	 * 
	 * @return namspaceUris
	 */
	public static Set<String> getNamepsaceURIS() {
		TreeSet<String> result = new TreeSet<String>();
		for (ModelRefactoring ref : RegistryUtil.getEmfRefactoringsAsModelRefactorings()) {
			result.add(ref.getNamespaceUri());
		}
		return result;
	}

}
