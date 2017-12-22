/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.AtomicUnit2CreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnit2CreateCommand;
import comrel.diagram.edit.commands.ConditionalUnit2CreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnit2CreateCommand;
import comrel.diagram.edit.commands.SequentialUnit2CreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnit2CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CartesianQueuedUnitCartesianQueuedUnitRefactoringUnitCompartment7ItemSemanticEditPolicy() {
		super(ComrelElementTypes.CartesianQueuedUnit_3047);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.CartesianQueuedUnit_3003 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_3004 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_3022 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_3026 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_3030 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_3034 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnit2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
