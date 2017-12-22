/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.AtomicUnit7CreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnit7CreateCommand;
import comrel.diagram.edit.commands.ConditionalUnit7CreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnit7CreateCommand;
import comrel.diagram.edit.commands.SequentialUnit7CreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnit7CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ConditionalUnitConditionalUnitElseCompartment3ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalUnitConditionalUnitElseCompartment3ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ConditionalUnit_3066);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.CartesianQueuedUnit_3047 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnit7CreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_3048 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnit7CreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_3067 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnit7CreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_3073 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnit7CreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_3075 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnit7CreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_3078 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnit7CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
