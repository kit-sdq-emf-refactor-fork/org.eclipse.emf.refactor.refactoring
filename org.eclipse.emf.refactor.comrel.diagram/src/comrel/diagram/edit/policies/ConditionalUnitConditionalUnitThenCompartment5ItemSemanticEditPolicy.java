/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.AtomicUnit6CreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnit6CreateCommand;
import comrel.diagram.edit.commands.ConditionalUnit6CreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnit3CreateCommand;
import comrel.diagram.edit.commands.SequentialUnit5CreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnit4CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ConditionalUnitConditionalUnitThenCompartment5ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalUnitConditionalUnitThenCompartment5ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ConditionalUnit_3072);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.CartesianQueuedUnit_3033 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnit6CreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_3036 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_3054 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_3069 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_3072 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnit6CreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_3077 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnit6CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
