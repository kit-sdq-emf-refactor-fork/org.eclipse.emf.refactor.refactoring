/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.MultiFeatureUnit3CreateCommand;
import comrel.diagram.edit.commands.MultiFilterUnit3CreateCommand;
import comrel.diagram.edit.commands.SingleFeatureUnit3CreateCommand;
import comrel.diagram.edit.commands.SingleFilterUnit3CreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ConditionalUnitConditionalUnitHelperUnitsCompartment7ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalUnitConditionalUnitHelperUnitsCompartment7ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ConditionalUnit_2006);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.SingleFeatureUnit_3050 == req.getElementType()) {
			return getGEFWrapper(new SingleFeatureUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFeatureUnit_3051 == req.getElementType()) {
			return getGEFWrapper(new MultiFeatureUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.SingleFilterUnit_3052 == req.getElementType()) {
			return getGEFWrapper(new SingleFilterUnit3CreateCommand(req));
		}
		if (ComrelElementTypes.MultiFilterUnit_3053 == req.getElementType()) {
			return getGEFWrapper(new MultiFilterUnit3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
