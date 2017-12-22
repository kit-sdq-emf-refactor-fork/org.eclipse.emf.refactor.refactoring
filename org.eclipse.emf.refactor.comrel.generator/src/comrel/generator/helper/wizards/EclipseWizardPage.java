package comrel.generator.helper.wizards;

import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class EclipseWizardPage extends WizardPage implements Listener {
	
	private Text txtId;
	private Combo comboProject;
	
	private LinkedList<IProject> projects;
	private final String PLUGINNATURE = "org.eclipse.pde.PluginNature";
	private String[] projectNames;
	
	private String id = "";
	private IProject project;

	/**
	 * Create the wizard.
	 */
	public EclipseWizardPage() {
		super("EclipseWizardPage");
		setTitle("Eclipse Specifics");
		setDescription("Please insert a unique id and select a plug-in project.");
		initProjects();
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(2, false));
		
		Label lblUniqueHelperId = new Label(container, SWT.NONE);
		lblUniqueHelperId.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblUniqueHelperId.setText("Unique helper id:");
		
		txtId = new Text(container, SWT.BORDER);
		txtId.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		txtId.setFocus();
		txtId.addListener(SWT.Modify, this);
		
		Label lblEclipsePluginProject = new Label(container, SWT.NONE);
		lblEclipsePluginProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEclipsePluginProject.setText("Eclipse plug-in project:");
		
		comboProject = new Combo(container, SWT.NONE);
		comboProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		comboProject.addListener(SWT.Modify, this);
		
		setProjectCombo();
		
		this.setPageComplete(false);
	}
	
	private void setProjectCombo() {
		projectNames = new String[projects.size()];
		for (int i = 0; i < projectNames.length; i++) {
			projectNames[i] = projects.get(i).getName();
		}
		comboProject.setItems(projectNames);
	}

	private void initProjects() {
		this.projects = new LinkedList<IProject>();
		IProject[] allProjects = ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : allProjects) {
			if (project.isOpen()) {
				IProjectNature nature = null;
				try {
					nature = project.getNature(PLUGINNATURE);
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if (null != nature) 
					this.projects.add(project);
			}
		}
	}

	@Override
	public void handleEvent(Event event) {
		if (event.widget == txtId) {
			id = txtId.getText();
		}
		if (event.widget == comboProject) {
			setProject(comboProject.getSelectionIndex());
		}
		updatePageComplete();
	}

	private void setProject(int index) {
		if (index == -1) {
			project = null;
		} else {
			project = projects.get(index);
		}
	}

	public void updatePageComplete() {
		if (id.isEmpty()) {
			this.setMessage("The id of the helper is not specified.", ERROR);
			this.setPageComplete(false);
		} else {
			char firstChar = id.charAt(0);
			char lastChar = id.charAt(id.length() - 1);
			if ((firstChar == '.') || (lastChar == '.')) {
				this.setMessage("The helper id must not start or end with a dot ('.')", ERROR);
				this.setPageComplete(false);
			} else {
				for (int i = 0; i < id.length(); i++) {
					char c = id.charAt(i);
					if (Character.isLetter(c) || (c == '.')) {
						if (project == null) {
							this.setMessage("Please select a plug-in project.", ERROR);
							this.setPageComplete(false);
						} else {
							this.setMessage("Please insert a unique id and select a plug-in project.");
							this.setPageComplete(true);
						}
					} else {
						this.setMessage("The helper id must consist of characters and/or dots ('.')", ERROR);
						this.setPageComplete(false);
						break;
					}
				}
			}
		}
	}

	public String getId() {
		return id;
	}

	public String getProjectName() {
		return project.getName();
	}

}
