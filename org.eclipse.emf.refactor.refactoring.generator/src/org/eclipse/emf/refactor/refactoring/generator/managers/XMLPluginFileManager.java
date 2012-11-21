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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.refactor.refactoring.core.ExtensionPointTags;
import org.eclipse.emf.refactor.refactoring.generator.core.RefactoringInfo;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Abstract class for load and store operations (plugin.xml file and
 * RefactoringConfig out of model refactoring extension point.
 * @generated NOT
 * @author Thorsten Arendt
 */
public abstract class XMLPluginFileManager {
	
	private static final String PLUGINXML = "plugin.xml";
	private static final String PLUGIN = "plugin";
	private static final String EXTENSION = "extension";
	private static final String POINT = "point";

	/**
	 * Static method for checking whether the project with the given name
	 * owns a plugin.xml file.
	 * @param projectName Name of the project to be checked.
	 * @return true if the project with the given name owns a plugin.xml 
	 * file; false otherwise.
	 */
	public static boolean pluginXmlExists(String projectName) {
		IProject project = ResourcesPlugin.getWorkspace()
											.getRoot().getProject(projectName);
		java.net.URI uri = project.getLocationURI();
		String path = uri.getPath() + "/" + XMLPluginFileManager.PLUGINXML;
		File file = new File(path);
		return file.exists();
	}

	/**
	 * Static method for creating a plugin.xml file within the project
	 * with the given name.
	 * @param projectName Name of the project the plugin.xml file has
	 * to be generated into.
	 */
	public static void createPluginXml(String projectName) {
		final DocumentBuilder builder = 
							XMLPluginFileManager.newDocumentBuilder();
		if (null != builder){
			final Document doc = builder.newDocument();			
			final Element root = doc.createElement
										(XMLPluginFileManager.PLUGIN);
			doc.appendChild(root);
			final TransformerFactory transformerFactory = 
										TransformerFactory.newInstance();
			Transformer transformer = null;
			try {
				transformer = transformerFactory.newTransformer();
				transformer.setOutputProperty(OutputKeys.INDENT,"yes");
			} catch (final TransformerConfigurationException e) {
				e.printStackTrace();
			}
			final DOMSource source = new DOMSource(doc);
			IProject project = ResourcesPlugin.getWorkspace().getRoot()
												.getProject(projectName);
			java.net.URI uri = project.getLocationURI();
			StreamResult result = new StreamResult
						(uri + "/" + XMLPluginFileManager.PLUGINXML);			
			try {
				transformer.transform(source, result);
			} catch (final TransformerException e) {
				e.printStackTrace();
			}			
		}
	}	
	
	private static DocumentBuilder newDocumentBuilder() {
		try {
			return DocumentBuilderFactory.newInstance()
												.newDocumentBuilder();
		} catch (final ParserConfigurationException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static Transformer createTransformer(){
		final TransformerFactory transformerFactory = TransformerFactory.newInstance();
		try {
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT,"yes");
			return transformer;
		} catch (final TransformerConfigurationException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	/**
	 * Abstract method for getting a list of RefactoringConfig out from
	 * the model refactoring extension point served in the plugin.xml 
	 * file of the project with the given name.
	 * @param projectName Name of the project the plugin.xml file has to
	 * be analyzed for serving the model refactoring extension point.
	 * @return List of RefactoringConfig out from the model refactoring
	 * extension point served in the plugin.xml file of the project with
	 * the given name.
	 */
	public static List<RefactoringInfo> getRefactoringConfig
												(String projectName) {
		final DocumentBuilder builder = XMLPluginFileManager
												.newDocumentBuilder();
		List<RefactoringInfo> refactoringConfigs = 
									new ArrayList<RefactoringInfo>();
		if (null != builder){
			Document doc = null;
			try {
				IProject project = ResourcesPlugin.getWorkspace()
									.getRoot().getProject(projectName);
				
				String path = project.getLocation().toString() + "/" + XMLPluginFileManager.PLUGINXML;
				System.out.println("Path: " + path);
				final File file = new File(path);
				System.out.println("exists: " + file.exists());
				if (! file.exists()) createPluginFile(path);
				
				java.net.URI uri = project.getLocationURI();
				path = uri + "/" + XMLPluginFileManager.PLUGINXML;
				doc = builder.parse(path);
			} catch (final SAXException e) {
				e.printStackTrace();
			} catch (final IOException e) {
				e.printStackTrace();
			}
			if (doc != null) {
				Element root = doc.getDocumentElement();
				System.out.println(root);
				NodeList refactorings = root.getElementsByTagName
									(ExtensionPointTags.REFACTORING_TAG);
				for (int i=0; i < refactorings.getLength(); i++){
					Element refactoring = (Element) refactorings.item(i);
					String controller = refactoring.getAttribute
									(ExtensionPointTags.REFACTORING_CONTROLLER_TAG);
					String gui = refactoring.getAttribute
									(ExtensionPointTags.REFACTORING_GUI_TAG);
					String id = refactoring.getAttribute
									(ExtensionPointTags.REFACTORING_ID_TAG);
					String menuLabel = refactoring.getAttribute
									(ExtensionPointTags.REFACTORING_MENULABEL_TAG);
					String namespaceURI = refactoring.getAttribute
									(ExtensionPointTags.REFACTORING_NSURI_TAG);
					RefactoringInfo refactoringConfig = 
							new RefactoringInfo
								(controller, gui, id, menuLabel, namespaceURI);
					refactoringConfigs.add(refactoringConfig);
				}				
			}
		}
		return refactoringConfigs;
	}

	/**
	 * Abstract method for saving the given RefactoringConfig list as model
	 * refactoring extension point servings in the plugin.xml file of the
	 * project with the given name. 
	 * @param projectName Name of the project the model refactoring 
	 * extension point servings shall be stored in the plugin.xml file.
	 * @param refactoringConfig List of RefactoringConfig to be saved as
	 * model refactoring extension point servings.
	 */
	public static void saveRefactoringConfig
			(String projectName, List<RefactoringInfo> refactoringConfig) {
		final DocumentBuilder builder = 
							XMLPluginFileManager.newDocumentBuilder();
		if (null != builder){
			final Document doc = builder.newDocument();			
			Element root = doc.createElement(XMLPluginFileManager.PLUGIN);
			doc.appendChild(root);
			final Element extension = doc.createElement
										(XMLPluginFileManager.EXTENSION);
			extension.setAttribute(XMLPluginFileManager.POINT, 
					ExtensionPointTags.EXTENSION_POINT_NAME);
			for (RefactoringInfo rc : refactoringConfig){
				Element refactoring = doc.createElement
										(ExtensionPointTags.REFACTORING_TAG);
				if (rc.getPackageName() == null){
					refactoring.setAttribute(ExtensionPointTags.REFACTORING_CONTROLLER_TAG, 
								rc.getController());
					refactoring.setAttribute(ExtensionPointTags.REFACTORING_GUI_TAG, 
								rc.getGuiHandler());
				} else {
					refactoring.setAttribute(ExtensionPointTags.REFACTORING_CONTROLLER_TAG, 
								rc.getPackageName() + "." + rc.getController());
					refactoring.setAttribute(ExtensionPointTags.REFACTORING_GUI_TAG, 
								rc.getPackageName() + "." + rc.getGuiHandler());
				}
				refactoring.setAttribute(ExtensionPointTags.REFACTORING_ID_TAG, 
								rc.getRefactoringId());
				refactoring.setAttribute(ExtensionPointTags.REFACTORING_MENULABEL_TAG, 
								rc.getMenuLabel());
				refactoring.setAttribute(ExtensionPointTags.REFACTORING_NSURI_TAG, 
								rc.getNamespaceUri());
				extension.appendChild(refactoring);
			}
			root.appendChild(extension);
			Transformer transformer = XMLPluginFileManager.createTransformer();
			final DOMSource source = new DOMSource(doc);
			IProject project = ResourcesPlugin.getWorkspace()
											.getRoot().getProject(projectName);
			java.net.URI uri = project.getLocationURI();
			StreamResult result = new StreamResult(uri + "/" 
											+ XMLPluginFileManager.PLUGINXML);			
			try {
				transformer.transform(source, result);
			} catch (final TransformerException e) {
				e.printStackTrace();
			}			
		}
	}
	
	private static void createPluginFile(String path) {
		final DocumentBuilder builder = XMLPluginFileManager.newDocumentBuilder();
		Document doc = null;
		Element root;
		if (builder != null) {
			doc = builder.newDocument();
			root = doc.createElement(XMLPluginFileManager.PLUGIN);
			doc.appendChild(root);
			final Element extension = doc.createElement(ExtensionPointTags.EXTENSION_POINT_TAG);
			extension.setAttribute(XMLPluginFileManager.POINT, ExtensionPointTags.EXTENSION_POINT_NAME);
			root.appendChild(extension);
		}
		final Transformer transformer = XMLPluginFileManager.createTransformer();
		final DOMSource source = new DOMSource(doc);
		final StreamResult result = new StreamResult(path);
		try {
			transformer.transform(source, result);
		} catch (final TransformerException e) {
			e.printStackTrace();
		}
	}

}
