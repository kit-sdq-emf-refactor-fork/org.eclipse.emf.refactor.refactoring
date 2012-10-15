package org.eclipse.emf.refactor.refactoring.managers;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;

public class XMLManager {
	
	protected static final String REFACTORING_TAG = "refactoring";
	protected static final String REFACTORING_ID_TAG = "refactoringId";
	protected  static final String REFACTORING_NAME_TAG = "refactoringName";	
	
	protected static Transformer createTransformer(){
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
		
	protected  static DocumentBuilder createDocumentBuilder() {
		try {
			return DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (final ParserConfigurationException e) {
			e.printStackTrace();
			return null;
		}
	}
}
