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

import java.util.ArrayList;

import org.eclipse.emf.refactor.refactoring.generator.core.ParameterInfo;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/**
 * Wizard page for configurating model refactoring parameters.
 * @generated NOT
 * @author Thorsten Arendt
 */
public class ParameterWizardPage extends WizardPage implements Listener {
	
	private static final String PAGE_NAME = "org.eclipse.emf.refactor.refactoring.generator.ParameterWizardPage";
	private static final String PAGE_TITLE = "New Refactoring: Parameter Data";
	private static final String PAGE_DESCRIPTION = "Please specify the parameter of the refactoring. " +
												"Required fields are denoted by \"(*)\".";
	
	private Button addButton;
	private Button removeButton;
	private List parameterList;	
	private Button cancelButton; 
	private Button saveButton; 
	private Text nameText;
	private Text descriptionText;
	
	/**
	 * List of model refactoring parameter configuration data.
	 */
	private java.util.List<ParameterInfo> parameters;

	/**
	 * Default constructor.
	 */
	protected ParameterWizardPage() {
		super(PAGE_NAME);
		setTitle(PAGE_TITLE);
		setDescription(PAGE_DESCRIPTION);
		parameters = new ArrayList<ParameterInfo>();
	}
	
	/**
	 * Gets a list of model refactoring parameter configuration data.
	 * @return List of model refactoring parameter configuration data.
	 */
	public java.util.List<ParameterInfo> getParameters(){
		return parameters;
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
		createListComposite(composite);
		createParameterComposite(composite);
		checkParameterList();
		setControl(composite);
	}
	
	/**
	 * Creates a composite including a list of parameter configuration
	 * data objects.
	 * @param parent Parent composite.
	 */
	private void createListComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		composite.setLayout(new RowLayout(SWT.VERTICAL));
		Label textLabel = new Label(composite, SWT.CENTER);
		textLabel.setText("Refactoring parameters: ");
		Composite parameterComposite = new Composite(composite, SWT.NULL);
		parameterComposite.setLayout(new RowLayout(SWT.HORIZONTAL));
		parameterList = new List(parameterComposite, 
								SWT.V_SCROLL | SWT.H_SCROLL | SWT.MULTI);
		parameterList.setLayoutData(new RowData(350, 80));
		Composite buttonComposite = 
							new Composite(parameterComposite, SWT.NULL);
		buttonComposite.setLayout(new RowLayout(SWT.VERTICAL));
		addButton = new Button(buttonComposite, SWT.PUSH);
		addButton.setText("Add");
		addButton.setLayoutData(new RowData(100, 25));
		addButton.addListener(SWT.Selection, this);
		removeButton = new Button(buttonComposite, SWT.PUSH);
		removeButton.setText("Remove");
		removeButton.setLayoutData(new RowData(100, 25));
		removeButton.addListener(SWT.Selection, this);
		removeButton.setEnabled(false);
	}
	
	/**
	 * Creates a composite for editing parameter configuration data.
	 * @param parent Parent composite.
	 */
	private void createParameterComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		composite.setLayout(gl);		
		Label idLabel = new Label(composite, SWT.NONE);
		idLabel.setText("Parameter name: ");
		idLabel.setEnabled(true);		
		nameText = new Text(composite, SWT.BORDER);
		nameText.setToolTipText("Parameter name");
		nameText.setEnabled(false);
		nameText.setLayoutData(gd);		
		Label menuLabel = new Label(composite, SWT.NONE);
		menuLabel.setText("Parameter description: ");
		menuLabel.setEnabled(true);		
		descriptionText = new Text(composite, SWT.BORDER);
		descriptionText.setToolTipText("Parameter description");
		descriptionText.setEnabled(false);
		descriptionText.setLayoutData(gd);		
		cancelButton = new Button(composite, SWT.PUSH);
		cancelButton.setText("Cancel");
		cancelButton.setLayoutData(new GridData(100, 25));
		cancelButton.setEnabled(false);
		cancelButton.addListener(SWT.Selection, this);		
		saveButton = new Button(composite, SWT.PUSH);
		saveButton.setText("Save");
		saveButton.setLayoutData(new GridData(100, 25));
		saveButton.setEnabled(false);
		saveButton.addListener(SWT.Selection, this);
	}
	
	/**
	 * Checks whether the parameter list is empty and sets
	 * the corresponding message to the top of the wizard page.
	 */
	private void checkParameterList() {
		if (parameters.isEmpty()){
			setMessage("There is no parameter specified. " +
					"Please insert a parameter.", SWT.ERROR);
			removeButton.setEnabled(false);
		} else {
			setMessage("", SWT.NONE);
			removeButton.setEnabled(true);
		}
	}

	/**
	 * @see org.eclipse.swt.widgets.Listener#handleEvent
	 * (org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		if (event.widget == addButton){
			enableListElements(false);
			enableParameterElements(true);
		}
		if (event.widget == removeButton){
			int index = parameterList.getSelectionIndex();
			if (index == -1){
				MessageDialog.openError(getShell(), "EMF Refactor", 
					"Please select a parameter from the list.");
				return;
			}
			if (MessageDialog.openConfirm(getShell(), "EMF Refactor", 
					"Remove parameter '" 
					+ parameters.get(index).getName() + "'?")){
				parameters.remove(index);
				updateList();
				checkParameterList();
			}
		}
		if (event.widget == cancelButton){
			clearTextElements();
			enableParameterElements(false);
			enableListElements(true);
			checkParameterList();
		}
		if (event.widget == saveButton){
			String name = nameText.getText().trim().replaceAll(" ", "");
			if (name.isEmpty()){
				MessageDialog.openError(getShell(), "EMF Refactor", 
						"Please insert a parameter name.");
				return;
			}
			name = name.substring(0,1).toLowerCase() + name.substring(1);
			for (ParameterInfo param : parameters){
				if (param.getName().equals(name)){
					MessageDialog.openError(getShell(), "EMF Refactor", 
						"There is already a parameter named '" 
						+ name + "'.");
					return;
				}
			}
			ParameterInfo newParameter = new ParameterInfo(name);
			newParameter.setDescription(descriptionText.getText().trim());
			parameters.add(newParameter);
			updateList();
			clearTextElements();
			enableParameterElements(false);
			enableListElements(true);
			checkParameterList();
		}		
	}

	/**
	 * Updates the list of model refactoring parameter configuration data.
	 */
	private void updateList(){
		parameterList.removeAll();
		for (ParameterInfo param : parameters){
			parameterList.add(param.getName());
		}
	}
	
	/**
	 * Removes the contents of the text components.
	 */
	private void clearTextElements(){
		nameText.setText("");
		descriptionText.setText("");
	}
	
	/**
	 * Enables the composites of the parameter section of the wizard page.
	 * @param b true if the composites shall be enabled, false otherwise.
	 */
	private void enableParameterElements(boolean b){
		nameText.setEnabled(b);
		descriptionText.setEnabled(b);
		cancelButton.setEnabled(b);
		saveButton.setEnabled(b);
		if (b){
			nameText.setFocus();
		}
	}
	
	/**
	 * Enables the composites of the list section of the wizard page.
	 * @param b true if the composites shall be enabled, false otherwise.
	 */
	private void enableListElements(boolean b){
		parameterList.setEnabled(b);
		addButton.setEnabled(b);
		removeButton.setEnabled(b);
		setPageComplete(b);
	}
}
