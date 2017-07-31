package com.oxygenxml.docbookChecker.persister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.oxygenxml.docbookChecker.CheckerInteractor;
import com.oxygenxml.docbookChecker.translator.Tags;

import ro.sync.exml.workspace.api.PluginWorkspaceProvider;
import ro.sync.exml.workspace.api.options.WSOptionsStorage;

/**
 * Use WSOptionStorage for save content from GUI in system and Set saved content
 * in GUI.
 * 
 * 
 * @author intern4
 *
 */
public class ContentPersisterImpl implements ContentPersister {

	@Override
	public void saveContent(CheckerInteractor interactor) {
		WSOptionsStorage optionsStorage = PluginWorkspaceProvider.getPluginWorkspace().getOptionsStorage();

		// save state of checkCurrentFile radioButton
		if (interactor.isSelectedCheckCurrent()) {
			optionsStorage.setOption(Tags.CHECK_FILE_KEY, Tags.SET);
		} else {
			optionsStorage.setOption(Tags.CHECK_FILE_KEY, Tags.NOT_SET);
		}

		// save state of checkExternalLinks CheckBox
		if (interactor.isSelectedCheckExternal()) {
			optionsStorage.setOption(Tags.CHECK_EXTERNAL_KEY, Tags.SET);
		} else {
			optionsStorage.setOption(Tags.CHECK_EXTERNAL_KEY, Tags.NOT_SET);
		}

		// save state of checkImages CheckBox
		if (interactor.isSelectedCheckImages()) {
			optionsStorage.setOption(Tags.CHECK_IMAGES_KEY, Tags.SET);
		} else {
			optionsStorage.setOption(Tags.CHECK_IMAGES_KEY, Tags.NOT_SET);
		}

		// save state of checkInternalLink CheckBox
		if (interactor.isSelectedCheckInternal()) {
			optionsStorage.setOption(Tags.CHECK_INTERNAL_KEY, Tags.SET);
		} else {
			optionsStorage.setOption(Tags.CHECK_INTERNAL_KEY, Tags.NOT_SET);
		}

		// save table rows
		//--join list and save the result
		optionsStorage.setOption(Tags.TABLE_ROWS, String.join(";", interactor.getTableRows()));

	}

	@Override
	public void setSavedContent(CheckerInteractor interactor) {
		WSOptionsStorage optionsStorage = PluginWorkspaceProvider.getPluginWorkspace().getOptionsStorage();
		String value;

		// set checkCurrent radioButton or checkOther radioButton
		value = optionsStorage.getOption(Tags.CHECK_FILE_KEY, Tags.SET);
		System.out.println(value);
		if (value.equals(Tags.SET)) {
			interactor.doClickOnCheckCurrentLink();
		} else {
			interactor.doClickOnCheckOtherLink();
		}

		// set checkExternalLinks checkButton
		value = optionsStorage.getOption(Tags.CHECK_EXTERNAL_KEY, Tags.SET);
		if (value.equals(Tags.SET)) {
			interactor.setCheckExternal(true);
		} else {
			interactor.setCheckExternal(false);
		}

		// set checkImages checkButton
		value = optionsStorage.getOption(Tags.CHECK_IMAGES_KEY, Tags.SET);
		if (value.equals(Tags.SET)) {
			interactor.setCheckImages(true);
		} else {
			interactor.setCheckImages(false);
		}
		// set checkInternalLinks checkButton
		value = optionsStorage.getOption(Tags.CHECK_INTERNAL_KEY, Tags.SET);
		if (value.equals(Tags.SET)) {
			interactor.setCheckInternal(true);
		} else {
			interactor.setCheckInternal(false);
		}

		// set rows in table
		value = optionsStorage.getOption(Tags.TABLE_ROWS, "");
		if (!value.isEmpty()) {
			// split value String in list with Strings
			List<String> rowList = new ArrayList<String>(Arrays.asList(value.split(";")));

			interactor.setRowsInFilesTable(rowList);
		
		}
	}

}