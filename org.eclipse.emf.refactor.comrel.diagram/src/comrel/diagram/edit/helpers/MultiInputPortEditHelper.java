/*
 * 
 */
package comrel.diagram.edit.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.FilterUnit;
import comrel.Port;
import comrel.QueuedUnit;
import comrel.diagram.edit.commands.custom.CustomDestroyElementCommand;

/**
 * @generated
 */
public class MultiInputPortEditHelper extends ComrelBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		EObject container = req.getElementToDestroy().eContainer();
		boolean condition = !(container instanceof QueuedUnit)
				|| container == null;
		condition &= !(container instanceof FilterUnit);
		return new CustomDestroyElementCommand(req,
				(Port) req.getElementToDestroy(), condition);
	}

}
