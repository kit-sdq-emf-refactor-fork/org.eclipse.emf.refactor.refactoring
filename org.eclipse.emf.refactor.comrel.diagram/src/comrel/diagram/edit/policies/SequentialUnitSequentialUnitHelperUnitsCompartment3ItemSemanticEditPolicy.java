/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.MultiFeatureUnit5CreateCommand;
import comrel.diagram.edit.commands.MultiFilterUnit5CreateCommand;
import comrel.diagram.edit.commands.SingleFeatureUnit5CreateCommand;
import comrel.diagram.edit.commands.SingleFilterUnit5CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class SequentialUnitSequentialUnitHelperUnitsCompartment3ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SequentialUnitSequentialUnitHelperUnitsCompartment3ItemSemanticEditPolicy() {
		super(ComrelElementTypes.SequentialUnit_3060);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.SingleFeatureUnit_3061 == req.getElementType()) {
			return getGEFWrapper(new SingleFeatureUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFeatureUnit_3062 == req.getElementType()) {
			return getGEFWrapper(new MultiFeatureUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.SingleFilterUnit_3063 == req.getElementType()) {
			return getGEFWrapper(new SingleFilterUnit5CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFilterUnit_3064 == req.getElementType()) {
			return getGEFWrapper(new MultiFilterUnit5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
