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
public class ConditionalUnitConditionalUnitIfCompartment4ItemSemanticEditPolicy
		extends ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConditionalUnitConditionalUnitIfCompartment4ItemSemanticEditPolicy() {
		super(ComrelElementTypes.ConditionalUnit_3071);
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
