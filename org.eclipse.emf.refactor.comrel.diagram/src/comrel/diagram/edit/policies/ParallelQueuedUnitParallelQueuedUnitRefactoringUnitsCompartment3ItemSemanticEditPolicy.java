/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.AtomicUnit3CreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnit3CreateCommand;
import comrel.diagram.edit.commands.ConditionalUnit3CreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnit4CreateCommand;
import comrel.diagram.edit.commands.SequentialUnit3CreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnit3CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ParallelQueuedUnitParallelQueuedUnitRefactoringUnitsCompartment3ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ParallelQueuedUnit_3037);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.CartesianQueuedUnit_3007 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_3037 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_3042 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_3044 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_3046 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_3049 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnit3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
