package org.eclipse.emf.refactor.refactoring.configuration.ui;

import java.util.LinkedList;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.swt.widgets.TableItem;

public class TableItemsMapping {

	private TableItemMapping[] tableItems;

	public TableItemsMapping(LinkedList<Refactoring> inputList) {
		LinkedList<TableItemMapping> tableItemsList = new LinkedList<TableItemMapping>();
		for (Refactoring Refactoring : inputList) {
			tableItemsList.add(new TableItemMapping(Refactoring));
		}
		tableItems = new TableItemMapping[tableItemsList.size()];
		for (int i = 0; i < tableItemsList.size(); i++) {
			tableItems[i] = tableItemsList.get(i);
		}
	}

	public int getSize() {
		return tableItems.length;
	}

	public void setItemForRefactoring(Refactoring Refactoring, TableItem item) {
		int index = getTableItemIndex(Refactoring);
		setItem(index, item);
	}

	public Refactoring getRefactoring(int index){
		return tableItems[index].getRefactoring();
	}
	
	public TableItem getTableItem(int index) {
		return tableItems[index].getItem();
	}

	public TableItem getTableItem(Refactoring refactoring) {
		return tableItems[getTableItemIndex(refactoring)].getItem();
	}

	private void setItem(int index, TableItem item) {
		tableItems[index].setItem(item);
	}

	private int getTableItemIndex(Refactoring refactoring) {
		for (int i = 0; i < tableItems.length; i++) {
			if (tableItems[i].getRefactoring().equals(refactoring))
				return i;
		}
		return -1;
	}

	private class TableItemMapping {
		private TableItem item;
		private Refactoring refactoring;

		private TableItemMapping(Refactoring refactoring) {
			this.refactoring = refactoring;
			this.item = null;
		}

		private void setItem(TableItem item) {
			this.item = item;
		}

		private TableItem getItem() {
			return item;
		}

		private Refactoring getRefactoring() {
			return refactoring;
		}

	}
}
