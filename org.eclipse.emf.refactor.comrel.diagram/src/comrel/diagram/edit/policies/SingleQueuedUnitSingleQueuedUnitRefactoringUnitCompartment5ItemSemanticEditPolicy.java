/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.AtomicUnit4CreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnit4CreateCommand;
import comrel.diagram.edit.commands.ConditionalUnit4CreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnit5CreateCommand;
import comrel.diagram.edit.commands.SequentialUnit4CreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnit5CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SingleQueuedUnitSingleQueuedUnitRefactoringUnitCompartment5ItemSemanticEditPolicy() {
		super(ComrelElementTypes.SingleQueuedUnit_3065);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.CartesianQueuedUnit_3025 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_3043 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_3059 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_3060 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_3066 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_3068 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnit4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
