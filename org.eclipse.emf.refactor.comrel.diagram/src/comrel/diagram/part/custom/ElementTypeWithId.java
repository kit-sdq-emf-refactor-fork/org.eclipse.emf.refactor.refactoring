package comrel.diagram.part.custom;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.edithelper.IEditHelper;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;


/**
 * Neues ElementTyp mit dem Attribut refId
 * @author Gerrit
 *
 */
public class ElementTypeWithId implements IElementType {

	final String refId;
	final IElementType iElementType;
	
	public ElementTypeWithId(String refId, IElementType iElementType){
		this.refId=refId;
		this.iElementType=iElementType;
	}
	
	@Override
	public boolean canEdit(IEditCommandRequest req) {
		
		return iElementType.canEdit(req);
	}

	@Override
	public IElementType[] getAllSuperTypes() {
		return iElementType.getAllSuperTypes();
	}

	@Override
	public String getDisplayName() {
		return iElementType.getDisplayName();
	}

	@Override
	public EClass getEClass() {
		return iElementType.getEClass();
	}

	@Override
	public ICommand getEditCommand(IEditCommandRequest request) {
		return iElementType.getEditCommand(request);
	}

	@Override
	public IEditHelper getEditHelper() {
		return iElementType.getEditHelper();
	}

	@Override
	public URL getIconURL() {
		return iElementType.getIconURL();
	}

	@Override
	public String getId() {
		return iElementType.getId();
	}

	@Override
	public Object getAdapter(Class adapter) {
		return iElementType.getAdapter(adapter);
	}


	@Override
	public boolean equals(Object obj) {
		return iElementType.equals(obj);
	}


	@Override
	public int hashCode() {
		return iElementType.hashCode();
	}

	@Override
	public String toString() {
		return iElementType.toString();
	}

	public String getRefId(){
		return this.refId;
	}
	
}
