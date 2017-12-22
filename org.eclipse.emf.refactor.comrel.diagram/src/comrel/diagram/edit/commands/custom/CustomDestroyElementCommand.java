/**
 * 
 */
package comrel.diagram.edit.commands.custom;

import java.util.ArrayList;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.AtomicUnit;
import comrel.CompositeRefactoring;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.ModelRefactoring;
import comrel.MultiPortMapping;
import comrel.MultiSinglePortMapping;
import comrel.Port;
import comrel.PortMapping;
import comrel.SinglePortMapping;
import comrel.util.ComrelUtil;

/**
 * @author Gerrit
 * Selbstdefiniertes DestroyElementCommand, um eventuell bestimmte 
 * Dinge noch zu machen, bevor das Element zerstört wird.
 */
public class CustomDestroyElementCommand extends DestroyElementCommand {

	boolean condition = true;
	ModelRefactoring ref= null;
	Port p = null;
	Helper helper= null;
	EObject container = null;
	
	
	public CustomDestroyElementCommand(DestroyElementRequest request,boolean condition) {
		super(request);
		this.condition = condition;
		this.container = request.getContainer();
	}
	
	public CustomDestroyElementCommand(DestroyElementRequest request,Port port, boolean condition) {
		super(request);
		this.condition = condition;
		this.container = request.getContainer();
		this.p=port;
	}
	
	public CustomDestroyElementCommand(DestroyElementRequest request,ModelRefactoring ref) {
		super(request);
		this.ref=ref;
		this.container = request.getContainer();
	}
	
	public CustomDestroyElementCommand(DestroyElementRequest request,Helper helper) {
		super(request);
		this.helper = helper;
		this.container = request.getContainer();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand#canExecute()
	 */
	@Override
	public boolean canExecute() {
		return condition;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		
		CommandResult result = super.doExecuteWithResult(monitor, info);
		CompositeRefactoring cr = (CompositeRefactoring)ComrelUtil.getContainedCompositeRefactoring(container);
		ArrayList<PortMapping> mappings = new ArrayList<PortMapping>();
		ArrayList<Port> ports = new ArrayList<Port>();
		if(ref != null) {
			AtomicUnit context = (AtomicUnit) getElementToDestroy();
			ports.addAll(context.getInputPorts());
			for(PortMapping m : cr.getPortMappings()) {
				if(ports.contains(m.getSource()) || ports.contains(m.getTarget())) {
					setSourceTargetNull(m);
					mappings.add(m);
				}
			}
			cr.getPortMappings().removeAll(mappings);
			cr.getModelRefactorings().remove(ref);
		}
		if(helper != null) {
			HelperUnit context = (HelperUnit) getElementToDestroy();
			ports.add(context.getInputPort());
			ports.add(context.getOutputPort());
			for(PortMapping m : cr.getPortMappings()) {
				if(ports.contains(m.getSource()) || ports.contains(m.getTarget())) {
					setSourceTargetNull(m);
					mappings.add(m);
				}
			}
			cr.getPortMappings().removeAll(mappings);
			cr.getHelper().remove(helper);
		}
		if(p != null) {
			for(PortMapping m : cr.getPortMappings()) {
				if(ports == m.getSource() || p == m.getTarget()) {
					setSourceTargetNull(m);
					mappings.add(m);
				}
			}
			cr.getPortMappings().removeAll(mappings);
		}
		
		cr.removeUnusedModelRefactorings();
		cr.removeUnusedHelper();

		
		return result;
	}
	
	private void setSourceTargetNull(PortMapping mapping) {
		
		if (mapping instanceof SinglePortMapping) {
			SinglePortMapping m = (SinglePortMapping) mapping;
			m.setSource(null);
			m.setTarget(null);
		}
		if (mapping instanceof MultiPortMapping) {
			MultiPortMapping m = (MultiPortMapping) mapping;
			m.setSource(null);
			m.setTarget(null);
		}
		if (mapping instanceof MultiSinglePortMapping) {
			MultiSinglePortMapping m = (MultiSinglePortMapping) mapping;
			m.setSource(null);
			m.setTarget(null);
		}
	}
	
	
	
}