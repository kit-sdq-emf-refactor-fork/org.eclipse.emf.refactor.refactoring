package comrel.generator.helper.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import comrel.generator.helper.HelperGenerator;
import comrel.generator.helper.HelperInfo;
import comrel.util.ExtensionPointInfo;

public class MultiFeatureWizard extends Wizard implements INewWizard {

private final String WINDOWTITLE = "New Multi Feature";
	
	private BasicsWizardPage basicsWizardPage;
	private MetaModelWizardPage metaModelWizardPage;
	private EclipseWizardPage eclipseWizardPage;

	public MultiFeatureWizard() { }
	
	public void addPages() {
		setWindowTitle(WINDOWTITLE);
		basicsWizardPage = new BasicsWizardPage();
		addPage(basicsWizardPage);
		metaModelWizardPage = new MetaModelWizardPage(false);
		addPage(metaModelWizardPage);
		eclipseWizardPage = new EclipseWizardPage();
		addPage(eclipseWizardPage);
	}
	
	@Override
	public boolean canFinish() {
		return (basicsWizardPage.isPageComplete() 
				&& metaModelWizardPage.isPageComplete()
				&& eclipseWizardPage.isPageComplete());
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) { }

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			@Override
			public void execute(IProgressMonitor monitor)
					throws InvocationTargetException {
				try {				
					createHelper(monitor);
				} catch (Exception e){
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(false, false, op);
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return true;
	}

	protected void createHelper(IProgressMonitor monitor) {
		HelperInfo helperInfo = createHelperInfo();
		System.out.println(helperInfo.toString());
		HelperGenerator generator = new HelperGenerator(helperInfo);
		generator.run(monitor, ExtensionPointInfo.MULTIFEATURE, ExtensionPointInfo.MULTIFEATURE_EXTENSION_POINT);
	}

	private HelperInfo createHelperInfo() {
		String name = basicsWizardPage.getHelperName();
		String description = basicsWizardPage.getHelperDescription();
		String id = eclipseWizardPage.getId();
		String namespaceUri = metaModelWizardPage.getNamespaceUri();
		String className = basicsWizardPage.getClassName();
		String jarFile = metaModelWizardPage.getJarFileName();
		String inputType = metaModelWizardPage.getInputTypeName();
		String outputType = metaModelWizardPage.getOutputTypeName();
		String projectName = eclipseWizardPage.getProjectName();
		return new HelperInfo(name, description, id, namespaceUri, className, 
								jarFile, inputType, outputType, projectName);
	}

}
