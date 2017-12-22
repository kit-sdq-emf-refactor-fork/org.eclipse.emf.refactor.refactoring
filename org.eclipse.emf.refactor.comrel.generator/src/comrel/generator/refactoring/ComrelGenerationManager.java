package comrel.generator.refactoring;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;
import org.eclipse.emf.refactor.refactoring.generator.managers.XMLPluginFileManager;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

import comrel.generator.Activator;

public class ComrelGenerationManager {
	
	private final String REFACTORINGGUIHANDLERCOMRELSINGLE =
								"RefactoringGuiHandlerComrelSingle";
	private final String REFACTORINGGUIHANDLERCOMRELMULTI =
								"RefactoringGuiHandlerComrelMulti";
	private final String REFACTORINGWIZARDCOMREL =
								"RefactoringWizardComrel";
	private final String REFACTORINGWIZARDPAGECOMREL =
								"RefactoringWizardPageComrel";
	private final String REFACTORINGDATAMANAGEMENTCOMRELSINGLE = 
								"RefactoringDataManagementComrelSingle";
	private final String REFACTORINGDATAMANAGEMENTCOMRELMULTI = 
								"RefactoringDataManagementComrelMulti";
	private final String REFACTORINGCONTROLLERCOMRELSINGLE = 
								"RefactoringControllerComrelSingle";
	private final String REFACTORINGCONTROLLERCOMRELMULTI = 
								"RefactoringControllerComrelMulti";
	
	private final String REFACTORINGWIZARD = "RefactoringWizard";	
	private final String REFACTORINGWIZARDPAGE = 
											"RefactoringWizardPage";
	private final String REFACTORINGGUIHANDLER = 
											"RefactoringGuiHandler";
	private final String REFACTORINGCONTROLLER = 
											"RefactoringController";
	private final String REFACTORINGDATAMANAGEMENT = 
											"RefactoringDataManagement";
	
	private final String BUNDLEVERSION = "Bundle-Version";
	private final String BUNDLESYMBOLICNAME = "Bundle-SymbolicName";
	private final String SINGLETONTRUE = "singleton:=true";
	private final String PLUGINSPATH = 
			Platform.getInstallLocation().getURL().getPath() + "plugins/"; 
	private final String JETEMITTERS = ".JETEmitters";
	private final String JAVA = ".java";
	private final String JAVAJET = ".javajet";
	private final String TEMPLATES = "templates";
	
	/**
	 * Configuration data used for generating model refactoring code.
	 */
	private ComrelConfig config;
	
	/**
	 * Full qualified name of the template directory inside the plugin.
	 */
	private String templateDirectory;
	
	/**
	 * Classpath entries needed for compiling JET code.
	 */
	private List<IClasspathEntry> classpathEntries; 
	
	/**
	 * JETEmitter instance used for code generation.
	 */
	private JETEmitter jetEmitter;

	public ComrelGenerationManager(ComrelConfig config) {
		this.config = config;
		this.templateDirectory = setNewTemplateDirectory();		
		classpathEntries = setClassPathEntries();
		System.out.println("ComrelGenerationManager initialized!");
	}
	
	protected List<IClasspathEntry> setClassPathEntries() {
		List<IClasspathEntry> cpe = new ArrayList<IClasspathEntry>();
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
	    // add org.eclipse.emf.refactor.comrel.generator to class path
	    String version = (String) bundle.getHeaders().get(BUNDLEVERSION);
	    cpe.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH + 
	    		Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));
	    // add org.eclipse.emf.refactor.refactoring.generator to class path
	 	bundle = Platform.getBundle(org.eclipse.emf.refactor.refactoring.generator.Activator.PLUGIN_ID);
	 	version = (String) bundle.getHeaders().get(BUNDLEVERSION);
	 	cpe.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH
	 			+ org.eclipse.emf.refactor.refactoring.generator.Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));
	 	// add org.eclipse.emf.refactor.refactoring to class path
	    bundle = Platform.getBundle(org.eclipse.emf.refactor.refactoring.Activator.PLUGIN_ID);
	    version = (String) bundle.getHeaders().get(BUNDLEVERSION);
	    cpe.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH + 
	   		org.eclipse.emf.refactor.refactoring.Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));	    
	    return cpe;
	}

	public void run(IProgressMonitor monitor) {
		deleteJetEmittersProject(monitor);
		updatePluginXml();
		CoMReLDependenciesManager.updateDependencies(config);
		setSingletonDirective();
		generateCode(monitor);
	}
	
	private void generateCode(IProgressMonitor monitor) {
		String generatedCode = "";
		try {
			if (config.isMulti()) { 
				generatedCode = 
					this.generateCode(monitor, REFACTORINGGUIHANDLERCOMRELMULTI);
				this.save(monitor, generatedCode, REFACTORINGGUIHANDLER);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGDATAMANAGEMENTCOMRELMULTI);
				this.save(monitor, generatedCode, REFACTORINGDATAMANAGEMENT);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGCONTROLLERCOMRELMULTI);
				this.save(monitor, generatedCode, REFACTORINGCONTROLLER);
			} else {
				generatedCode = 
					this.generateCode(monitor, REFACTORINGGUIHANDLERCOMRELSINGLE);
				this.save(monitor, generatedCode, REFACTORINGGUIHANDLER);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGDATAMANAGEMENTCOMRELSINGLE);
				this.save(monitor, generatedCode, REFACTORINGDATAMANAGEMENT);
				generatedCode = 
					this.generateCode(monitor, REFACTORINGCONTROLLERCOMRELSINGLE);
				this.save(monitor, generatedCode, REFACTORINGCONTROLLER);
			}
			generatedCode = 
				this.generateCode(monitor, REFACTORINGWIZARDCOMREL);
			this.save(monitor, generatedCode, REFACTORINGWIZARD);
			generatedCode = 
				this.generateCode(monitor, REFACTORINGWIZARDPAGECOMREL);
			this.save(monitor, generatedCode, REFACTORINGWIZARDPAGE);
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
								+ this.config.getPackageName() + " in " 
								+ this.config.getProjectName());
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
	 * Finds or creates the package the code has to be located to.
	 * @param progressMonitor Object for monitoring the activity.
	 * @return Package the code has to be located to.
	 * @throws CoreException Exception that can be thrown.
	 */
	private IContainer findOrCreatePackage(IProgressMonitor progressMonitor) 
														throws CoreException {
		IPath outputPath = new Path
					(this.config.getProjectName() + "/src/" 
						+ this.config.getPackageName().replace('.', '/'));
		IProgressMonitor subMonitor = 
								new SubProgressMonitor(progressMonitor, 1);
		IPath localLocation = null; 
		IContainer container = 
				CodeGenUtil.EclipseUtil.findOrCreateContainer
								(outputPath, true, localLocation, subMonitor);
		return container;
	}
	
	private String generateCode(IProgressMonitor monitor, String template) {
		String templatePath = this.templateDirectory + template + JAVAJET;
		ClassLoader classLoader = getClass().getClassLoader();
		this.jetEmitter = new JETEmitter(templatePath, classLoader);
		this.jetEmitter.getClasspathEntries().addAll(classpathEntries);
		String result = "";
		IProgressMonitor sub = new SubProgressMonitor(monitor, 1);
		try {
			result = 
				jetEmitter.generate(sub, new Object[] { this.config });
		} catch (JETException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * Sets the singleton directive of the plugin to true.
	 */
	protected void setSingletonDirective() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot()
							.getProject(this.config.getProjectName());
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
	 * Updates the plugin.xml file by adding the generated model refactoring
	 * to served extension points.
	 */
	protected void updatePluginXml() {
		List<RefactoringInfo> refactoringConfig = 
						XMLPluginFileManager.getRefactoringConfig
											(this.config.getProjectName());
		refactoringConfig.add(this.config);
		XMLPluginFileManager.saveRefactoringConfig
						(this.config.getProjectName(), refactoringConfig);		
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

	@Override
	public String toString() {
		return "ComrelGenerationManager [config=" + config + ", templateDirectory="
				+ templateDirectory + ", classpathEntries=" + classpathEntries
				+ "]";
	}	

}
