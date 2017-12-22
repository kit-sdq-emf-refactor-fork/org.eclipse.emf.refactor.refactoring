package comrel.interpreter;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.UMLPackage;

public abstract class ComrelInterpreterTester {

	public static void testInterpreterInit() {
		Model umlModel;
		umlModel = loadUmlModel("D:/Uni/Eclipse/scm/ws/comrel.interpreter/models/My.uml");
		ComrelInterpreter comrelInterpreter = new ComrelInterpreter(umlModel);
		ComrelInterpreterPrinter printer = new ComrelInterpreterPrinter(comrelInterpreter);
		printer.printRootObject();
		printer.printRefactorings();
		printer.printHelper();
		try {
			comrelInterpreter.loadComrelModel("D:/Uni/Eclipse/scm/ws/comrel.interpreter/models/extractsuperclass.comrel");
		} catch (IOException e) {
			e.printStackTrace();
		}
		printer.printCompositeRefactoring();
		printer.printMainRefactoringUnit();
		printer.printCheckPreconditions();
	}
	
	private static Model loadUmlModel(String fileName) {
		UMLPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("uml", new XMIResourceFactoryImpl());
		URI uri = URI.createFileURI(new File(fileName).getAbsolutePath());
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.createResource(uri);
		try {
			resource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Model model = (Model) resource.getContents().get(0); 
		System.out.println("Model: " + model.toString());
		return model;
	}

}
