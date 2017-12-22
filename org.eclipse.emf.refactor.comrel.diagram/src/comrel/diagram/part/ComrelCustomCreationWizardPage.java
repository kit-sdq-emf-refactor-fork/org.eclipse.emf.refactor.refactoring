package comrel.diagram.part;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import comrel.MappingVisualization;
import comrel.util.RegistryUtil;

public class ComrelCustomCreationWizardPage extends WizardPage {

	private Combo namespaceURI;
	
	private Text diagramName;
	
	private Combo connectionVisualization;
	
	protected ComrelCustomCreationWizardPage(String pageName) {
		super(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent,SWT.NONE);
		GridLayout gl = new GridLayout();
	    int ncol = 3;
	    gl.numColumns = ncol;
	    GridData gridData = new GridData();
	    new Label (composite, SWT.NONE).setText("Diagram Name:");		
	    diagramName = new Text(composite, SWT.BORDER);
	    gridData = new GridData(GridData.FILL_HORIZONTAL);
	    gridData.horizontalSpan = ncol - 1;
	    diagramName.setLayoutData(gridData);
	    gridData.horizontalAlignment = GridData.BEGINNING;
	    IWizardPage prePage = this.getPreviousPage();
	    if(prePage instanceof WizardNewFileCreationPage) {
	    	WizardNewFileCreationPage p = (WizardNewFileCreationPage)prePage;
	    	String filename = p.getFileName();
	    	String subString = filename.substring(0,filename.length()-18);
	    	diagramName.setText(subString);
	    }
	    gridData.widthHint = GridData.HORIZONTAL_ALIGN_FILL;
	    gridData.minimumWidth = GridData.HORIZONTAL_ALIGN_FILL;
	    new Label (composite, SWT.NONE).setText("NamespaceURI:");						
	    namespaceURI = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
	   	for(String s: RegistryUtil.getNamepsaceURIS()) {
	   		namespaceURI.add(s);
	   	}
	    namespaceURI.setLayoutData(gridData);
	    namespaceURI.addListener(SWT.Selection, new MyListener());
	    
	    new Label (composite, SWT.NONE).setText("Connection Visualization:");
	    connectionVisualization = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
	    for(MappingVisualization m : MappingVisualization.values()) {
	    	connectionVisualization.add(m.getLiteral());
	    }
	    if(connectionVisualization.getItemCount()>0) {
	    	connectionVisualization.select(0);
	    }
	    connectionVisualization.setLayoutData(gridData);
	    composite.setLayout(gl);
	    setControl(composite);	    
	}	

	public Combo getNamespaceURI() {
		return namespaceURI;
	}

	public void setNamespaceURI(Combo namespaceURI) {
		this.namespaceURI = namespaceURI;
		this.setPageComplete(this.isPageComplete());
		getWizard().getContainer().updateButtons();
	}

	public Text getDiagramName() {
		return diagramName;
	}

	public void setDiagramName(Text diagramName) {
		this.diagramName = diagramName;
	}

	public Combo getConnectionVisualization() {
		return connectionVisualization;
	}

	public void setConnectionVisualization(Combo connectionVisualization) {
		this.connectionVisualization = connectionVisualization;
	}	
	
	@Override
	public boolean isPageComplete() {
		return validatePage() && super.isPageComplete();
	}

	@Override
	public void setPageComplete(boolean complete) {
		super.setPageComplete(complete);
	}
	
	public boolean validatePage(){
		if(this.getNamespaceURI().getSelectionIndex()==-1) {
			setErrorMessage("NamspaceURI must be set");
			return false;
		}
		setErrorMessage(null);
		return true;
	}	

	private class MyListener implements org.eclipse.swt.widgets.Listener{

		@Override
		public void handleEvent(Event event) {
		    setPageComplete(validatePage());
		    getWizard().getContainer().updateButtons();
		    
		}
		
	}
}
