package com.oxygenxml.docbook.checker.gui;

/**
 * Progress dialog interactor.
 * @author intern4
 *
 */
public interface ProgressDialogInteractor {
	
	/**
	 * Set the given note in dialog.
	 * @param note The note.
	 */
	 void setNote(String note);
	
	/**
	 * Close the dialog
	 */
	 void close();
}
