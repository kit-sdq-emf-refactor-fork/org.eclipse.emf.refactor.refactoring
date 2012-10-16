/*******************************************************************************
 * Copyright (c) Philipps University of Marburg. All rights reserved. 
 * This program and the accompanying materials are made 
 * available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Philipps University of Marburg - initial API and implementation
 *******************************************************************************/
package org.eclipse.emf.refactor.refactoring.generator.ui;

import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;
import org.eclipse.emf.refactor.refactoring.generator.managers.XMLPluginFileManager;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page for configurating model refactoring data (basics).
 * @generated NOT
 * @author Thorsten Arendt
 */
public class BasicDataWizardPage extends WizardPage implements Listener {
	
	private Text idText;
	private Text menuText;
	private Text nsUriText;
	private Text classText;
	private Text jarText;
	private Combo projectCombo;	
	
	/**
	 * Id of the model refactoring to be generated.
	 */
	private String id = "";
	
	/**
	 * Inserted id of the model refactoring to be generated.
	 */
	private String originalId = "";
	
	/**
	 * Menu Label of the model refactoring to be generated.
	 */
	private String menuLabel = "";
	
	/**
	 * Name of the project the model refactoring code has to be 
	 * generated to.
	 */
	private String projectName = "";
	
	/**
	 * Namespace for the model refactoring to be generated.
	 */
	private String nsUri = "";
	
	/**
	 * Name of the class the model refactoring shall be executed on.
	 */
	private String className = "";
	
	/**
	 * Name of the jar file that owns the class specified in 'className'.
	 */
	private String jar = "";
	
	/**
	 * The selected EObject when starting the generation process of
	 * the model refactoring.
	 */
	private EObject selectedEObject;
	
	/**
	 * Namespace prefix for the model refactoring to be generated.
	 */
	private String nsPrefix = "";
	 
	/**
	 * Name of the meta model for the  model refactoring to be generated.
	 */
	private String metaModelName = "";

	/**
	 * Default constructor.
	 * @param pageName Name of the wizard page.
	 * @param selectedEObject Selected EObject when starting the 
	 * generation process of the model refactoring.
	 */
	protected BasicDataWizardPage(String pageName, EObject selectedEObject) {
		super(pageName);
		this.selectedEObject = selectedEObject;
	}
	
	/**
	 * Gets the id of the model refactoring to be generated.
	 * @return Id of the model refactoring to be generated.
	 */
	public String getRefactoringId(){
		return id;
	}
	
	/**
	 * Gets the menu Label of the model refactoring to be generated.
	 * @return Menu Label of the model refactoring to be generated.
	 */
	public String getMenuLabel(){
		if (menuLabel.isEmpty()){
			return originalId;
		} else {
			return menuLabel;
		}
	}
	
	/**
	 * Gets the namespace for the model refactoring to be generated.
	 * @return Namespace for the model refactoring to be generated.
	 */
	public String getNsUri(){
		return nsUri;
	}
	
	/**
	 * Gets the name of the class the model refactoring shall be 
	 * executed on.
	 * @return Name of the class the model refactoring shall be 
	 * executed on.
	 */
	public String getClassName(){
		return className;
	}
	
	/**
	 * Gets the name of the jar file that owns the class 
	 * specified in 'className'.
	 * @return Name of the jar file that owns the class 
	 * specified in 'className'.
	 */
	public String getJar(){
		return jar;
	}
	
	/**
	 * Gets the name of the project the model refactoring code 
	 * has to be generated to.
	 * @return Name of the project the model refactoring code 
	 * has to be generated to.
	 */
	public String getProjectName(){
		return projectName;
	}
	
	/**
	 * Gets the namespace prefix for the model refactoring to be generated.
	 * @return Namespace prefix for the model refactoring to be generated.
	 */
	public String getNsPrefix(){
		return nsPrefix;
	}
		
	/**
	 * Gets the name of the meta model for the model refactoring to be generated.
	 * @return Name of the meta model for the model refactoring to be generated.
	 */
	public String getMetaModelName(){
		return metaModelName;
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl
	 * (org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		FillLayout fillLayout = new FillLayout();
		fillLayout.spacing = 5;
		fillLayout.type = SWT.VERTICAL;
		composite.setLayout(fillLayout);
		createTextComposite(composite);
		createSelectedEObjectComposite(composite);
		createProjectComposite(composite);
		checkIsPageComplete();
		setControl(composite);
	}
	
	/**
	 * Creates a composite for editing id and menu label of the 
	 * model refactoring to be generated.
	 * @param parent Parent composite.
	 */
	private void createTextComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		composite.setLayout(gl);		
		Label idLabel = new Label(composite, SWT.NONE);
		idLabel.setText("Name of the new EMF Model Refactoring (Id): ");
		idLabel.setEnabled(true);		
		idText = new Text(composite, SWT.BORDER);
		idText.setToolTipText("Refactoring-Id");
		idText.setEnabled(true);
		idText.setLayoutData(gd);
		idText.addListener(SWT.Modify, this);		
		Label menuLabel = new Label(composite, SWT.NONE);
		menuLabel.setText("Text to be shown in menu (menu label): ");
		menuLabel.setEnabled(true);		
		menuText = new Text(composite, SWT.BORDER);
		menuText.setToolTipText("Menu Label Text");
		menuText.setEnabled(true);
		menuText.setLayoutData(gd);
		menuText.addListener(SWT.Modify, this);
	}
	
	/**
	 * Creates a composite for displaying the namespace, the selected class,
	 * and the owning jar file of the model refactoring to be generated.
	 * @param parent Parent composite.
	 */
	private void createSelectedEObjectComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		composite.setLayout(gl);		
		Label nsUriLabel = new Label(composite, SWT.NONE);
		nsUriLabel.setText("Namespace-Uri: ");
		nsUriLabel.setEnabled(true);		
		nsUriText = new Text(composite, SWT.BORDER);
		nsUri = ((EPackage)selectedEObject.eClass().eContainer())
														.getNsURI();
		nsUriText.setText(nsUri);
		nsUriText.setEnabled(false);
		nsUriText.setLayoutData(gd);		
		Label classLabel = new Label(composite, SWT.NONE);
		classLabel.setText("Class of selected EObject (context): ");
		classLabel.setEnabled(true);		
		classText = new Text(composite, SWT.BORDER);
		className = selectedEObject.eClass().getInstanceClassName();
		classText.setText(className);
		classText.setEnabled(false);
		classText.setLayoutData(gd);		
		Label jarLabel = new Label(composite, SWT.NONE);
		jarLabel.setText("jar-File to be included (required bundle): ");
		jarLabel.setEnabled(true);		
		jarText = new Text(composite, SWT.BORDER);
		jar = selectedEObject.eClass().getInstanceClass().getPackage()
															.getName();
		jarText.setText(jar);
		jarText.setEnabled(false);
		jarText.setLayoutData(gd);
		
		nsPrefix = ((EPackage)selectedEObject.eClass().eContainer())
														.getNsPrefix();
		metaModelName = selectedEObject.eClass().eContainer()
												.getClass().getName();
	}
	
	/**
	 * Creates a composite for choosing the project the model refactoring 
	 * code has to be generated to.
	 * @param parent Parent composite.
	 */
	private void createProjectComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayout gl = new GridLayout();
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gl.numColumns = 2;
		composite.setLayout(gl);		
		Label projectLabel = new Label(composite, SWT.NONE);
		projectLabel.setText("Plugin-Project that will contain the code: ");
		projectLabel.setEnabled(true);		
		projectCombo = new Combo (composite, SWT.READ_ONLY);
		projectCombo.setLayoutData(gd);
		projectCombo.addListener(SWT.Selection, this);
		addProjectsToCombo(projectCombo);
	}
	
	/**
	 * Adds the plugin-projects of the workspace to the given combo.
	 * @param projectCombo Combo the projects have to be inserted to.
	 */
	private void addProjectsToCombo(Combo projectCombo) {
		IProject[] projects = 
					ResourcesPlugin.getWorkspace().getRoot().getProjects();
		for (IProject project : projects){
			if (project.isOpen()){
				IProjectNature nature = null;
				try {
					nature = project.getNature("org.eclipse.pde.PluginNature");
				} catch (CoreException e) {
					e.printStackTrace();
				}
				if (null != nature){
					projectCombo.add(project.getName());
				}
			}
		}
	}
	
	/**
	 * Checks whether the edited data are complete and sets
	 * the corresponding message to the top of the wizard page.
	 */
	private void checkIsPageComplete() {
		if (projectCombo.getItemCount() == 0){
			setErrorMessage("EMF Refactor cannot generate code without an " +
					"open plugin-project in the actual workspace.");
			setPageComplete(false);
			return;
		}		
		if (id.isEmpty()){
			setMessage("Please insert a name.", SWT.ERROR);
			setPageComplete(false);
		} else {
			if (projectName.isEmpty()){
				setMessage("Please select a plugin-project to generate " +
						"							your code in.", SWT.ERROR);
				setPageComplete(false);
			} else {
				if (! XMLPluginFileManager.pluginXmlExists(projectName)){
					XMLPluginFileManager.createPluginXml(projectName);
				}
				List<RefactoringInfo> refactoringConfig = 
					XMLPluginFileManager.getRefactoringConfig(projectName);
				boolean exists = false;
				for (RefactoringInfo refCon : refactoringConfig){
					if (refCon.getRefactoringId().equals(id)){
						exists = true;
						break;
					}
				}
				if (exists){
					setMessage("There is already a refactoring with id '" + 
								id + "' in project '" + projectName + "'!");
					setPageComplete(false);
				} else {
					if (menuLabel.isEmpty()){
						setMessage("Please insert a text to be shown in " +
								"menu (menu label). Otherwise, EMF Refactor " +
								"will show the refactoring name.", SWT.ERROR);
					} else {
						setMessage("", SWT.NONE);
					}
					setPageComplete(true);
				}
			}
		}
	}

	/**
	 * @see org.eclipse.swt.widgets.Listener#handleEvent
	 * (org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		if (event.widget == idText){
			id = idText.getText().trim().replaceAll(" ", "");
			originalId = idText.getText().trim();
		}
		if (event.widget == menuText){
			menuLabel = menuText.getText().trim();
		}
		if (event.widget == projectCombo){
			int index = projectCombo.getSelectionIndex();
			if (index == -1){
				projectName = "";
			} else {
				projectName = projectCombo.getItem(index);
			}
		}
		checkIsPageComplete();
	}

}
