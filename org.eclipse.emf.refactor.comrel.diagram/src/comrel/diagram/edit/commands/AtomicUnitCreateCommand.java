/*
 * 
 */
package comrel.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;

import comrel.AtomicUnit;
import comrel.CompositeRefactoring;
import comrel.ComrelFactory;

/**
 * @generated
 */
public class AtomicUnitCreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public AtomicUnitCreateCommand(CreateElementRequest req) {
		super(req.getLabel(), null, req);
	}

	/**
	 * FIXME: replace with setElementToEdit()
	 * @generated
	 */
	protected EObject getElementToEdit() {
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		CompositeRefactoring container = (CompositeRefactoring) getElementToEdit();
		if (container.getMainRefactoringUnit() != null) {
			return false;
		}
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		/*
		 * changes: Liest aus einem Request die ID des ModelRefactorings und
		 * erstellt anhand dessen die AtomicUnit
		 */
		CreateElementRequest request = ((CreateElementRequest) getRequest());
		String refId = (String) request.getParameters().get(
				comrel.diagram.part.ComrelPaletteFactory.UNIT_ID);
		comrel.ComrelFactory factory = ComrelFactory.eINSTANCE;
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		while (container.eContainer() != null) {
			container = container.eContainer();
		}
		CompositeRefactoring cr = (CompositeRefactoring) container;
		comrel.ModelRefactoring refactoring = cr
				.getEmfRefactoringAsModelRefactoring(refId);
		if (refactoring != null
				&& !cr.getModelRefactorings().contains(refactoring)) {
			cr.getModelRefactorings().add(refactoring);
		}
		comrel.AtomicUnit newElement = factory.createAtomicUnit(refactoring);
		/* end of change */

		CompositeRefactoring owner = (CompositeRefactoring) getElementToEdit();
		owner.setMainRefactoringUnit(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(AtomicUnit newElement, IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		IElementType elementType = ((CreateElementRequest) getRequest())
				.getElementType();
		ConfigureRequest configureRequest = new ConfigureRequest(
				getEditingDomain(), newElement, elementType);
		configureRequest.setClientContext(((CreateElementRequest) getRequest())
				.getClientContext());
		configureRequest.addParameters(getRequest().getParameters());
		ICommand configureCommand = elementType
				.getEditCommand(configureRequest);
		if (configureCommand != null && configureCommand.canExecute()) {
			configureCommand.execute(monitor, info);
		}
	}

}
