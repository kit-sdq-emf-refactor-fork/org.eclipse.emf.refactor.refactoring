/*
 * 
 */
package comrel.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

import comrel.AtomicUnit;
import comrel.CartesianQueuedUnit;
import comrel.CompositeRefactoring;
import comrel.ComrelPackage;
import comrel.ConditionCheck;
import comrel.ConditionalUnit;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.MultiFeatureUnit;
import comrel.MultiFilterUnit;
import comrel.MultiInputPort;
import comrel.MultiOutputPort;
import comrel.MultiPort;
import comrel.MultiPortMapping;
import comrel.MultiSinglePortMapping;
import comrel.ParallelQueuedUnit;
import comrel.RefactoringUnit;
import comrel.SequentialUnit;
import comrel.SingleFeatureUnit;
import comrel.SingleFilterUnit;
import comrel.SingleInputPort;
import comrel.SingleOutputPort;
import comrel.SinglePort;
import comrel.SinglePortMapping;
import comrel.SingleQueuedUnit;
import comrel.diagram.edit.parts.*;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ComrelDiagramUpdater {

	/**
	 * @generated
	 */
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null
				|| view.getElement().eIsProxy();
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSemanticChildren(View view) {
		switch (ComrelVisualIDRegistry.getVisualID(view)) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			return getCompositeRefactoring_1000SemanticChildren(view);
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return getCartesianQueuedUnit_2002SemanticChildren(view);
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return getParallelQueuedUnit_2003SemanticChildren(view);
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return getSingleQueuedUnit_2004SemanticChildren(view);
		case SequentialUnitEditPart.VISUAL_ID:
			return getSequentialUnit_2005SemanticChildren(view);
		case ConditionalUnitEditPart.VISUAL_ID:
			return getConditionalUnit_2006SemanticChildren(view);
		case AtomicUnitEditPart.VISUAL_ID:
			return getAtomicUnit_2007SemanticChildren(view);
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3003SemanticChildren(view);
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3004SemanticChildren(view);
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3007SemanticChildren(view);
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return getSingleFeatureUnit_3008SemanticChildren(view);
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return getMultiFeatureUnit_3012SemanticChildren(view);
		case SingleFilterUnitEditPart.VISUAL_ID:
			return getSingleFilterUnit_3016SemanticChildren(view);
		case MultiFilterUnitEditPart.VISUAL_ID:
			return getMultiFilterUnit_3019SemanticChildren(view);
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3022SemanticChildren(view);
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3025SemanticChildren(view);
		case SequentialUnit2EditPart.VISUAL_ID:
			return getSequentialUnit_3026SemanticChildren(view);
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3029SemanticChildren(view);
		case ConditionalUnit2EditPart.VISUAL_ID:
			return getConditionalUnit_3030SemanticChildren(view);
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3033SemanticChildren(view);
		case AtomicUnit2EditPart.VISUAL_ID:
			return getAtomicUnit_3034SemanticChildren(view);
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3036SemanticChildren(view);
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3037SemanticChildren(view);
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3038SemanticChildren(view);
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3039SemanticChildren(view);
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return getSingleFilterUnit_3040SemanticChildren(view);
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return getMultiFilterUnit_3041SemanticChildren(view);
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3042SemanticChildren(view);
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3043SemanticChildren(view);
		case SequentialUnit3EditPart.VISUAL_ID:
			return getSequentialUnit_3044SemanticChildren(view);
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3045SemanticChildren(view);
		case ConditionalUnit3EditPart.VISUAL_ID:
			return getConditionalUnit_3046SemanticChildren(view);
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3047SemanticChildren(view);
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3048SemanticChildren(view);
		case AtomicUnit3EditPart.VISUAL_ID:
			return getAtomicUnit_3049SemanticChildren(view);
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3050SemanticChildren(view);
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3051SemanticChildren(view);
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return getSingleFilterUnit_3052SemanticChildren(view);
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return getMultiFilterUnit_3053SemanticChildren(view);
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3054SemanticChildren(view);
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3055SemanticChildren(view);
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3056SemanticChildren(view);
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return getSingleFilterUnit_3057SemanticChildren(view);
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return getMultiFilterUnit_3058SemanticChildren(view);
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3059SemanticChildren(view);
		case SequentialUnit4EditPart.VISUAL_ID:
			return getSequentialUnit_3060SemanticChildren(view);
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3061SemanticChildren(view);
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3062SemanticChildren(view);
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return getSingleFilterUnit_3063SemanticChildren(view);
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return getMultiFilterUnit_3064SemanticChildren(view);
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3065SemanticChildren(view);
		case ConditionalUnit4EditPart.VISUAL_ID:
			return getConditionalUnit_3066SemanticChildren(view);
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3067SemanticChildren(view);
		case AtomicUnit4EditPart.VISUAL_ID:
			return getAtomicUnit_3068SemanticChildren(view);
		case SequentialUnit5EditPart.VISUAL_ID:
			return getSequentialUnit_3069SemanticChildren(view);
		case SequentialUnit6EditPart.VISUAL_ID:
			return getSequentialUnit_3070SemanticChildren(view);
		case ConditionalUnit5EditPart.VISUAL_ID:
			return getConditionalUnit_3071SemanticChildren(view);
		case ConditionalUnit6EditPart.VISUAL_ID:
			return getConditionalUnit_3072SemanticChildren(view);
		case SequentialUnit7EditPart.VISUAL_ID:
			return getSequentialUnit_3073SemanticChildren(view);
		case AtomicUnit5EditPart.VISUAL_ID:
			return getAtomicUnit_3074SemanticChildren(view);
		case ConditionalUnit7EditPart.VISUAL_ID:
			return getConditionalUnit_3075SemanticChildren(view);
		case AtomicUnit6EditPart.VISUAL_ID:
			return getAtomicUnit_3077SemanticChildren(view);
		case AtomicUnit7EditPart.VISUAL_ID:
			return getAtomicUnit_3078SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7001SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7002SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7003SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7004SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7005SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7006SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7007SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7008SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7009SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7010SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7011SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7012SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7013SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7014SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7015SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7016SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartmentEditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7017SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7018SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7019SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7020SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7021SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7022SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7023SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7024SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7025SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7026SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7027SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7028SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7029SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7030SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7031SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7032SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7033SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7034SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartment2EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7035SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7036SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7037SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7038SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7039SemanticChildren(view);
		case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
			return getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7040SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7041SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7042SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7043SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7044SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7045SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7046SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7047SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7048SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7049SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7050SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartment3EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7051SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7052SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7053SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7054SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7055SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7056SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7057SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7058SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7059SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7060SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartment4EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7061SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7062SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7063SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7064SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartment5EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7065SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7066SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7067SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7068SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7069SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7070SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartment6EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7071SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7072SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7073SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7074SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7075SemanticChildren(view);
		case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
			return getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7076SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7077SemanticChildren(view);
		case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
			return getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7078SemanticChildren(view);
		case SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitHelperUnitsCompartment_7079SemanticChildren(view);
		case SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
			return getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7080SemanticChildren(view);
		case ConditionalUnitConditionalUnitIfCompartment7EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitIfCompartment_7081SemanticChildren(view);
		case ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitHelperUnitsCompartment_7082SemanticChildren(view);
		case ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitThenCompartment_7083SemanticChildren(view);
		case ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID:
			return getConditionalUnitConditionalUnitElseCompartment_7084SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCompositeRefactoring_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CompositeRefactoring modelElement = (CompositeRefactoring) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			RefactoringUnit childElement = modelElement
					.getMainRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_2004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_2005SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_2007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_3003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_3004SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_3007SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFeatureUnit_3008SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFeatureUnit modelElement = (SingleFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFeatureUnit_3012SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFeatureUnit modelElement = (MultiFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFilterUnit_3016SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFilterUnit modelElement = (SingleFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFilterUnit_3019SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFilterUnit modelElement = (MultiFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_3022SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_3025SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_3026SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_3029SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_3030SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_3033SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_3034SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_3036SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_3037SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFeatureUnit_3038SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFeatureUnit modelElement = (SingleFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFeatureUnit_3039SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFeatureUnit modelElement = (MultiFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFilterUnit_3040SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFilterUnit modelElement = (SingleFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFilterUnit_3041SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFilterUnit modelElement = (MultiFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_3042SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_3043SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_3044SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_3045SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_3046SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnit_3047SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnit_3048SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) view
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getMultiInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_3049SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFeatureUnit_3050SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFeatureUnit modelElement = (SingleFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFeatureUnit_3051SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFeatureUnit modelElement = (MultiFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFilterUnit_3052SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFilterUnit modelElement = (SingleFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFilterUnit_3053SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFilterUnit modelElement = (MultiFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_3054SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFeatureUnit_3055SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFeatureUnit modelElement = (SingleFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFeatureUnit_3056SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFeatureUnit modelElement = (MultiFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFilterUnit_3057SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFilterUnit modelElement = (SingleFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFilterUnit_3058SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFilterUnit modelElement = (MultiFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_3059SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_3060SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFeatureUnit_3061SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFeatureUnit modelElement = (SingleFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFeatureUnit_3062SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFeatureUnit modelElement = (MultiFeatureUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			SingleInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getSecondaryInputPorts().iterator(); it
				.hasNext();) {
			MultiInputPort childElement = (MultiInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPortEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleFilterUnit_3063SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleFilterUnit modelElement = (SingleFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			SingleOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getMultiFilterUnit_3064SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MultiFilterUnit modelElement = (MultiFilterUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			MultiInputPort childElement = modelElement.getInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		{
			MultiOutputPort childElement = modelElement.getOutputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiOutputPort2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_3065SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_3066SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnit_3067SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getSingleInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			MultiInputPort childElement = modelElement.getMultiInputPort();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == MultiInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_3068SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_3069SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_3070SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_3071SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_3072SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnit_3073SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_3074SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnit_3075SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			InputPort childElement = (InputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort8EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_3077SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getAtomicUnit_3078SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		AtomicUnit modelElement = (AtomicUnit) view.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getInputPorts().iterator(); it
				.hasNext();) {
			SingleInputPort childElement = (SingleInputPort) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleInputPort9EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7007SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7008SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7009SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7010SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7011SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7012SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7013SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7014SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7015SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7016SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7017SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7018SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7019SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7020SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7021SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7022SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7023SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7024SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7025SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7026SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7027SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7028SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7029SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7030SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7031SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7032SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7033SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7034SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7035SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7036SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7037SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7038SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment_7039SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnitEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getCartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment_7040SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		CartesianQueuedUnit modelElement = (CartesianQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7041SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7042SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7043SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7044SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7045SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7046SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7047SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7048SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7049SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7050SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7051SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7052SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7053SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7054SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7055SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7056SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7057SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7058SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7059SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7060SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7061SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7062SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7063SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7064SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7065SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7066SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7067SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7068SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7069SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7070SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7071SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7072SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7073SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7074SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment_7075SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit2EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment_7076SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ParallelQueuedUnit modelElement = (ParallelQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnits();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment_7077SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment_7078SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SingleQueuedUnit modelElement = (SingleQueuedUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getRefactoringUnit();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitHelperUnitsCompartment_7079SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getSequentialUnitSequentialUnitRefactoringUnitsCompartment_7080SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		SequentialUnit modelElement = (SequentialUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRefactoringUnits().iterator(); it
				.hasNext();) {
			RefactoringUnit childElement = (RefactoringUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ParallelQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SequentialUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == ConditionalUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == AtomicUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitIfCompartment_7081SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			ConditionCheck childElement = modelElement.getIf();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ConditionCheckEditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitHelperUnitsCompartment_7082SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHelperUnits().iterator(); it
				.hasNext();) {
			HelperUnit childElement = (HelperUnit) it.next();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SingleFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFeatureUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SingleFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == MultiFilterUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitThenCompartment_7083SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getThen();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit3EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit4EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit5EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit6EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelNodeDescriptor> getConditionalUnitConditionalUnitElseCompartment_7084SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		ConditionalUnit modelElement = (ConditionalUnit) containerView
				.getElement();
		LinkedList<ComrelNodeDescriptor> result = new LinkedList<ComrelNodeDescriptor>();
		{
			RefactoringUnit childElement = modelElement.getElse();
			int visualID = ComrelVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == CartesianQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ParallelQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SingleQueuedUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == SequentialUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == ConditionalUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
			if (visualID == AtomicUnit7EditPart.VISUAL_ID) {
				result.add(new ComrelNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getContainedLinks(View view) {
		switch (ComrelVisualIDRegistry.getVisualID(view)) {
		case CompositeRefactoringEditPart.VISUAL_ID:
			return getCompositeRefactoring_1000ContainedLinks(view);
		case SingleInputPortEditPart.VISUAL_ID:
			return getSingleInputPort_2001ContainedLinks(view);
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return getCartesianQueuedUnit_2002ContainedLinks(view);
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return getParallelQueuedUnit_2003ContainedLinks(view);
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return getSingleQueuedUnit_2004ContainedLinks(view);
		case SequentialUnitEditPart.VISUAL_ID:
			return getSequentialUnit_2005ContainedLinks(view);
		case ConditionalUnitEditPart.VISUAL_ID:
			return getConditionalUnit_2006ContainedLinks(view);
		case AtomicUnitEditPart.VISUAL_ID:
			return getAtomicUnit_2007ContainedLinks(view);
		case SingleInputPort2EditPart.VISUAL_ID:
			return getSingleInputPort_3001ContainedLinks(view);
		case MultiInputPortEditPart.VISUAL_ID:
			return getMultiInputPort_3002ContainedLinks(view);
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3003ContainedLinks(view);
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3004ContainedLinks(view);
		case SingleInputPort3EditPart.VISUAL_ID:
			return getSingleInputPort_3005ContainedLinks(view);
		case MultiInputPort2EditPart.VISUAL_ID:
			return getMultiInputPort_3006ContainedLinks(view);
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3007ContainedLinks(view);
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return getSingleFeatureUnit_3008ContainedLinks(view);
		case SingleInputPort4EditPart.VISUAL_ID:
			return getSingleInputPort_3009ContainedLinks(view);
		case MultiInputPort3EditPart.VISUAL_ID:
			return getMultiInputPort_3010ContainedLinks(view);
		case SingleOutputPortEditPart.VISUAL_ID:
			return getSingleOutputPort_3011ContainedLinks(view);
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return getMultiFeatureUnit_3012ContainedLinks(view);
		case SingleInputPort5EditPart.VISUAL_ID:
			return getSingleInputPort_3013ContainedLinks(view);
		case MultiInputPort4EditPart.VISUAL_ID:
			return getMultiInputPort_3014ContainedLinks(view);
		case MultiOutputPortEditPart.VISUAL_ID:
			return getMultiOutputPort_3015ContainedLinks(view);
		case SingleFilterUnitEditPart.VISUAL_ID:
			return getSingleFilterUnit_3016ContainedLinks(view);
		case MultiInputPort5EditPart.VISUAL_ID:
			return getMultiInputPort_3017ContainedLinks(view);
		case SingleOutputPort2EditPart.VISUAL_ID:
			return getSingleOutputPort_3018ContainedLinks(view);
		case MultiFilterUnitEditPart.VISUAL_ID:
			return getMultiFilterUnit_3019ContainedLinks(view);
		case MultiInputPort6EditPart.VISUAL_ID:
			return getMultiInputPort_3020ContainedLinks(view);
		case MultiOutputPort2EditPart.VISUAL_ID:
			return getMultiOutputPort_3021ContainedLinks(view);
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3022ContainedLinks(view);
		case SingleInputPort6EditPart.VISUAL_ID:
			return getSingleInputPort_3023ContainedLinks(view);
		case MultiInputPort7EditPart.VISUAL_ID:
			return getMultiInputPort_3024ContainedLinks(view);
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3025ContainedLinks(view);
		case SequentialUnit2EditPart.VISUAL_ID:
			return getSequentialUnit_3026ContainedLinks(view);
		case SingleInputPort7EditPart.VISUAL_ID:
			return getSingleInputPort_3027ContainedLinks(view);
		case MultiInputPort8EditPart.VISUAL_ID:
			return getMultiInputPort_3028ContainedLinks(view);
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3029ContainedLinks(view);
		case ConditionalUnit2EditPart.VISUAL_ID:
			return getConditionalUnit_3030ContainedLinks(view);
		case SingleInputPort8EditPart.VISUAL_ID:
			return getSingleInputPort_3031ContainedLinks(view);
		case MultiInputPort9EditPart.VISUAL_ID:
			return getMultiInputPort_3032ContainedLinks(view);
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3033ContainedLinks(view);
		case AtomicUnit2EditPart.VISUAL_ID:
			return getAtomicUnit_3034ContainedLinks(view);
		case SingleInputPort9EditPart.VISUAL_ID:
			return getSingleInputPort_3035ContainedLinks(view);
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3036ContainedLinks(view);
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3037ContainedLinks(view);
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3038ContainedLinks(view);
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3039ContainedLinks(view);
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return getSingleFilterUnit_3040ContainedLinks(view);
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return getMultiFilterUnit_3041ContainedLinks(view);
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3042ContainedLinks(view);
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3043ContainedLinks(view);
		case SequentialUnit3EditPart.VISUAL_ID:
			return getSequentialUnit_3044ContainedLinks(view);
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3045ContainedLinks(view);
		case ConditionalUnit3EditPart.VISUAL_ID:
			return getConditionalUnit_3046ContainedLinks(view);
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3047ContainedLinks(view);
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3048ContainedLinks(view);
		case AtomicUnit3EditPart.VISUAL_ID:
			return getAtomicUnit_3049ContainedLinks(view);
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3050ContainedLinks(view);
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3051ContainedLinks(view);
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return getSingleFilterUnit_3052ContainedLinks(view);
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return getMultiFilterUnit_3053ContainedLinks(view);
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3054ContainedLinks(view);
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3055ContainedLinks(view);
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3056ContainedLinks(view);
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return getSingleFilterUnit_3057ContainedLinks(view);
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return getMultiFilterUnit_3058ContainedLinks(view);
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3059ContainedLinks(view);
		case SequentialUnit4EditPart.VISUAL_ID:
			return getSequentialUnit_3060ContainedLinks(view);
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3061ContainedLinks(view);
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3062ContainedLinks(view);
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return getSingleFilterUnit_3063ContainedLinks(view);
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return getMultiFilterUnit_3064ContainedLinks(view);
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3065ContainedLinks(view);
		case ConditionalUnit4EditPart.VISUAL_ID:
			return getConditionalUnit_3066ContainedLinks(view);
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3067ContainedLinks(view);
		case AtomicUnit4EditPart.VISUAL_ID:
			return getAtomicUnit_3068ContainedLinks(view);
		case SequentialUnit5EditPart.VISUAL_ID:
			return getSequentialUnit_3069ContainedLinks(view);
		case SequentialUnit6EditPart.VISUAL_ID:
			return getSequentialUnit_3070ContainedLinks(view);
		case ConditionalUnit5EditPart.VISUAL_ID:
			return getConditionalUnit_3071ContainedLinks(view);
		case ConditionalUnit6EditPart.VISUAL_ID:
			return getConditionalUnit_3072ContainedLinks(view);
		case SequentialUnit7EditPart.VISUAL_ID:
			return getSequentialUnit_3073ContainedLinks(view);
		case AtomicUnit5EditPart.VISUAL_ID:
			return getAtomicUnit_3074ContainedLinks(view);
		case ConditionalUnit7EditPart.VISUAL_ID:
			return getConditionalUnit_3075ContainedLinks(view);
		case ConditionCheckEditPart.VISUAL_ID:
			return getConditionCheck_3076ContainedLinks(view);
		case AtomicUnit6EditPart.VISUAL_ID:
			return getAtomicUnit_3077ContainedLinks(view);
		case AtomicUnit7EditPart.VISUAL_ID:
			return getAtomicUnit_3078ContainedLinks(view);
		case SinglePortMappingEditPart.VISUAL_ID:
			return getSinglePortMapping_4001ContainedLinks(view);
		case MultiPortMappingEditPart.VISUAL_ID:
			return getMultiPortMapping_4002ContainedLinks(view);
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return getMultiSinglePortMapping_4003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getIncomingLinks(View view) {
		switch (ComrelVisualIDRegistry.getVisualID(view)) {
		case SingleInputPortEditPart.VISUAL_ID:
			return getSingleInputPort_2001IncomingLinks(view);
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return getCartesianQueuedUnit_2002IncomingLinks(view);
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return getParallelQueuedUnit_2003IncomingLinks(view);
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return getSingleQueuedUnit_2004IncomingLinks(view);
		case SequentialUnitEditPart.VISUAL_ID:
			return getSequentialUnit_2005IncomingLinks(view);
		case ConditionalUnitEditPart.VISUAL_ID:
			return getConditionalUnit_2006IncomingLinks(view);
		case AtomicUnitEditPart.VISUAL_ID:
			return getAtomicUnit_2007IncomingLinks(view);
		case SingleInputPort2EditPart.VISUAL_ID:
			return getSingleInputPort_3001IncomingLinks(view);
		case MultiInputPortEditPart.VISUAL_ID:
			return getMultiInputPort_3002IncomingLinks(view);
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3003IncomingLinks(view);
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3004IncomingLinks(view);
		case SingleInputPort3EditPart.VISUAL_ID:
			return getSingleInputPort_3005IncomingLinks(view);
		case MultiInputPort2EditPart.VISUAL_ID:
			return getMultiInputPort_3006IncomingLinks(view);
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3007IncomingLinks(view);
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return getSingleFeatureUnit_3008IncomingLinks(view);
		case SingleInputPort4EditPart.VISUAL_ID:
			return getSingleInputPort_3009IncomingLinks(view);
		case MultiInputPort3EditPart.VISUAL_ID:
			return getMultiInputPort_3010IncomingLinks(view);
		case SingleOutputPortEditPart.VISUAL_ID:
			return getSingleOutputPort_3011IncomingLinks(view);
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return getMultiFeatureUnit_3012IncomingLinks(view);
		case SingleInputPort5EditPart.VISUAL_ID:
			return getSingleInputPort_3013IncomingLinks(view);
		case MultiInputPort4EditPart.VISUAL_ID:
			return getMultiInputPort_3014IncomingLinks(view);
		case MultiOutputPortEditPart.VISUAL_ID:
			return getMultiOutputPort_3015IncomingLinks(view);
		case SingleFilterUnitEditPart.VISUAL_ID:
			return getSingleFilterUnit_3016IncomingLinks(view);
		case MultiInputPort5EditPart.VISUAL_ID:
			return getMultiInputPort_3017IncomingLinks(view);
		case SingleOutputPort2EditPart.VISUAL_ID:
			return getSingleOutputPort_3018IncomingLinks(view);
		case MultiFilterUnitEditPart.VISUAL_ID:
			return getMultiFilterUnit_3019IncomingLinks(view);
		case MultiInputPort6EditPart.VISUAL_ID:
			return getMultiInputPort_3020IncomingLinks(view);
		case MultiOutputPort2EditPart.VISUAL_ID:
			return getMultiOutputPort_3021IncomingLinks(view);
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3022IncomingLinks(view);
		case SingleInputPort6EditPart.VISUAL_ID:
			return getSingleInputPort_3023IncomingLinks(view);
		case MultiInputPort7EditPart.VISUAL_ID:
			return getMultiInputPort_3024IncomingLinks(view);
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3025IncomingLinks(view);
		case SequentialUnit2EditPart.VISUAL_ID:
			return getSequentialUnit_3026IncomingLinks(view);
		case SingleInputPort7EditPart.VISUAL_ID:
			return getSingleInputPort_3027IncomingLinks(view);
		case MultiInputPort8EditPart.VISUAL_ID:
			return getMultiInputPort_3028IncomingLinks(view);
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3029IncomingLinks(view);
		case ConditionalUnit2EditPart.VISUAL_ID:
			return getConditionalUnit_3030IncomingLinks(view);
		case SingleInputPort8EditPart.VISUAL_ID:
			return getSingleInputPort_3031IncomingLinks(view);
		case MultiInputPort9EditPart.VISUAL_ID:
			return getMultiInputPort_3032IncomingLinks(view);
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3033IncomingLinks(view);
		case AtomicUnit2EditPart.VISUAL_ID:
			return getAtomicUnit_3034IncomingLinks(view);
		case SingleInputPort9EditPart.VISUAL_ID:
			return getSingleInputPort_3035IncomingLinks(view);
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3036IncomingLinks(view);
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3037IncomingLinks(view);
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3038IncomingLinks(view);
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3039IncomingLinks(view);
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return getSingleFilterUnit_3040IncomingLinks(view);
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return getMultiFilterUnit_3041IncomingLinks(view);
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3042IncomingLinks(view);
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3043IncomingLinks(view);
		case SequentialUnit3EditPart.VISUAL_ID:
			return getSequentialUnit_3044IncomingLinks(view);
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3045IncomingLinks(view);
		case ConditionalUnit3EditPart.VISUAL_ID:
			return getConditionalUnit_3046IncomingLinks(view);
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3047IncomingLinks(view);
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3048IncomingLinks(view);
		case AtomicUnit3EditPart.VISUAL_ID:
			return getAtomicUnit_3049IncomingLinks(view);
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3050IncomingLinks(view);
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3051IncomingLinks(view);
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return getSingleFilterUnit_3052IncomingLinks(view);
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return getMultiFilterUnit_3053IncomingLinks(view);
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3054IncomingLinks(view);
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3055IncomingLinks(view);
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3056IncomingLinks(view);
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return getSingleFilterUnit_3057IncomingLinks(view);
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return getMultiFilterUnit_3058IncomingLinks(view);
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3059IncomingLinks(view);
		case SequentialUnit4EditPart.VISUAL_ID:
			return getSequentialUnit_3060IncomingLinks(view);
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3061IncomingLinks(view);
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3062IncomingLinks(view);
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return getSingleFilterUnit_3063IncomingLinks(view);
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return getMultiFilterUnit_3064IncomingLinks(view);
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3065IncomingLinks(view);
		case ConditionalUnit4EditPart.VISUAL_ID:
			return getConditionalUnit_3066IncomingLinks(view);
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3067IncomingLinks(view);
		case AtomicUnit4EditPart.VISUAL_ID:
			return getAtomicUnit_3068IncomingLinks(view);
		case SequentialUnit5EditPart.VISUAL_ID:
			return getSequentialUnit_3069IncomingLinks(view);
		case SequentialUnit6EditPart.VISUAL_ID:
			return getSequentialUnit_3070IncomingLinks(view);
		case ConditionalUnit5EditPart.VISUAL_ID:
			return getConditionalUnit_3071IncomingLinks(view);
		case ConditionalUnit6EditPart.VISUAL_ID:
			return getConditionalUnit_3072IncomingLinks(view);
		case SequentialUnit7EditPart.VISUAL_ID:
			return getSequentialUnit_3073IncomingLinks(view);
		case AtomicUnit5EditPart.VISUAL_ID:
			return getAtomicUnit_3074IncomingLinks(view);
		case ConditionalUnit7EditPart.VISUAL_ID:
			return getConditionalUnit_3075IncomingLinks(view);
		case ConditionCheckEditPart.VISUAL_ID:
			return getConditionCheck_3076IncomingLinks(view);
		case AtomicUnit6EditPart.VISUAL_ID:
			return getAtomicUnit_3077IncomingLinks(view);
		case AtomicUnit7EditPart.VISUAL_ID:
			return getAtomicUnit_3078IncomingLinks(view);
		case SinglePortMappingEditPart.VISUAL_ID:
			return getSinglePortMapping_4001IncomingLinks(view);
		case MultiPortMappingEditPart.VISUAL_ID:
			return getMultiPortMapping_4002IncomingLinks(view);
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return getMultiSinglePortMapping_4003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getOutgoingLinks(View view) {
		switch (ComrelVisualIDRegistry.getVisualID(view)) {
		case SingleInputPortEditPart.VISUAL_ID:
			return getSingleInputPort_2001OutgoingLinks(view);
		case CartesianQueuedUnitEditPart.VISUAL_ID:
			return getCartesianQueuedUnit_2002OutgoingLinks(view);
		case ParallelQueuedUnitEditPart.VISUAL_ID:
			return getParallelQueuedUnit_2003OutgoingLinks(view);
		case SingleQueuedUnitEditPart.VISUAL_ID:
			return getSingleQueuedUnit_2004OutgoingLinks(view);
		case SequentialUnitEditPart.VISUAL_ID:
			return getSequentialUnit_2005OutgoingLinks(view);
		case ConditionalUnitEditPart.VISUAL_ID:
			return getConditionalUnit_2006OutgoingLinks(view);
		case AtomicUnitEditPart.VISUAL_ID:
			return getAtomicUnit_2007OutgoingLinks(view);
		case SingleInputPort2EditPart.VISUAL_ID:
			return getSingleInputPort_3001OutgoingLinks(view);
		case MultiInputPortEditPart.VISUAL_ID:
			return getMultiInputPort_3002OutgoingLinks(view);
		case CartesianQueuedUnit2EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3003OutgoingLinks(view);
		case ParallelQueuedUnit2EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3004OutgoingLinks(view);
		case SingleInputPort3EditPart.VISUAL_ID:
			return getSingleInputPort_3005OutgoingLinks(view);
		case MultiInputPort2EditPart.VISUAL_ID:
			return getMultiInputPort_3006OutgoingLinks(view);
		case CartesianQueuedUnit3EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3007OutgoingLinks(view);
		case SingleFeatureUnitEditPart.VISUAL_ID:
			return getSingleFeatureUnit_3008OutgoingLinks(view);
		case SingleInputPort4EditPart.VISUAL_ID:
			return getSingleInputPort_3009OutgoingLinks(view);
		case MultiInputPort3EditPart.VISUAL_ID:
			return getMultiInputPort_3010OutgoingLinks(view);
		case SingleOutputPortEditPart.VISUAL_ID:
			return getSingleOutputPort_3011OutgoingLinks(view);
		case MultiFeatureUnitEditPart.VISUAL_ID:
			return getMultiFeatureUnit_3012OutgoingLinks(view);
		case SingleInputPort5EditPart.VISUAL_ID:
			return getSingleInputPort_3013OutgoingLinks(view);
		case MultiInputPort4EditPart.VISUAL_ID:
			return getMultiInputPort_3014OutgoingLinks(view);
		case MultiOutputPortEditPart.VISUAL_ID:
			return getMultiOutputPort_3015OutgoingLinks(view);
		case SingleFilterUnitEditPart.VISUAL_ID:
			return getSingleFilterUnit_3016OutgoingLinks(view);
		case MultiInputPort5EditPart.VISUAL_ID:
			return getMultiInputPort_3017OutgoingLinks(view);
		case SingleOutputPort2EditPart.VISUAL_ID:
			return getSingleOutputPort_3018OutgoingLinks(view);
		case MultiFilterUnitEditPart.VISUAL_ID:
			return getMultiFilterUnit_3019OutgoingLinks(view);
		case MultiInputPort6EditPart.VISUAL_ID:
			return getMultiInputPort_3020OutgoingLinks(view);
		case MultiOutputPort2EditPart.VISUAL_ID:
			return getMultiOutputPort_3021OutgoingLinks(view);
		case SingleQueuedUnit2EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3022OutgoingLinks(view);
		case SingleInputPort6EditPart.VISUAL_ID:
			return getSingleInputPort_3023OutgoingLinks(view);
		case MultiInputPort7EditPart.VISUAL_ID:
			return getMultiInputPort_3024OutgoingLinks(view);
		case CartesianQueuedUnit4EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3025OutgoingLinks(view);
		case SequentialUnit2EditPart.VISUAL_ID:
			return getSequentialUnit_3026OutgoingLinks(view);
		case SingleInputPort7EditPart.VISUAL_ID:
			return getSingleInputPort_3027OutgoingLinks(view);
		case MultiInputPort8EditPart.VISUAL_ID:
			return getMultiInputPort_3028OutgoingLinks(view);
		case CartesianQueuedUnit5EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3029OutgoingLinks(view);
		case ConditionalUnit2EditPart.VISUAL_ID:
			return getConditionalUnit_3030OutgoingLinks(view);
		case SingleInputPort8EditPart.VISUAL_ID:
			return getSingleInputPort_3031OutgoingLinks(view);
		case MultiInputPort9EditPart.VISUAL_ID:
			return getMultiInputPort_3032OutgoingLinks(view);
		case CartesianQueuedUnit6EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3033OutgoingLinks(view);
		case AtomicUnit2EditPart.VISUAL_ID:
			return getAtomicUnit_3034OutgoingLinks(view);
		case SingleInputPort9EditPart.VISUAL_ID:
			return getSingleInputPort_3035OutgoingLinks(view);
		case ParallelQueuedUnit3EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3036OutgoingLinks(view);
		case ParallelQueuedUnit4EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3037OutgoingLinks(view);
		case SingleFeatureUnit2EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3038OutgoingLinks(view);
		case MultiFeatureUnit2EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3039OutgoingLinks(view);
		case SingleFilterUnit2EditPart.VISUAL_ID:
			return getSingleFilterUnit_3040OutgoingLinks(view);
		case MultiFilterUnit2EditPart.VISUAL_ID:
			return getMultiFilterUnit_3041OutgoingLinks(view);
		case SingleQueuedUnit3EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3042OutgoingLinks(view);
		case ParallelQueuedUnit5EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3043OutgoingLinks(view);
		case SequentialUnit3EditPart.VISUAL_ID:
			return getSequentialUnit_3044OutgoingLinks(view);
		case ParallelQueuedUnit6EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3045OutgoingLinks(view);
		case ConditionalUnit3EditPart.VISUAL_ID:
			return getConditionalUnit_3046OutgoingLinks(view);
		case CartesianQueuedUnit7EditPart.VISUAL_ID:
			return getCartesianQueuedUnit_3047OutgoingLinks(view);
		case ParallelQueuedUnit7EditPart.VISUAL_ID:
			return getParallelQueuedUnit_3048OutgoingLinks(view);
		case AtomicUnit3EditPart.VISUAL_ID:
			return getAtomicUnit_3049OutgoingLinks(view);
		case SingleFeatureUnit3EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3050OutgoingLinks(view);
		case MultiFeatureUnit3EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3051OutgoingLinks(view);
		case SingleFilterUnit3EditPart.VISUAL_ID:
			return getSingleFilterUnit_3052OutgoingLinks(view);
		case MultiFilterUnit3EditPart.VISUAL_ID:
			return getMultiFilterUnit_3053OutgoingLinks(view);
		case SingleQueuedUnit4EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3054OutgoingLinks(view);
		case SingleFeatureUnit4EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3055OutgoingLinks(view);
		case MultiFeatureUnit4EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3056OutgoingLinks(view);
		case SingleFilterUnit4EditPart.VISUAL_ID:
			return getSingleFilterUnit_3057OutgoingLinks(view);
		case MultiFilterUnit4EditPart.VISUAL_ID:
			return getMultiFilterUnit_3058OutgoingLinks(view);
		case SingleQueuedUnit5EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3059OutgoingLinks(view);
		case SequentialUnit4EditPart.VISUAL_ID:
			return getSequentialUnit_3060OutgoingLinks(view);
		case SingleFeatureUnit5EditPart.VISUAL_ID:
			return getSingleFeatureUnit_3061OutgoingLinks(view);
		case MultiFeatureUnit5EditPart.VISUAL_ID:
			return getMultiFeatureUnit_3062OutgoingLinks(view);
		case SingleFilterUnit5EditPart.VISUAL_ID:
			return getSingleFilterUnit_3063OutgoingLinks(view);
		case MultiFilterUnit5EditPart.VISUAL_ID:
			return getMultiFilterUnit_3064OutgoingLinks(view);
		case SingleQueuedUnit6EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3065OutgoingLinks(view);
		case ConditionalUnit4EditPart.VISUAL_ID:
			return getConditionalUnit_3066OutgoingLinks(view);
		case SingleQueuedUnit7EditPart.VISUAL_ID:
			return getSingleQueuedUnit_3067OutgoingLinks(view);
		case AtomicUnit4EditPart.VISUAL_ID:
			return getAtomicUnit_3068OutgoingLinks(view);
		case SequentialUnit5EditPart.VISUAL_ID:
			return getSequentialUnit_3069OutgoingLinks(view);
		case SequentialUnit6EditPart.VISUAL_ID:
			return getSequentialUnit_3070OutgoingLinks(view);
		case ConditionalUnit5EditPart.VISUAL_ID:
			return getConditionalUnit_3071OutgoingLinks(view);
		case ConditionalUnit6EditPart.VISUAL_ID:
			return getConditionalUnit_3072OutgoingLinks(view);
		case SequentialUnit7EditPart.VISUAL_ID:
			return getSequentialUnit_3073OutgoingLinks(view);
		case AtomicUnit5EditPart.VISUAL_ID:
			return getAtomicUnit_3074OutgoingLinks(view);
		case ConditionalUnit7EditPart.VISUAL_ID:
			return getConditionalUnit_3075OutgoingLinks(view);
		case ConditionCheckEditPart.VISUAL_ID:
			return getConditionCheck_3076OutgoingLinks(view);
		case AtomicUnit6EditPart.VISUAL_ID:
			return getAtomicUnit_3077OutgoingLinks(view);
		case AtomicUnit7EditPart.VISUAL_ID:
			return getAtomicUnit_3078OutgoingLinks(view);
		case SinglePortMappingEditPart.VISUAL_ID:
			return getSinglePortMapping_4001OutgoingLinks(view);
		case MultiPortMappingEditPart.VISUAL_ID:
			return getMultiPortMapping_4002OutgoingLinks(view);
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return getMultiSinglePortMapping_4003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCompositeRefactoring_1000ContainedLinks(
			View view) {
		CompositeRefactoring modelElement = (CompositeRefactoring) view
				.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_2004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_2006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3008ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3009ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3010ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleOutputPort_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3014ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiOutputPort_3015ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3017ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleOutputPort_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiOutputPort_3021ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3022ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3023ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3024ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3025ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3026ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3027ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3028ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3029ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3030ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3031ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3032ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3033ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3034ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3035ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3036ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3037ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3038ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3039ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3040ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3041ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3042ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3043ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3044ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3045ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3046ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3047ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3048ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3049ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3050ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3051ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3052ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3053ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3054ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3055ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3056ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3057ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3058ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3059ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3060ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3061ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3062ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3063ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3064ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3065ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3066ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3067ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3068ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3069ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3070ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3071ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3072ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3073ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3074ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3075ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionCheck_3076ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3077ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3078ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSinglePortMapping_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiPortMapping_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiSinglePortMapping_4003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_2001IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_2006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3001IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3002IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3005IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3006IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3008IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3009IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3010IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleOutputPort_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3013IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3014IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiOutputPort_3015IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3017IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleOutputPort_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3020IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiOutputPort_3021IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3022IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3023IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3024IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3025IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3026IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3027IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3028IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3029IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3030IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3031IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3032IncomingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3033IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3034IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3035IncomingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3036IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3037IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3038IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3039IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3040IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3041IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3042IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3043IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3044IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3045IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3046IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3047IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3048IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3049IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3050IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3051IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3052IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3053IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3054IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3055IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3056IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3057IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3058IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3059IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3060IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3061IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3062IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3063IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3064IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3065IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3066IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3067IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3068IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3069IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3070IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3071IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3072IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3073IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3074IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3075IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionCheck_3076IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3077IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3078IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSinglePortMapping_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiPortMapping_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiSinglePortMapping_4003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_2001OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_2004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_2006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3001OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3002OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3005OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3006OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3008OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3009OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3010OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleOutputPort_3011OutgoingLinks(
			View view) {
		SingleOutputPort modelElement = (SingleOutputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3013OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3014OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiOutputPort_3015OutgoingLinks(
			View view) {
		MultiOutputPort modelElement = (MultiOutputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3017OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleOutputPort_3018OutgoingLinks(
			View view) {
		SingleOutputPort modelElement = (SingleOutputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3020OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiOutputPort_3021OutgoingLinks(
			View view) {
		MultiOutputPort modelElement = (MultiOutputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3022OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3023OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3024OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3025OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3026OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3027OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3028OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3029OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3030OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3031OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiInputPort_3032OutgoingLinks(
			View view) {
		MultiInputPort modelElement = (MultiInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3033OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3034OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleInputPort_3035OutgoingLinks(
			View view) {
		SingleInputPort modelElement = (SingleInputPort) view.getElement();
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3036OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3037OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3038OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3039OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3040OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3041OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3042OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3043OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3044OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3045OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3046OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getCartesianQueuedUnit_3047OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getParallelQueuedUnit_3048OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3049OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3050OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3051OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3052OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3053OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3054OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3055OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3056OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3057OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3058OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3059OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3060OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFeatureUnit_3061OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFeatureUnit_3062OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleFilterUnit_3063OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiFilterUnit_3064OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3065OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3066OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSingleQueuedUnit_3067OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3068OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3069OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3070OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3071OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3072OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSequentialUnit_3073OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3074OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionalUnit_3075OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getConditionCheck_3076OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3077OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getAtomicUnit_3078OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getSinglePortMapping_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiPortMapping_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ComrelLinkDescriptor> getMultiSinglePortMapping_4003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getContainedTypeModelFacetLinks_SinglePortMapping_4001(
			CompositeRefactoring container) {
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		for (Iterator<?> links = container.getPortMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SinglePortMapping) {
				continue;
			}
			SinglePortMapping link = (SinglePortMapping) linkObject;
			if (SinglePortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SingleInputPort dst = link.getTarget();
			SinglePort src = link.getSource();
			result.add(new ComrelLinkDescriptor(src, dst, link,
					ComrelElementTypes.SinglePortMapping_4001,
					SinglePortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getContainedTypeModelFacetLinks_MultiPortMapping_4002(
			CompositeRefactoring container) {
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		for (Iterator<?> links = container.getPortMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiPortMapping) {
				continue;
			}
			MultiPortMapping link = (MultiPortMapping) linkObject;
			if (MultiPortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MultiInputPort dst = link.getTarget();
			MultiPort src = link.getSource();
			result.add(new ComrelLinkDescriptor(src, dst, link,
					ComrelElementTypes.MultiPortMapping_4002,
					MultiPortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getContainedTypeModelFacetLinks_MultiSinglePortMapping_4003(
			CompositeRefactoring container) {
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		for (Iterator<?> links = container.getPortMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiSinglePortMapping) {
				continue;
			}
			MultiSinglePortMapping link = (MultiSinglePortMapping) linkObject;
			if (MultiSinglePortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SingleInputPort dst = link.getTarget();
			MultiPort src = link.getSource();
			result.add(new ComrelLinkDescriptor(src, dst, link,
					ComrelElementTypes.MultiSinglePortMapping_4003,
					MultiSinglePortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getIncomingTypeModelFacetLinks_SinglePortMapping_4001(
			SingleInputPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComrelPackage.eINSTANCE
					.getSinglePortMapping_Target()
					|| false == setting.getEObject() instanceof SinglePortMapping) {
				continue;
			}
			SinglePortMapping link = (SinglePortMapping) setting.getEObject();
			if (SinglePortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SinglePort src = link.getSource();
			result.add(new ComrelLinkDescriptor(src, target, link,
					ComrelElementTypes.SinglePortMapping_4001,
					SinglePortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getIncomingTypeModelFacetLinks_MultiPortMapping_4002(
			MultiInputPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComrelPackage.eINSTANCE
					.getMultiPortMapping_Target()
					|| false == setting.getEObject() instanceof MultiPortMapping) {
				continue;
			}
			MultiPortMapping link = (MultiPortMapping) setting.getEObject();
			if (MultiPortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MultiPort src = link.getSource();
			result.add(new ComrelLinkDescriptor(src, target, link,
					ComrelElementTypes.MultiPortMapping_4002,
					MultiPortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getIncomingTypeModelFacetLinks_MultiSinglePortMapping_4003(
			SingleInputPort target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ComrelPackage.eINSTANCE
					.getMultiSinglePortMapping_Target()
					|| false == setting.getEObject() instanceof MultiSinglePortMapping) {
				continue;
			}
			MultiSinglePortMapping link = (MultiSinglePortMapping) setting
					.getEObject();
			if (MultiSinglePortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MultiPort src = link.getSource();
			result.add(new ComrelLinkDescriptor(src, target, link,
					ComrelElementTypes.MultiSinglePortMapping_4003,
					MultiSinglePortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getOutgoingTypeModelFacetLinks_SinglePortMapping_4001(
			SinglePort source) {
		CompositeRefactoring container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeRefactoring) {
				container = (CompositeRefactoring) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		for (Iterator<?> links = container.getPortMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof SinglePortMapping) {
				continue;
			}
			SinglePortMapping link = (SinglePortMapping) linkObject;
			if (SinglePortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SingleInputPort dst = link.getTarget();
			SinglePort src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComrelLinkDescriptor(src, dst, link,
					ComrelElementTypes.SinglePortMapping_4001,
					SinglePortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getOutgoingTypeModelFacetLinks_MultiPortMapping_4002(
			MultiPort source) {
		CompositeRefactoring container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeRefactoring) {
				container = (CompositeRefactoring) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		for (Iterator<?> links = container.getPortMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiPortMapping) {
				continue;
			}
			MultiPortMapping link = (MultiPortMapping) linkObject;
			if (MultiPortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MultiInputPort dst = link.getTarget();
			MultiPort src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComrelLinkDescriptor(src, dst, link,
					ComrelElementTypes.MultiPortMapping_4002,
					MultiPortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ComrelLinkDescriptor> getOutgoingTypeModelFacetLinks_MultiSinglePortMapping_4003(
			MultiPort source) {
		CompositeRefactoring container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof CompositeRefactoring) {
				container = (CompositeRefactoring) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ComrelLinkDescriptor> result = new LinkedList<ComrelLinkDescriptor>();
		for (Iterator<?> links = container.getPortMappings().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MultiSinglePortMapping) {
				continue;
			}
			MultiSinglePortMapping link = (MultiSinglePortMapping) linkObject;
			if (MultiSinglePortMappingEditPart.VISUAL_ID != ComrelVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			SingleInputPort dst = link.getTarget();
			MultiPort src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ComrelLinkDescriptor(src, dst, link,
					ComrelElementTypes.MultiSinglePortMapping_4003,
					MultiSinglePortMappingEditPart.VISUAL_ID));
		}
		return result;
	}

}
