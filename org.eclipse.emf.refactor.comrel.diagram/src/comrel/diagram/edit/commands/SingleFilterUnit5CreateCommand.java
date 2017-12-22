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

import comrel.CompositeRefactoring;
import comrel.ComrelFactory;
import comrel.SequentialUnit;
import comrel.SingleFilterUnit;

/**
 * @generated
 */
public class SingleFilterUnit5CreateCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	public SingleFilterUnit5CreateCommand(CreateElementRequest req) {
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
		return true;

	}

	/**
	 * @generated NOT
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		/*
		 * changes: Liest aus einem Request die ID des Helpers und
		 * erstellt anhand dessen die HelperUnit
		 */
		CreateElementRequest request = ((CreateElementRequest) getRequest());
		String helperId = (String) request.getParameters().get(
				comrel.diagram.part.ComrelPaletteFactory.UNIT_ID);
		comrel.ComrelFactory factory = comrel.ComrelFactory.eINSTANCE;
		EObject container = ((CreateElementRequest) getRequest())
				.getContainer();
		while (container.eContainer() != null) {
			container = container.eContainer();
		}
		CompositeRefactoring cr = (CompositeRefactoring) container;
		comrel.SingleFilterHelper helper = cr.getSingleFilterHelper(helperId);
		if (helper != null && !cr.getHelper().contains(helper)) {
			cr.getHelper().add(helper);
		}
		comrel.SingleFilterUnit newElement;
		if (helper != null) {
			newElement = factory.createSingleFilterUnit(helper);
		} else {
			newElement = factory.createSingleFilterUnit();
		}
		/* end of change */

		SequentialUnit owner = (SequentialUnit) getElementToEdit();
		owner.getHelperUnits().add(newElement);

		doConfigure(newElement, monitor, info);

		((CreateElementRequest) getRequest()).setNewElement(newElement);
		return CommandResult.newOKCommandResult(newElement);
	}

	/**
	 * @generated
	 */
	protected void doConfigure(SingleFilterUnit newElement,
			IProgressMonitor monitor, IAdaptable info)
			throws ExecutionException {
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
