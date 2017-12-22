package comrel.interpreter;

public class ComrelInterpreterPrinter {
	
	ComrelInterpreter comrelInterpreter;
	
	public ComrelInterpreterPrinter(ComrelInterpreter comrelInterpreter) {
		this.comrelInterpreter = comrelInterpreter;
	}
	
	public void printRefactorings() {
		System.out.println("---------------------------------------");
		System.out.println("------- Registered Refactorings -------");
		System.out.println("---------------------------------------");
//		for (EmfRefactoring ref : comrelInterpreter.emfRefactorings) {
//			System.out.println(ref.getId());
//		}
		System.out.println("---------------------------------------");
	}
	
	public void printHelper() {
		System.out.println("---------------------------------------");
		System.out.println("--------- Registered Helper -----------");
		System.out.println("---------------------------------------");
//		for (Helper hel : comrelInterpreter.helper) {
//			System.out.println(hel.getName());
//		}
		System.out.println("---------------------------------------");
	}
	
	public void printRootObject() {
		System.out.println("---------------------------------------");
		System.out.println("--------- Root Model Object -----------");
		System.out.println("---------------------------------------");
//		System.out.println(comrelInterpreter.rootObject.toString());
		System.out.println("---------------------------------------");
	}
	
	public void printCheckPreconditions() {
		System.out.println("---------------------------------------");
		System.out.println("--------- Flag Preconditions Check ----");
		System.out.println("---------------------------------------");
//		System.out.println(comrelInterpreter.checkPreconditions);
		System.out.println("---------------------------------------");
	}
	
	public void printCompositeRefactoring() {
		System.out.println("---------------------------------------");
		System.out.println("--------- Composite Refactoring -------");
		System.out.println("---------------------------------------");
//		System.out.println(comrelInterpreter.compositeRefactoring);
		System.out.println("---------------------------------------");
	}
	
	public void printMainRefactoringUnit() {
		System.out.println("---------------------------------------");
		System.out.println("---------- Main Refactoring Unit ------");
		System.out.println("---------------------------------------");
//		System.out.println(comrelInterpreter.mainRefactoringUnit);
		System.out.println("---------------------------------------");
	}

}
