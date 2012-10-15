package org.eclipse.emf.refactor.refactoring.configuration.ui;

import java.util.LinkedList;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.refactor.refactoring.configuration.core.SortedRefactoringList;
import org.eclipse.emf.refactor.refactoring.configuration.managers.ConfigurationManager;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.ProjectManager;
import org.eclipse.emf.refactor.refactoring.managers.RefactoringManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.TableEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.PropertyPage;

public class RefactoringsConfigurationPage extends PropertyPage {

	private IProject project;
	private TableItemsMapping mapping;
	private SortedRefactoringList refactoringList;
	private Table[] refactoringsTables;

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		this.getDefaultsButton().setText("(De-)Select All");
	}

	@Override
	protected Control createContents(Composite parent) {
		Composite panel = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.verticalSpacing = 20;
		layout.horizontalSpacing = 10;
		layout.marginHeight = 20;
		layout.marginWidth = 10;
		layout.numColumns = 1;
		panel.setLayout(layout);
		refactoringList = new SortedRefactoringList(RefactoringManager.getAllRefactorings());
		mapping = new TableItemsMapping(RefactoringManager.getAllRefactorings());
		createHeader(panel);
		createRefactoringTables(panel);
		project = ProjectManager.getActualProjectForPropertyPage(this);
		fillTables();
		loadSelection();
		return panel;
	}

	@Override
	public boolean performOk() {
		saveSelection();
		ConfigurationManager.getInstance();
		ConfigurationManager.saveConfiguration(project);
		return true;
	}

	@Override
	protected void performApply() {
		performOk();
	}

	@Override
	protected void performDefaults() {
		boolean allSelected = true;
		for (int index = 0; index < mapping.getSize(); index++) {
			if(! mapping.getTableItem(index).getChecked()){
				allSelected = false;
				break;
			}
		}
		for (int index = 0; index < mapping.getSize(); index++) {
			mapping.getTableItem(index).setChecked(!allSelected);
		}
	}

	private void createHeader(Composite panel) {
		Text text = new Text(panel, SWT.LEFT);
		text.setBackground(panel.getBackground());
		text.setText("Please select EMF refactorings from the list below to be supported by the project.");
		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		text.setLayoutData(gridData);
	}

	private void createRefactoringTables(Composite panel) {
		TabFolder tabs = new TabFolder(panel, SWT.NULL);
		GridData gridData = new GridData(GridData.FILL_BOTH);
		gridData.horizontalAlignment = GridData.FILL;
		tabs.setLayoutData(gridData);
		refactoringsTables = new Table[refactoringList.getRefactoringList().size()];
		for (int index = 0; index < refactoringList.getRefactoringList().size(); index++) {
			TabItem tabItem = new TabItem(tabs, SWT.LEFT);
			tabItem.setText(""+ refactoringList.getRefactoringList().get(index).get(0)
							.getNamespaceUri());
			Composite composite = new Composite(tabs, SWT.NULL);
			tabItem.setControl(composite);
			GridLayout layout = new GridLayout();
			composite.setLayout(layout);
			refactoringsTables[index] = new Table(composite, SWT.CHECK | SWT.SINGLE
					| SWT.FULL_SELECTION | SWT.BORDER | SWT.V_SCROLL);
			refactoringsTables[index].setHeaderVisible(true);
			gridData = new GridData(GridData.FILL_BOTH);
			refactoringsTables[index].setLayoutData(gridData);
			TableColumn col;
			col = new TableColumn(refactoringsTables[index], SWT.CENTER
					| SWT.READ_ONLY);
			col.setText("Selected");
			col.setWidth(60);
			col = new TableColumn(refactoringsTables[index], SWT.LEFT
					| SWT.READ_ONLY);
			col.setText("Name");
			col.setWidth(300);
			col = new TableColumn(refactoringsTables[index], SWT.LEFT
					| SWT.READ_ONLY);
			col.setText("Description");
			col.setWidth(100);
			
			final Table currentTable = refactoringsTables[index]; 
			
			final TableEditor tableEditor = new TableEditor(currentTable);
			// The editor must have the same size as the cell and must
			// not be any smaller than 50 pixels.
			tableEditor.horizontalAlignment = SWT.LEFT;
			tableEditor.grabHorizontal = true;
			tableEditor.minimumWidth = 100;		
		}
	}
	
	private void fillTables() {
		for (int index = 0; index < refactoringList.getSize(); index++) {
			LinkedList<Refactoring> metamodelList = refactoringList.get(index);
			for(Refactoring refactoring : metamodelList) {
				TableItem item = new TableItem(refactoringsTables[index], SWT.NONE);
				item.setText(1, refactoring.getName());
				// TODO insert field description to refactorings
//				item.setText(2, refactoring.getDescription());
				item.setText(2, "");
				mapping.setItemForRefactoring(refactoring, item);
			}
		}
	}

	private void loadSelection() {	
		ConfigurationManager.getInstance();
		LinkedList<Refactoring> selectedRefactorings = ConfigurationManager.getSelectedRefactorings(project);
		if(selectedRefactorings==null || selectedRefactorings.isEmpty())
			for(int i=0; i < mapping.getSize(); i++)
				mapping.getTableItem(i).setChecked(true);
		for (Refactoring refactoring : selectedRefactorings)
			mapping.getTableItem(refactoring).setChecked(true);
	}

	private void saveSelection() {
		boolean[] selection = new boolean[mapping.getSize()];
		for (int index = 0; index < mapping.getSize(); index++) {
			selection[index] = mapping.getTableItem(index).getChecked();
		}
		ConfigurationManager.getInstance();
		ConfigurationManager.setConfiguration(project, selection);
	}
}