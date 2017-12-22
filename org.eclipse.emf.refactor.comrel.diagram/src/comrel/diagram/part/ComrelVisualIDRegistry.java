/*
 * 
 */
package comrel.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import comrel.CompositeRefactoring;
import comrel.ComrelPackage;
import comrel.diagram.edit.parts.*;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ComrelVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "comrel.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (CompositeRefactoringEditPart.MODEL_ID.equals(view.getType())) {
				return CompositeRefactoringEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return comrel.diagram.part.ComrelVisualIDRegistry.getVisualID(view
				.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ComrelDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComrelPackage.eINSTANCE.getCompositeRefactoring().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((CompositeRefactoring) domainElement)) {
			return CompositeRefactoringEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = comrel.diagram.part.ComrelVisualIDRegistry
				.getModelID(containerView);
		if (!CompositeRefactoringEditPart.MODEL_ID.equals(containerModelID)
				&& !"comrel".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (CompositeRefactoringEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = comrel.diagram.part.ComrelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositeRefactoringEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPortEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case AtomicUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case SingleFeatureUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPortEditPart.VISUAL_ID;
			}
			break;
		case MultiFeatureUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPortEditPart.VISUAL_ID;
			}
			break;
		case SingleFilterUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case MultiFilterUnitEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case SequentialUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case AtomicUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPortEditPart.VISUAL_ID;
			}
			break;
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPortEditPart.VISUAL_ID;
			}
			break;
		case SingleFilterUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case MultiFilterUnit2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPortEditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort2EditPart.VISUAL_ID;
			}
			break;
		case AtomicUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPortEditPart.VISUAL_ID;
			}
			break;
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPortEditPart.VISUAL_ID;
			}
			break;
		case SingleFilterUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case MultiFilterUnit3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPortEditPart.VISUAL_ID;
			}
			break;
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPortEditPart.VISUAL_ID;
			}
			break;
		case SingleFilterUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case MultiFilterUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPortEditPart.VISUAL_ID;
			}
			break;
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPortEditPart.VISUAL_ID;
			}
			break;
		case SingleFilterUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case MultiFilterUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiOutputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiOutputPort2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort7EditPart.VISUAL_ID;
			}
			break;
		case AtomicUnit4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnit6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnit6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnit7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort8EditPart.VISUAL_ID;
			}
			break;
		case AtomicUnit5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnit7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort8EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiInputPort9EditPart.VISUAL_ID;
			}
			break;
		case AtomicUnit6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case AtomicUnit7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleInputPort().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleInputPort9EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnitEditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnitEditPart.VISUAL_ID;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit2EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit2EditPart.VISUAL_ID;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit3EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit4EditPart.VISUAL_ID;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit4EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit5EditPart.VISUAL_ID;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit5EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getConditionCheck().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionCheckEditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getSingleFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFeatureUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFeatureUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleFilterUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getMultiFilterUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return MultiFilterUnit3EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit3EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit4EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit5EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit6EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit6EditPart.VISUAL_ID;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID:
			if (ComrelPackage.eINSTANCE.getCartesianQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return CartesianQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getParallelQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ParallelQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSingleQueuedUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SingleQueuedUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getSequentialUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return SequentialUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getConditionalUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return ConditionalUnit7EditPart.VISUAL_ID;
			}
			if (ComrelPackage.eINSTANCE.getAtomicUnit().isSuperTypeOf(
					domainElement.eClass())) {
				return AtomicUnit7EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = comrel.diagram.part.ComrelVisualIDRegistry
				.getModelID(containerView);
		if (!CompositeRefactoringEditPart.MODEL_ID.equals(containerModelID)
				&& !"comrel".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (CompositeRefactoringEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = comrel.diagram.part.ComrelVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = CompositeRefactoringEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			if (SingleInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPortEditPart.VISUAL_ID:
			if (SingleInputPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitEditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitEditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrictEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitEditPart.VISUAL_ID:
			if (ConditionalUnitNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnitEditPart.VISUAL_ID:
			if (AtomicUnitLabelTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort2EditPart.VISUAL_ID:
			if (SingleInputPortNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPortEditPart.VISUAL_ID:
			if (MultiInputPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort3EditPart.VISUAL_ID:
			if (SingleInputPortNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort2EditPart.VISUAL_ID:
			if (MultiInputPortNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFeatureUnitEditPart.VISUAL_ID:
			if (SingleFeatureUnitNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort4EditPart.VISUAL_ID:
			if (SingleInputPortNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort3EditPart.VISUAL_ID:
			if (MultiInputPortNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleOutputPortEditPart.VISUAL_ID:
			if (SingleOutputPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFeatureUnitEditPart.VISUAL_ID:
			if (MultiFeatureUnitNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort5EditPart.VISUAL_ID:
			if (SingleInputPortNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort4EditPart.VISUAL_ID:
			if (MultiInputPortNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiOutputPortEditPart.VISUAL_ID:
			if (MultiOutputPortNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFilterUnitEditPart.VISUAL_ID:
			if (SingleFilterUnitNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort5EditPart.VISUAL_ID:
			if (MultiInputPortNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleOutputPort2EditPart.VISUAL_ID:
			if (SingleOutputPortNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFilterUnitEditPart.VISUAL_ID:
			if (MultiFilterUnitNameTypeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort6EditPart.VISUAL_ID:
			if (MultiInputPortNameType6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiOutputPort2EditPart.VISUAL_ID:
			if (MultiOutputPortNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort6EditPart.VISUAL_ID:
			if (SingleInputPortNameType6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort7EditPart.VISUAL_ID:
			if (MultiInputPortNameType7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnit2EditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrict2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort7EditPart.VISUAL_ID:
			if (SingleInputPortNameType7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort8EditPart.VISUAL_ID:
			if (MultiInputPortNameType8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnit2EditPart.VISUAL_ID:
			if (ConditionalUnitNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort8EditPart.VISUAL_ID:
			if (SingleInputPortNameType8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiInputPort9EditPart.VISUAL_ID:
			if (MultiInputPortNameType9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnit2EditPart.VISUAL_ID:
			if (AtomicUnitLabelType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleInputPort9EditPart.VISUAL_ID:
			if (SingleInputPortNameType9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			if (SingleFeatureUnitNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			if (MultiFeatureUnitNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFilterUnit2EditPart.VISUAL_ID:
			if (SingleFilterUnitNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFilterUnit2EditPart.VISUAL_ID:
			if (MultiFilterUnitNameType2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnit3EditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrict3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnit3EditPart.VISUAL_ID:
			if (ConditionalUnitNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			if (CartesianQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			if (ParallelQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnit3EditPart.VISUAL_ID:
			if (AtomicUnitLabelType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			if (SingleFeatureUnitNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			if (MultiFeatureUnitNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFilterUnit3EditPart.VISUAL_ID:
			if (SingleFilterUnitNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFilterUnit3EditPart.VISUAL_ID:
			if (MultiFilterUnitNameType3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			if (SingleFeatureUnitNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			if (MultiFeatureUnitNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFilterUnit4EditPart.VISUAL_ID:
			if (SingleFilterUnitNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFilterUnit4EditPart.VISUAL_ID:
			if (MultiFilterUnitNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnit4EditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrict4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			if (SingleFeatureUnitNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			if (MultiFeatureUnitNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPortEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleFilterUnit5EditPart.VISUAL_ID:
			if (SingleFilterUnitNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MultiFilterUnit5EditPart.VISUAL_ID:
			if (MultiFilterUnitNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiOutputPort2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnit4EditPart.VISUAL_ID:
			if (ConditionalUnitNameType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			if (SingleQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnit4EditPart.VISUAL_ID:
			if (AtomicUnitLabelType4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnit5EditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrict5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnit6EditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrict6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnit5EditPart.VISUAL_ID:
			if (ConditionalUnitNameType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnit6EditPart.VISUAL_ID:
			if (ConditionalUnitNameType6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnit7EditPart.VISUAL_ID:
			if (SequentialUnitNameTypeLblStrict7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnit5EditPart.VISUAL_ID:
			if (AtomicUnitLabelType5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnit7EditPart.VISUAL_ID:
			if (ConditionalUnitNameType7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitIfCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort8EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionCheckEditPart.VISUAL_ID:
			if (ConditionCheckNameTypeSpecEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnit6EditPart.VISUAL_ID:
			if (AtomicUnitLabelType6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AtomicUnit7EditPart.VISUAL_ID:
			if (AtomicUnitLabelType7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleInputPort9EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartmentEditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment2EditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (SingleFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnitEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
			if (CartesianQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment3EditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment4EditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment5EditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment6EditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (SingleFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
			if (CartesianQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (SingleFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
			if (CartesianQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (SingleFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
			if (CartesianQueuedUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitIfCompartment7EditPart.VISUAL_ID:
			if (ConditionCheckEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			if (SingleFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFeatureUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MultiFilterUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID:
			if (CartesianQueuedUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID:
			if (CartesianQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParallelQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SingleQueuedUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SequentialUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AtomicUnit7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ComrelPackage.eINSTANCE.getSinglePortMapping().isSuperTypeOf(
				domainElement.eClass())) {
			return SinglePortMappingEditPart.VISUAL_ID;
		}
		if (ComrelPackage.eINSTANCE.getMultiPortMapping().isSuperTypeOf(
				domainElement.eClass())) {
			return MultiPortMappingEditPart.VISUAL_ID;
		}
		if (ComrelPackage.eINSTANCE.getMultiSinglePortMapping().isSuperTypeOf(
				domainElement.eClass())) {
			return MultiSinglePortMappingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(CompositeRefactoring element) {
		return true;
	}

}
