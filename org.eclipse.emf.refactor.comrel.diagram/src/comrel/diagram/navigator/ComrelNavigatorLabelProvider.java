/*
 * 
 */
package comrel.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import comrel.CompositeRefactoring;
import comrel.diagram.edit.parts.*;
import comrel.diagram.part.ComrelDiagramEditorPlugin;
import comrel.diagram.part.ComrelVisualIDRegistry;
import comrel.diagram.providers.ComrelElementTypes;
import comrel.diagram.providers.ComrelParserProvider;

/**
 * @generated
 */
public class ComrelNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ComrelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ComrelDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ComrelNavigatorItem
				&& !isOwnView(((ComrelNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ComrelNavigatorGroup) {
			ComrelNavigatorGroup group = (ComrelNavigatorGroup) element;
			return ComrelDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof ComrelNavigatorItem) {
			ComrelNavigatorItem navigatorItem = (ComrelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ComrelVisualIDRegistry.getVisualID(view)) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://comrel/0.1?CompositeRefactoring", ComrelElementTypes.CompositeRefactoring_1000); //$NON-NLS-1$
		case ConditionCheckEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionCheck", ComrelElementTypes.ConditionCheck_3076); //$NON-NLS-1$
		case SingleInputPort4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3009); //$NON-NLS-1$
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_3033); //$NON-NLS-1$
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_2002); //$NON-NLS-1$
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_3025); //$NON-NLS-1$
		case AtomicUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_3068); //$NON-NLS-1$
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_3048); //$NON-NLS-1$
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_3059); //$NON-NLS-1$
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFilterUnit", ComrelElementTypes.MultiFilterUnit_3053); //$NON-NLS-1$
		case SinglePortMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://comrel/0.1?SinglePortMapping", ComrelElementTypes.SinglePortMapping_4001); //$NON-NLS-1$
		case SequentialUnit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_3073); //$NON-NLS-1$
		case ConditionalUnit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_3072); //$NON-NLS-1$
		case AtomicUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_2007); //$NON-NLS-1$
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFeatureUnit", ComrelElementTypes.MultiFeatureUnit_3062); //$NON-NLS-1$
		case ConditionalUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_3046); //$NON-NLS-1$
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFeatureUnit", ComrelElementTypes.SingleFeatureUnit_3008); //$NON-NLS-1$
		case AtomicUnit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_3077); //$NON-NLS-1$
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFeatureUnit", ComrelElementTypes.MultiFeatureUnit_3039); //$NON-NLS-1$
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_3029); //$NON-NLS-1$
		case ConditionalUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_3030); //$NON-NLS-1$
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFeatureUnit", ComrelElementTypes.SingleFeatureUnit_3055); //$NON-NLS-1$
		case SequentialUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_3069); //$NON-NLS-1$
		case AtomicUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_3034); //$NON-NLS-1$
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFeatureUnit", ComrelElementTypes.MultiFeatureUnit_3012); //$NON-NLS-1$
		case SingleInputPort8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3031); //$NON-NLS-1$
		case SingleInputPort5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3013); //$NON-NLS-1$
		case MultiFilterUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFilterUnit", ComrelElementTypes.MultiFilterUnit_3019); //$NON-NLS-1$
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_3007); //$NON-NLS-1$
		case MultiInputPort4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3014); //$NON-NLS-1$
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_3036); //$NON-NLS-1$
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFeatureUnit", ComrelElementTypes.SingleFeatureUnit_3038); //$NON-NLS-1$
		case MultiInputPort9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3032); //$NON-NLS-1$
		case MultiInputPort7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3024); //$NON-NLS-1$
		case ConditionalUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_3066); //$NON-NLS-1$
		case SequentialUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_3060); //$NON-NLS-1$
		case SingleInputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3001); //$NON-NLS-1$
		case SingleInputPort9EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3035); //$NON-NLS-1$
		case MultiInputPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3010); //$NON-NLS-1$
		case ConditionalUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_2006); //$NON-NLS-1$
		case SingleFilterUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFilterUnit", ComrelElementTypes.SingleFilterUnit_3016); //$NON-NLS-1$
		case SingleOutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleOutputPort", ComrelElementTypes.SingleOutputPort_3011); //$NON-NLS-1$
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFilterUnit", ComrelElementTypes.MultiFilterUnit_3058); //$NON-NLS-1$
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFeatureUnit", ComrelElementTypes.SingleFeatureUnit_3061); //$NON-NLS-1$
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFilterUnit", ComrelElementTypes.MultiFilterUnit_3064); //$NON-NLS-1$
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFeatureUnit", ComrelElementTypes.SingleFeatureUnit_3050); //$NON-NLS-1$
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_3054); //$NON-NLS-1$
		case SequentialUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_3044); //$NON-NLS-1$
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_3065); //$NON-NLS-1$
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_3042); //$NON-NLS-1$
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFilterUnit", ComrelElementTypes.SingleFilterUnit_3063); //$NON-NLS-1$
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFilterUnit", ComrelElementTypes.SingleFilterUnit_3057); //$NON-NLS-1$
		case SequentialUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_2005); //$NON-NLS-1$
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_3004); //$NON-NLS-1$
		case MultiInputPort8EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3028); //$NON-NLS-1$
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_2004); //$NON-NLS-1$
		case MultiInputPort5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3017); //$NON-NLS-1$
		case SingleInputPort3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3005); //$NON-NLS-1$
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_3022); //$NON-NLS-1$
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_3047); //$NON-NLS-1$
		case AtomicUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_3049); //$NON-NLS-1$
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_3043); //$NON-NLS-1$
		case MultiInputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3002); //$NON-NLS-1$
		case SequentialUnit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_3070); //$NON-NLS-1$
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFeatureUnit", ComrelElementTypes.MultiFeatureUnit_3056); //$NON-NLS-1$
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFilterUnit", ComrelElementTypes.SingleFilterUnit_3040); //$NON-NLS-1$
		case SingleInputPort6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3023); //$NON-NLS-1$
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?CartesianQueuedUnit", ComrelElementTypes.CartesianQueuedUnit_3003); //$NON-NLS-1$
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_3045); //$NON-NLS-1$
		case SingleInputPort7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_3027); //$NON-NLS-1$
		case MultiInputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3006); //$NON-NLS-1$
		case SingleInputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?SingleInputPort", ComrelElementTypes.SingleInputPort_2001); //$NON-NLS-1$
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFilterUnit", ComrelElementTypes.MultiFilterUnit_3041); //$NON-NLS-1$
		case SequentialUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SequentialUnit", ComrelElementTypes.SequentialUnit_3026); //$NON-NLS-1$
		case ConditionalUnit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_3075); //$NON-NLS-1$
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleFilterUnit", ComrelElementTypes.SingleFilterUnit_3052); //$NON-NLS-1$
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiFeatureUnit", ComrelElementTypes.MultiFeatureUnit_3051); //$NON-NLS-1$
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_2003); //$NON-NLS-1$
		case MultiOutputPortEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiOutputPort", ComrelElementTypes.MultiOutputPort_3015); //$NON-NLS-1$
		case AtomicUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_3074); //$NON-NLS-1$
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ParallelQueuedUnit", ComrelElementTypes.ParallelQueuedUnit_3037); //$NON-NLS-1$
		case MultiPortMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://comrel/0.1?MultiPortMapping", ComrelElementTypes.MultiPortMapping_4002); //$NON-NLS-1$
		case MultiInputPort6EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiInputPort", ComrelElementTypes.MultiInputPort_3020); //$NON-NLS-1$
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://comrel/0.1?MultiSinglePortMapping", ComrelElementTypes.MultiSinglePortMapping_4003); //$NON-NLS-1$
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleQueuedUnit", ComrelElementTypes.SingleQueuedUnit_3067); //$NON-NLS-1$
		case SingleOutputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?SingleOutputPort", ComrelElementTypes.SingleOutputPort_3018); //$NON-NLS-1$
		case ConditionalUnit5EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?ConditionalUnit", ComrelElementTypes.ConditionalUnit_3071); //$NON-NLS-1$
		case MultiOutputPort2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?MultiOutputPort", ComrelElementTypes.MultiOutputPort_3021); //$NON-NLS-1$
		case AtomicUnit7EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://comrel/0.1?AtomicUnit", ComrelElementTypes.AtomicUnit_3078); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ComrelDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ComrelElementTypes.isKnownElementType(elementType)) {
			image = ComrelElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ComrelNavigatorGroup) {
			ComrelNavigatorGroup group = (ComrelNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ComrelNavigatorItem) {
			ComrelNavigatorItem navigatorItem = (ComrelNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ComrelVisualIDRegistry.getVisualID(view)) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			return getCompositeRefactoring_1000Text(view);
		case ConditionCheckEditPart.VISUAL_ID:
			return getConditionCheck_3076Text(view);
		case SingleInputPort4EditPart.VISUAL_ID:
			return getSingleInputPort_3009Text(view);
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3033Text(view);
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return getCartesianQueuedUnit_2002Text(view);
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3025Text(view);
		case AtomicUnit4EditPart.VISUAL_ID:
			return getAtomicUnit_3068Text(view);
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3048Text(view);
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3059Text(view);
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return getMultiFilterUnit_3053Text(view);
		case SinglePortMappingEditPart.VISUAL_ID:
			return getSinglePortMapping_4001Text(view);
		case SequentialUnit7EditPart.VISUAL_ID:
			return getSequentialUnit_3073Text(view);
		case ConditionalUnit6EditPart.VISUAL_ID:
			return getConditionalUnit_3072Text(view);
		case AtomicUnitEditPart.VISUAL_ID:
			return getAtomicUnit_2007Text(view);
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3062Text(view);
		case ConditionalUnit3EditPart.VISUAL_ID:
			return getConditionalUnit_3046Text(view);
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return getSingleFeatureUnit_3008Text(view);
		case AtomicUnit6EditPart.VISUAL_ID:
			return getAtomicUnit_3077Text(view);
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3039Text(view);
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3029Text(view);
		case ConditionalUnit2EditPart.VISUAL_ID:
			return getConditionalUnit_3030Text(view);
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3055Text(view);
		case SequentialUnit5EditPart.VISUAL_ID:
			return getSequentialUnit_3069Text(view);
		case AtomicUnit2EditPart.VISUAL_ID:
			return getAtomicUnit_3034Text(view);
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return getMultiFeatureUnit_3012Text(view);
		case SingleInputPort8EditPart.VISUAL_ID:
			return getSingleInputPort_3031Text(view);
		case SingleInputPort5EditPart.VISUAL_ID:
			return getSingleInputPort_3013Text(view);
		case MultiFilterUnitEditPart.VISUAL_ID:
			return getMultiFilterUnit_3019Text(view);
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3007Text(view);
		case MultiInputPort4EditPart.VISUAL_ID:
			return getMultiInputPort_3014Text(view);
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3036Text(view);
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3038Text(view);
		case MultiInputPort9EditPart.VISUAL_ID:
			return getMultiInputPort_3032Text(view);
		case MultiInputPort7EditPart.VISUAL_ID:
			return getMultiInputPort_3024Text(view);
		case ConditionalUnit4EditPart.VISUAL_ID:
			return getConditionalUnit_3066Text(view);
		case SequentialUnit4EditPart.VISUAL_ID:
			return getSequentialUnit_3060Text(view);
		case SingleInputPort2EditPart.VISUAL_ID:
			return getSingleInputPort_3001Text(view);
		case SingleInputPort9EditPart.VISUAL_ID:
			return getSingleInputPort_3035Text(view);
		case MultiInputPort3EditPart.VISUAL_ID:
			return getMultiInputPort_3010Text(view);
		case ConditionalUnitEditPart.VISUAL_ID:
			return getConditionalUnit_2006Text(view);
		case SingleFilterUnitEditPart.VISUAL_ID:
			return getSingleFilterUnit_3016Text(view);
		case SingleOutputPortEditPart.VISUAL_ID:
			return getSingleOutputPort_3011Text(view);
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return getMultiFilterUnit_3058Text(view);
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3061Text(view);
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return getMultiFilterUnit_3064Text(view);
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3050Text(view);
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3054Text(view);
		case SequentialUnit3EditPart.VISUAL_ID:
			return getSequentialUnit_3044Text(view);
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3065Text(view);
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3042Text(view);
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return getSingleFilterUnit_3063Text(view);
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return getSingleFilterUnit_3057Text(view);
		case SequentialUnitEditPart.VISUAL_ID:
			return getSequentialUnit_2005Text(view);
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3004Text(view);
		case MultiInputPort8EditPart.VISUAL_ID:
			return getMultiInputPort_3028Text(view);
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return getSingleQueuedUnit_2004Text(view);
		case MultiInputPort5EditPart.VISUAL_ID:
			return getMultiInputPort_3017Text(view);
		case SingleInputPort3EditPart.VISUAL_ID:
			return getSingleInputPort_3005Text(view);
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3022Text(view);
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3047Text(view);
		case AtomicUnit3EditPart.VISUAL_ID:
			return getAtomicUnit_3049Text(view);
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3043Text(view);
		case MultiInputPortEditPart.VISUAL_ID:
			return getMultiInputPort_3002Text(view);
		case SequentialUnit6EditPart.VISUAL_ID:
			return getSequentialUnit_3070Text(view);
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3056Text(view);
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return getSingleFilterUnit_3040Text(view);
		case SingleInputPort6EditPart.VISUAL_ID:
			return getSingleInputPort_3023Text(view);
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3003Text(view);
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3045Text(view);
		case SingleInputPort7EditPart.VISUAL_ID:
			return getSingleInputPort_3027Text(view);
		case MultiInputPort2EditPart.VISUAL_ID:
			return getMultiInputPort_3006Text(view);
		case SingleInputPortEditPart.VISUAL_ID:
			return getSingleInputPort_2001Text(view);
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return getMultiFilterUnit_3041Text(view);
		case SequentialUnit2EditPart.VISUAL_ID:
			return getSequentialUnit_3026Text(view);
		case ConditionalUnit7EditPart.VISUAL_ID:
			return getConditionalUnit_3075Text(view);
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return getSingleFilterUnit_3052Text(view);
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3051Text(view);
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return getParallelQueuedUnit_2003Text(view);
		case MultiOutputPortEditPart.VISUAL_ID:
			return getMultiOutputPort_3015Text(view);
		case AtomicUnit5EditPart.VISUAL_ID:
			return getAtomicUnit_3074Text(view);
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3037Text(view);
		case MultiPortMappingEditPart.VISUAL_ID:
			return getMultiPortMapping_4002Text(view);
		case MultiInputPort6EditPart.VISUAL_ID:
			return getMultiInputPort_3020Text(view);
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return getMultiSinglePortMapping_4003Text(view);
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3067Text(view);
		case SingleOutputPort2EditPart.VISUAL_ID:
			return getSingleOutputPort_3018Text(view);
		case ConditionalUnit5EditPart.VISUAL_ID:
			return getConditionalUnit_3071Text(view);
		case MultiOutputPort2EditPart.VISUAL_ID:
			return getMultiOutputPort_3021Text(view);
		case AtomicUnit7EditPart.VISUAL_ID:
			return getAtomicUnit_3078Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3017Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3017,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5014); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_3075Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_3075,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameType7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5055); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_3059Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_3059,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5063); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_3060Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_3060,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrict4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5062); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_3074Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_3074,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5050); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionCheck_3076Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionCheck_3076,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionCheckNameTypeSpecEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5052); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFilterUnit_3052Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFilterUnit_3052,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFilterUnitNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5038); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_3066Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_3066,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5060); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3035Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3035,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5026); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFilterUnit_3016Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFilterUnit_3016,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFilterUnitNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFilterUnit_3058Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFilterUnit_3058,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFilterUnitNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5043); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3032Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3032,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType9EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5025); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_3067Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_3067,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5049); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_3073Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_3073,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrict7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5051); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_3034Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_3034,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5027); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFeatureUnit_3056Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFeatureUnit_3056,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFeatureUnitNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5041); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFilterUnit_3041Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFilterUnit_3041,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFilterUnitNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5032); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_3046Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_3046,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5065); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_3037Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_3037,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5070); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3013Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3013,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_3022Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_3022,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5076); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3024Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3024,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5021); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiPortMapping_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultiFilterUnit_3053Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFilterUnit_3053,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFilterUnitNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5039); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_3077Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_3077,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelType6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5053); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_3068Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_3068,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5048); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3020Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3020,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5017); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFilterUnit_3064Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFilterUnit_3064,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFilterUnitNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5047); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleOutputPort_3018Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleOutputPort_3018,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleOutputPortNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5015); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSinglePortMapping_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3010Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3010,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_2005Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_2005,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrictEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5083); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_3026Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_3026,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrict2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5074); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFeatureUnit_3055Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFeatureUnit_3055,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFeatureUnitNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5040); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFeatureUnit_3050Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFeatureUnit_3050,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFeatureUnitNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5036); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_3030Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_3030,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5072); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_3045Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_3045,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5066); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_3043Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_3043,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5068); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_3071Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_3071,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5057); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3023Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3023,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiOutputPort_3015Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiOutputPort_3015,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiOutputPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFeatureUnit_3062Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFeatureUnit_3062,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFeatureUnitNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5045); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_2002Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_2002,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5080); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFeatureUnit_3039Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFeatureUnit_3039,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFeatureUnitNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5030); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleOutputPort_3011Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleOutputPort_3011,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleOutputPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_3025Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_3025,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5075); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFeatureUnit_3038Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFeatureUnit_3038,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFeatureUnitNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5029); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFilterUnit_3063Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFilterUnit_3063,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFilterUnitNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5046); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFilterUnit_3019Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFilterUnit_3019,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFilterUnitNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5019); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFeatureUnit_3008Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFeatureUnit_3008,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFeatureUnitNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_3029Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_3029,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5073); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_3072Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_3072,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameType6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5056); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3005Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3005,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_3078Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_3078,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelType7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5054); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_3054Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_3054,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5064); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3002Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3002,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_3042Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_3042,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5069); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_3036Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_3036,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5071); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_3044Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_3044,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrict3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5067); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConditionalUnit_2006Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.ConditionalUnit_2006,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(ConditionalUnitNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5084); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3006Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3006,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3031Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3031,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5024); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiOutputPort_3021Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiOutputPort_3021,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiOutputPortNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_3069Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_3069,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrict5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5059); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_3033Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_3033,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5028); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_2001Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_2001,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3009Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3009,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_3048Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_3048,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5035); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_3003Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_3003,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5079); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_3065Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_3065,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5061); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFeatureUnit_3061Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFeatureUnit_3061,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFeatureUnitNameType5EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5044); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_3007Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_3007,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5077); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCartesianQueuedUnit_3047Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.CartesianQueuedUnit_3047,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(CartesianQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5033); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFilterUnit_3040Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFilterUnit_3040,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFilterUnitNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5031); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_3004Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_3004,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5078); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCompositeRefactoring_1000Text(View view) {
		CompositeRefactoring domainModelElement = (CompositeRefactoring) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFeatureUnit_3012Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFeatureUnit_3012,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFeatureUnitNameTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3027Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3027,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType7EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5022); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleInputPort_3001Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleInputPort_3001,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleInputPortNameType2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSequentialUnit_3070Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SequentialUnit_3070,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SequentialUnitNameTypeLblStrict6EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5058); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_2007Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_2007,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelTypeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5085); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleQueuedUnit_2004Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.SingleQueuedUnit_2004,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(SingleQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5082); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3028Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3028,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType8EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5023); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiSinglePortMapping_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getAtomicUnit_3049Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.AtomicUnit_3049,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(AtomicUnitLabelType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5034); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getParallelQueuedUnit_2003Text(View view) {
		IParser parser = ComrelParserProvider
				.getParser(
						ComrelElementTypes.ParallelQueuedUnit_2003,
						view.getElement() != null ? view.getElement() : view,
						ComrelVisualIDRegistry
								.getType(ParallelQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5081); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiFeatureUnit_3051Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiFeatureUnit_3051,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiFeatureUnitNameType3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5037); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getMultiInputPort_3014Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.MultiInputPort_3014,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(MultiInputPortNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSingleFilterUnit_3057Text(View view) {
		IParser parser = ComrelParserProvider.getParser(
				ComrelElementTypes.SingleFilterUnit_3057,
				view.getElement() != null ? view.getElement() : view,
				ComrelVisualIDRegistry
						.getType(SingleFilterUnitNameType4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ComrelDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5042); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return CompositeRefactoringEditPart.MODEL_ID
				.equals(ComrelVisualIDRegistry.getModelID(view));
	}

}
