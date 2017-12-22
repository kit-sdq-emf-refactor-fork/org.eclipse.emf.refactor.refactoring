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
import comrel.MultiPort;
import comrel.MultiSinglePortMapping;
import comrel.SingleInputPort;
import comrel.diagram.edit.policies.ComrelBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class MultiSinglePortMappingReorientCommand extends EditElementCommand {

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
	public MultiSinglePortMappingReorientCommand(
			ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof MultiSinglePortMapping) {
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
		SingleInputPort target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof CompositeRefactoring)) {
			return false;
		}
		CompositeRefactoring container = (CompositeRefactoring) getLink()
				.eContainer();
		return ComrelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMultiSinglePortMapping_4003(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SingleInputPort && newEnd instanceof SingleInputPort)) {
			return false;
		}
		MultiPort source = getLink().getSource();
		if (!(getLink().eContainer() instanceof CompositeRefactoring)) {
			return false;
		}
		CompositeRefactoring container = (CompositeRefactoring) getLink()
				.eContainer();
		return ComrelBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistMultiSinglePortMapping_4003(container, getLink(),
						source, getNewTarget());
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
	protected MultiSinglePortMapping getLink() {
		return (MultiSinglePortMapping) getElementToEdit();
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
	protected SingleInputPort getOldTarget() {
		return (SingleInputPort) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SingleInputPort getNewTarget() {
		return (SingleInputPort) newEnd;
	}
}
