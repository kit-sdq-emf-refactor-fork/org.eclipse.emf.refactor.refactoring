package comrel.generator.helper.wizards;

import java.util.Arrays;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.emf.ecore.plugin.RegistryReader;

public class MetaModelWizardPage extends WizardPage implements Listener {
	
	private Combo comboMM, comboInput, comboOutput;
	
	private String[] metaModels;
	private EPackage metaModel;
	private String[] modelElementNames;
	private EClass inputPortType;
	private Object outputPortType;
	
	private boolean isFilter;

	/**
	 * Create the wizard.
	 */
	public MetaModelWizardPage(boolean isFilter) {
		super("HelperMetaModelWizardPage");
		setTitle("Meta model Data");
		setDescription("Please select a meta model and corresponding port type(s).");
		this.isFilter = isFilter;
		initMetaModels();
	}
	
	private void setComboMM() {
		comboMM.setItems(metaModels);
	}

	private void initMetaModels() {
		metaModels = EPackage.Registry.INSTANCE.keySet().toArray(new String[EPackage.Registry.INSTANCE.size()]);
		Arrays.sort(metaModels);
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		setControl(container);
		container.setLayout(new GridLayout(1, false));
		
		Composite composite = new Composite(container, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));
		
		Label lblMetaModelThe = new Label(composite, SWT.NONE);
		GridData gd_lblMetaModelThe = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblMetaModelThe.widthHint = 270;
		lblMetaModelThe.setLayoutData(gd_lblMetaModelThe);
		lblMetaModelThe.setText("Meta model the Helper conforms to:");
		
		comboMM = new Combo(composite, SWT.NONE);
		GridData gd_comboMM = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_comboMM.widthHint = 330;
		comboMM.setLayoutData(gd_comboMM);
		
		Composite composite_1 = new Composite(container, SWT.NONE);
		composite_1.setLayout(new GridLayout(2, false));
		
		Label lblMetaModelType = new Label(composite_1, SWT.NONE);
		GridData gd_lblMetaModelType = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblMetaModelType.widthHint = 270;
		lblMetaModelType.setLayoutData(gd_lblMetaModelType);
		lblMetaModelType.setText("Meta model type of the input port:");
		
		comboInput = new Combo(composite_1, SWT.NONE);
		comboInput.setEnabled(false);
		GridData gd_comboInput = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_comboInput.widthHint = 330;
		comboInput.setLayoutData(gd_comboInput);
		
		Composite composite_2 = new Composite(container, SWT.NONE);
		composite_2.setLayout(new GridLayout(2, false));
		
		Label lblMetaModelType_1 = new Label(composite_2, SWT.NONE);
		GridData gd_lblMetaModelType_1 = new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1);
		gd_lblMetaModelType_1.widthHint = 270;
		lblMetaModelType_1.setLayoutData(gd_lblMetaModelType_1);
		lblMetaModelType_1.setText("Meta model type of the output port:");
		
		comboOutput = new Combo(composite_2, SWT.NONE);
		comboOutput.setEnabled(false);
		GridData gd_comboOutput = new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1);
		gd_comboOutput.widthHint = 330;
		comboOutput.setLayoutData(gd_comboOutput);
		
		setComboMM();
		comboMM.setFocus();
		comboMM.addListener(SWT.Modify, this);
		comboInput.addListener(SWT.Modify, this);
		comboOutput.addListener(SWT.Modify, this);
		
		this.setPageComplete(false);
	}

	@Override
	public void handleEvent(Event event) {
		if (event.widget == comboMM) {
			setElementCombos(comboMM.getSelectionIndex());
		}
		if (event.widget == comboInput) {
			setInputPortType(comboInput.getSelectionIndex());
			if (isFilter) {
				if (comboInput.getSelectionIndex() == -1) {
					comboOutput.deselectAll();
				} else {
					comboOutput.select(comboInput.getSelectionIndex());
				}
				outputPortType = inputPortType;
			}
		}
		if (event.widget == comboOutput) {
			setOutputPortType(comboOutput.getSelectionIndex());
		}
		updatePageComplete();
	}

	private void setOutputPortType(int index) {
		if (index == -1) {
			outputPortType = null;
		} else {	
			String elementName = comboOutput.getItem(index);
			if (elementName.equals("String")) {
				outputPortType = elementName;
			} else {
				outputPortType = getEClassFromName(elementName);
			}
		}
	}

	private void setInputPortType(int index) {
		if (index == -1) {
			inputPortType = null;
		} else {			
			String elementName = comboInput.getItem(index);
			inputPortType = getEClassFromName(elementName);
		}
	}

	private EClass getEClassFromName(String elementName) {
		TreeIterator<EObject> iter = metaModel.eAllContents();
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			if (eObject instanceof EClass) {
				if (((EClass) eObject).getName().equals(elementName)) {
					return ((EClass) eObject);
				}
			}
		}
		return null;
	}

	private void setElementCombos(int index) {
		if (index == -1) {
			comboInput.removeAll();
			comboOutput.removeAll();
			comboInput.setEnabled(false);
			comboOutput.setEnabled(false);			
		} else {
			String mm = comboMM.getItem(index);
			// new
			Object value = EPackage.Registry.INSTANCE.get(mm);
			System.out.println(value);
			metaModel = (EPackage) value;
			setModelElementNames();
			comboInput.setItems(modelElementNames);
			comboInput.setEnabled(true);
			comboOutput.setItems(modelElementNames);
			comboOutput.add("String");
			comboOutput.setEnabled(! isFilter);
		}
	}

	private void setModelElementNames() {
		EList<EClass> eClasses = new BasicEList<EClass>();
		TreeIterator<EObject> iter = metaModel.eAllContents();
		while (iter.hasNext()) {
			EObject eObject = iter.next();
			if (eObject instanceof EClass) {
				eClasses.add((EClass) eObject);
			}
		}
		modelElementNames = new String[eClasses.size()];
		for (int i = 0; i < modelElementNames.length; i++) {
			modelElementNames[i] = eClasses.get(i).getName();
		}
		Arrays.sort(modelElementNames);
	}
	
	public void updatePageComplete() {
		if (comboMM.getSelectionIndex() == -1) {
			this.setMessage("The meta model is not specified.", ERROR);
			this.setPageComplete(false);
			return;
		} 
		if (comboInput.isEnabled() && (comboInput.getSelectionIndex() == -1)) {
			this.setMessage("The type of the input port is not specified.", ERROR);
			this.setPageComplete(false);
			return;
		} 
		if (comboOutput.isEnabled() && (comboOutput.getSelectionIndex() == -1)) {
			this.setMessage("The type of the output port is not specified.", ERROR);
			this.setPageComplete(false);
			return;
		}
		this.setMessage("Please select a meta model and corresponding port type(s).");
		this.setPageComplete(true);
	}

	public String getNamespaceUri() {
		return metaModel.getNsURI();
	}

	public String getInputTypeName() {
		return inputPortType.getInstanceClassName();
	}

	public String getOutputTypeName() {
		if (outputPortType.equals("String")) {
			return "String";
		} else {
			return ((EClass) outputPortType).getInstanceClassName();
		}
	}

	public String getJarFileName() {
		return inputPortType.getInstanceClass().getPackage().getName();
	}
}
