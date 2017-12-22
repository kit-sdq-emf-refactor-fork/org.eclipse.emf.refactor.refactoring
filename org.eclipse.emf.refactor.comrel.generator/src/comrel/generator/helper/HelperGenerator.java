package comrel.generator.helper;

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
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

import comrel.generator.Activator;

public class HelperGenerator {
	
	private final String JETEMITTERS = ".JETEmitters";
	private final String JAVA = ".java";
	private final String JAVAJET = ".javajet";
	private final String COMRELMODEL = "org.eclipse.emf.refactor.comrel";
	private final String REQUIREBUNDLE = "Require-Bundle";
	private final String BUNDLESYMBOLICNAME = "Bundle-SymbolicName";
	private final String BUNDLEVERSION = "Bundle-Version";
	private final String SINGLETONTRUE = "singleton:=true";	
	private final String TEMPLATES = "templates";
	private final String PLUGINSPATH = Platform.getInstallLocation().getURL().getPath() + "plugins/";
	
	private HelperInfo helperInfo;
	private String templateDirectory;
	private JETEmitter jetEmitter;
	private List<IClasspathEntry> classpathEntries; 
	
	
	public HelperGenerator(HelperInfo helperInfo) {
		this.helperInfo = helperInfo;
		this.templateDirectory = this.setTemplateDirectory();
		this.classpathEntries = new ArrayList<IClasspathEntry>();
		this.setClassPathEntries();
	}
	
	private void setClassPathEntries() {
		Bundle bundle = Platform.getBundle(Activator.PLUGIN_ID);
		String version = (String) bundle.getHeaders().get(BUNDLEVERSION);
		classpathEntries.add(JavaCore.newLibraryEntry(new Path(PLUGINSPATH
				+ Activator.PLUGIN_ID + "_" + version + ".jar"), null, null));
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
	
	public void run(IProgressMonitor monitor, String helperType, String helperExtensionPoint) {
		deleteJetEmittersProject(monitor);
		updatePluginXml(helperType, helperExtensionPoint);
		updateDependencies();
		setSingletonDirective();
		generateJavaCode(monitor, helperType);
		refreshProject(monitor);
	}
	
	private void generateJavaCode(IProgressMonitor monitor, String helperType) {
		String generatedCode = "";
		try {
			generatedCode = this.generateCode(monitor, helperType);
			this.save(monitor, generatedCode, helperInfo.getClassName());
		} catch (JETException e) {
			e.printStackTrace();
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}
	
	private IContainer findOrCreatePackage(IProgressMonitor progressMonitor) throws CoreException {
		IPath outputPath = new Path(this.helperInfo.getProjectName() + "/src/" + this.helperInfo.getPackageName().replace('.', '/'));
		System.out.println("outputpath: " + outputPath.toString());
		IProgressMonitor subMonitor = new SubProgressMonitor(progressMonitor, 1);
		IPath localLocation = null; 
		IContainer container = CodeGenUtil.EclipseUtil.findOrCreateContainer(outputPath, true, localLocation, subMonitor);
		return container;
	}
	
	private void save(IProgressMonitor monitor, String content, String fileName) throws CoreException, JETException {
		IContainer container = findOrCreatePackage(monitor);
		if (container == null) {
			throw new JETException
				("Cound not find or create container for package " 
								+ this.helperInfo.getPackageName() + " in " 
								+ this.helperInfo.getProjectName());
		}
		IFile file = container.getFile(new Path(fileName + JAVA));
		InputStream inputStream = new ByteArrayInputStream(content.getBytes());
		if (!file.exists()) {
			file.create(inputStream, false, monitor);
		} else {
			container.refreshLocal(1, monitor);
			file.setContents(inputStream, true, false, monitor);
		}
	}
	
	private String generateCode(IProgressMonitor monitor, String template) {
		String templatePath = this.templateDirectory + template + JAVAJET;
		ClassLoader classLoader = getClass().getClassLoader();
		this.jetEmitter = new JETEmitter(templatePath, classLoader);
		this.jetEmitter.getClasspathEntries().addAll(classpathEntries);
		String result = "";
		IProgressMonitor sub = new SubProgressMonitor(monitor, 1);
		try {
			result = jetEmitter.generate(sub, new Object[] { this.helperInfo });
		} catch (JETException e) {
			e.printStackTrace();
		}
		return result;
	}

	private void updatePluginXml(String helperType, String helperExtensionPoint) {
		XMLPluginFile.createHelperEntry(helperInfo, helperType, helperExtensionPoint);
	}

	private void setSingletonDirective() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.helperInfo.getProjectName());
		try {
			String fileName = project.getLocation().append("/META-INF/MANIFEST.MF").toOSString();
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

	private void refreshProject(IProgressMonitor monitor) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.helperInfo.getProjectName());
		try {
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void updateDependencies() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(this.helperInfo.getProjectName());
		try {
			String fileName = project.getLocation().append("/META-INF/MANIFEST.MF").toOSString();
			FileInputStream is = new FileInputStream(fileName);
			Manifest mf = new Manifest(is);
			Attributes att = mf.getMainAttributes();
			String value = att.getValue(REQUIREBUNDLE);
			if (! value.contains(COMRELMODEL)) 
				value = value + "," +  COMRELMODEL;
			if (! value.contains(this.helperInfo.getJarFile()))
				value = value + "," +  this.helperInfo.getJarFile();
			att.putValue(REQUIREBUNDLE, value);
			FileOutputStream out = new FileOutputStream(fileName);  
			mf.write(out); 
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}  catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void deleteJetEmittersProject(IProgressMonitor monitor) {
		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource r = root.findMember(JETEMITTERS);
			if (r != null){
				r.delete(false, monitor);
			}
		} 
		catch (CoreException e) { } 
		catch (Exception e) { }
	}

}
