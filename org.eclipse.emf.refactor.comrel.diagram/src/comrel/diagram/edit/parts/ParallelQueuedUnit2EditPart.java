/*
 * 
 */
package comrel.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import comrel.diagram.edit.parts.ParallelQueuedUnit6EditPart.ParallelQueuedUnitFigure;
import comrel.diagram.edit.parts.custom.Labels;
import comrel.diagram.edit.policies.OpenDiagramEditPolicy;
import comrel.diagram.edit.policies.ParallelQueuedUnit2CanonicalEditPolicy;
import comrel.diagram.edit.policies.ParallelQueuedUnit2ItemSemanticEditPolicy;
import comrel.diagram.part.ComrelVisualIDRegistry;

/**
 * @generated
 */
public class ParallelQueuedUnit2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3004;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public ParallelQueuedUnit2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE,
				new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new ParallelQueuedUnit2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new ParallelQueuedUnit2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE,
				new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				View childView = (View) child.getModel();
				switch (ComrelVisualIDRegistry.getVisualID(childView)) {
				case SingleInputPort3EditPart.VISUAL_ID:
				case MultiInputPort2EditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy();
				}
				EditPolicy result = child
						.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated NOT
	 */
	protected IFigure createNodeShape() {
		ParallelQueuedUnitFigure figure = new ParallelQueuedUnitFigure();
		RectangleFigure compHelper = (RectangleFigure) figure.getChildren()
				.get(1);
		RectangleFigure compRef = (RectangleFigure) figure.getChildren().get(2);
		Labels.setLabels(compHelper, compRef, true);
		//		RefactoringUnit unit = (RefactoringUnit) this.resolveSemanticElement();
		//		unit.setFigure(figure);
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ParallelQueuedUnitFigure getPrimaryShape() {
		return (ParallelQueuedUnitFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParallelQueuedUnitNameTypeLblStrict2EditPart) {
			((ParallelQueuedUnitNameTypeLblStrict2EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureParallelQueuedUnitLabelFigure());
			return true;
		}
		if (childEditPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getParallelQueuedUnitHelperUnitsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getParallelQueuedUnitRefactoringUnitsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SingleInputPort3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			locator.setCurrentSideOfParent(PositionConstants.NORTH); // Position des Ports
			locator.setPreferredSideOfParent(PositionConstants.NORTH); // Position des Ports
			getBorderedFigure().getBorderItemContainer().add(
					((SingleInputPort3EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof MultiInputPort2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			locator.setCurrentSideOfParent(PositionConstants.NORTH); // Position des Ports
			locator.setPreferredSideOfParent(PositionConstants.NORTH); // Position des Ports
			getBorderedFigure().getBorderItemContainer().add(
					((MultiInputPort2EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ParallelQueuedUnitNameTypeLblStrict2EditPart) {
			return true;
		}
		if (childEditPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getParallelQueuedUnitHelperUnitsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart) {
			IFigure pane = getPrimaryShape()
					.getParallelQueuedUnitRefactoringUnitsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.remove(((ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart) childEditPart)
					.getFigure());
			return true;
		}
		if (childEditPart instanceof SingleInputPort3EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((SingleInputPort3EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MultiInputPort2EditPart) {
			//			getBorderedFigure().getBorderItemContainer().remove(
			//					((MultiInputPort2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartmentEditPart) {
			return getPrimaryShape()
					.getParallelQueuedUnitHelperUnitsCompartmentFigure();
		}
		if (editPart instanceof ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartmentEditPart) {
			return getPrimaryShape()
					.getParallelQueuedUnitRefactoringUnitsCompartmentFigure();
		}
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createMainFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(ComrelVisualIDRegistry
				.getType(ParallelQueuedUnitNameTypeLblStrict2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ParallelQueuedUnitFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureParallelQueuedUnitLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fParallelQueuedUnitHelperUnitsCompartmentFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fParallelQueuedUnitRefactoringUnitsCompartmentFigure;

		/**
		 * @generated
		 */
		public ParallelQueuedUnitFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8),
					getMapMode().DPtoLP(8)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5), getMapMode().DPtoLP(5),
					getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureParallelQueuedUnitLabelFigure = new WrappingLabel();
			fFigureParallelQueuedUnitLabelFigure.setText("ParallelQueuedUnit");
			fFigureParallelQueuedUnitLabelFigure.setMaximumSize(new Dimension(
					getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureParallelQueuedUnitLabelFigure);

			fParallelQueuedUnitHelperUnitsCompartmentFigure = new RectangleFigure();
			fParallelQueuedUnitHelperUnitsCompartmentFigure.setOutline(false);

			this.add(fParallelQueuedUnitHelperUnitsCompartmentFigure);

			fParallelQueuedUnitRefactoringUnitsCompartmentFigure = new RectangleFigure();
			fParallelQueuedUnitRefactoringUnitsCompartmentFigure
					.setOutline(false);

			this.add(fParallelQueuedUnitRefactoringUnitsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureParallelQueuedUnitLabelFigure() {
			return fFigureParallelQueuedUnitLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getParallelQueuedUnitHelperUnitsCompartmentFigure() {
			return fParallelQueuedUnitHelperUnitsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getParallelQueuedUnitRefactoringUnitsCompartmentFigure() {
			return fParallelQueuedUnitRefactoringUnitsCompartmentFigure;
		}

	}

}
