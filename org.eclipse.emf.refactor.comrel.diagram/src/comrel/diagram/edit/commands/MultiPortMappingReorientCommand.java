/*
 * 
 */
package comrel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import comrel.CompositeRefactoring;
import comrel.MultiInputPort;
import comrel.MultiPort;
import comrel.MultiPortMapping;
import comrel.diagram.edit.policies.ComrelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MultiPortMappingReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public MultiPortMappingReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MultiPortMapping) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MultiPort && newEnd instanceof MultiPort)) {
			return false;
		}
		MultiInputPort target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CompositeRefactoring)) {
			return false;
		}
		CompositeRefactoring container = (CompositeRefactoring) getLink()
				.eContainer();
		return ComrelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMultiPortMapping_4002(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MultiInputPort && newEnd instanceof MultiInputPort)) {
			return false;
		}
		MultiPort source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CompositeRefactoring)) {
			return false;
		}
		CompositeRefactoring container = (CompositeRefactoring) getLink()
				.eContainer();
		return ComrelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMultiPortMapping_4002(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected MultiPortMapping getLink() {
		return (MultiPortMapping) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected MultiPort getOldSource() {
		return (MultiPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MultiPort getNewSource() {
		return (MultiPort) newEnd;
	}

	/**
	 * @generated
	 */
	protected MultiInputPort getOldTarget() {
		return (MultiInputPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected MultiInputPort getNewTarget() {
		return (MultiInputPort) newEnd;
	}
}
