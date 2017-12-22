package comrel.generator.refactoring.wizards;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;

import comrel.generator.refactoring.ComrelConfig;

public class CoMReLRefactoringWizardPage extends WizardPage implements Listener, SelectionListener {

	private Combo comboProject;
	private Combo comboFile;
	private Button btnImport;
	
	private LinkedList<IProject> projects;
	private final String PLUGINNATURE = "org.eclipse.pde.PluginNature";
	private String[] projectNames;
	
	private File[] comrelFiles;
	private String[] comrelFileNames;
	
	private IProject project;
	private String comrelFileName;

	/**
	 * Create the wizard.
	 */
	public CoMReLRefactoringWizardPage() {
		super("CoMReLRefactoringWizardPage");
		setTitle("CoMReL - project and model selection");
		setDescription("Please select a plug-in project and an appropriate CoMReL model.");
		initProjects();
	}
	
	public IProject getProject() {
		return project;
	}

	public String getComrelFileName() {
		return comrelFileName;
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

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(3, false));
		
		Label lblEclipsePluginProject = new Label(container, SWT.NONE);
		lblEclipsePluginProject.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEclipsePluginProject.setText("Eclipse plug-in project:");
		
		comboProject = new Combo(container, SWT.NONE);
		comboProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("");
		
		Label lblComrelModelFile = new Label(container, SWT.NONE);
		lblComrelModelFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblComrelModelFile.setText("CoMReL model file:");
		
		comboFile = new Combo(container, SWT.NONE);
		comboFile.setEnabled(false);
		comboFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		btnImport = new Button(container, SWT.NONE);
		btnImport.setEnabled(false);
		btnImport.setText("import");
		
		setProjectCombo();
		comboProject.addListener(SWT.Modify, this);
		comboFile.addListener(SWT.Modify, this);
		btnImport.addSelectionListener(this);
		
		this.setPageComplete(false);
	}
	
	private void setProjectCombo() {
		if (projects.isEmpty()) {
			this.setMessage("There is no open plug-in project in the current workspace!", ERROR);
			comboProject.setEnabled(false);
		} else {
			projectNames = new String[projects.size()];
			for (int i = 0; i < projectNames.length; i++) {
				projectNames[i] = projects.get(i).getName();
			}
			comboProject.setItems(projectNames);
		}
	}

	@Override
	public void handleEvent(Event event) {
		if (event.widget == comboProject) {
			setProject(comboProject.getSelectionIndex());
		}
		if (event.widget == comboFile) {
			setComrelFile(comboFile.getSelectionIndex());
		}
	}
	
	private void setComrelFile(int index) {
		if (index == -1) {
			comrelFileName = null;
			this.setPageComplete(false);
			this.setMessage("Please select or import the corresponding CoMReL model.");
		} else {
			comrelFileName = comrelFileNames[index];
			this.setPageComplete(true);
			this.setMessage("Please select a plug-in project and an appropriate CoMReL model.");
		}
	}

	private void setProject(int index) {
		if (index == -1) {
			project = null;
		} else {
			project = projects.get(index);
			comboProject.setEnabled(false);
			loadComrelFiles();
			setComrelCombo();
		}
	}

	private void setComrelCombo() {
		if (comrelFiles != null) {
			comrelFileNames = new String[comrelFiles.length];
			for (int i = 0; i < comrelFiles.length; i++) {
				comrelFileNames[i] = comrelFiles[i].getName();
			}
			comboFile.setItems(comrelFileNames);
			comboFile.setEnabled(true);
			btnImport.setEnabled(true);
			this.setMessage("Please select or import the corresponding CoMReL model.");
		}
	}

	private void loadComrelFiles() {
		String path = project.getLocationURI().getPath() + ComrelConfig.COMRELDIR;
		File file = new File(path);
		if (! file.exists()) {
			file.mkdirs();
		}
		FileFilter ff = new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				if (pathname.getName().endsWith(ComrelConfig.COMRELEXT)) {
					return true;
				} else {
					return false;
				}
			}
		};
		comrelFiles = file.listFiles(ff);
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		FileDialog fd = new FileDialog(this.getShell(), SWT.OPEN);
		fd.setText("Select CoMReL model");
		fd.setFilterPath(project.getLocation().toString());
		String[] filterExt = { "*" + ComrelConfig.COMRELEXT };
		fd.setFilterExtensions(filterExt);
		String selected = fd.open();
		if (selected != null)
			if (!selected.isEmpty()) {
				selected = selected.replace('\\', '/');
				int i = selected.lastIndexOf("/");
				String name = selected.substring(i + 1);
				String destination = project.getLocationURI().getPath() + ComrelConfig.COMRELDIR;
				copyFile(selected, destination, name);
				File f = new File(selected);
				if (comrelFiles == null) {
					comrelFiles = new File[] {f};
					comrelFileNames = new String[] {name};
				} else {
					File[] fileTemp = new File[comrelFiles.length + 1];
					String[] nameTemp = new String[comrelFiles.length + 1];
					for (int j = 0; j < comrelFiles.length; j++) {
						fileTemp[j] = comrelFiles[j]; 
						nameTemp[j] = comrelFileNames[j];
					}
					fileTemp[comrelFiles.length] = f;
					nameTemp[comrelFiles.length] = name;
					comrelFiles = fileTemp;
					comrelFileNames = nameTemp;
				}
				comboFile.setItems(comrelFileNames);
			}
	}
	
	public static void copyFile(String target, String destination, String name) {
		File file = new File(destination);
		if (! file.exists()) {
			file.mkdirs();
		}
		File newFile = new File(destination + name);
		try {
			newFile.createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		copy(target, destination + name);
	}

	public static void copy(String filePath, String newFilePath) {
		try {
			BufferedInputStream is = new BufferedInputStream(
					new FileInputStream(filePath));
			new File(newFilePath).createNewFile();
			BufferedOutputStream os = new BufferedOutputStream(
					new FileOutputStream(newFilePath));
			int b;
			while ((b = is.read()) != -1) {
				os.write(b);
			}
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) { }

}
