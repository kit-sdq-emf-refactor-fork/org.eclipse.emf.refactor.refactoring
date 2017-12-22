/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.AtomicUnit5CreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnit5CreateCommand;
import comrel.diagram.edit.commands.ConditionalUnit5CreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnit6CreateCommand;
import comrel.diagram.edit.commands.SequentialUnit6CreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnit6CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class SequentialUnitSequentialUnitRefactoringUnitsCompartment6ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequentialUnitSequentialUnitRefactoringUnitsCompartment6ItemSemanticEditPolicy() {
		super(ComrelElementTypes.SequentialUnit_3073);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.CartesianQueuedUnit_3029 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_3045 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnit6CreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_3065 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnit6CreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_3070 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnit6CreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_3071 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_3074 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnit5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
