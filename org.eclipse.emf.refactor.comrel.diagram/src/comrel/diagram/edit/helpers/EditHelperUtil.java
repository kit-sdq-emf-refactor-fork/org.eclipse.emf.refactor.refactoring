package comrel.diagram.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import comrel.MultiInputPort;
import comrel.MultiOutputPort;
import comrel.SingleInputPort;
import comrel.SingleOutputPort;

public class EditHelperUtil {

	
	public static ICommand getPortDestroy(DestroyElementRequest req) {
		ComrelBaseEditHelper h;
		if(req.getElementToDestroy() instanceof SingleInputPort){
			h = new SingleInputPortEditHelper();
			System.out.println("in: getPortDestroy(DestroyElementRequest req)");
			return h.getDestroyElementCommand(req);
		}
		if(req.getElementToDestroy() instanceof SingleOutputPort){
			h = new SingleOutputPortEditHelper();
			return h.getDestroyElementCommand(req);
		}
		if(req.getElementToDestroy() instanceof MultiInputPort){
			h = new MultiInputPortEditHelper();
			return h.getDestroyElementCommand(req);
		}
		if(req.getElementToDestroy() instanceof MultiOutputPort){
			h = new MultiOutputPortEditHelper();
			return h.getDestroyElementCommand(req);
		}
		return null;
		
	}
}
