/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.MultiFeatureUnit4CreateCommand;
import comrel.diagram.edit.commands.MultiFilterUnit4CreateCommand;
import comrel.diagram.edit.commands.SingleFeatureUnit4CreateCommand;
import comrel.diagram.edit.commands.SingleFilterUnit4CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SingleQueuedUnitSingleQueuedUnitHelperUnitsCompartment6ItemSemanticEditPolicy() {
		super(ComrelElementTypes.SingleQueuedUnit_3067);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.SingleFeatureUnit_3055 == req.getElementType()) {
			return getGEFWrapper(new SingleFeatureUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFeatureUnit_3056 == req.getElementType()) {
			return getGEFWrapper(new MultiFeatureUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.SingleFilterUnit_3057 == req.getElementType()) {
			return getGEFWrapper(new SingleFilterUnit4CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFilterUnit_3058 == req.getElementType()) {
			return getGEFWrapper(new MultiFilterUnit4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
