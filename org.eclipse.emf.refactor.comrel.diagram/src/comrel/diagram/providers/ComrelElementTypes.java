/*
 * 
 */
package comrel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import comrel.ComrelPackage;
import comrel.diagram.edit.parts.AtomicUnit2EditPart;
import comrel.diagram.edit.parts.AtomicUnit3EditPart;
import comrel.diagram.edit.parts.AtomicUnit4EditPart;
import comrel.diagram.edit.parts.AtomicUnit5EditPart;
import comrel.diagram.edit.parts.AtomicUnit6EditPart;
import comrel.diagram.edit.parts.AtomicUnit7EditPart;
import comrel.diagram.edit.parts.AtomicUnitEditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnit2EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnit3EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnit4EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnit5EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnit6EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnit7EditPart;
import comrel.diagram.edit.parts.CartesianQueuedUnitEditPart;
import comrel.diagram.edit.parts.CompositeRefactoringEditPart;
import comrel.diagram.edit.parts.ConditionCheckEditPart;
import comrel.diagram.edit.parts.ConditionalUnit2EditPart;
import comrel.diagram.edit.parts.ConditionalUnit3EditPart;
import comrel.diagram.edit.parts.ConditionalUnit4EditPart;
import comrel.diagram.edit.parts.ConditionalUnit5EditPart;
import comrel.diagram.edit.parts.ConditionalUnit6EditPart;
import comrel.diagram.edit.parts.ConditionalUnit7EditPart;
import comrel.diagram.edit.parts.ConditionalUnitEditPart;
import comrel.diagram.edit.parts.MultiFeatureUnit2EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnit3EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnit4EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnit5EditPart;
import comrel.diagram.edit.parts.MultiFeatureUnitEditPart;
import comrel.diagram.edit.parts.MultiFilterUnit2EditPart;
import comrel.diagram.edit.parts.MultiFilterUnit3EditPart;
import comrel.diagram.edit.parts.MultiFilterUnit4EditPart;
import comrel.diagram.edit.parts.MultiFilterUnit5EditPart;
import comrel.diagram.edit.parts.MultiFilterUnitEditPart;
import comrel.diagram.edit.parts.MultiInputPort2EditPart;
import comrel.diagram.edit.parts.MultiInputPort3EditPart;
import comrel.diagram.edit.parts.MultiInputPort4EditPart;
import comrel.diagram.edit.parts.MultiInputPort5EditPart;
import comrel.diagram.edit.parts.MultiInputPort6EditPart;
import comrel.diagram.edit.parts.MultiInputPort7EditPart;
import comrel.diagram.edit.parts.MultiInputPort8EditPart;
import comrel.diagram.edit.parts.MultiInputPort9EditPart;
import comrel.diagram.edit.parts.MultiInputPortEditPart;
import comrel.diagram.edit.parts.MultiOutputPort2EditPart;
import comrel.diagram.edit.parts.MultiOutputPortEditPart;
import comrel.diagram.edit.parts.MultiPortMappingEditPart;
import comrel.diagram.edit.parts.MultiSinglePortMappingEditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnit2EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnit3EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnit4EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnit5EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnit6EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnit7EditPart;
import comrel.diagram.edit.parts.ParallelQueuedUnitEditPart;
import comrel.diagram.edit.parts.SequentialUnit2EditPart;
import comrel.diagram.edit.parts.SequentialUnit3EditPart;
import comrel.diagram.edit.parts.SequentialUnit4EditPart;
import comrel.diagram.edit.parts.SequentialUnit5EditPart;
import comrel.diagram.edit.parts.SequentialUnit6EditPart;
import comrel.diagram.edit.parts.SequentialUnit7EditPart;
import comrel.diagram.edit.parts.SequentialUnitEditPart;
import comrel.diagram.edit.parts.SingleFeatureUnit2EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnit3EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnit4EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnit5EditPart;
import comrel.diagram.edit.parts.SingleFeatureUnitEditPart;
import comrel.diagram.edit.parts.SingleFilterUnit2EditPart;
import comrel.diagram.edit.parts.SingleFilterUnit3EditPart;
import comrel.diagram.edit.parts.SingleFilterUnit4EditPart;
import comrel.diagram.edit.parts.SingleFilterUnit5EditPart;
import comrel.diagram.edit.parts.SingleFilterUnitEditPart;
import comrel.diagram.edit.parts.SingleInputPort2EditPart;
import comrel.diagram.edit.parts.SingleInputPort3EditPart;
import comrel.diagram.edit.parts.SingleInputPort4EditPart;
import comrel.diagram.edit.parts.SingleInputPort5EditPart;
import comrel.diagram.edit.parts.SingleInputPort6EditPart;
import comrel.diagram.edit.parts.SingleInputPort7EditPart;
import comrel.diagram.edit.parts.SingleInputPort8EditPart;
import comrel.diagram.edit.parts.SingleInputPort9EditPart;
import comrel.diagram.edit.parts.SingleInputPortEditPart;
import comrel.diagram.edit.parts.SingleOutputPort2EditPart;
import comrel.diagram.edit.parts.SingleOutputPortEditPart;
import comrel.diagram.edit.parts.SinglePortMappingEditPart;
import comrel.diagram.edit.parts.SingleQueuedUnit2EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnit3EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnit4EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnit5EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnit6EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnit7EditPart;
import comrel.diagram.edit.parts.SingleQueuedUnitEditPart;
import comrel.diagram.part.ComrelDiagramEditorPlugin;

/**
 * @generated
 */
public class ComrelElementTypes {

	/**
	 * @generated
	 */
	private ComrelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType CompositeRefactoring_1000 = getElementType("comrel.diagram.CompositeRefactoring_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_2001 = getElementType("comrel.diagram.SingleInputPort_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_2002 = getElementType("comrel.diagram.CartesianQueuedUnit_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_2003 = getElementType("comrel.diagram.ParallelQueuedUnit_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_2004 = getElementType("comrel.diagram.SingleQueuedUnit_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_2005 = getElementType("comrel.diagram.SequentialUnit_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_2006 = getElementType("comrel.diagram.ConditionalUnit_2006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_2007 = getElementType("comrel.diagram.AtomicUnit_2007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3001 = getElementType("comrel.diagram.SingleInputPort_3001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3002 = getElementType("comrel.diagram.MultiInputPort_3002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_3003 = getElementType("comrel.diagram.CartesianQueuedUnit_3003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_3004 = getElementType("comrel.diagram.ParallelQueuedUnit_3004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3005 = getElementType("comrel.diagram.SingleInputPort_3005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3006 = getElementType("comrel.diagram.MultiInputPort_3006"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_3007 = getElementType("comrel.diagram.CartesianQueuedUnit_3007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFeatureUnit_3008 = getElementType("comrel.diagram.SingleFeatureUnit_3008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3009 = getElementType("comrel.diagram.SingleInputPort_3009"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3010 = getElementType("comrel.diagram.MultiInputPort_3010"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleOutputPort_3011 = getElementType("comrel.diagram.SingleOutputPort_3011"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFeatureUnit_3012 = getElementType("comrel.diagram.MultiFeatureUnit_3012"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3013 = getElementType("comrel.diagram.SingleInputPort_3013"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3014 = getElementType("comrel.diagram.MultiInputPort_3014"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiOutputPort_3015 = getElementType("comrel.diagram.MultiOutputPort_3015"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFilterUnit_3016 = getElementType("comrel.diagram.SingleFilterUnit_3016"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3017 = getElementType("comrel.diagram.MultiInputPort_3017"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleOutputPort_3018 = getElementType("comrel.diagram.SingleOutputPort_3018"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFilterUnit_3019 = getElementType("comrel.diagram.MultiFilterUnit_3019"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3020 = getElementType("comrel.diagram.MultiInputPort_3020"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiOutputPort_3021 = getElementType("comrel.diagram.MultiOutputPort_3021"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_3022 = getElementType("comrel.diagram.SingleQueuedUnit_3022"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3023 = getElementType("comrel.diagram.SingleInputPort_3023"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3024 = getElementType("comrel.diagram.MultiInputPort_3024"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_3025 = getElementType("comrel.diagram.CartesianQueuedUnit_3025"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_3026 = getElementType("comrel.diagram.SequentialUnit_3026"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3027 = getElementType("comrel.diagram.SingleInputPort_3027"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3028 = getElementType("comrel.diagram.MultiInputPort_3028"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_3029 = getElementType("comrel.diagram.CartesianQueuedUnit_3029"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_3030 = getElementType("comrel.diagram.ConditionalUnit_3030"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3031 = getElementType("comrel.diagram.SingleInputPort_3031"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiInputPort_3032 = getElementType("comrel.diagram.MultiInputPort_3032"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_3033 = getElementType("comrel.diagram.CartesianQueuedUnit_3033"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_3034 = getElementType("comrel.diagram.AtomicUnit_3034"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleInputPort_3035 = getElementType("comrel.diagram.SingleInputPort_3035"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_3036 = getElementType("comrel.diagram.ParallelQueuedUnit_3036"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_3037 = getElementType("comrel.diagram.ParallelQueuedUnit_3037"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFeatureUnit_3038 = getElementType("comrel.diagram.SingleFeatureUnit_3038"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFeatureUnit_3039 = getElementType("comrel.diagram.MultiFeatureUnit_3039"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFilterUnit_3040 = getElementType("comrel.diagram.SingleFilterUnit_3040"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFilterUnit_3041 = getElementType("comrel.diagram.MultiFilterUnit_3041"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_3042 = getElementType("comrel.diagram.SingleQueuedUnit_3042"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_3043 = getElementType("comrel.diagram.ParallelQueuedUnit_3043"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_3044 = getElementType("comrel.diagram.SequentialUnit_3044"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_3045 = getElementType("comrel.diagram.ParallelQueuedUnit_3045"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_3046 = getElementType("comrel.diagram.ConditionalUnit_3046"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType CartesianQueuedUnit_3047 = getElementType("comrel.diagram.CartesianQueuedUnit_3047"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ParallelQueuedUnit_3048 = getElementType("comrel.diagram.ParallelQueuedUnit_3048"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_3049 = getElementType("comrel.diagram.AtomicUnit_3049"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFeatureUnit_3050 = getElementType("comrel.diagram.SingleFeatureUnit_3050"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFeatureUnit_3051 = getElementType("comrel.diagram.MultiFeatureUnit_3051"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFilterUnit_3052 = getElementType("comrel.diagram.SingleFilterUnit_3052"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFilterUnit_3053 = getElementType("comrel.diagram.MultiFilterUnit_3053"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_3054 = getElementType("comrel.diagram.SingleQueuedUnit_3054"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFeatureUnit_3055 = getElementType("comrel.diagram.SingleFeatureUnit_3055"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFeatureUnit_3056 = getElementType("comrel.diagram.MultiFeatureUnit_3056"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFilterUnit_3057 = getElementType("comrel.diagram.SingleFilterUnit_3057"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFilterUnit_3058 = getElementType("comrel.diagram.MultiFilterUnit_3058"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_3059 = getElementType("comrel.diagram.SingleQueuedUnit_3059"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_3060 = getElementType("comrel.diagram.SequentialUnit_3060"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFeatureUnit_3061 = getElementType("comrel.diagram.SingleFeatureUnit_3061"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFeatureUnit_3062 = getElementType("comrel.diagram.MultiFeatureUnit_3062"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleFilterUnit_3063 = getElementType("comrel.diagram.SingleFilterUnit_3063"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiFilterUnit_3064 = getElementType("comrel.diagram.MultiFilterUnit_3064"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_3065 = getElementType("comrel.diagram.SingleQueuedUnit_3065"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_3066 = getElementType("comrel.diagram.ConditionalUnit_3066"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SingleQueuedUnit_3067 = getElementType("comrel.diagram.SingleQueuedUnit_3067"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_3068 = getElementType("comrel.diagram.AtomicUnit_3068"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_3069 = getElementType("comrel.diagram.SequentialUnit_3069"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_3070 = getElementType("comrel.diagram.SequentialUnit_3070"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_3071 = getElementType("comrel.diagram.ConditionalUnit_3071"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_3072 = getElementType("comrel.diagram.ConditionalUnit_3072"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SequentialUnit_3073 = getElementType("comrel.diagram.SequentialUnit_3073"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_3074 = getElementType("comrel.diagram.AtomicUnit_3074"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionalUnit_3075 = getElementType("comrel.diagram.ConditionalUnit_3075"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConditionCheck_3076 = getElementType("comrel.diagram.ConditionCheck_3076"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_3077 = getElementType("comrel.diagram.AtomicUnit_3077"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType AtomicUnit_3078 = getElementType("comrel.diagram.AtomicUnit_3078"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SinglePortMapping_4001 = getElementType("comrel.diagram.SinglePortMapping_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiPortMapping_4002 = getElementType("comrel.diagram.MultiPortMapping_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType MultiSinglePortMapping_4003 = getElementType("comrel.diagram.MultiSinglePortMapping_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ComrelDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(CompositeRefactoring_1000,
					ComrelPackage.eINSTANCE.getCompositeRefactoring());

			elements.put(SingleInputPort_2001,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(CartesianQueuedUnit_2002,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(ParallelQueuedUnit_2003,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(SingleQueuedUnit_2004,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(SequentialUnit_2005,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(ConditionalUnit_2006,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(AtomicUnit_2007,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(SingleInputPort_3001,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3002,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(CartesianQueuedUnit_3003,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(ParallelQueuedUnit_3004,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(SingleInputPort_3005,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3006,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(CartesianQueuedUnit_3007,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(SingleFeatureUnit_3008,
					ComrelPackage.eINSTANCE.getSingleFeatureUnit());

			elements.put(SingleInputPort_3009,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3010,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(SingleOutputPort_3011,
					ComrelPackage.eINSTANCE.getSingleOutputPort());

			elements.put(MultiFeatureUnit_3012,
					ComrelPackage.eINSTANCE.getMultiFeatureUnit());

			elements.put(SingleInputPort_3013,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3014,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(MultiOutputPort_3015,
					ComrelPackage.eINSTANCE.getMultiOutputPort());

			elements.put(SingleFilterUnit_3016,
					ComrelPackage.eINSTANCE.getSingleFilterUnit());

			elements.put(MultiInputPort_3017,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(SingleOutputPort_3018,
					ComrelPackage.eINSTANCE.getSingleOutputPort());

			elements.put(MultiFilterUnit_3019,
					ComrelPackage.eINSTANCE.getMultiFilterUnit());

			elements.put(MultiInputPort_3020,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(MultiOutputPort_3021,
					ComrelPackage.eINSTANCE.getMultiOutputPort());

			elements.put(SingleQueuedUnit_3022,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(SingleInputPort_3023,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3024,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(CartesianQueuedUnit_3025,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(SequentialUnit_3026,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(SingleInputPort_3027,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3028,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(CartesianQueuedUnit_3029,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(ConditionalUnit_3030,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(SingleInputPort_3031,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(MultiInputPort_3032,
					ComrelPackage.eINSTANCE.getMultiInputPort());

			elements.put(CartesianQueuedUnit_3033,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(AtomicUnit_3034,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(SingleInputPort_3035,
					ComrelPackage.eINSTANCE.getSingleInputPort());

			elements.put(ParallelQueuedUnit_3036,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(ParallelQueuedUnit_3037,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(SingleFeatureUnit_3038,
					ComrelPackage.eINSTANCE.getSingleFeatureUnit());

			elements.put(MultiFeatureUnit_3039,
					ComrelPackage.eINSTANCE.getMultiFeatureUnit());

			elements.put(SingleFilterUnit_3040,
					ComrelPackage.eINSTANCE.getSingleFilterUnit());

			elements.put(MultiFilterUnit_3041,
					ComrelPackage.eINSTANCE.getMultiFilterUnit());

			elements.put(SingleQueuedUnit_3042,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(ParallelQueuedUnit_3043,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(SequentialUnit_3044,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(ParallelQueuedUnit_3045,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(ConditionalUnit_3046,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(CartesianQueuedUnit_3047,
					ComrelPackage.eINSTANCE.getCartesianQueuedUnit());

			elements.put(ParallelQueuedUnit_3048,
					ComrelPackage.eINSTANCE.getParallelQueuedUnit());

			elements.put(AtomicUnit_3049,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(SingleFeatureUnit_3050,
					ComrelPackage.eINSTANCE.getSingleFeatureUnit());

			elements.put(MultiFeatureUnit_3051,
					ComrelPackage.eINSTANCE.getMultiFeatureUnit());

			elements.put(SingleFilterUnit_3052,
					ComrelPackage.eINSTANCE.getSingleFilterUnit());

			elements.put(MultiFilterUnit_3053,
					ComrelPackage.eINSTANCE.getMultiFilterUnit());

			elements.put(SingleQueuedUnit_3054,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(SingleFeatureUnit_3055,
					ComrelPackage.eINSTANCE.getSingleFeatureUnit());

			elements.put(MultiFeatureUnit_3056,
					ComrelPackage.eINSTANCE.getMultiFeatureUnit());

			elements.put(SingleFilterUnit_3057,
					ComrelPackage.eINSTANCE.getSingleFilterUnit());

			elements.put(MultiFilterUnit_3058,
					ComrelPackage.eINSTANCE.getMultiFilterUnit());

			elements.put(SingleQueuedUnit_3059,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(SequentialUnit_3060,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(SingleFeatureUnit_3061,
					ComrelPackage.eINSTANCE.getSingleFeatureUnit());

			elements.put(MultiFeatureUnit_3062,
					ComrelPackage.eINSTANCE.getMultiFeatureUnit());

			elements.put(SingleFilterUnit_3063,
					ComrelPackage.eINSTANCE.getSingleFilterUnit());

			elements.put(MultiFilterUnit_3064,
					ComrelPackage.eINSTANCE.getMultiFilterUnit());

			elements.put(SingleQueuedUnit_3065,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(ConditionalUnit_3066,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(SingleQueuedUnit_3067,
					ComrelPackage.eINSTANCE.getSingleQueuedUnit());

			elements.put(AtomicUnit_3068,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(SequentialUnit_3069,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(SequentialUnit_3070,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(ConditionalUnit_3071,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(ConditionalUnit_3072,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(SequentialUnit_3073,
					ComrelPackage.eINSTANCE.getSequentialUnit());

			elements.put(AtomicUnit_3074,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(ConditionalUnit_3075,
					ComrelPackage.eINSTANCE.getConditionalUnit());

			elements.put(ConditionCheck_3076,
					ComrelPackage.eINSTANCE.getConditionCheck());

			elements.put(AtomicUnit_3077,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(AtomicUnit_3078,
					ComrelPackage.eINSTANCE.getAtomicUnit());

			elements.put(SinglePortMapping_4001,
					ComrelPackage.eINSTANCE.getSinglePortMapping());

			elements.put(MultiPortMapping_4002,
					ComrelPackage.eINSTANCE.getMultiPortMapping());

			elements.put(MultiSinglePortMapping_4003,
					ComrelPackage.eINSTANCE.getMultiSinglePortMapping());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(CompositeRefactoring_1000);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_2001);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_2002);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_2003);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_2004);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_2005);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_2006);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_2007);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3001);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3002);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_3003);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_3004);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3005);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3006);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_3007);
			KNOWN_ELEMENT_TYPES.add(SingleFeatureUnit_3008);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3009);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3010);
			KNOWN_ELEMENT_TYPES.add(SingleOutputPort_3011);
			KNOWN_ELEMENT_TYPES.add(MultiFeatureUnit_3012);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3013);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3014);
			KNOWN_ELEMENT_TYPES.add(MultiOutputPort_3015);
			KNOWN_ELEMENT_TYPES.add(SingleFilterUnit_3016);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3017);
			KNOWN_ELEMENT_TYPES.add(SingleOutputPort_3018);
			KNOWN_ELEMENT_TYPES.add(MultiFilterUnit_3019);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3020);
			KNOWN_ELEMENT_TYPES.add(MultiOutputPort_3021);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_3022);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3023);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3024);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_3025);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_3026);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3027);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3028);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_3029);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_3030);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3031);
			KNOWN_ELEMENT_TYPES.add(MultiInputPort_3032);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_3033);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_3034);
			KNOWN_ELEMENT_TYPES.add(SingleInputPort_3035);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_3036);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_3037);
			KNOWN_ELEMENT_TYPES.add(SingleFeatureUnit_3038);
			KNOWN_ELEMENT_TYPES.add(MultiFeatureUnit_3039);
			KNOWN_ELEMENT_TYPES.add(SingleFilterUnit_3040);
			KNOWN_ELEMENT_TYPES.add(MultiFilterUnit_3041);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_3042);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_3043);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_3044);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_3045);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_3046);
			KNOWN_ELEMENT_TYPES.add(CartesianQueuedUnit_3047);
			KNOWN_ELEMENT_TYPES.add(ParallelQueuedUnit_3048);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_3049);
			KNOWN_ELEMENT_TYPES.add(SingleFeatureUnit_3050);
			KNOWN_ELEMENT_TYPES.add(MultiFeatureUnit_3051);
			KNOWN_ELEMENT_TYPES.add(SingleFilterUnit_3052);
			KNOWN_ELEMENT_TYPES.add(MultiFilterUnit_3053);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_3054);
			KNOWN_ELEMENT_TYPES.add(SingleFeatureUnit_3055);
			KNOWN_ELEMENT_TYPES.add(MultiFeatureUnit_3056);
			KNOWN_ELEMENT_TYPES.add(SingleFilterUnit_3057);
			KNOWN_ELEMENT_TYPES.add(MultiFilterUnit_3058);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_3059);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_3060);
			KNOWN_ELEMENT_TYPES.add(SingleFeatureUnit_3061);
			KNOWN_ELEMENT_TYPES.add(MultiFeatureUnit_3062);
			KNOWN_ELEMENT_TYPES.add(SingleFilterUnit_3063);
			KNOWN_ELEMENT_TYPES.add(MultiFilterUnit_3064);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_3065);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_3066);
			KNOWN_ELEMENT_TYPES.add(SingleQueuedUnit_3067);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_3068);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_3069);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_3070);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_3071);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_3072);
			KNOWN_ELEMENT_TYPES.add(SequentialUnit_3073);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_3074);
			KNOWN_ELEMENT_TYPES.add(ConditionalUnit_3075);
			KNOWN_ELEMENT_TYPES.add(ConditionCheck_3076);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_3077);
			KNOWN_ELEMENT_TYPES.add(AtomicUnit_3078);
			KNOWN_ELEMENT_TYPES.add(SinglePortMapping_4001);
			KNOWN_ELEMENT_TYPES.add(MultiPortMapping_4002);
			KNOWN_ELEMENT_TYPES.add(MultiSinglePortMapping_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			return CompositeRefactoring_1000;
		case SingleInputPortEditPart.VISUAL_ID:
			return SingleInputPort_2001;
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return CartesianQueuedUnit_2002;
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return ParallelQueuedUnit_2003;
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return SingleQueuedUnit_2004;
		case SequentialUnitEditPart.VISUAL_ID:
			return SequentialUnit_2005;
		case ConditionalUnitEditPart.VISUAL_ID:
			return ConditionalUnit_2006;
		case AtomicUnitEditPart.VISUAL_ID:
			return AtomicUnit_2007;
		case SingleInputPort2EditPart.VISUAL_ID:
			return SingleInputPort_3001;
		case MultiInputPortEditPart.VISUAL_ID:
			return MultiInputPort_3002;
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return CartesianQueuedUnit_3003;
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return ParallelQueuedUnit_3004;
		case SingleInputPort3EditPart.VISUAL_ID:
			return SingleInputPort_3005;
		case MultiInputPort2EditPart.VISUAL_ID:
			return MultiInputPort_3006;
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return CartesianQueuedUnit_3007;
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return SingleFeatureUnit_3008;
		case SingleInputPort4EditPart.VISUAL_ID:
			return SingleInputPort_3009;
		case MultiInputPort3EditPart.VISUAL_ID:
			return MultiInputPort_3010;
		case SingleOutputPortEditPart.VISUAL_ID:
			return SingleOutputPort_3011;
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return MultiFeatureUnit_3012;
		case SingleInputPort5EditPart.VISUAL_ID:
			return SingleInputPort_3013;
		case MultiInputPort4EditPart.VISUAL_ID:
			return MultiInputPort_3014;
		case MultiOutputPortEditPart.VISUAL_ID:
			return MultiOutputPort_3015;
		case SingleFilterUnitEditPart.VISUAL_ID:
			return SingleFilterUnit_3016;
		case MultiInputPort5EditPart.VISUAL_ID:
			return MultiInputPort_3017;
		case SingleOutputPort2EditPart.VISUAL_ID:
			return SingleOutputPort_3018;
		case MultiFilterUnitEditPart.VISUAL_ID:
			return MultiFilterUnit_3019;
		case MultiInputPort6EditPart.VISUAL_ID:
			return MultiInputPort_3020;
		case MultiOutputPort2EditPart.VISUAL_ID:
			return MultiOutputPort_3021;
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return SingleQueuedUnit_3022;
		case SingleInputPort6EditPart.VISUAL_ID:
			return SingleInputPort_3023;
		case MultiInputPort7EditPart.VISUAL_ID:
			return MultiInputPort_3024;
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return CartesianQueuedUnit_3025;
		case SequentialUnit2EditPart.VISUAL_ID:
			return SequentialUnit_3026;
		case SingleInputPort7EditPart.VISUAL_ID:
			return SingleInputPort_3027;
		case MultiInputPort8EditPart.VISUAL_ID:
			return MultiInputPort_3028;
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return CartesianQueuedUnit_3029;
		case ConditionalUnit2EditPart.VISUAL_ID:
			return ConditionalUnit_3030;
		case SingleInputPort8EditPart.VISUAL_ID:
			return SingleInputPort_3031;
		case MultiInputPort9EditPart.VISUAL_ID:
			return MultiInputPort_3032;
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return CartesianQueuedUnit_3033;
		case AtomicUnit2EditPart.VISUAL_ID:
			return AtomicUnit_3034;
		case SingleInputPort9EditPart.VISUAL_ID:
			return SingleInputPort_3035;
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return ParallelQueuedUnit_3036;
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return ParallelQueuedUnit_3037;
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return SingleFeatureUnit_3038;
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return MultiFeatureUnit_3039;
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return SingleFilterUnit_3040;
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return MultiFilterUnit_3041;
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return SingleQueuedUnit_3042;
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return ParallelQueuedUnit_3043;
		case SequentialUnit3EditPart.VISUAL_ID:
			return SequentialUnit_3044;
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return ParallelQueuedUnit_3045;
		case ConditionalUnit3EditPart.VISUAL_ID:
			return ConditionalUnit_3046;
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return CartesianQueuedUnit_3047;
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return ParallelQueuedUnit_3048;
		case AtomicUnit3EditPart.VISUAL_ID:
			return AtomicUnit_3049;
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return SingleFeatureUnit_3050;
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return MultiFeatureUnit_3051;
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return SingleFilterUnit_3052;
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return MultiFilterUnit_3053;
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return SingleQueuedUnit_3054;
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return SingleFeatureUnit_3055;
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return MultiFeatureUnit_3056;
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return SingleFilterUnit_3057;
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return MultiFilterUnit_3058;
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return SingleQueuedUnit_3059;
		case SequentialUnit4EditPart.VISUAL_ID:
			return SequentialUnit_3060;
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return SingleFeatureUnit_3061;
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return MultiFeatureUnit_3062;
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return SingleFilterUnit_3063;
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return MultiFilterUnit_3064;
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return SingleQueuedUnit_3065;
		case ConditionalUnit4EditPart.VISUAL_ID:
			return ConditionalUnit_3066;
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return SingleQueuedUnit_3067;
		case AtomicUnit4EditPart.VISUAL_ID:
			return AtomicUnit_3068;
		case SequentialUnit5EditPart.VISUAL_ID:
			return SequentialUnit_3069;
		case SequentialUnit6EditPart.VISUAL_ID:
			return SequentialUnit_3070;
		case ConditionalUnit5EditPart.VISUAL_ID:
			return ConditionalUnit_3071;
		case ConditionalUnit6EditPart.VISUAL_ID:
			return ConditionalUnit_3072;
		case SequentialUnit7EditPart.VISUAL_ID:
			return SequentialUnit_3073;
		case AtomicUnit5EditPart.VISUAL_ID:
			return AtomicUnit_3074;
		case ConditionalUnit7EditPart.VISUAL_ID:
			return ConditionalUnit_3075;
		case ConditionCheckEditPart.VISUAL_ID:
			return ConditionCheck_3076;
		case AtomicUnit6EditPart.VISUAL_ID:
			return AtomicUnit_3077;
		case AtomicUnit7EditPart.VISUAL_ID:
			return AtomicUnit_3078;
		case SinglePortMappingEditPart.VISUAL_ID:
			return SinglePortMapping_4001;
		case MultiPortMappingEditPart.VISUAL_ID:
			return MultiPortMapping_4002;
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return MultiSinglePortMapping_4003;
		}
		return null;
	}

}
