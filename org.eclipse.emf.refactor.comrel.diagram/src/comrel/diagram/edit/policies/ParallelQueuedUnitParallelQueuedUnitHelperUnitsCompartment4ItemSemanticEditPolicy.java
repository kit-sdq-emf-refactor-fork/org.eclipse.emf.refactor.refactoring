/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.MultiFeatureUnit2CreateCommand;
import comrel.diagram.edit.commands.MultiFilterUnit2CreateCommand;
import comrel.diagram.edit.commands.SingleFeatureUnit2CreateCommand;
import comrel.diagram.edit.commands.SingleFilterUnit2CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ParallelQueuedUnitParallelQueuedUnitHelperUnitsCompartment4ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ParallelQueuedUnit_3043);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.SingleFeatureUnit_3038 == req.getElementType()) {
			return getGEFWrapper(new SingleFeatureUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFeatureUnit_3039 == req.getElementType()) {
			return getGEFWrapper(new MultiFeatureUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.SingleFilterUnit_3040 == req.getElementType()) {
			return getGEFWrapper(new SingleFilterUnit2CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFilterUnit_3041 == req.getElementType()) {
			return getGEFWrapper(new MultiFilterUnit2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
