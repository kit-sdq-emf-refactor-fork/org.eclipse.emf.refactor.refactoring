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
package org.eclipse.emf.refactor.refactoring.generator.managers;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.jet.JETEmitter;
import org.eclipse.emf.codegen.jet.JETException;
import org.eclipse.emf.codegen.util.CodeGenUtil;
import org.eclipse.emf.refactor.refactoring.generator.Activator;
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

/**
 * Main class for generating model refactoring code out of an object of class
 * RefactoringConfig using JET.
 * @generated NOT
 * @author Thorsten Arendt
 */
/**
 * @author arendt
 *
 */
/**
 * @author arendt
 *
 */
public class RefactoringGenerationManager {
	
	/**
	 * Full qualified name of the template directory inside the plugin.
	 */
	protected String templateDirectory;
	
	/**
	 * Configuration data used for generating model refactoring code.
	 */
	protected RefactoringInfo info;
	
	/**
	 * Classpath entry needed for compiling JET code.
	 */
	protected List<IClasspathEntry> classpathEntries; 
	
	/**
	 * JETEmitter instance used for code generation.
	 */
	protected JETEmitter jetEmitter;
	
	protected final String TEMPLATES = "templates";
	protected final String BUNDLEVERSION = "Bundle-Version";
	protected final String BUNDLESYMBOLICNAME = "Bundle-SymbolicName";
	protected final String SINGLETONTRUE = "singleton:=true";
	protected final String PLUGINSPATH = 
			Platform.getInstallLocation().getURL().getPath() + "plugins/"; 
	
	private final String JETEMITTERS = ".JETEmitters";
	protected final String JAVAJET = ".javajet";
	private final String JAVA = ".java";
	protected final String REFACTORINGWIZARD = "RefactoringWizard";	
	protected final String REFACTORINGWIZARDPAGE = 
											"RefactoringWizardPage";
	protected final String REFACTORINGGUIHANDLER = 
											"RefactoringGuiHandler";
	protected final String REFACTORINGCONTROLLER = 
											"RefactoringController";
	protected final String REFACTORINGDATAMANAGEMENT = 
											"RefactoringDataManagement";
	protected final String REFACTORINGTEST = "RefactoringTest";
	private final String XMLCONFIG = "Config";
	
	
	/**
	 * Default constructor using configuration data.
	 * @param config Configuration data used for generating model 
	 * refactoring code.
	 */
	public RefactoringGenerationManager(RefactoringInfo info) {
		this.info = info;
		this.templateDirectory = setTemplateDirectory();
		this.classpathEntries = setClassPathEntries();
		System.out.println("GenerationManager initialized!");
	}

	private String setTemplateDirectory() {
		String td = "";
		final Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		try {
			td = FileLocator.toFileURL(bundle.getEntry(TEMPLATES)).getFile();
		} catch (final IOException e) {
			e.printStackTrace();
		}
		return td;
	}

	protected List<IClasspathEntry> setClassPathEntries() {
		List<IClasspathEntry> cpe = new ArrayList<IClasspathEntry>();
		// add org.eclipse.emf.refactor.refactoring.generator to class path
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String version = (String) bundle.getHeaders().get(BUNDLEVERSION);
		cpe.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH
				+ Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));
		// add org.eclipse.emf.refactor.refactoring to class path
	    bundle = Platform.getBundle(org.eclipse.emf.refactor.refactoring.Activator.PLUGIN_ID);
	    version = (String) bundle.getHeaders().get(BUNDLEVERSION);
	    cpe.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH + 
	    		org.eclipse.emf.refactor.refactoring.Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));	    
		return cpe;
	}
	
	/**
	 * Method for executing model refactoring code generation.
	 * @param monitor Object for monitoring the progress of the model 
	 * refactoring code generation activity.
	 */
	public void run(IProgressMonitor monitor){
		deleteJetEmittersProject(monitor);
		updatePluginXml();
		DependenciesManager.updateDependencies(info);
		setSingletonDirective();
		createTestFolders(monitor);
		generateCode(monitor);
	}

	/**
	 * Sets the singleton directive of the plugin to true.
	 */
	protected void setSingletonDirective() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
							.getProject(this.info.getProjectName());
		try {
			String fileName = project.getLocation()
					.append("/META-INF/MANIFEST.MF")
					.toOSString();
			FileInputStream is = new FileInputStream(fileName);
			Manifest mf = new Manifest(is);
			Attributes att = mf.getMainAttributes();
			String value = att.getValue(BUNDLESYMBOLICNAME);
			if (! value.contains(SINGLETONTRUE))
				value = value + ";" +  SINGLETONTRUE;
			att.putValue(BUNDLESYMBOLICNAME, value);
			FileOutputStream out = new FileOutputStream(fileName);  
			mf.write(out); 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Deletes the .JETEmitters project used for model refactoring
	 * code generation.
	 * @param monitor Object for monitoring the deleting activity.
	 */
	protected void deleteJetEmittersProject(IProgressMonitor monitor) {
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource r = root.findMember(JETEMITTERS);
			System.out.println("IResoure: "+ r.getName());
			if (r != null){
				r.delete(IResource.ALWAYS_DELETE_PROJECT_CONTENT, monitor);
//				r.delete(false, monitor);
			}
		} 
		catch (CoreException e) { } 
		catch (Exception e) { }
	}

	/**
	 * Method for generating model refactoring code. This includes
	 * "RefactoringWizard.java", "RactoringWizardPage.java",
	 * "RefactoringGuiHandler.java", "RefactoringController.java", and
	 * "RefactoringDataManagement.java".
	 * @param monitor Object for monitoring the code generation.
	 */
	private void generateCode(IProgressMonitor monitor) {
		String generatedCode = "";
		try {
			generatedCode = this.generateCode
									(monitor, REFACTORINGWIZARD);
			this.save(monitor, generatedCode, REFACTORINGWIZARD);
			generatedCode = this.generateCode
									(monitor, REFACTORINGWIZARDPAGE);
			this.save(monitor, generatedCode, REFACTORINGWIZARDPAGE);
			generatedCode = this.generateCode
									(monitor, REFACTORINGGUIHANDLER);
			this.save(monitor, generatedCode, REFACTORINGGUIHANDLER);
			generatedCode = this.generateCode
									(monitor, REFACTORINGCONTROLLER);
			this.save(monitor, generatedCode, REFACTORINGCONTROLLER);
			generatedCode = this.generateCode
									(monitor, REFACTORINGDATAMANAGEMENT);
			this.save(monitor, generatedCode, REFACTORINGDATAMANAGEMENT);
			generatedCode = this.generateCode
									(monitor, REFACTORINGTEST);
			this.save(monitor, generatedCode, REFACTORINGTEST);
		} catch (JETException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Saves the given content in a file with the given name.
	 * @param monitor Object for monitoring the saving activity.
	 * @param content Content to be saved in a file with the given name.
	 * @param fileName Name of the file the content has to be saved in.
	 * @throws CoreException Exception that can be thrown.
	 * @throws JETException Exception that can be thrown.
	 */
	protected void save
			(IProgressMonitor monitor, String content, String fileName) 
										throws CoreException, JETException {
		IContainer container = findOrCreatePackage(monitor);
		if (container == null) {
			throw new JETException
				("Cound not find or create container for package " 
								+ this.info.getPackageName() + " in " 
								+ this.info.getProjectName());
		}
		IFile file = container.getFile(new Path(fileName + JAVA));
		InputStream inputStream = 
							new ByteArrayInputStream(content.getBytes());
		if (!file.exists()) {
			file.create(inputStream, false, monitor);
		} else {
			container.refreshLocal(1, monitor);
			file.setContents(inputStream, true, false, monitor);
		}
	}
	
	/**
	 * Saves the given content in a XML file with the given name.
	 * @param monitor Object for monitoring the saving activity.
	 * @param content Content to be saved in a file with the given name.
	 * @param fileName Name of the file the content has to be saved in.
	 * @throws CoreException Exception that can be thrown.
	 * @throws JETException Exception that can be thrown.
	 */
	protected void saveXml
	 	(IProgressMonitor monitor, String content, String fileName) 
	    throws CoreException, JETException {
		IContainer container = findOrCreatePackage(monitor).getParent()
												.getParent().getParent();
		if (container == null) {
			throw new JETException
				("Cound not find or create container for package " 
							+ this.info.getPackageName() + " in " 
							+ this.info.getProjectName());
		}
		File file = new File(fileName);
		try {
			if (!file.exists()) {
				Writer output = new BufferedWriter(new FileWriter(file));
				output.write(content);
				output.close();
			} else {
				container.refreshLocal(1, monitor);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
	
	/**
	 * Finds or creates the package the code has to be located to.
	 * @param progressMonitor Object for monitoring the activity.
	 * @return Package the code has to be located to.
	 * @throws CoreException Exception that can be thrown.
	 */
	private IContainer findOrCreatePackage(IProgressMonitor progressMonitor) 
														throws CoreException {
		IPath outputPath = new Path
					(this.info.getProjectName() + "/src/" 
						+ this.info.getPackageName().replace('.', '/'));
		IProgressMonitor subMonitor = 
								new SubProgressMonitor(progressMonitor, 1);
		IPath localLocation = null; 
		IContainer container = 
				CodeGenUtil.EclipseUtil.findOrCreateContainer
								(outputPath, true, localLocation, subMonitor);
		return container;
	}

	/**
	 * Generates code out of the template with the given name.
	 * @param monitor Object monitoring the code generation.
	 * @param template Name of the template used by JET.
	 * @return Generated code as String.
	 */
	protected String generateCode(IProgressMonitor monitor, String template) {
		String templatePath = this.templateDirectory + template + JAVAJET;
		System.out.println("templatePath: " + templatePath);
		ClassLoader classLoader = getClass().getClassLoader();
		this.jetEmitter = new JETEmitter(templatePath, classLoader);
		this.jetEmitter.getClasspathEntries().addAll(classpathEntries);
		String result = "";
		IProgressMonitor sub = new SubProgressMonitor(monitor, 1);
		try {
			result = jetEmitter.generate(sub, new Object[] { this.info });
		} catch (JETException e) {
			e.printStackTrace();
		}
		return result;
	}

	/**
	 * Updates the plugin.xml file by adding the generated model refactoring
	 * to served extension points.
	 */
	protected void updatePluginXml() {
		List<RefactoringInfo> refactoringConfig = 
						XMLPluginFileManager.getRefactoringConfig
											(this.info.getProjectName());
		refactoringConfig.add(this.info);
		XMLPluginFileManager.saveRefactoringConfig
						(this.info.getProjectName(), refactoringConfig);		
	}
	
	/**
	 * Creates the set of test folders for the generated model refactoring
	 * as well as the contained config.xml files.
	 * @param monitor Object monitoring the code generation.
	 */
	private void createTestFolders(IProgressMonitor monitor) { 		
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
		String generatedCode = this.generateCode(monitor, XMLCONFIG);
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

