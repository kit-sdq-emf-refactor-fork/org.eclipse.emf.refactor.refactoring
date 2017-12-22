/*
 * 
 */
package comrel.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import comrel.diagram.part.ComrelVisualIDRegistry;

/**
 * @generated
 */
public class ComrelEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ComrelVisualIDRegistry.getVisualID(view)) {

			case CompositeRefactoringEditPart.VISUAL_ID:
				return new CompositeRefactoringEditPart(view);

			case SingleInputPortEditPart.VISUAL_ID:
				return new SingleInputPortEditPart(view);

			case SingleInputPortNameTypeEditPart.VISUAL_ID:
				return new SingleInputPortNameTypeEditPart(view);

			case CartesianQueuedUnitEditPart.VISUAL_ID:
				return new CartesianQueuedUnitEditPart(view);

			case CartesianQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrictEditPart(view);

			case ParallelQueuedUnitEditPart.VISUAL_ID:
				return new ParallelQueuedUnitEditPart(view);

			case ParallelQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrictEditPart(view);

			case SingleQueuedUnitEditPart.VISUAL_ID:
				return new SingleQueuedUnitEditPart(view);

			case SingleQueuedUnitNameTypeLblStrictEditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrictEditPart(view);

			case SequentialUnitEditPart.VISUAL_ID:
				return new SequentialUnitEditPart(view);

			case SequentialUnitNameTypeLblStrictEditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrictEditPart(view);

			case ConditionalUnitEditPart.VISUAL_ID:
				return new ConditionalUnitEditPart(view);

			case ConditionalUnitNameTypeEditPart.VISUAL_ID:
				return new ConditionalUnitNameTypeEditPart(view);

			case AtomicUnitEditPart.VISUAL_ID:
				return new AtomicUnitEditPart(view);

			case AtomicUnitLabelTypeEditPart.VISUAL_ID:
				return new AtomicUnitLabelTypeEditPart(view);

			case SingleInputPort2EditPart.VISUAL_ID:
				return new SingleInputPort2EditPart(view);

			case SingleInputPortNameType2EditPart.VISUAL_ID:
				return new SingleInputPortNameType2EditPart(view);

			case MultiInputPortEditPart.VISUAL_ID:
				return new MultiInputPortEditPart(view);

			case MultiInputPortNameTypeEditPart.VISUAL_ID:
				return new MultiInputPortNameTypeEditPart(view);

			case CartesianQueuedUnit2EditPart.VISUAL_ID:
				return new CartesianQueuedUnit2EditPart(view);

			case CartesianQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrict2EditPart(view);

			case ParallelQueuedUnit2EditPart.VISUAL_ID:
				return new ParallelQueuedUnit2EditPart(view);

			case ParallelQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrict2EditPart(view);

			case SingleInputPort3EditPart.VISUAL_ID:
				return new SingleInputPort3EditPart(view);

			case SingleInputPortNameType3EditPart.VISUAL_ID:
				return new SingleInputPortNameType3EditPart(view);

			case MultiInputPort2EditPart.VISUAL_ID:
				return new MultiInputPort2EditPart(view);

			case MultiInputPortNameType2EditPart.VISUAL_ID:
				return new MultiInputPortNameType2EditPart(view);

			case CartesianQueuedUnit3EditPart.VISUAL_ID:
				return new CartesianQueuedUnit3EditPart(view);

			case CartesianQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrict3EditPart(view);

			case SingleFeatureUnitEditPart.VISUAL_ID:
				return new SingleFeatureUnitEditPart(view);

			case SingleFeatureUnitNameTypeEditPart.VISUAL_ID:
				return new SingleFeatureUnitNameTypeEditPart(view);

			case SingleInputPort4EditPart.VISUAL_ID:
				return new SingleInputPort4EditPart(view);

			case SingleInputPortNameType4EditPart.VISUAL_ID:
				return new SingleInputPortNameType4EditPart(view);

			case MultiInputPort3EditPart.VISUAL_ID:
				return new MultiInputPort3EditPart(view);

			case MultiInputPortNameType3EditPart.VISUAL_ID:
				return new MultiInputPortNameType3EditPart(view);

			case SingleOutputPortEditPart.VISUAL_ID:
				return new SingleOutputPortEditPart(view);

			case SingleOutputPortNameTypeEditPart.VISUAL_ID:
				return new SingleOutputPortNameTypeEditPart(view);

			case MultiFeatureUnitEditPart.VISUAL_ID:
				return new MultiFeatureUnitEditPart(view);

			case MultiFeatureUnitNameTypeEditPart.VISUAL_ID:
				return new MultiFeatureUnitNameTypeEditPart(view);

			case SingleInputPort5EditPart.VISUAL_ID:
				return new SingleInputPort5EditPart(view);

			case SingleInputPortNameType5EditPart.VISUAL_ID:
				return new SingleInputPortNameType5EditPart(view);

			case MultiInputPort4EditPart.VISUAL_ID:
				return new MultiInputPort4EditPart(view);

			case MultiInputPortNameType4EditPart.VISUAL_ID:
				return new MultiInputPortNameType4EditPart(view);

			case MultiOutputPortEditPart.VISUAL_ID:
				return new MultiOutputPortEditPart(view);

			case MultiOutputPortNameTypeEditPart.VISUAL_ID:
				return new MultiOutputPortNameTypeEditPart(view);

			case SingleFilterUnitEditPart.VISUAL_ID:
				return new SingleFilterUnitEditPart(view);

			case SingleFilterUnitNameTypeEditPart.VISUAL_ID:
				return new SingleFilterUnitNameTypeEditPart(view);

			case MultiInputPort5EditPart.VISUAL_ID:
				return new MultiInputPort5EditPart(view);

			case MultiInputPortNameType5EditPart.VISUAL_ID:
				return new MultiInputPortNameType5EditPart(view);

			case SingleOutputPort2EditPart.VISUAL_ID:
				return new SingleOutputPort2EditPart(view);

			case SingleOutputPortNameType2EditPart.VISUAL_ID:
				return new SingleOutputPortNameType2EditPart(view);

			case MultiFilterUnitEditPart.VISUAL_ID:
				return new MultiFilterUnitEditPart(view);

			case MultiFilterUnitNameTypeEditPart.VISUAL_ID:
				return new MultiFilterUnitNameTypeEditPart(view);

			case MultiInputPort6EditPart.VISUAL_ID:
				return new MultiInputPort6EditPart(view);

			case MultiInputPortNameType6EditPart.VISUAL_ID:
				return new MultiInputPortNameType6EditPart(view);

			case MultiOutputPort2EditPart.VISUAL_ID:
				return new MultiOutputPort2EditPart(view);

			case MultiOutputPortNameType2EditPart.VISUAL_ID:
				return new MultiOutputPortNameType2EditPart(view);

			case SingleQueuedUnit2EditPart.VISUAL_ID:
				return new SingleQueuedUnit2EditPart(view);

			case SingleQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrict2EditPart(view);

			case SingleInputPort6EditPart.VISUAL_ID:
				return new SingleInputPort6EditPart(view);

			case SingleInputPortNameType6EditPart.VISUAL_ID:
				return new SingleInputPortNameType6EditPart(view);

			case MultiInputPort7EditPart.VISUAL_ID:
				return new MultiInputPort7EditPart(view);

			case MultiInputPortNameType7EditPart.VISUAL_ID:
				return new MultiInputPortNameType7EditPart(view);

			case CartesianQueuedUnit4EditPart.VISUAL_ID:
				return new CartesianQueuedUnit4EditPart(view);

			case CartesianQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrict4EditPart(view);

			case SequentialUnit2EditPart.VISUAL_ID:
				return new SequentialUnit2EditPart(view);

			case SequentialUnitNameTypeLblStrict2EditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrict2EditPart(view);

			case SingleInputPort7EditPart.VISUAL_ID:
				return new SingleInputPort7EditPart(view);

			case SingleInputPortNameType7EditPart.VISUAL_ID:
				return new SingleInputPortNameType7EditPart(view);

			case MultiInputPort8EditPart.VISUAL_ID:
				return new MultiInputPort8EditPart(view);

			case MultiInputPortNameType8EditPart.VISUAL_ID:
				return new MultiInputPortNameType8EditPart(view);

			case CartesianQueuedUnit5EditPart.VISUAL_ID:
				return new CartesianQueuedUnit5EditPart(view);

			case CartesianQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrict5EditPart(view);

			case ConditionalUnit2EditPart.VISUAL_ID:
				return new ConditionalUnit2EditPart(view);

			case ConditionalUnitNameType2EditPart.VISUAL_ID:
				return new ConditionalUnitNameType2EditPart(view);

			case SingleInputPort8EditPart.VISUAL_ID:
				return new SingleInputPort8EditPart(view);

			case SingleInputPortNameType8EditPart.VISUAL_ID:
				return new SingleInputPortNameType8EditPart(view);

			case MultiInputPort9EditPart.VISUAL_ID:
				return new MultiInputPort9EditPart(view);

			case MultiInputPortNameType9EditPart.VISUAL_ID:
				return new MultiInputPortNameType9EditPart(view);

			case CartesianQueuedUnit6EditPart.VISUAL_ID:
				return new CartesianQueuedUnit6EditPart(view);

			case CartesianQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrict6EditPart(view);

			case AtomicUnit2EditPart.VISUAL_ID:
				return new AtomicUnit2EditPart(view);

			case AtomicUnitLabelType2EditPart.VISUAL_ID:
				return new AtomicUnitLabelType2EditPart(view);

			case SingleInputPort9EditPart.VISUAL_ID:
				return new SingleInputPort9EditPart(view);

			case SingleInputPortNameType9EditPart.VISUAL_ID:
				return new SingleInputPortNameType9EditPart(view);

			case ParallelQueuedUnit3EditPart.VISUAL_ID:
				return new ParallelQueuedUnit3EditPart(view);

			case ParallelQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrict3EditPart(view);

			case ParallelQueuedUnit4EditPart.VISUAL_ID:
				return new ParallelQueuedUnit4EditPart(view);

			case ParallelQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrict4EditPart(view);

			case SingleFeatureUnit2EditPart.VISUAL_ID:
				return new SingleFeatureUnit2EditPart(view);

			case SingleFeatureUnitNameType2EditPart.VISUAL_ID:
				return new SingleFeatureUnitNameType2EditPart(view);

			case MultiFeatureUnit2EditPart.VISUAL_ID:
				return new MultiFeatureUnit2EditPart(view);

			case MultiFeatureUnitNameType2EditPart.VISUAL_ID:
				return new MultiFeatureUnitNameType2EditPart(view);

			case SingleFilterUnit2EditPart.VISUAL_ID:
				return new SingleFilterUnit2EditPart(view);

			case SingleFilterUnitNameType2EditPart.VISUAL_ID:
				return new SingleFilterUnitNameType2EditPart(view);

			case MultiFilterUnit2EditPart.VISUAL_ID:
				return new MultiFilterUnit2EditPart(view);

			case MultiFilterUnitNameType2EditPart.VISUAL_ID:
				return new MultiFilterUnitNameType2EditPart(view);

			case SingleQueuedUnit3EditPart.VISUAL_ID:
				return new SingleQueuedUnit3EditPart(view);

			case SingleQueuedUnitNameTypeLblStrict3EditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrict3EditPart(view);

			case ParallelQueuedUnit5EditPart.VISUAL_ID:
				return new ParallelQueuedUnit5EditPart(view);

			case ParallelQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrict5EditPart(view);

			case SequentialUnit3EditPart.VISUAL_ID:
				return new SequentialUnit3EditPart(view);

			case SequentialUnitNameTypeLblStrict3EditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrict3EditPart(view);

			case ParallelQueuedUnit6EditPart.VISUAL_ID:
				return new ParallelQueuedUnit6EditPart(view);

			case ParallelQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrict6EditPart(view);

			case ConditionalUnit3EditPart.VISUAL_ID:
				return new ConditionalUnit3EditPart(view);

			case ConditionalUnitNameType3EditPart.VISUAL_ID:
				return new ConditionalUnitNameType3EditPart(view);

			case CartesianQueuedUnit7EditPart.VISUAL_ID:
				return new CartesianQueuedUnit7EditPart(view);

			case CartesianQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID:
				return new CartesianQueuedUnitNameTypeLblStrict7EditPart(view);

			case ParallelQueuedUnit7EditPart.VISUAL_ID:
				return new ParallelQueuedUnit7EditPart(view);

			case ParallelQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID:
				return new ParallelQueuedUnitNameTypeLblStrict7EditPart(view);

			case AtomicUnit3EditPart.VISUAL_ID:
				return new AtomicUnit3EditPart(view);

			case AtomicUnitLabelType3EditPart.VISUAL_ID:
				return new AtomicUnitLabelType3EditPart(view);

			case SingleFeatureUnit3EditPart.VISUAL_ID:
				return new SingleFeatureUnit3EditPart(view);

			case SingleFeatureUnitNameType3EditPart.VISUAL_ID:
				return new SingleFeatureUnitNameType3EditPart(view);

			case MultiFeatureUnit3EditPart.VISUAL_ID:
				return new MultiFeatureUnit3EditPart(view);

			case MultiFeatureUnitNameType3EditPart.VISUAL_ID:
				return new MultiFeatureUnitNameType3EditPart(view);

			case SingleFilterUnit3EditPart.VISUAL_ID:
				return new SingleFilterUnit3EditPart(view);

			case SingleFilterUnitNameType3EditPart.VISUAL_ID:
				return new SingleFilterUnitNameType3EditPart(view);

			case MultiFilterUnit3EditPart.VISUAL_ID:
				return new MultiFilterUnit3EditPart(view);

			case MultiFilterUnitNameType3EditPart.VISUAL_ID:
				return new MultiFilterUnitNameType3EditPart(view);

			case SingleQueuedUnit4EditPart.VISUAL_ID:
				return new SingleQueuedUnit4EditPart(view);

			case SingleQueuedUnitNameTypeLblStrict4EditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrict4EditPart(view);

			case SingleFeatureUnit4EditPart.VISUAL_ID:
				return new SingleFeatureUnit4EditPart(view);

			case SingleFeatureUnitNameType4EditPart.VISUAL_ID:
				return new SingleFeatureUnitNameType4EditPart(view);

			case MultiFeatureUnit4EditPart.VISUAL_ID:
				return new MultiFeatureUnit4EditPart(view);

			case MultiFeatureUnitNameType4EditPart.VISUAL_ID:
				return new MultiFeatureUnitNameType4EditPart(view);

			case SingleFilterUnit4EditPart.VISUAL_ID:
				return new SingleFilterUnit4EditPart(view);

			case SingleFilterUnitNameType4EditPart.VISUAL_ID:
				return new SingleFilterUnitNameType4EditPart(view);

			case MultiFilterUnit4EditPart.VISUAL_ID:
				return new MultiFilterUnit4EditPart(view);

			case MultiFilterUnitNameType4EditPart.VISUAL_ID:
				return new MultiFilterUnitNameType4EditPart(view);

			case SingleQueuedUnit5EditPart.VISUAL_ID:
				return new SingleQueuedUnit5EditPart(view);

			case SingleQueuedUnitNameTypeLblStrict5EditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrict5EditPart(view);

			case SequentialUnit4EditPart.VISUAL_ID:
				return new SequentialUnit4EditPart(view);

			case SequentialUnitNameTypeLblStrict4EditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrict4EditPart(view);

			case SingleFeatureUnit5EditPart.VISUAL_ID:
				return new SingleFeatureUnit5EditPart(view);

			case SingleFeatureUnitNameType5EditPart.VISUAL_ID:
				return new SingleFeatureUnitNameType5EditPart(view);

			case MultiFeatureUnit5EditPart.VISUAL_ID:
				return new MultiFeatureUnit5EditPart(view);

			case MultiFeatureUnitNameType5EditPart.VISUAL_ID:
				return new MultiFeatureUnitNameType5EditPart(view);

			case SingleFilterUnit5EditPart.VISUAL_ID:
				return new SingleFilterUnit5EditPart(view);

			case SingleFilterUnitNameType5EditPart.VISUAL_ID:
				return new SingleFilterUnitNameType5EditPart(view);

			case MultiFilterUnit5EditPart.VISUAL_ID:
				return new MultiFilterUnit5EditPart(view);

			case MultiFilterUnitNameType5EditPart.VISUAL_ID:
				return new MultiFilterUnitNameType5EditPart(view);

			case SingleQueuedUnit6EditPart.VISUAL_ID:
				return new SingleQueuedUnit6EditPart(view);

			case SingleQueuedUnitNameTypeLblStrict6EditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrict6EditPart(view);

			case ConditionalUnit4EditPart.VISUAL_ID:
				return new ConditionalUnit4EditPart(view);

			case ConditionalUnitNameType4EditPart.VISUAL_ID:
				return new ConditionalUnitNameType4EditPart(view);

			case SingleQueuedUnit7EditPart.VISUAL_ID:
				return new SingleQueuedUnit7EditPart(view);

			case SingleQueuedUnitNameTypeLblStrict7EditPart.VISUAL_ID:
				return new SingleQueuedUnitNameTypeLblStrict7EditPart(view);

			case AtomicUnit4EditPart.VISUAL_ID:
				return new AtomicUnit4EditPart(view);

			case AtomicUnitLabelType4EditPart.VISUAL_ID:
				return new AtomicUnitLabelType4EditPart(view);

			case SequentialUnit5EditPart.VISUAL_ID:
				return new SequentialUnit5EditPart(view);

			case SequentialUnitNameTypeLblStrict5EditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrict5EditPart(view);

			case SequentialUnit6EditPart.VISUAL_ID:
				return new SequentialUnit6EditPart(view);

			case SequentialUnitNameTypeLblStrict6EditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrict6EditPart(view);

			case ConditionalUnit5EditPart.VISUAL_ID:
				return new ConditionalUnit5EditPart(view);

			case ConditionalUnitNameType5EditPart.VISUAL_ID:
				return new ConditionalUnitNameType5EditPart(view);

			case ConditionalUnit6EditPart.VISUAL_ID:
				return new ConditionalUnit6EditPart(view);

			case ConditionalUnitNameType6EditPart.VISUAL_ID:
				return new ConditionalUnitNameType6EditPart(view);

			case SequentialUnit7EditPart.VISUAL_ID:
				return new SequentialUnit7EditPart(view);

			case SequentialUnitNameTypeLblStrict7EditPart.VISUAL_ID:
				return new SequentialUnitNameTypeLblStrict7EditPart(view);

			case AtomicUnit5EditPart.VISUAL_ID:
				return new AtomicUnit5EditPart(view);

			case AtomicUnitLabelType5EditPart.VISUAL_ID:
				return new AtomicUnitLabelType5EditPart(view);

			case ConditionalUnit7EditPart.VISUAL_ID:
				return new ConditionalUnit7EditPart(view);

			case ConditionalUnitNameType7EditPart.VISUAL_ID:
				return new ConditionalUnitNameType7EditPart(view);

			case ConditionCheckEditPart.VISUAL_ID:
				return new ConditionCheckEditPart(view);

			case ConditionCheckNameTypeSpecEditPart.VISUAL_ID:
				return new ConditionCheckNameTypeSpecEditPart(view);

			case AtomicUnit6EditPart.VISUAL_ID:
				return new AtomicUnit6EditPart(view);

			case AtomicUnitLabelType6EditPart.VISUAL_ID:
				return new AtomicUnitLabelType6EditPart(view);

			case AtomicUnit7EditPart.VISUAL_ID:
				return new AtomicUnit7EditPart(view);

			case AtomicUnitLabelType7EditPart.VISUAL_ID:
				return new AtomicUnitLabelType7EditPart(view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartmentEditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartmentEditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartmentEditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartmentEditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartmentEditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartmentEditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartment2EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartment2EditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartment2EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartment2EditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartment2EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartment2EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart(
						view);

			case CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
				return new CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartment3EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartment3EditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartment3EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartment3EditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartment3EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartment3EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartment4EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartment4EditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartment4EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartment4EditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartment4EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartment4EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartment5EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartment5EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartment5EditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartment5EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartment5EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartment6EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartment6EditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartment6EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartment6EditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartment6EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartment6EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart(
						view);

			case ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
				return new ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart(
						view);

			case SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart.VISUAL_ID:
				return new SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart(
						view);

			case SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart(
						view);

			case SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart.VISUAL_ID:
				return new SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart(
						view);

			case ConditionalUnitConditionalUnitIfCompartment7EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitIfCompartment7EditPart(
						view);

			case ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart(
						view);

			case ConditionalUnitConditionalUnitThenCompartment7EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitThenCompartment7EditPart(
						view);

			case ConditionalUnitConditionalUnitElseCompartment7EditPart.VISUAL_ID:
				return new ConditionalUnitConditionalUnitElseCompartment7EditPart(
						view);

			case SinglePortMappingEditPart.VISUAL_ID:
				return new SinglePortMappingEditPart(view);

			case MultiPortMappingEditPart.VISUAL_ID:
				return new MultiPortMappingEditPart(view);

			case MultiSinglePortMappingEditPart.VISUAL_ID:
				return new MultiSinglePortMappingEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
