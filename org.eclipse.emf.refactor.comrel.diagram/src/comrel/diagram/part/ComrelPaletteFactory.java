/*
 * 
 */
package comrel.diagram.part;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import comrel.ModelRefactoring;
import comrel.MultiFeatureHelper;
import comrel.MultiFilterHelper;
import comrel.SingleFeatureHelper;
import comrel.SingleFilterHelper;
import comrel.diagram.part.custom.ToolEntryComparator;
import comrel.diagram.part.custom.UnspecifiedTypeCreationToolWithUnitId;
import comrel.diagram.providers.ComrelElementTypes;
import comrel.impl.CompositeRefactoringImpl;
import comrel.util.ComrelUtil;
import comrel.util.RegistryUtil;

/**
 * @generated
 */
public class ComrelPaletteFactory {

	public static final String UNIT_ID = "UNIT_ID";

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createCompositeUnits1Group());
		paletteRoot.add(createAtomicUnits2Group());
		paletteRoot.add(createFilterUnits3Group());
		paletteRoot.add(createFeatureUnits4Group());
		paletteRoot.add(createPorts5Group());
		paletteRoot.add(createMappings6Group());
	}

	/**
	 * Erstellt alle nötigen Tooleinträge für alle verfügbaren AtomicUNits
	 * 
	 * @return
	 */
	private EList<ToolEntry> createAtomicUnits() {
		EList<ToolEntry> erg = new BasicEList<ToolEntry>();
		Collection<ModelRefactoring> refactorings = RegistryUtil
				.getEmfRefactoringsAsModelRefactorings(CompositeRefactoringImpl.nsUri);
		refactorings = ComrelUtil.sortAtomicRefactorings(refactorings);
		List<IElementType> types;
		for (ModelRefactoring ref : refactorings) {
			if (ref.getNamespaceUri().equals(CompositeRefactoringImpl.nsUri)) {
				types = new ArrayList<IElementType>(7); //(3) ???
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_2007);
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_3034);
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_3049);
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_3068);
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_3074);
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_3077);
				types.add(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_3078);

				NodeToolEntry entry = new NodeToolEntry(ref.getName(),
						ref.getName(), types);
				entry.setUnitId(ref.getRefId());
				entry.setId(ref.getRefId()); //$NON-NLS-1$
				entry.setSmallIcon(comrel.diagram.providers.ComrelElementTypes
						.getImageDescriptor(comrel.diagram.providers.ComrelElementTypes.AtomicUnit_2007));
				entry.setLargeIcon(entry.getSmallIcon());
				erg.add(entry);
			}
		}

		return erg;
	}

	/**
	 * Erstellt alle nötigen Tooleinträge für alle verfügbaren FilterUnits
	 * 
	 * @return
	 */
	private EList<ToolEntry> createSingleFilterUnits() {
		EList<ToolEntry> erg = new BasicEList<ToolEntry>();

		Set<SingleFilterHelper> helper = RegistryUtil
				.loadSingleFilterHelper(CompositeRefactoringImpl.nsUri);
		List<IElementType> types;
		NodeToolEntry entry;
		for (SingleFilterHelper filter : helper) {
			types = new ArrayList<IElementType>(5); //(1)???
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFilterUnit_3016);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFilterUnit_3040);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFilterUnit_3052);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFilterUnit_3057);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFilterUnit_3063);

			entry = new NodeToolEntry(filter.getName(), filter.getName(), types);
			entry.setUnitId(filter.getHelperId());
			entry.setId(filter.getHelperId()); //$NON-NLS-1$
			entry.setSmallIcon(comrel.diagram.providers.ComrelElementTypes
					.getImageDescriptor(comrel.diagram.providers.ComrelElementTypes.SingleFilterUnit_3016));
			entry.setLargeIcon(entry.getSmallIcon());
			erg.add(entry);

		}

		return erg;
	}

	/**
	 * Erstellt alle nötigen Tooleinträge für alle verfügbaren FilterUnits
	 * 
	 * @return
	 */
	private EList<ToolEntry> createMultiFilterUnits() {
		EList<ToolEntry> erg = new BasicEList<ToolEntry>();

		Set<MultiFilterHelper> helper = RegistryUtil
				.loadMultiFilterHelper(CompositeRefactoringImpl.nsUri);
		List<IElementType> types;
		NodeToolEntry entry;
		for (MultiFilterHelper filter : helper) {
			types = new ArrayList<IElementType>(5); //(1)???
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFilterUnit_3019);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFilterUnit_3041);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFilterUnit_3053);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFilterUnit_3058);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFilterUnit_3064);

			entry = new NodeToolEntry(filter.getName(), filter.getName(), types);
			entry.setUnitId(filter.getHelperId());
			entry.setId(filter.getHelperId()); //$NON-NLS-1$
			entry.setSmallIcon(comrel.diagram.providers.ComrelElementTypes
					.getImageDescriptor(comrel.diagram.providers.ComrelElementTypes.MultiFilterUnit_3019));
			entry.setLargeIcon(entry.getSmallIcon());
			erg.add(entry);

		}

		return erg;
	}

	/**
	 * Erstellt alle nötigen Tooleinträge für alle verfügbaren
	 * SingleFeatureUnits
	 * 
	 * @return
	 */
	private EList<ToolEntry> createSingleFeatureUnits() {
		EList<ToolEntry> erg = new BasicEList<ToolEntry>();
		Set<SingleFeatureHelper> helper = RegistryUtil
				.loadSingleFeatureHelper(CompositeRefactoringImpl.nsUri);
		List<IElementType> types;
		NodeToolEntry entry;

		for (SingleFeatureHelper singleFeature : helper) {
			types = new ArrayList<IElementType>(5); // (1) ???
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(comrel.diagram.providers.ComrelElementTypes.SingleFeatureUnit_3061);

			entry = new NodeToolEntry(singleFeature.getName(),
					singleFeature.getName(), types);
			entry.setUnitId(singleFeature.getHelperId());
			entry.setId(singleFeature.getHelperId()); //$NON-NLS-1$
			entry.setSmallIcon(comrel.diagram.providers.ComrelElementTypes
					.getImageDescriptor(comrel.diagram.providers.ComrelElementTypes.SingleFeatureUnit_3008));
			entry.setLargeIcon(entry.getSmallIcon());
			erg.add(entry);

		}

		return erg;
	}

	/**
	 * Erstellt alle nötigen Tooleinträge für alle verfügbaren MultiFeatureUnits
	 * 
	 * @return
	 */
	private EList<ToolEntry> createMultiFeatureUnits() {
		EList<ToolEntry> erg = new BasicEList<ToolEntry>();
		Set<MultiFeatureHelper> helper = RegistryUtil
				.loadMultiFeatureHelper(CompositeRefactoringImpl.nsUri);
		List<IElementType> types;
		NodeToolEntry entry;

		for (MultiFeatureHelper multiFeature : helper) {

			types = new ArrayList<IElementType>(5); //(1) ???
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(comrel.diagram.providers.ComrelElementTypes.MultiFeatureUnit_3062);

			entry = new NodeToolEntry(multiFeature.getName(),
					multiFeature.getName(), types);
			entry.setUnitId(multiFeature.getHelperId());
			entry.setId(multiFeature.getHelperId()); //$NON-NLS-1$
			entry.setSmallIcon(comrel.diagram.providers.ComrelElementTypes
					.getImageDescriptor(comrel.diagram.providers.ComrelElementTypes.MultiFeatureUnit_3012));
			entry.setLargeIcon(entry.getSmallIcon());
			erg.add(entry);

		}

		return erg;
	}

	/**
	 * Creates "Composite Units" palette tool group
	 * @generated
	 */
	private PaletteContainer createCompositeUnits1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.CompositeUnits1Group_title);
		paletteContainer.setId("createCompositeUnits1Group"); //$NON-NLS-1$
		paletteContainer.add(createCartesianQueuedUnit1CreationTool());
		paletteContainer.add(createConditionCheck2CreationTool());
		paletteContainer.add(createConditionalUnit3CreationTool());
		paletteContainer.add(createParallelQueuedUnit4CreationTool());
		paletteContainer.add(createSequentialUnit5CreationTool());
		paletteContainer.add(createSingleQueuedUnit6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Atomic Units" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createAtomicUnits2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.AtomicUnits2Group_title);
		paletteContainer.setId("createAtomicUnits2Group"); //$NON-NLS-1$
		paletteContainer.addAll(this.createAtomicUnits());
		return paletteContainer;
	}

	/**
	 * Creates "Filter Units" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createFilterUnits3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.FilterUnits3Group_title);
		paletteContainer.setId("createFilterUnits3Group"); //$NON-NLS-1$
		ArrayList<ToolEntry> result = new ArrayList<ToolEntry>();
		result.addAll(createSingleFilterUnits());
		result.addAll(createMultiFilterUnits());
		Collections.sort(result, new ToolEntryComparator());
		paletteContainer.addAll(result);
		return paletteContainer;
	}

	/**
	 * Creates "Feature Units" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createFeatureUnits4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.FeatureUnits4Group_title);
		paletteContainer.setId("createFeatureUnits4Group"); //$NON-NLS-1$
		ArrayList<ToolEntry> result = new ArrayList<ToolEntry>();
		result.addAll(createSingleFeatureUnits());
		result.addAll(createMultiFeatureUnits());
		Collections.sort(result, new ToolEntryComparator());
		paletteContainer.addAll(result);
		return paletteContainer;
	}

	/**
	 * Creates "Ports" palette tool group
	 * @generated NOT
	 */
	private PaletteContainer createPorts5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Ports5Group_title);
		paletteContainer.setId("createPorts5Group"); //$NON-NLS-1$
		paletteContainer.add(createMultiInputPort1CreationTool());
		// paletteContainer.add(createMultiOutputPort2CreationTool());
		paletteContainer.add(createSingleInputPort3CreationTool());
		// paletteContainer.add(createSingleOutputPort4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Mappings" palette tool group
	 * @generated
	 */
	private PaletteContainer createMappings6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				Messages.Mappings6Group_title);
		paletteContainer.setId("createMappings6Group"); //$NON-NLS-1$
		paletteContainer.add(createMultiPortMapping1CreationTool());
		paletteContainer.add(createMultiSinglePortMapping2CreationTool());
		paletteContainer.add(createSinglePortMapping3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCartesianQueuedUnit1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComrelElementTypes.CartesianQueuedUnit_2002);
		types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
		types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
		types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
		types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
		types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
		types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.CartesianQueuedUnit1CreationTool_title,
				Messages.CartesianQueuedUnit1CreationTool_desc, types);
		entry.setId("createCartesianQueuedUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.CartesianQueuedUnit_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionCheck2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConditionCheck2CreationTool_title,
				Messages.ConditionCheck2CreationTool_desc,
				Collections
						.singletonList(ComrelElementTypes.ConditionCheck_3076));
		entry.setId("createConditionCheck2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.ConditionCheck_3076));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConditionalUnit3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComrelElementTypes.ConditionalUnit_3030);
		types.add(ComrelElementTypes.ConditionalUnit_3046);
		types.add(ComrelElementTypes.ConditionalUnit_3066);
		types.add(ComrelElementTypes.ConditionalUnit_3071);
		types.add(ComrelElementTypes.ConditionalUnit_3072);
		types.add(ComrelElementTypes.ConditionalUnit_3075);
		types.add(ComrelElementTypes.ConditionalUnit_2006);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConditionalUnit3CreationTool_title,
				Messages.ConditionalUnit3CreationTool_desc, types);
		entry.setId("createConditionalUnit3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.ConditionalUnit_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParallelQueuedUnit4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
		types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
		types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
		types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
		types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
		types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
		types.add(ComrelElementTypes.ParallelQueuedUnit_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ParallelQueuedUnit4CreationTool_title,
				Messages.ParallelQueuedUnit4CreationTool_desc, types);
		entry.setId("createParallelQueuedUnit4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.ParallelQueuedUnit_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSequentialUnit5CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComrelElementTypes.SequentialUnit_3026);
		types.add(ComrelElementTypes.SequentialUnit_3044);
		types.add(ComrelElementTypes.SequentialUnit_3060);
		types.add(ComrelElementTypes.SequentialUnit_3069);
		types.add(ComrelElementTypes.SequentialUnit_3070);
		types.add(ComrelElementTypes.SequentialUnit_3073);
		types.add(ComrelElementTypes.SequentialUnit_2005);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SequentialUnit5CreationTool_title,
				Messages.SequentialUnit5CreationTool_desc, types);
		entry.setId("createSequentialUnit5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SequentialUnit_3026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleQueuedUnit6CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComrelElementTypes.SingleQueuedUnit_3022);
		types.add(ComrelElementTypes.SingleQueuedUnit_3042);
		types.add(ComrelElementTypes.SingleQueuedUnit_3054);
		types.add(ComrelElementTypes.SingleQueuedUnit_3059);
		types.add(ComrelElementTypes.SingleQueuedUnit_3065);
		types.add(ComrelElementTypes.SingleQueuedUnit_3067);
		types.add(ComrelElementTypes.SingleQueuedUnit_2004);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleQueuedUnit6CreationTool_title,
				Messages.SingleQueuedUnit6CreationTool_desc, types);
		entry.setId("createSingleQueuedUnit6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SingleQueuedUnit_3022));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAtomicUnit1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(7);
		types.add(ComrelElementTypes.AtomicUnit_3034);
		types.add(ComrelElementTypes.AtomicUnit_3049);
		types.add(ComrelElementTypes.AtomicUnit_3068);
		types.add(ComrelElementTypes.AtomicUnit_3074);
		types.add(ComrelElementTypes.AtomicUnit_3077);
		types.add(ComrelElementTypes.AtomicUnit_3078);
		types.add(ComrelElementTypes.AtomicUnit_2007);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.AtomicUnit1CreationTool_title,
				Messages.AtomicUnit1CreationTool_desc, types);
		entry.setId("createAtomicUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.AtomicUnit_3034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiFilterUnit1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ComrelElementTypes.MultiFilterUnit_3019);
		types.add(ComrelElementTypes.MultiFilterUnit_3041);
		types.add(ComrelElementTypes.MultiFilterUnit_3053);
		types.add(ComrelElementTypes.MultiFilterUnit_3058);
		types.add(ComrelElementTypes.MultiFilterUnit_3064);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiFilterUnit1CreationTool_title,
				Messages.MultiFilterUnit1CreationTool_desc, types);
		entry.setId("createMultiFilterUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.MultiFilterUnit_3019));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleFilterUnit2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ComrelElementTypes.SingleFilterUnit_3016);
		types.add(ComrelElementTypes.SingleFilterUnit_3040);
		types.add(ComrelElementTypes.SingleFilterUnit_3052);
		types.add(ComrelElementTypes.SingleFilterUnit_3057);
		types.add(ComrelElementTypes.SingleFilterUnit_3063);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleFilterUnit2CreationTool_title,
				Messages.SingleFilterUnit2CreationTool_desc, types);
		entry.setId("createSingleFilterUnit2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SingleFilterUnit_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiFeatureUnit1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ComrelElementTypes.MultiFeatureUnit_3012);
		types.add(ComrelElementTypes.MultiFeatureUnit_3039);
		types.add(ComrelElementTypes.MultiFeatureUnit_3051);
		types.add(ComrelElementTypes.MultiFeatureUnit_3056);
		types.add(ComrelElementTypes.MultiFeatureUnit_3062);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiFeatureUnit1CreationTool_title,
				Messages.MultiFeatureUnit1CreationTool_desc, types);
		entry.setId("createMultiFeatureUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.MultiFeatureUnit_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleFeatureUnit2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(ComrelElementTypes.SingleFeatureUnit_3008);
		types.add(ComrelElementTypes.SingleFeatureUnit_3038);
		types.add(ComrelElementTypes.SingleFeatureUnit_3050);
		types.add(ComrelElementTypes.SingleFeatureUnit_3055);
		types.add(ComrelElementTypes.SingleFeatureUnit_3061);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleFeatureUnit2CreationTool_title,
				Messages.SingleFeatureUnit2CreationTool_desc, types);
		entry.setId("createSingleFeatureUnit2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SingleFeatureUnit_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiInputPort1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(ComrelElementTypes.MultiInputPort_3002);
		types.add(ComrelElementTypes.MultiInputPort_3006);
		types.add(ComrelElementTypes.MultiInputPort_3010);
		types.add(ComrelElementTypes.MultiInputPort_3014);
		types.add(ComrelElementTypes.MultiInputPort_3017);
		types.add(ComrelElementTypes.MultiInputPort_3020);
		types.add(ComrelElementTypes.MultiInputPort_3024);
		types.add(ComrelElementTypes.MultiInputPort_3028);
		types.add(ComrelElementTypes.MultiInputPort_3032);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiInputPort1CreationTool_title,
				Messages.MultiInputPort1CreationTool_desc, types);
		entry.setId("createMultiInputPort1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.MultiInputPort_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiOutputPort2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComrelElementTypes.MultiOutputPort_3015);
		types.add(ComrelElementTypes.MultiOutputPort_3021);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.MultiOutputPort2CreationTool_title,
				Messages.MultiOutputPort2CreationTool_desc, types);
		entry.setId("createMultiOutputPort2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.MultiOutputPort_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleInputPort3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(9);
		types.add(ComrelElementTypes.SingleInputPort_2001);
		types.add(ComrelElementTypes.SingleInputPort_3001);
		types.add(ComrelElementTypes.SingleInputPort_3005);
		types.add(ComrelElementTypes.SingleInputPort_3009);
		types.add(ComrelElementTypes.SingleInputPort_3013);
		types.add(ComrelElementTypes.SingleInputPort_3023);
		types.add(ComrelElementTypes.SingleInputPort_3027);
		types.add(ComrelElementTypes.SingleInputPort_3031);
		types.add(ComrelElementTypes.SingleInputPort_3035);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleInputPort3CreationTool_title,
				Messages.SingleInputPort3CreationTool_desc, types);
		entry.setId("createSingleInputPort3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SingleInputPort_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSingleOutputPort4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(ComrelElementTypes.SingleOutputPort_3011);
		types.add(ComrelElementTypes.SingleOutputPort_3018);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SingleOutputPort4CreationTool_title,
				Messages.SingleOutputPort4CreationTool_desc, types);
		entry.setId("createSingleOutputPort4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SingleOutputPort_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiPortMapping1CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MultiPortMapping1CreationTool_title,
				Messages.MultiPortMapping1CreationTool_desc,
				Collections
						.singletonList(ComrelElementTypes.MultiPortMapping_4002));
		entry.setId("createMultiPortMapping1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.MultiPortMapping_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMultiSinglePortMapping2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MultiSinglePortMapping2CreationTool_title,
				Messages.MultiSinglePortMapping2CreationTool_desc,
				Collections
						.singletonList(ComrelElementTypes.MultiSinglePortMapping_4003));
		entry.setId("createMultiSinglePortMapping2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.MultiSinglePortMapping_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSinglePortMapping3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SinglePortMapping3CreationTool_title,
				Messages.SinglePortMapping3CreationTool_desc,
				Collections
						.singletonList(ComrelElementTypes.SinglePortMapping_4001));
		entry.setId("createSinglePortMapping3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ComrelElementTypes
				.getImageDescriptor(ComrelElementTypes.SinglePortMapping_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		String unitId = "";

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			/*
			 * change: UnspecifiedTypeCReateionTool ->
			 * UnspecifiedTypeCreationToolWithUnitId
			 */
			UnspecifiedTypeCreationTool tool = new UnspecifiedTypeCreationToolWithUnitId(
					elementTypes, unitId);
			Map prop = getToolProperties();
			tool.setProperties(prop);
			return tool;
		}

		public void setUnitId(String unitId) {
			this.unitId = unitId;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
