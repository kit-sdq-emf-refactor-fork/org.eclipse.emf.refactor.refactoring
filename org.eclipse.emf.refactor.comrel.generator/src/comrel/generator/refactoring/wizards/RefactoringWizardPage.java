package comrel.generator.refactoring.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;

public class RefactoringWizardPage extends WizardPage {

	/**
	 * Create the wizard.
	 */
	public RefactoringWizardPage() {
		super("wizardPage");
		setTitle("Wizard Page title");
		setDescription("Wizard Page description");
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
		
		Combo comboProject = new Combo(container, SWT.NONE);
		comboProject.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		
		Label lblComrelModelFile = new Label(container, SWT.NONE);
		lblComrelModelFile.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblComrelModelFile.setText("CoMReL model file:");
		
		Combo comboFile = new Combo(container, SWT.NONE);
		comboFile.setEnabled(false);
		comboFile.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button btnImport = new Button(container, SWT.NONE);
		btnImport.setEnabled(false);
		btnImport.setText("import");
	}

}
