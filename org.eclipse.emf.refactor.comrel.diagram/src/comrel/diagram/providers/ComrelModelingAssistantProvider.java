/*
 * 
 */
package comrel.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

import comrel.diagram.edit.parts.*;
import comrel.diagram.part.ComrelDiagramEditorPlugin;
import comrel.diagram.part.Messages;

/**
 * @generated
 */
public class ComrelModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof CompositeRefactoringEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(7);
			types.add(ComrelElementTypes.SingleInputPort_2001);
			types.add(ComrelElementTypes.CartesianQueuedUnit_2002);
			types.add(ComrelElementTypes.ParallelQueuedUnit_2003);
			types.add(ComrelElementTypes.SingleQueuedUnit_2004);
			types.add(ComrelElementTypes.SequentialUnit_2005);
			types.add(ComrelElementTypes.ConditionalUnit_2006);
			types.add(ComrelElementTypes.AtomicUnit_2007);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof SequentialUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof ConditionalUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof AtomicUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof SingleFeatureUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3009);
			types.add(ComrelElementTypes.MultiInputPort_3010);
			types.add(ComrelElementTypes.SingleOutputPort_3011);
			return types;
		}
		if (editPart instanceof MultiFeatureUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3013);
			types.add(ComrelElementTypes.MultiInputPort_3014);
			types.add(ComrelElementTypes.MultiOutputPort_3015);
			return types;
		}
		if (editPart instanceof SingleFilterUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3017);
			types.add(ComrelElementTypes.SingleOutputPort_3018);
			return types;
		}
		if (editPart instanceof MultiFilterUnitEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3020);
			types.add(ComrelElementTypes.MultiOutputPort_3021);
			return types;
		}
		if (editPart instanceof SingleQueuedUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof SequentialUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof ConditionalUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof AtomicUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof SingleFeatureUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3009);
			types.add(ComrelElementTypes.MultiInputPort_3010);
			types.add(ComrelElementTypes.SingleOutputPort_3011);
			return types;
		}
		if (editPart instanceof MultiFeatureUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3013);
			types.add(ComrelElementTypes.MultiInputPort_3014);
			types.add(ComrelElementTypes.MultiOutputPort_3015);
			return types;
		}
		if (editPart instanceof SingleFilterUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3017);
			types.add(ComrelElementTypes.SingleOutputPort_3018);
			return types;
		}
		if (editPart instanceof MultiFilterUnit2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3020);
			types.add(ComrelElementTypes.MultiOutputPort_3021);
			return types;
		}
		if (editPart instanceof SingleQueuedUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof SequentialUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof ConditionalUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3001);
			types.add(ComrelElementTypes.MultiInputPort_3002);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3005);
			types.add(ComrelElementTypes.MultiInputPort_3006);
			return types;
		}
		if (editPart instanceof AtomicUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof SingleFeatureUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3009);
			types.add(ComrelElementTypes.MultiInputPort_3010);
			types.add(ComrelElementTypes.SingleOutputPort_3011);
			return types;
		}
		if (editPart instanceof MultiFeatureUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3013);
			types.add(ComrelElementTypes.MultiInputPort_3014);
			types.add(ComrelElementTypes.MultiOutputPort_3015);
			return types;
		}
		if (editPart instanceof SingleFilterUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3017);
			types.add(ComrelElementTypes.SingleOutputPort_3018);
			return types;
		}
		if (editPart instanceof MultiFilterUnit3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3020);
			types.add(ComrelElementTypes.MultiOutputPort_3021);
			return types;
		}
		if (editPart instanceof SingleQueuedUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof SingleFeatureUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3009);
			types.add(ComrelElementTypes.MultiInputPort_3010);
			types.add(ComrelElementTypes.SingleOutputPort_3011);
			return types;
		}
		if (editPart instanceof MultiFeatureUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3013);
			types.add(ComrelElementTypes.MultiInputPort_3014);
			types.add(ComrelElementTypes.MultiOutputPort_3015);
			return types;
		}
		if (editPart instanceof SingleFilterUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3017);
			types.add(ComrelElementTypes.SingleOutputPort_3018);
			return types;
		}
		if (editPart instanceof MultiFilterUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3020);
			types.add(ComrelElementTypes.MultiOutputPort_3021);
			return types;
		}
		if (editPart instanceof SingleQueuedUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof SequentialUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof SingleFeatureUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3009);
			types.add(ComrelElementTypes.MultiInputPort_3010);
			types.add(ComrelElementTypes.SingleOutputPort_3011);
			return types;
		}
		if (editPart instanceof MultiFeatureUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(3);
			types.add(ComrelElementTypes.SingleInputPort_3013);
			types.add(ComrelElementTypes.MultiInputPort_3014);
			types.add(ComrelElementTypes.MultiOutputPort_3015);
			return types;
		}
		if (editPart instanceof SingleFilterUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3017);
			types.add(ComrelElementTypes.SingleOutputPort_3018);
			return types;
		}
		if (editPart instanceof MultiFilterUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.MultiInputPort_3020);
			types.add(ComrelElementTypes.MultiOutputPort_3021);
			return types;
		}
		if (editPart instanceof SingleQueuedUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof ConditionalUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof SingleQueuedUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3023);
			types.add(ComrelElementTypes.MultiInputPort_3024);
			return types;
		}
		if (editPart instanceof AtomicUnit4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof SequentialUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof SequentialUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof ConditionalUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof ConditionalUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof SequentialUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3027);
			types.add(ComrelElementTypes.MultiInputPort_3028);
			return types;
		}
		if (editPart instanceof AtomicUnit5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof ConditionalUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(2);
			types.add(ComrelElementTypes.SingleInputPort_3031);
			types.add(ComrelElementTypes.MultiInputPort_3032);
			return types;
		}
		if (editPart instanceof AtomicUnit6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof AtomicUnit7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.SingleInputPort_3035);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartmentEditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartment2EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3008);
			types.add(ComrelElementTypes.MultiFeatureUnit_3012);
			types.add(ComrelElementTypes.SingleFilterUnit_3016);
			types.add(ComrelElementTypes.MultiFilterUnit_3019);
			return types;
		}
		if (editPart instanceof CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3003);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3004);
			types.add(ComrelElementTypes.SingleQueuedUnit_3022);
			types.add(ComrelElementTypes.SequentialUnit_3026);
			types.add(ComrelElementTypes.ConditionalUnit_3030);
			types.add(ComrelElementTypes.AtomicUnit_3034);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartment3EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartment4EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartment5EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartment6EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3038);
			types.add(ComrelElementTypes.MultiFeatureUnit_3039);
			types.add(ComrelElementTypes.SingleFilterUnit_3040);
			types.add(ComrelElementTypes.MultiFilterUnit_3041);
			return types;
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3007);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3037);
			types.add(ComrelElementTypes.SingleQueuedUnit_3042);
			types.add(ComrelElementTypes.SequentialUnit_3044);
			types.add(ComrelElementTypes.ConditionalUnit_3046);
			types.add(ComrelElementTypes.AtomicUnit_3049);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3055);
			types.add(ComrelElementTypes.MultiFeatureUnit_3056);
			types.add(ComrelElementTypes.SingleFilterUnit_3057);
			types.add(ComrelElementTypes.MultiFilterUnit_3058);
			return types;
		}
		if (editPart instanceof SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3025);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3043);
			types.add(ComrelElementTypes.SingleQueuedUnit_3059);
			types.add(ComrelElementTypes.SequentialUnit_3060);
			types.add(ComrelElementTypes.ConditionalUnit_3066);
			types.add(ComrelElementTypes.AtomicUnit_3068);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitHelperUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3061);
			types.add(ComrelElementTypes.MultiFeatureUnit_3062);
			types.add(ComrelElementTypes.SingleFilterUnit_3063);
			types.add(ComrelElementTypes.MultiFilterUnit_3064);
			return types;
		}
		if (editPart instanceof SequentialUnitSequentialUnitRefactoringUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3029);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3045);
			types.add(ComrelElementTypes.SingleQueuedUnit_3065);
			types.add(ComrelElementTypes.SequentialUnit_3070);
			types.add(ComrelElementTypes.ConditionalUnit_3071);
			types.add(ComrelElementTypes.AtomicUnit_3074);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitIfCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(1);
			types.add(ComrelElementTypes.ConditionCheck_3076);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitHelperUnitsCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(4);
			types.add(ComrelElementTypes.SingleFeatureUnit_3050);
			types.add(ComrelElementTypes.MultiFeatureUnit_3051);
			types.add(ComrelElementTypes.SingleFilterUnit_3052);
			types.add(ComrelElementTypes.MultiFilterUnit_3053);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitThenCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3033);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3036);
			types.add(ComrelElementTypes.SingleQueuedUnit_3054);
			types.add(ComrelElementTypes.SequentialUnit_3069);
			types.add(ComrelElementTypes.ConditionalUnit_3072);
			types.add(ComrelElementTypes.AtomicUnit_3077);
			return types;
		}
		if (editPart instanceof ConditionalUnitConditionalUnitElseCompartment7EditPart) {
			ArrayList<IElementType> types = new ArrayList<IElementType>(6);
			types.add(ComrelElementTypes.CartesianQueuedUnit_3047);
			types.add(ComrelElementTypes.ParallelQueuedUnit_3048);
			types.add(ComrelElementTypes.SingleQueuedUnit_3067);
			types.add(ComrelElementTypes.SequentialUnit_3073);
			types.add(ComrelElementTypes.ConditionalUnit_3075);
			types.add(ComrelElementTypes.AtomicUnit_3078);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SingleInputPortEditPart) {
			return ((SingleInputPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort2EditPart) {
			return ((SingleInputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPortEditPart) {
			return ((MultiInputPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort3EditPart) {
			return ((SingleInputPort3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort2EditPart) {
			return ((MultiInputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort4EditPart) {
			return ((SingleInputPort4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort3EditPart) {
			return ((MultiInputPort3EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleOutputPortEditPart) {
			return ((SingleOutputPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort5EditPart) {
			return ((SingleInputPort5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort4EditPart) {
			return ((MultiInputPort4EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiOutputPortEditPart) {
			return ((MultiOutputPortEditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort5EditPart) {
			return ((MultiInputPort5EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleOutputPort2EditPart) {
			return ((SingleOutputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort6EditPart) {
			return ((MultiInputPort6EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiOutputPort2EditPart) {
			return ((MultiOutputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort6EditPart) {
			return ((SingleInputPort6EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort7EditPart) {
			return ((MultiInputPort7EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort7EditPart) {
			return ((SingleInputPort7EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort8EditPart) {
			return ((MultiInputPort8EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort8EditPart) {
			return ((SingleInputPort8EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MultiInputPort9EditPart) {
			return ((MultiInputPort9EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SingleInputPort9EditPart) {
			return ((SingleInputPort9EditPart) sourceEditPart)
					.getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SingleInputPortEditPart) {
			return ((SingleInputPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort2EditPart) {
			return ((SingleInputPort2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPortEditPart) {
			return ((MultiInputPortEditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort3EditPart) {
			return ((SingleInputPort3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort2EditPart) {
			return ((MultiInputPort2EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort4EditPart) {
			return ((SingleInputPort4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort3EditPart) {
			return ((MultiInputPort3EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort5EditPart) {
			return ((SingleInputPort5EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort4EditPart) {
			return ((MultiInputPort4EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort5EditPart) {
			return ((MultiInputPort5EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort6EditPart) {
			return ((MultiInputPort6EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort6EditPart) {
			return ((SingleInputPort6EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort7EditPart) {
			return ((MultiInputPort7EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort7EditPart) {
			return ((SingleInputPort7EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort8EditPart) {
			return ((MultiInputPort8EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort8EditPart) {
			return ((SingleInputPort8EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MultiInputPort9EditPart) {
			return ((MultiInputPort9EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SingleInputPort9EditPart) {
			return ((SingleInputPort9EditPart) targetEditPart)
					.getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SingleInputPortEditPart) {
			return ((SingleInputPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort2EditPart) {
			return ((SingleInputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPortEditPart) {
			return ((MultiInputPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort3EditPart) {
			return ((SingleInputPort3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort2EditPart) {
			return ((MultiInputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort4EditPart) {
			return ((SingleInputPort4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort3EditPart) {
			return ((MultiInputPort3EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleOutputPortEditPart) {
			return ((SingleOutputPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort5EditPart) {
			return ((SingleInputPort5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort4EditPart) {
			return ((MultiInputPort4EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiOutputPortEditPart) {
			return ((MultiOutputPortEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort5EditPart) {
			return ((MultiInputPort5EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleOutputPort2EditPart) {
			return ((SingleOutputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort6EditPart) {
			return ((MultiInputPort6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiOutputPort2EditPart) {
			return ((MultiOutputPort2EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort6EditPart) {
			return ((SingleInputPort6EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort7EditPart) {
			return ((MultiInputPort7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort7EditPart) {
			return ((SingleInputPort7EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort8EditPart) {
			return ((MultiInputPort8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort8EditPart) {
			return ((SingleInputPort8EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MultiInputPort9EditPart) {
			return ((MultiInputPort9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SingleInputPort9EditPart) {
			return ((SingleInputPort9EditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SingleInputPortEditPart) {
			return ((SingleInputPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort2EditPart) {
			return ((SingleInputPort2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPortEditPart) {
			return ((MultiInputPortEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort3EditPart) {
			return ((SingleInputPort3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort2EditPart) {
			return ((MultiInputPort2EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort4EditPart) {
			return ((SingleInputPort4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort3EditPart) {
			return ((MultiInputPort3EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort5EditPart) {
			return ((SingleInputPort5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort4EditPart) {
			return ((MultiInputPort4EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort5EditPart) {
			return ((MultiInputPort5EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort6EditPart) {
			return ((MultiInputPort6EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort6EditPart) {
			return ((SingleInputPort6EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort7EditPart) {
			return ((MultiInputPort7EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort7EditPart) {
			return ((SingleInputPort7EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort8EditPart) {
			return ((MultiInputPort8EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort8EditPart) {
			return ((SingleInputPort8EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MultiInputPort9EditPart) {
			return ((MultiInputPort9EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SingleInputPort9EditPart) {
			return ((SingleInputPort9EditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SingleInputPortEditPart) {
			return ((SingleInputPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort2EditPart) {
			return ((SingleInputPort2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPortEditPart) {
			return ((MultiInputPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort3EditPart) {
			return ((SingleInputPort3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort2EditPart) {
			return ((MultiInputPort2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort4EditPart) {
			return ((SingleInputPort4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort3EditPart) {
			return ((MultiInputPort3EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleOutputPortEditPart) {
			return ((SingleOutputPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort5EditPart) {
			return ((SingleInputPort5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort4EditPart) {
			return ((MultiInputPort4EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiOutputPortEditPart) {
			return ((MultiOutputPortEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort5EditPart) {
			return ((MultiInputPort5EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleOutputPort2EditPart) {
			return ((SingleOutputPort2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort6EditPart) {
			return ((MultiInputPort6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiOutputPort2EditPart) {
			return ((MultiOutputPort2EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort6EditPart) {
			return ((SingleInputPort6EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort7EditPart) {
			return ((MultiInputPort7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort7EditPart) {
			return ((SingleInputPort7EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort8EditPart) {
			return ((MultiInputPort8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort8EditPart) {
			return ((SingleInputPort8EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MultiInputPort9EditPart) {
			return ((MultiInputPort9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SingleInputPort9EditPart) {
			return ((SingleInputPort9EditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target,
				getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source,
				getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		HashSet<EObject> elements = new HashSet<EObject>();
		for (Iterator<EObject> it = diagram.getElement().eAllContents(); it
				.hasNext();) {
			EObject element = it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ComrelDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ComrelModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ComrelModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
