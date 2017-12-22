/*
 * 
 */
package comrel.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.CompositeRefactoring;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.MultiFilterUnit;
import comrel.diagram.edit.commands.custom.CustomDestroyElementCommand;

/**
 * @generated
 */
public class MultiFilterUnitEditHelper extends ComrelBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		if (req.getElementToDestroy() instanceof HelperUnit) {
			HelperUnit context = (HelperUnit) req.getElementToDestroy();
			Helper helper = ((MultiFilterUnit) context).getMultiFilterHelper();
			CompositeRefactoring refSys = (CompositeRefactoring) helper
					.eContainer();
			if (refSys != null) {
				if (!refSys.helperInUse(helper, context)) {
					return new CustomDestroyElementCommand(req, helper);
				}
			}
		}
		return super.getDestroyElementCommand(req);
	}

}
