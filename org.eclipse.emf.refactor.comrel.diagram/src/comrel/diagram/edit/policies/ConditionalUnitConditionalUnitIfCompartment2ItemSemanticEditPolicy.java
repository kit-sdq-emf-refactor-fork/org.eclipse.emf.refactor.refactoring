/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import comrel.diagram.edit.commands.ConditionCheckCreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ConditionalUnitConditionalUnitIfCompartment2ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalUnitConditionalUnitIfCompartment2ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ConditionalUnit_3046);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.ConditionCheck_3076 == req.getElementType()) {
			return getGEFWrapper(new ConditionCheckCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
