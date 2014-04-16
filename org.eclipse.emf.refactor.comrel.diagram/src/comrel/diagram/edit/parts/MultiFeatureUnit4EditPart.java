/*
 * 
 */
package comrel.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
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

import comrel.diagram.edit.policies.MultiFeatureUnit4CanonicalEditPolicy;
import comrel.diagram.edit.policies.MultiFeatureUnit4ItemSemanticEditPolicy;
import comrel.diagram.part.ComrelVisualIDRegistry;

/**
 * @generated
 */
public class MultiFeatureUnit4EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3056;

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
	public MultiFeatureUnit4EditPart(View view) {
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
				new MultiFeatureUnit4ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE,
				new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new MultiFeatureUnit4CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
				case SingleInputPort5EditPart.VISUAL_ID:
				case MultiInputPort4EditPart.VISUAL_ID:
				case MultiOutputPortEditPart.VISUAL_ID:
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
	 * @generated
	 */
	protected IFigure createNodeShape() {
		return primaryShape = new MultiFeatureUnitFigure();
	}

	/**
	 * @generated
	 */
	public MultiFeatureUnitFigure getPrimaryShape() {
		return (MultiFeatureUnitFigure) primaryShape;
	}

	/**
	 * @generated NOT
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MultiFeatureUnitNameType4EditPart) {
			((MultiFeatureUnitNameType4EditPart) childEditPart)
					.setLabel(getPrimaryShape()
							.getFigureMultiFeatureUnitLabelFigure());
			return true;
		}
		if (childEditPart instanceof SingleInputPort5EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			locator.setCurrentSideOfParent(PositionConstants.NORTH); // Position des Ports
			locator.setPreferredSideOfParent(PositionConstants.NORTH); // Position des Ports
			getBorderedFigure().getBorderItemContainer().add(
					((SingleInputPort5EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof MultiInputPort4EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.NORTH);
			locator.setCurrentSideOfParent(PositionConstants.NORTH); // Position des Ports
			locator.setPreferredSideOfParent(PositionConstants.NORTH); // Position des Ports
			getBorderedFigure().getBorderItemContainer().add(
					((MultiInputPort4EditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		if (childEditPart instanceof MultiOutputPortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(),
					PositionConstants.SOUTH);
			locator.setCurrentSideOfParent(PositionConstants.SOUTH); // Position des Ports
			locator.setPreferredSideOfParent(PositionConstants.SOUTH); // Position des Ports
			getBorderedFigure().getBorderItemContainer().add(
					((MultiOutputPortEditPart) childEditPart).getFigure(),
					locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof MultiFeatureUnitNameType4EditPart) {
			return true;
		}
		if (childEditPart instanceof SingleInputPort5EditPart) {
			//			getBorderedFigure().getBorderItemContainer().remove(
			//					((SingleInputPort5EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MultiInputPort4EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(
					((MultiInputPort4EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof MultiOutputPortEditPart) {
			//			getBorderedFigure().getBorderItemContainer().remove(
			//					((MultiOutputPortEditPart) childEditPart).getFigure());
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
				.getType(MultiFeatureUnitNameType4EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class MultiFeatureUnitFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureMultiFeatureUnitLabelFigure;

		/**
		 * @generated
		 */
		public MultiFeatureUnitFigure() {
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

			fFigureMultiFeatureUnitLabelFigure = new WrappingLabel();
			fFigureMultiFeatureUnitLabelFigure.setText("MultiFeatureUnit");

			this.add(fFigureMultiFeatureUnitLabelFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureMultiFeatureUnitLabelFigure() {
			return fFigureMultiFeatureUnitLabelFigure;
		}

	}

}