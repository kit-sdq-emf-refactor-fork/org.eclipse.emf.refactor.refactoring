/*
 * 
 */
package comrel.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;

import comrel.PortMapping;
import comrel.SinglePortMapping;
import comrel.diagram.edit.policies.SinglePortMappingItemSemanticEditPolicy;
import comrel.figures.PortMappingFigure;

/**
 * @generated
 */
public class SinglePortMappingEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public SinglePortMappingEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SinglePortMappingItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */

	protected Connection createConnectionFigure() {
		PortMapping mapping = (PortMapping) this.resolveSemanticElement();
		SinglePortMappingFigure figure = new SinglePortMappingFigure();
		figure.setMapping(mapping);
		return figure;
	}

	/**
	 * @generated
	 */
	public SinglePortMappingFigure getPrimaryShape() {
		return (SinglePortMappingFigure) getFigure();
	}

	/**
	 * @generated NOT
	 */
	public class SinglePortMappingFigure extends PortMappingFigure {

		SinglePortMapping mapping;

		/**
		 * @generated
		 */
		public SinglePortMappingFigure() {
			this.setLineWidth(2);
			this.setLineStyle(Graphics.LINE_DOT);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			return df;
		}

	}

}
