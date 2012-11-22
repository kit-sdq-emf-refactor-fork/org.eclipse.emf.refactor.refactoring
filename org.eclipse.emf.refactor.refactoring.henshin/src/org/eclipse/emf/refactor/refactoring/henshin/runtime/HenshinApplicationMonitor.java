package org.eclipse.emf.refactor.refactoring.henshin.runtime;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.henshin.interpreter.ApplicationMonitor;
import org.eclipse.emf.henshin.interpreter.RuleApplication;
import org.eclipse.emf.henshin.interpreter.UnitApplication;

public class HenshinApplicationMonitor implements ApplicationMonitor {
	
	private List<RuleApplication> appliedRules = new ArrayList<RuleApplication>(5);
	
	// Canceled flag:
	protected boolean canceled = false;
	
	// Undoing flag:
	protected boolean undo = false;
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#isCanceled()
	 */
	@Override
	public boolean isCanceled() {
		return canceled;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#isUndo()
	 */
	@Override
	public boolean isUndo() {
		return undo;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#cancel()
	 */
	@Override
	public void cancel() {
		canceled = true;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.emf.henshin.interpreter.ApplicationMonitor#cancelAndUndo()
	 */
	@Override
	public void cancelAndUndo() {
		canceled = true;
		undo = true;
	}
	
	@Override
	public void notifyExecute(UnitApplication application, boolean success) {
		if (success && application instanceof RuleApplication && application.getUnit().getDescription() != null && !application.getUnit().getDescription().isEmpty())
			appliedRules.add((RuleApplication) application);
	}

	@Override
	public void notifyUndo(UnitApplication application, boolean succeess) {
		// do nothing
	}

	@Override
	public void notifyRedo(UnitApplication application, boolean success) {
		// do nothing
	}
	
	/**
	 * Returns the applied UnitApplications where:
	 * (a) the execution was successful
	 * (b) the description is not empty
	 * @return
	 */
	public List<RuleApplication> getAppliedRules() {
		return appliedRules;
	}
	
}
