package comrel.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Color;

import comrel.AtomicUnit;
import comrel.CompositeRefactoring;
import comrel.FeatureHelper;
import comrel.FeatureUnit;
import comrel.FilterHelper;
import comrel.FilterUnit;
import comrel.Helper;
import comrel.HelperUnit;
import comrel.ModelRefactoring;
import comrel.OutputPort;
import comrel.Port;
import comrel.SingleInputPort;

public class ComrelUtil {

	
	/**
	 * Überprüft, ob ein Port änderbar ist oder nicht
	 * @param p Port, der überprüft werden soll
	 * @return
	 */
	public static boolean portIsSettable(Port p) {
		EObject container = p.eContainer();
		if (container != null) {
			if (container instanceof AtomicUnit) {
				return false;
			}
			if (container instanceof ModelRefactoring) {
				return false;
			}
			if (container instanceof FilterHelper) {
				return false;
			}
			if (container instanceof FilterUnit) {
				return false;
			}
			if (container instanceof FeatureHelper && (p instanceof SingleInputPort || p instanceof OutputPort)) {
				return false;
			}
			if (container instanceof FeatureUnit && (p instanceof SingleInputPort || p instanceof OutputPort)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Überprüft, ob ein Object änderbar ist oder nicht
	 * @param p Object, das überprüft werden soll
	 * @return
	 */
	public static boolean objectIsSettable(EObject e) {
		if (e.eContainer() != null) {
			if (e instanceof AtomicUnit) {
				return false;
			}
			if (e instanceof ModelRefactoring) {
				return false;
			}
			if (e instanceof HelperUnit) {
				return false;
			}
			if (e instanceof Helper) {
				return false;
			}
			if (e instanceof Port) {
				return portIsSettable((Port) e);
			}
		}
		return true;
	}

	
	/**
	 * Konvertiert einen String in den Plural (BETA)
	 * @param singlePortName
	 * @return
	 */
	public static String convertSingularToPluralPortName(String singlePortName) {
		String result = "";
		char[] cases = singlePortName.toCharArray();
		if(cases.length==0) {
			return "";
		}
		for (int i = 0; i < cases.length - 1; i++) {
			result += cases[i];
		}
		if (singlePortName.endsWith("y")) {
			result += "ie";
		} else {
			if (singlePortName.endsWith("s")) {
				result += "se";
			} else {
				result += cases[cases.length - 1];
			}
		}
		result += "s";
		return result;
	}

	/**
	 * Convertiert einen String in den Singular (BETA)
	 * @param multiPortName
	 * @return
	 */
	public static String convertPluralToSingularPortName(String multiPortName) {
		String result = "";
		char[] cases = multiPortName.toCharArray();
		if (multiPortName.endsWith("ies")) {
			for (int i = 0; i < cases.length - 3; i++) {
				result += cases[i];
			}
			result += "y";
		}
		if (multiPortName.endsWith("ses")) {
			for (int i = 0; i < cases.length - 2; i++) {
				result += cases[i];
			}
		}
		if (result.length() == 0) {
			for (int i = 0; i < cases.length - 1; i++) {
				result += cases[i];
			}
		}
		return result;
	}

	/**
	 * Liefert die Farbe zum entsprechenden Index
	 * @param i
	 * @return
	 */
	public static Color getColor(int i) {
		int number = Math.abs(i) % 50;

		return Colors.getColors(50).get(number);
	}

	
	/**
	 * Liefert zu einem EObject das contained CompositeRefactoring
	 * @param eobject das Object
	 * @return das CompositeRefactoring
	 */
	public static CompositeRefactoring getContainedCompositeRefactoring(EObject eobject) {
		if(eobject == null) {
			return null;
		}
		EObject container = eobject;
		while (container.eContainer() != null) {
			container = container.eContainer();
		}
		if (container instanceof CompositeRefactoring) {
			return (CompositeRefactoring) container;
		}
		return null;
	}


	/**
	 * Sortiert alle ModelRefactorings nach Name
	 * @param atomics
	 * @return
	 */
	public static Collection<ModelRefactoring> sortAtomicRefactorings(Collection<ModelRefactoring> atomics){
		Comparator<ModelRefactoring> comp = new ModelRefactoringComparator();
		List<ModelRefactoring> result = new ArrayList<ModelRefactoring>();
		result.addAll(atomics);
		Collections.sort(result, comp);
		return result;
	}
	
	/**
	 * Der Comparator zum sortieren der ModelRefactorings
	 * @author Gerrit
	 *
	 */
	public static class ModelRefactoringComparator implements Comparator<ModelRefactoring>{
		@Override
		public int compare(ModelRefactoring arg0, ModelRefactoring arg1) {
			int result = 0;
			result = arg0.getName().compareTo(arg1.getName()); 
			if(result == 0) {
				result = arg0.getRefId().compareTo(arg1.getRefId());
			}
			if(result == 0) {
				result = arg0.getLabel().compareTo(arg1.getLabel());
			}
			if(result == 0) {
				result = arg0.getNamespaceUri().compareTo(arg1.getNamespaceUri());
			}
			return result;
		}
		
	}
	
}
