/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class MultiPortMappingItemSemanticEditPolicy extends
		ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MultiPortMappingItemSemanticEditPolicy() {
		super(ComrelElementTypes.MultiPortMapping_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
