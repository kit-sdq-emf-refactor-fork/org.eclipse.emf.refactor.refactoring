/*
 * 
 */
package comrel.diagram.edit.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.AtomicUnit;
import comrel.HelperUnit;
import comrel.Port;
import comrel.diagram.edit.commands.custom.CustomDestroyElementCommand;

/**
 * @generated
 */
public class SingleInputPortEditHelper extends ComrelBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		EObject container = req.getElementToDestroy().eContainer();
		boolean condition = !(container instanceof AtomicUnit)
				|| container == null;
		condition &= !(container instanceof HelperUnit);
		return new CustomDestroyElementCommand(req,
				(Port) req.getElementToDestroy(), condition);
	}

}
