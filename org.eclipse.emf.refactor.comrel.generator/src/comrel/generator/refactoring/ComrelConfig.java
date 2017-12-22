package comrel.generator.refactoring;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.refactor.refactoring.generator.core.ParameterInfo;
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;

import comrel.CompositeRefactoring;
import comrel.InputPort;

public class ComrelConfig extends RefactoringInfo {
	
	public static final String COMRELDIR = "/comrelmodels/";
	public static final String COMRELEXT = ".comrel";
	
	private static final String SELECTEDEOBJECT = "selectedEObject";
	private static final String SELECTEDEOBJECTS = "selectedEObjects";
	
	private boolean multi = false;
	private String comrelModel;
	
	public ComrelConfig(CompositeRefactoring cr, IProject project, String comrelModel) {
		super(project.getName(), cr.getRefId(), 
				cr.getLabel(), cr.getNamespaceUri());
		this.comrelModel = comrelModel;
		this.init(cr);
	}

	public boolean isMulti() {
		return multi;
	}

	public String getComrelModel() {
		return comrelModel;
	}

	private void init(CompositeRefactoring cr) {
		List<InputPort> ips = cr.getMainRefactoringUnit().getAllInputPorts();
		for (InputPort ip : ips) {
			if (ip.getName().equals(SELECTEDEOBJECTS)) multi = true; 
			if (ip.getName().equals(SELECTEDEOBJECT) 
					|| ip.getName().equals(SELECTEDEOBJECTS)) {
				setSelectedEObjectClass(ip.getType().getName());
				setSelectedEObjectJar(ip.getType().getPackage().getName());
			} else {
				ParameterInfo pi = new ParameterInfo(ip.getName());
				if (ip.getDescription() != null) {
					pi.setDescription(ip.getDescription());
				}
				this.getParameters().add(pi);
			}
		}
	}

	@Override
	public String toString() {
		return "ComrelConfig \n [projectName=" + projectName
				+ ", \n getParameters()=" + getParameterString()
				+ ", \n getProjectName()=" + getProjectName()
				+ ", \n getRefactoringId()=" + getRefactoringId()
				+ ", \n getMenuLabel()=" + getMenuLabel() + ", \n getNamespaceUri()="
				+ getNamespaceUri() + ", \n getSelectedEObjectClass()="
				+ getSelectedEObjectClass() + ", \n getSelectedEObjectJar()="
				+ getJar() + ", \n getGuiHandler()="
				+ getGuiHandler() + ", \n getController()=" + getController()
				+ ", \n getPackageName()=" + getPackageName() + ", \n getClass()="
				+ getClass() + ", \n hashCode()=" + hashCode() + ", \n toString()="
				+ super.toString() + "]";
	}
	
	private String getParameterString() {
		String ret = "";
		for (ParameterInfo pi : getParameters()) {
			ret += " " + pi.getName() + ":" + pi.getDescription() + ";";
		}
		return ret;
	}

}

