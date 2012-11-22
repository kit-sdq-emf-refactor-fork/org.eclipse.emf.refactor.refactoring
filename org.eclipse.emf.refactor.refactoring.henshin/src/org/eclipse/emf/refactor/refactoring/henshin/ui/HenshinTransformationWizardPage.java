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
package org.eclipse.emf.refactor.refactoring.henshin.ui;

import java.io.File;
import java.io.FileFilter;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.refactor.refactoring.henshin.generator.HenshinRefactoringInfo;
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

/**
 * Wizard page for specifying Henshin files used for initial checking,
 * final checking, and executing the EMF model refactoring.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class HenshinTransformationWizardPage extends WizardPage implements Listener {
	
	private Combo transformationCombo;
	private Combo checkInitialCombo;
	private Combo checkFinalCombo;
	
	/**
	 * Wizard that owns the WizardPage.
	 */
	private NewRefactoringWizardHenshin wizard;
	
	/**
	 * Name of the project the model refactoring code has to be 
	 * generated to.
	 */
	private String projectName = "";
	
	/**
	 * List of Henshin files contained in the 'transformation' folder
	 * of the project with name 'projectName'.
	 */
	private File[] henshinFiles;
	
	/**
	 * Name of the Henshin file used for executing the EMF model
	 * refactoring.
	 */
	private String transformationFileName = "";
	
	/**
	 * Name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 */
	private String checkInitialFileName = "";
	
	/**
	 * Name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 */
	private String checkFinalFileName = "";
	
	/**
	 * Default constructor.
	 * @param pageName Name of the wizard page.
	 * @param newRefactoringWizardHenshin Wizard that owns the WizardPage.
	 */
	protected HenshinTransformationWizardPage
		(String pageName, NewRefactoringWizardHenshin newRefactoringWizardHenshin) {
		super(pageName);
		this.wizard = newRefactoringWizardHenshin;
		this.henshinFiles = new File[0];
	}	
	
	/**
	 * Sets the name of the project the model refactoring code has to be 
	 * generated to and sets the combos according to the project name.
	 * @param projectName
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
		setHenshinFiles();
		setCombos();
		checkIsPageComplete();
	}
	
	/**
	 * Sets the name of the Henshin file used for executing the EMF model
	 * refactoring and redirects it to the owning wizard.
	 * @param transformationFileName Name of the Henshin file used for 
	 * executing the EMF model refactoring.
	 */
	private void setTransformationFileName(String transformationFileName) {
		this.transformationFileName = transformationFileName;
		this.wizard.setTransformationFileName(transformationFileName);
	}

	/**
	 * Gets the name of the Henshin file used for executing the EMF model
	 * refactoring.
	 * @return Name of the Henshin file used for executing the EMF model
	 * refactoring.
	 */
	public String getTransformationFileName() {
		return transformationFileName;
	}

	/**
	 * Sets the name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 * @param checkInitialFileName Name of the Henshin file used for the 
	 * initial checking of the EMF model refactoring.
	 */
	private void setCheckInitialFileName(String checkInitialFileName) {
		this.checkInitialFileName = checkInitialFileName;
	}

	/**
	 * Gets the name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 * @return Name of the Henshin file used for the initial checking 
	 * of the EMF model refactoring.
	 */
	public String getCheckInitialFileName() {
		return checkInitialFileName;
	}

	/**
	 * Sets the name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 * @param checkFinalFileName Name of the Henshin file used for the 
	 * final checking of the EMF model refactoring.
	 */
	private void setCheckFinalFileName(String checkFinalFileName) {
		this.checkFinalFileName = checkFinalFileName;
	}

	/**
	 * Gets the name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 * @return Name of the Henshin file used for the final checking 
	 * of the EMF model refactoring.
	 */
	public String getCheckFinalFileName() {
		return checkFinalFileName;
	}
	
	/**
	 * Sets the list of Henshin files contained in the 'transformation' 
	 * folder of the project with name 'projectName'.
	 */
	private void setHenshinFiles() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
										.getProject(this.projectName);
		String path = project.getLocationURI().getPath() 
									+ HenshinRefactoringInfo.TRAFODIR;
		File file = new File(path);
		FileFilter ff = new FileFilter() {			
			@Override
			public boolean accept(File pathname) {
				if (pathname.getName().endsWith(".henshin")){
					return true;
				} else {
					return false;
				}
			}
		};
		this.henshinFiles = file.listFiles(ff);
	}
	
	/**
	 * Sets the combos  according to the project name.
	 */
	private void setCombos() {
		transformationCombo.removeAll();
		checkInitialCombo.removeAll();
		checkFinalCombo.removeAll();
		if (this.henshinFiles != null){
			for (File file : henshinFiles){
				transformationCombo.add(file.getName());
				checkInitialCombo.add(file.getName());
				checkFinalCombo.add(file.getName());
			}
		}
	}
	
	/**
	 * Checks whether the edited data are complete and sets
	 * the corresponding message to the top of the wizard page.
	 */
	private void checkIsPageComplete() {
		if (henshinFiles == null){
			setMessage("The target project '" + projectName + 
					"' does not contain a folder '" + 
					HenshinRefactoringInfo.TRAFODIR + "'.", SWT.ERROR);
			setPageComplete(false);
		} else {
			if (henshinFiles.length == 0){
				setMessage("There is no henshin transformation file in " +
						"folder '" + HenshinRefactoringInfo.TRAFODIR + 
						"' of project '" + projectName + "'.", SWT.ERROR);
				setPageComplete(false);
			} else {
				if (transformationCombo.getSelectionIndex() == -1){
					setMessage("Please select a henshin transformation " +
							"file (execute).", SWT.ERROR);
					setPageComplete(false);
				} else {
					if (checkInitialCombo.getSelectionIndex() == -1){
						setMessage("Please select a henshin transformation " +
								"file (check initial).", SWT.ERROR);
					} else {
						if (checkFinalCombo.getSelectionIndex() == -1){
							setMessage("Please select a henshin " +
									"transformation file (check final).", 
																SWT.ERROR);
						} else {
							setMessage("", SWT.NONE);
						}
					}	
					setPageComplete(true);
				}
			}
		}
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#
	 * createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		FillLayout fillLayout = new FillLayout();
		fillLayout.spacing = 5;
		fillLayout.type = SWT.VERTICAL;
		composite.setLayout(fillLayout);		
		GridLayout gl = new GridLayout();
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		gl.numColumns = 2;		
		Composite transformationComposite = 
						new Composite(composite, SWT.BORDER);
		transformationComposite.setLayout(gl);		
		Label textTransformationLabel = 
						new Label(transformationComposite, SWT.NONE);
		textTransformationLabel
			.setText("Model transformation file name (execute):        ");		
		transformationCombo = 
					new Combo (transformationComposite, SWT.READ_ONLY);
		transformationCombo.setLayoutData(gd);
		transformationCombo.addListener(SWT.Selection, this);		
		Composite checkInitialComposite = 
					new Composite(composite, SWT.BORDER);
		checkInitialComposite.setLayout(gl);
		Label textCheckInitialLabel = 
					new Label(checkInitialComposite, SWT.NONE);
		textCheckInitialLabel
			.setText("Model transformation file name (check initial): ");		
		checkInitialCombo = new Combo (checkInitialComposite, SWT.READ_ONLY);
		checkInitialCombo.setLayoutData(gd);
		checkInitialCombo.addListener(SWT.Selection, this);		
		Composite checkFinalComposite = new Composite(composite, SWT.BORDER);
		checkFinalComposite.setLayout(gl);
		Label textCheckFinalLabel = new Label(checkFinalComposite, SWT.NONE);
		textCheckFinalLabel
			.setText("Model transformation file name (check final):   ");		
		checkFinalCombo = new Combo (checkFinalComposite, SWT.READ_ONLY);
		checkFinalCombo.setLayoutData(gd);
		checkFinalCombo.addListener(SWT.Selection, this);		
		setControl(composite);
	}

	/**
	 * @see org.eclipse.swt.widgets.Listener#
	 * handleEvent(org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		if (event.widget == transformationCombo){
			int index = transformationCombo.getSelectionIndex();
			if (index == -1){
				setTransformationFileName("");
			} else {
				setTransformationFileName(transformationCombo.getItem(index));
			}
		}
		if (event.widget == checkInitialCombo){
			int index = checkInitialCombo.getSelectionIndex();
			if (index == -1){
				setCheckInitialFileName("");
			} else {
				setCheckInitialFileName(checkInitialCombo.getItem(index));
			}
		}
		if (event.widget == checkFinalCombo){
			int index = checkFinalCombo.getSelectionIndex();
			if (index == -1){
				setCheckFinalFileName("");
			} else {
				setCheckFinalFileName(checkFinalCombo.getItem(index));
			}
		}
		checkIsPageComplete();
	}

}
