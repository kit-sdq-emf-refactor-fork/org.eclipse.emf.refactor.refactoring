package org.eclipse.emf.refactor.refactoring.henshin.managers;

import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.refactor.refactoring.generator.managers.GenerationManager;
import org.eclipse.emf.refactor.refactoring.henshin.Activator;
import org.eclipse.emf.refactor.refactoring.henshin.generator.HenshinRefactoringInfo;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

public class HenshinGenerationManager extends GenerationManager {
	
	private final String REFACTORINGWIZARDHENSHIN = 
				"RefactoringWizardHenshin";	
	private final String REFACTORINGWIZARDPAGEHENSHIN = 
				"RefactoringWizardPageHenshin";
	private final String REFACTORINGGUIHANDLERHENSHIN = 
				"RefactoringGuiHandlerHenshin";
	private final String REFACTORINGCONTROLLERHENSHIN = 
				"RefactoringControllerHenshin";
	private final String REFACTORINGDATAMANAGEMENTHENSHIN = 
				"RefactoringDataManagementHenshin";
	private final String REFACTORINGINFORMATIONHENSHIN = 
				"RefactoringInformationHenshin";
	private final String REFACTORINGINFORMATION = 
				"RefactoringInformation";
	protected final String REFACTORINGTESTHENSHIN = 
				"RefactoringTestHenshin";
	
	/**
	 * Configuration data used for generating model refactoring code.
	 */
	private HenshinRefactoringInfo info;
	
	
	public HenshinGenerationManager(HenshinRefactoringInfo info) {
		super(info);
		this.info = info;
		this.templateDirectory = this.setNewTemplateDirectory();		
		classpathEntries = setClassPathEntries();
		System.out.println("HenshinGenerationManager initialized!");
	}
	
	protected List<IClasspathEntry> setClassPathEntries() {
		List<IClasspathEntry> cpe = super.setClassPathEntries();
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
	    // add org.eclipse.emf.refactor.refactoring.henshin to class path
	    String version = (String) bundle.getHeaders().get(BUNDLEVERSION);
	    cpe.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH + 
	    		Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));
	    return cpe;
	}
	
	/**
	 * @see org.eclipse.emf.refactor.generator.RefactoringGenerator#
	 * run(org.eclipse.core.runtime.IProgressMonitor)
	 */
	public void run(IProgressMonitor monitor){
		deleteJetEmittersProject(monitor);
		updatePluginXml();
		HenshinDependenciesManager.updateDependencies(info);
		setSingletonDirective();
		createTestFolders(monitor);
		generateCode(monitor);
	}
	
	private void generateCode(IProgressMonitor monitor) {
		String generatedCode = "";
		try {
			generatedCode = 
					this.generateCode(monitor, REFACTORINGWIZARDHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGWIZARD);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGWIZARDPAGEHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGWIZARDPAGE);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGGUIHANDLERHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGGUIHANDLER);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGCONTROLLERHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGCONTROLLER);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGDATAMANAGEMENTHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGDATAMANAGEMENT);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGINFORMATIONHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGINFORMATION);
				generatedCode =
					this.generateCode(monitor, REFACTORINGTESTHENSHIN);
				this.save(monitor, generatedCode, REFACTORINGTEST);
		} catch (JETException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private String setNewTemplateDirectory() {
		String td = "";
		final Bundle bundle = Activator.getDefault().getBundle();
		try {
			td = FileLocator.toFileURL(bundle.getEntry(TEMPLATES)).getFile();
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return td;
	}

}
