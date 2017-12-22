/*
 * 
 */
package comrel.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.CompositeRefactoring;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.SingleFeatureUnit;
import comrel.diagram.edit.commands.custom.CustomDestroyElementCommand;

/**
 * @generated
 */
public class SingleFeatureUnitEditHelper extends ComrelBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		if (req.getElementToDestroy() instanceof HelperUnit) {
			HelperUnit context = (HelperUnit) req.getElementToDestroy();
			Helper helper = ((SingleFeatureUnit) context)
					.getSingleFeatureHelper();
			CompositeRefactoring cr = (CompositeRefactoring) helper
					.eContainer();
			if (cr != null) {
				if (!cr.helperInUse(helper, context)) {
					return new CustomDestroyElementCommand(req, helper);
				}
			}
		}
		return super.getDestroyElementCommand(req);
	}

}
