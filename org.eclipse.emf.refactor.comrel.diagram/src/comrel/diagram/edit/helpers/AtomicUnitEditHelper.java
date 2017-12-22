/*
 * 
 */
package comrel.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.AtomicUnit;
import comrel.CompositeRefactoring;
import comrel.ModelRefactoring;
import comrel.diagram.edit.commands.custom.CustomDestroyElementCommand;

/**
 * @generated
 */
public class AtomicUnitEditHelper extends ComrelBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		if (req.getElementToDestroy() instanceof AtomicUnit) {
			AtomicUnit context = (AtomicUnit) req.getElementToDestroy();
			System.out.println("AtomicUnit: " + context);
			ModelRefactoring modelRefactoring = context.getModelRefactoring();
			System.out.println("ModelRefactoring: " + modelRefactoring);
			CompositeRefactoring cr = (CompositeRefactoring) modelRefactoring
					.eContainer();
			System.out.println("CompositeRefactoring: " + cr);
			if (cr != null) {
				System.out.println("in use?: " + cr.modelRefactoringInUse(modelRefactoring, context));
				if (!cr.modelRefactoringInUse(modelRefactoring, context)) {
					System.out.println("return: new CustomDestroyElementCommand");
					return new CustomDestroyElementCommand(req,
							modelRefactoring);
				}
			}
		}
		System.out.println("return: super call");
		return super.getDestroyElementCommand(req);
	}

}
