package comrel.generator.helper.wizards;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class BasicsWizardPage extends WizardPage implements Listener {
	private Text txtName;
	private Text txtDescription;
	private String helperName = "";
	private String helperDescription = "";

	/**
	 * Create the wizard.
	 */
	public BasicsWizardPage() {
		super("HelperBasicsWizardPage");
		setTitle("Basic Helper data");
		setDescription("Please insert name and description of the new refactoring helper.");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Label lblPleaseInsertA = new Label(container, SWT.NONE);
		lblPleaseInsertA.setText("Name of the Helper* (must start with an upper case letter):");
		
		txtName = new Text(container, SWT.BORDER);
		GridData gd_txtName = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_txtName.widthHint = 600;
		txtName.setLayoutData(gd_txtName);
		txtName.addListener(SWT.Modify, this);
		txtName.setFocus();
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setText("Description of its intended purpose:");
		
		txtDescription = new Text(container, SWT.BORDER | SWT.V_SCROLL);
		GridData gd_txtDescription = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_txtDescription.heightHint = 195;
		gd_txtDescription.widthHint = 600;
		txtDescription.setLayoutData(gd_txtDescription);
		txtDescription.addListener(SWT.Modify, this);
		
		this.setPageComplete(false);
	}

	@Override
	public void handleEvent(Event event) {
		if (event.widget == txtName) {
			helperName = txtName.getText();
			updatePageComplete();
		}
		if (event.widget == txtDescription) {
			helperDescription = txtDescription.getText();
		}
	}

	private void updatePageComplete() {
		if (helperName.isEmpty()) {
			this.setMessage("The name of the helper is not specified.", ERROR);
			this.setPageComplete(false);
		} else {
			char c = helperName.charAt(0);
			if (Character.isLetter(c) && Character.isUpperCase(c)) {
				this.setMessage("Please insert name and description of the new refactoring helper.");
				this.setPageComplete(true);
			} else {
				this.setMessage("The name of the helper must begin with an upper case letter.", ERROR);
				this.setPageComplete(false);
			}
		}
	}

	public String getHelperName() {
		return helperName;
	}

	public String getClassName() {
		return helperName.replaceAll(" ", "");
	}

	public String getHelperDescription() {
		return helperDescription;
	}
	
}
