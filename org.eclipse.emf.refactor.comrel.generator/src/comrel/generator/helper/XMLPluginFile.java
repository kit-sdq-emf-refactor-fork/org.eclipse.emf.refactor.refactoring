package comrel.generator.helper;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;


public class XMLPluginFile extends XMLFile {
	
	public static final String PLUGIN_FILE = "/plugin.xml";
	public static final String PLUGIN_TAG = "plugin";
	public static final String EXTENSION_TAG = "extension";
	public static final String POINT_ATTR_TAG = "point";
	
	public static void createHelperEntry(HelperInfo helperInfo, String helperType, String helperExtensionPoint) {
		final DocumentBuilder builder = createDocumentBuilder();
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(helperInfo.getProjectName());
		final String path = project.getLocation().toString() + PLUGIN_FILE;
		Document doc = null;
		final File file = new File(path);
		if (!file.exists())
			createPluginXml(helperInfo.getProjectName());
		if (builder != null) {
			Element root;
			try {
				doc = builder.parse(path);
			} catch (final SAXException e) {
				e.printStackTrace();
			} catch (final IOException e) {
				e.printStackTrace();
			}
			if (doc != null) {
				root = doc.getDocumentElement();
				Element ep = doc.createElement(EXTENSION_TAG);
				ep.setAttribute(POINT_ATTR_TAG, helperExtensionPoint);
				Node newEntry = createElement(helperInfo, doc, helperType);
				ep.appendChild(newEntry);
				root.appendChild(ep);
			}
		}
		final Transformer transformer = createTransformer();
		final DOMSource source = new DOMSource(doc);
		final StreamResult result = new StreamResult(path);
		try {
			transformer.transform(source, result);
		} catch (final TransformerException e) {
			e.printStackTrace();
		}
	}
	
	public static void createPluginXml(String projectName) {
		final DocumentBuilder builder = createDocumentBuilder();
		if (null != builder){
			final Document doc = builder.newDocument();			
			final Element root = doc.createElement(PLUGIN_TAG);
			doc.appendChild(root);
			final Transformer transformer = createTransformer();
			final DOMSource source = new DOMSource(doc);
			IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
			java.net.URI uri = project.getLocationURI();
			StreamResult result = new StreamResult(uri + PLUGIN_FILE);			
			try {
				transformer.transform(source, result);
			} catch (final TransformerException e) {
				e.printStackTrace();
			}			
		}
	}
	
	private static Element createElement(HelperInfo helperInfo, Document doc, String helperType) {
		final Element multifeature = doc.createElement(helperType);
		multifeature.setAttribute(ExtensionPoint.NAME, helperInfo.getName());
		multifeature.setAttribute(ExtensionPoint.ID, helperInfo.getId());
		multifeature.setAttribute(ExtensionPoint.DESCRIPTION, helperInfo.getDescription());
		multifeature.setAttribute(ExtensionPoint.NAMESPACEURI, helperInfo.getNamespaceUri());
		multifeature.setAttribute(ExtensionPoint.CLASS, helperInfo.getQualifiedClassName());
		return multifeature;
	}

}
