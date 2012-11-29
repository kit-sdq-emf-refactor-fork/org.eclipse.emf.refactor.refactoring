package org.eclipse.emf.refactor.refactoring.henshin.managers;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
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
	private final String XMLCONFIGHENSHIN = "ConfigHenshin";
	
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
	
	/**
	 * Creates the set of test folders for the generated model refactoring
	 * as well as the contained config.xml files.
	 * @param monitor Object monitoring the code generation.
	 */
	protected void createTestFolders(IProgressMonitor monitor) { 		
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(this.info.getProjectName());	
		System.out.println("-- info.getNumberOfTests(): " + info.getNumberOfTests());
		if (this.info.getNumberOfTests() > 0) {
			String rootDir = "/tests/" + this.info.getRefactoringId() + "/";
			String dirPath = project.getLocation().append(rootDir).toOSString();
			System.out.println("--- dirPath: " + dirPath);
			File testFolder = new File(dirPath);
			testFolder.mkdirs();
			if (testFolder.exists() && testFolder.isDirectory()){
				for (int i = 1; i <= this.info.getNumberOfTests(); i++) {
					String testDirSnippet = "/test_" + String.format("%03d", i) + "/";
					String testDir = project.getLocation().append(rootDir + testDirSnippet).toOSString();
					System.out.println("--- testDir: " + testDir);
					File specifictestfolder = new File(testDir);
					if (!specifictestfolder.exists() 
							|| !specifictestfolder.isDirectory()) {
						specifictestfolder.mkdir();
						String xmlName = "/config.xml";
						String xmlLocation = project.getLocation().append(rootDir + testDirSnippet + xmlName).toOSString();
						createConfigXml(monitor, xmlLocation);
					}
				}
			}
		}
	}
	
	/**
	 * Creates the config.xml files within the test folders for the 
	 * generated model refactoring.
	 * @param monitor Object monitoring the code generation.
	 * @param xmlLocation File object containing the folder in which 
	 * the config should be saved. 
	 */
	private void createConfigXml(IProgressMonitor monitor, String path) {
		String generatedCode = this.generateCode(monitor, XMLCONFIGHENSHIN);
//		String generatedCode = "TO DO";
		try {
//			String path = xmlLocation.getCanonicalPath() + "/config.xml";
			File configXml = new File(path);
			System.out.println("---- createConfigXml::path: " + path);
			if (!configXml.exists() || !configXml.isFile()) {
				this.saveXml(monitor, generatedCode, 
								configXml.getCanonicalPath().toString());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JETException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

}
