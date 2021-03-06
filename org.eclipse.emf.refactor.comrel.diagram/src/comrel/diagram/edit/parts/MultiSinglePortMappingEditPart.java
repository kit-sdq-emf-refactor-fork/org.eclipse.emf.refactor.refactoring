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
import comrel.diagram.edit.policies.MultiSinglePortMappingItemSemanticEditPolicy;
import comrel.figures.PortMappingFigure;

/**
 * @generated
 */
public class MultiSinglePortMappingEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public MultiSinglePortMappingEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new MultiSinglePortMappingItemSemanticEditPolicy());
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
		PortMappingFigure figure = new MultiSinglePortMappingFigure();
		figure.setMapping(mapping);
		return figure;
	}

	/**
	 * @generated
	 */
	public MultiSinglePortMappingFigure getPrimaryShape() {
		return (MultiSinglePortMappingFigure) getFigure();
	}

	/**
	 * @generated NOT
	 */
	public class MultiSinglePortMappingFigure extends PortMappingFigure {

		/**
		 * @generated
		 */
		public MultiSinglePortMappingFigure() {
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
