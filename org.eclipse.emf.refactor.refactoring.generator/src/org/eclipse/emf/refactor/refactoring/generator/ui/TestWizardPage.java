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
public class TestWizardPage extends WizardPage implements Listener {
	
	private static final String PAGE_NAME = "org.eclipse.emf.refactor.refactoring.generator.TestWizardPage";
	private static final String PAGE_TITLE = "New Refactoring: Test Data";
	private static final String PAGE_DESCRIPTION = "Please specify the number of test cases to be generated. " +
												"Required fields are denoted by \"(*)\".";
	
	private Text numberText;
	private Combo numberCombo;	
	
	/**
	 * Default constructor.
	 */
	public TestWizardPage() {
		super(PAGE_NAME);
		setTitle(PAGE_TITLE);
		setDescription(PAGE_DESCRIPTION);
	}
	
	/**
	 * The number of tests to be generated for this model refactoring.
	 */
	private int numberOfTests;
	
	/**
	 * Returns the number of tests to be generated for this
	 * model refactoring.	
	 * @return Number of tests to be generated for this model
	 * refactoring
	 */
	public int getNumberOfTests() {
		return numberOfTests;
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
		setControl(composite);
	}
	
	/**
	 * Creates a composite for changing the number of tests to be 
	 * generated for this model refactoring.
	 * @param parent Parent composite.
	 */
	private void createTextComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.BORDER);
		GridLayout gl = new GridLayout();
		gl.numColumns = 2;
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		composite.setLayout(gl);		
		Label numberLabel = new Label(composite, SWT.NONE);
		numberLabel.setText
			("Number of (empty) test cases to be generated: ");
		numberLabel.setEnabled(true);
		numberCombo = new Combo (composite, SWT.READ_ONLY);
		numberCombo.setLayoutData(gd);
		numberCombo.addListener(SWT.Selection, this);
		for (int i = 0 ; i <= 100; i++) {
			numberCombo.add(Integer.toString(i));
		}
		numberCombo.select(0);
	}
	
	/**
	 * @see org.eclipse.swt.widgets.Listener#handleEvent
	 * (org.eclipse.swt.widgets.Event)
	 */
	@Override
	public void handleEvent(Event event) {
		if (event.widget == numberText){
			numberOfTests = Integer.parseInt
					(numberText.getText().trim().replaceAll(" ", ""));
		}
		if (event.widget == numberCombo){
			int index = numberCombo.getSelectionIndex();
			if (index == -1){
				numberOfTests = 0;
			} else {
				numberOfTests = Integer.parseInt
						(numberCombo.getItem(index));
			}
		}
	}

}
