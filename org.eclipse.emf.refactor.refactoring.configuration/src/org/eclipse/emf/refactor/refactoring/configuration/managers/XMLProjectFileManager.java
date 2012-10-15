package org.eclipse.emf.refactor.refactoring.configuration.managers;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.refactor.refactoring.configuration.core.Configuration;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.managers.XMLManager;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLProjectFileManager extends XMLManager{

	private static final String REF_CONFIG = ".emfrefactorings.xml";
	private static final String CONFIGURATOR_TAG = "refactoringConfiguration";
	
	public static void saveConfiguration(Configuration configurator) {
		final DocumentBuilder builder = createDocumentBuilder();
		if (builder != null){
			final Document doc = builder.newDocument();		
			final Element root = doc.createElement(CONFIGURATOR_TAG);
			doc.appendChild(root);		
			for (Refactoring refactoring : configurator.getSelectedRefactorings()){
				Element metricEntry = doc.createElement(REFACTORING_TAG);
				Element metricId = doc.createElement(REFACTORING_ID_TAG);
				metricId.setTextContent(refactoring.getId());
				metricEntry.appendChild(metricId);
				root.appendChild(metricEntry);
			}				
			final Transformer transformer = createTransformer();
			final DOMSource source = new DOMSource(doc);		
			final java.net.URI uri = configurator.getProject().getLocationURI();
			StreamResult result = new StreamResult(uri + "/" + REF_CONFIG);			
			try {
				transformer.transform(source, result);
			} catch (final TransformerException e) {
				e.printStackTrace();
			}		
		}
	}
	
	public static Configuration loadConfiguration(IProject project){
		if(! configurationFileExists(project)) {
			return null;
		}
		Configuration configurator = new Configuration(project);
		final DocumentBuilder builder = createDocumentBuilder();
		if (builder != null){
			Document doc = null;
			try {
				java.net.URI uri = project.getLocationURI();
				doc = builder.parse(uri + "/" + REF_CONFIG);
			} catch (final SAXException e) {
				e.printStackTrace();
			} catch (final IOException e) {
				e.printStackTrace();
			}
			if (doc != null) {
				Element root = doc.getDocumentElement();					
				NodeList entryList = root.getElementsByTagName(REFACTORING_TAG);
				LinkedList<String> metricIdList = new LinkedList<String>();
				for (int i=0; i < entryList.getLength(); i++){
					Element entry = (Element) entryList.item(i);
					NodeList nodeList = entry.getElementsByTagName(REFACTORING_ID_TAG);
					Element metricId = (Element) nodeList.item(0);
					metricIdList.add(metricId.getTextContent());
				}	
				configurator.setSelection(metricIdList);
				}
			}		
		return configurator;
	}	
	
	private static boolean configurationFileExists(IProject project) {
		java.net.URI uri = project.getLocationURI();
		String path = uri.getPath() + "/" + REF_CONFIG;
		File file = new File(path);
		return file.exists();
	}
	
	
}
