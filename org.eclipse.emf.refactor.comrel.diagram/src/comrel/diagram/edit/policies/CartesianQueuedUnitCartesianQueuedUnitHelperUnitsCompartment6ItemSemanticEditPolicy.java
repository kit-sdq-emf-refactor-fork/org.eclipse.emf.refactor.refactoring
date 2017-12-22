/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.MultiFeatureUnitCreateCommand;
import comrel.diagram.edit.commands.MultiFilterUnitCreateCommand;
import comrel.diagram.edit.commands.SingleFeatureUnitCreateCommand;
import comrel.diagram.edit.commands.SingleFilterUnitCreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CartesianQueuedUnitCartesianQueuedUnitHelperUnitsCompartment6ItemSemanticEditPolicy() {
		super(ComrelElementTypes.CartesianQueuedUnit_3033);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.SingleFeatureUnit_3008 == req.getElementType()) {
			return getGEFWrapper(new SingleFeatureUnitCreateCommand(req));
		}
		if (ComrelElementTypes.MultiFeatureUnit_3012 == req.getElementType()) {
			return getGEFWrapper(new MultiFeatureUnitCreateCommand(req));
		}
		if (ComrelElementTypes.SingleFilterUnit_3016 == req.getElementType()) {
			return getGEFWrapper(new SingleFilterUnitCreateCommand(req));
		}
		if (ComrelElementTypes.MultiFilterUnit_3019 == req.getElementType()) {
			return getGEFWrapper(new MultiFilterUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
