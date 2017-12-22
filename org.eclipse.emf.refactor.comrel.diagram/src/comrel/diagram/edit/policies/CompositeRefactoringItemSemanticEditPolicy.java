/*
 * 
 */
package comrel.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import comrel.diagram.edit.commands.AtomicUnitCreateCommand;
import comrel.diagram.edit.commands.CartesianQueuedUnitCreateCommand;
import comrel.diagram.edit.commands.ConditionalUnitCreateCommand;
import comrel.diagram.edit.commands.ParallelQueuedUnitCreateCommand;
import comrel.diagram.edit.commands.SequentialUnitCreateCommand;
import comrel.diagram.edit.commands.SingleInputPortCreateCommand;
import comrel.diagram.edit.commands.SingleQueuedUnitCreateCommand;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class CompositeRefactoringItemSemanticEditPolicy extends
		ComrelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CompositeRefactoringItemSemanticEditPolicy() {
		super(ComrelElementTypes.CompositeRefactoring_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ComrelElementTypes.SingleInputPort_2001 == req.getElementType()) {
			return getGEFWrapper(new SingleInputPortCreateCommand(req));
		}
		if (ComrelElementTypes.CartesianQueuedUnit_2002 == req.getElementType()) {
			return getGEFWrapper(new CartesianQueuedUnitCreateCommand(req));
		}
		if (ComrelElementTypes.ParallelQueuedUnit_2003 == req.getElementType()) {
			return getGEFWrapper(new ParallelQueuedUnitCreateCommand(req));
		}
		if (ComrelElementTypes.SingleQueuedUnit_2004 == req.getElementType()) {
			return getGEFWrapper(new SingleQueuedUnitCreateCommand(req));
		}
		if (ComrelElementTypes.SequentialUnit_2005 == req.getElementType()) {
			return getGEFWrapper(new SequentialUnitCreateCommand(req));
		}
		if (ComrelElementTypes.ConditionalUnit_2006 == req.getElementType()) {
			return getGEFWrapper(new ConditionalUnitCreateCommand(req));
		}
		if (ComrelElementTypes.AtomicUnit_2007 == req.getElementType()) {
			return getGEFWrapper(new AtomicUnitCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
