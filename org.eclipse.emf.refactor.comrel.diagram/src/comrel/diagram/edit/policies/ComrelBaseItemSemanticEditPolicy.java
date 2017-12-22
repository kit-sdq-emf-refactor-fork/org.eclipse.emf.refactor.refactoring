/*
 * 
 */
package comrel.diagram.edit.policies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;

import comrel.AtomicUnit;
import comrel.CompositeRefactoring;
import comrel.CompositeUnit;
import comrel.ComrelPackage;
import comrel.HelperUnit;
import comrel.InputPort;
import comrel.MultiInputPort;
import comrel.MultiPort;
import comrel.MultiPortMapping;
import comrel.MultiSinglePortMapping;
import comrel.OutputPort;
import comrel.PortMapping;
import comrel.QueuedUnit;
import comrel.RefactoringUnit;
import comrel.SingleInputPort;
import comrel.SinglePort;
import comrel.SinglePortMapping;
import comrel.diagram.edit.helpers.ComrelBaseEditHelper;
import comrel.diagram.expressions.ComrelOCLFactory;
import comrel.diagram.part.ComrelDiagramEditorPlugin;
import comrel.diagram.part.ComrelVisualIDRegistry;
import comrel.diagram.providers.ComrelElementTypes;

/**
 * @generated
 */
public class ComrelBaseItemSemanticEditPolicy extends SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected ComrelBaseItemSemanticEditPolicy(IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						ComrelVisualIDRegistry.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(ComrelBaseEditHelper.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(ComrelBaseEditHelper.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(ComrelBaseEditHelper.EDIT_POLICY_COMMAND, null);
		request.setParameter(ComrelBaseEditHelper.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = ComrelElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = ComrelDiagramEditorPlugin.getInstance()
				.getLinkConstraints();
		if (cached == null) {
			ComrelDiagramEditorPlugin.getInstance().setLinkConstraints(
					cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateSinglePortMapping_4001(
				CompositeRefactoring container, SinglePort source,
				SingleInputPort target) {
			return canExistSinglePortMapping_4001(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMultiPortMapping_4002(
				CompositeRefactoring container, MultiPort source,
				MultiInputPort target) {
			return canExistMultiPortMapping_4002(container, null, source,
					target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateMultiSinglePortMapping_4003(
				CompositeRefactoring container, MultiPort source,
				SingleInputPort target) {
			return canExistMultiSinglePortMapping_4003(container, null, source,
					target);
		}

		/**
		 * @generated NOT
		 */
		public boolean canExistSinglePortMapping_4001(
				CompositeRefactoring container, SinglePortMapping linkInstance,
				SinglePort source, SingleInputPort target) {
			try {
				if (source == null) {
					return true;
				} else if (!singlePortMappingRules(container, source, target)) {
					return false;
				}

				else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ComrelPackage.eINSTANCE.getSingleInputPort()); //$NON-NLS-1$
					Object sourceVal = ComrelOCLFactory.getExpression(0,
							ComrelPackage.eINSTANCE.getSinglePort(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ComrelDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated NOT
		 */
		public boolean canExistMultiPortMapping_4002(
				CompositeRefactoring container, MultiPortMapping linkInstance,
				MultiPort source, MultiInputPort target) {
			try {
				if (source == null) {
					return true;
				} else if (!multiPortMappingRules(container, source, target)) {
					return false;
				}

				else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ComrelPackage.eINSTANCE.getMultiInputPort()); //$NON-NLS-1$
					Object sourceVal = ComrelOCLFactory.getExpression(1,
							ComrelPackage.eINSTANCE.getMultiPort(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ComrelDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		/**
		 * @generated NOT
		 */
		public boolean canExistMultiSinglePortMapping_4003(
				CompositeRefactoring container,
				MultiSinglePortMapping linkInstance, MultiPort source,
				SingleInputPort target) {
			try {
				if (source == null) {
					return true;
				} else if (!multiSinglePortMappingRules(container, source,
						target)) {
					return false;
				}

				else {
					Map<String, EClassifier> env = Collections
							.<String, EClassifier> singletonMap(
									"oppositeEnd", ComrelPackage.eINSTANCE.getSingleInputPort()); //$NON-NLS-1$
					Object sourceVal = ComrelOCLFactory.getExpression(2,
							ComrelPackage.eINSTANCE.getMultiPort(), env)
							.evaluate(
									source,
									Collections.singletonMap(
											"oppositeEnd", target)); //$NON-NLS-1$
					if (false == sourceVal instanceof Boolean
							|| !((Boolean) sourceVal).booleanValue()) {
						return false;
					} // else fall-through
				}
				return true;
			} catch (Exception e) {
				ComrelDiagramEditorPlugin.getInstance().logError(
						"Link constraint evaluation error", e); //$NON-NLS-1$
				return false;
			}
		}

		private static boolean singlePortMappingRules(
				comrel.CompositeRefactoring container, comrel.Port source,
				comrel.InputPort target) {
			boolean result = true;
			result &= sameType(container, source, target);
			result &= rightEbene(container, source, target);
			result &= onlyOneInput(container, source, target);
			return result;
		}

		private static boolean multiPortMappingRules(
				comrel.CompositeRefactoring container, comrel.Port source,
				comrel.InputPort target) {
			boolean result = true;
			result &= sameType(container, source, target);
			result &= rightEbene(container, source, target);
			result &= onlyOneInput(container, source, target);
			return result;
		}

		private static boolean multiSinglePortMappingRules(
				comrel.CompositeRefactoring container, comrel.Port source,
				comrel.InputPort target) {
			boolean result = true;
			result &= rightSourceTargetType(container, source, target);
			result &= rightEbene(container, source, target);
			result &= onlyOneInput(container, source, target);
			result &= sameType(container, source, target);
			return result;
		}

		private static boolean rightSourceTargetType(
				comrel.CompositeRefactoring container, comrel.Port source,
				comrel.InputPort target) {
			boolean result = true;
			if (source != null) {
				result &= (source instanceof InputPort);
				result &= (source.eContainer() instanceof QueuedUnit);
			}
			return result;
		}

		private static boolean sameType(comrel.CompositeRefactoring container,
				comrel.Port source, comrel.InputPort target) {
			boolean result = true;
			if (source != null && target != null) {
				if (source.getType() != null && target.getType() != null) {
					result = source.getType().equals(target.getType());
				} else {
					result = true;
				}
			}
			return result;
		}

	}

	private static boolean rightEbene(comrel.CompositeRefactoring container,
			comrel.Port source, comrel.InputPort target) {
		boolean result = true;
		if (source != null) {
			if (source.eContainer() instanceof HelperUnit)
				result &= (source instanceof OutputPort);
			if (source.eContainer() instanceof AtomicUnit) {
				result = false;
			}
			if (target != null) {
				if (source.eContainer() instanceof CompositeUnit) {
					result &= source.eContainer() == target.eContainer()
							.eContainer();

				}
				if (source.eContainer() instanceof HelperUnit) {
					if (target.eContainer() instanceof HelperUnit) {
						result &= source.eContainer() != target.eContainer();
					}
					result &= (source.eContainer().eContainer() == target
							.eContainer().eContainer());
				}
			}

		}
		return result;
	}

	private static boolean onlyOneInput(comrel.CompositeRefactoring container,
			comrel.Port source, comrel.InputPort target) {
		boolean result = true;
		if (target != null) {
			List<InputPort> ports = new ArrayList<InputPort>();
			EObject portContainer = target.eContainer();
			if (portContainer instanceof RefactoringUnit) {
				RefactoringUnit refUnit = (RefactoringUnit) portContainer;
				ports.addAll(refUnit.getAllInputPorts());
			}
			if (portContainer instanceof HelperUnit) {
				HelperUnit helperUnit = (HelperUnit) portContainer;
				ports.add(helperUnit.getInputPort());
			}
			InputPort p = null;
			for (InputPort in : ports) {
				if (target == in) {
					p = in;
					break;
				}
			}
			if (p != null) {
				List<PortMapping> mappings = container.getPortMappings();
				for (PortMapping mapping : mappings) {
					if (mapping.getTarget() == p) {
						return false;
					}
				}
			}
		}
		return result;
	}

}
