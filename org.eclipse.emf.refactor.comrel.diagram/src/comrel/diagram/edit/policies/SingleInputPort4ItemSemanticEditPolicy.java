/*
 * 
 */
package comrel.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import comrel.diagram.edit.commands.MultiSinglePortMappingCreateCommand;
import comrel.diagram.edit.commands.MultiSinglePortMappingReorientCommand;
import comrel.diagram.edit.commands.SinglePortMappingCreateCommand;
import comrel.diagram.edit.commands.SinglePortMappingReorientCommand;
import comrel.diagram.edit.parts.MultiSinglePortMappingEditPart;
import comrel.diagram.edit.parts.SinglePortMappingEditPart;
import comrel.diagram.part.ComrelVisualIDRegistry;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class SingleInputPort4ItemSemanticEditPolicy extends
		ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SingleInputPort4ItemSemanticEditPolicy() {
		super(ComrelElementTypes.SingleInputPort_3009);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ComrelVisualIDRegistry.getVisualID(incomingLink) == SinglePortMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ComrelVisualIDRegistry.getVisualID(incomingLink) == MultiSinglePortMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ComrelVisualIDRegistry.getVisualID(outgoingLink) == SinglePortMappingEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ComrelElementTypes.SinglePortMapping_4001 == req.getElementType()) {
			return getGEFWrapper(new SinglePortMappingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ComrelElementTypes.MultiSinglePortMapping_4003 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ComrelElementTypes.SinglePortMapping_4001 == req.getElementType()) {
			return getGEFWrapper(new SinglePortMappingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ComrelElementTypes.MultiSinglePortMapping_4003 == req
				.getElementType()) {
			return getGEFWrapper(new MultiSinglePortMappingCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SinglePortMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new SinglePortMappingReorientCommand(req));
		case MultiSinglePortMappingEditPart.VISUAL_ID:
			return getGEFWrapper(new MultiSinglePortMappingReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
