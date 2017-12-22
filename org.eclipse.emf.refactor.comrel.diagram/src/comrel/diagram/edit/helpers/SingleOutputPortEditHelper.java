/*
 * 
 */
package comrel.diagram.edit.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.HelperUnit;
import comrel.Port;
import comrel.diagram.edit.commands.custom.CustomDestroyElementCommand;

/**
 * @generated
 */
public class SingleOutputPortEditHelper extends ComrelBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		EObject container = req.getElementToDestroy().eContainer();
		boolean condition = !(container instanceof HelperUnit)
				|| container == null;
		return new CustomDestroyElementCommand(req,
				(Port) req.getElementToDestroy(), condition);
	}

}
