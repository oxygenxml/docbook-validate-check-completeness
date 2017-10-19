package com.oxygenxml.docbook.checker.translator;

/**
 * Tags used for persistence and internationalization.
 * @author intern4
 *
 */
public interface Tags {
	
	/**
	 * The hint from the icon.
	 */
	public final String ICON_HINT = "Icon_Hint_DB_Checker";
	/**
	 * Title of checker frame
	 */
	public final String FRAME_TITLE = "Frame_Title_DB_Checker";
	
	/**
	 * Label for choose files for check 
	 */
	public final String SELECT_FILES_LABEL_KEY = "Select_Files_Label_DB_Checker";
	/**
	 * Radio button for check current file.
	 */
	public final String CHECK_CURRENT_FILE_KEY = "Check_Current_File_Key_DB_Checker";
	/**
	 * Radio button for check other files
	 */
	public final String CHECK_OTHER_FILES_KEY = "Check_Other_Files_Key_DB_Checker";
	
	/**
	 * CheckBox for use profiling conditions for check;
	 */
	public final String USE_PROFLING_CBOX = "Use_Profiling_Check_Box_DB_Checker";
	
	/**
	 * Check box for check external links.
	 */
	public final String CHECK_EXTERNAL_KEY = "Check_External_Key_DB_Checker";
	/**
	 * Check box for check images.
	 */
	public final String CHECK_IMAGES_KEY = "Check_Images_Key_DB_Checker";
	/**
	 * Check box for check internal links.
	 */
	public final String CHECK_INTERNAL_KEY = "Check_Internal_Key_DB_Checker";

	/**
	 * Check box for check internal links.
	 */
	public final String REPORT_UNDEFINED_CONDITIONS = "Report_undefined_conditions_DB_Checker";
	
	/**
	 * Check box for generate resource hierarchy report.
	 */
	public final String GENERATE_HIERACHY_REPORT = "Generate_hierachy_report_DB_Checker";
	
	
	/**
	 * Head of files table.
	 */
	public final String FILES_TABLE_HEAD = "Files_Tabel_Head_DB_Checker";
	/**
	 * Head of conditions table.
	 */
	public final String CONDTIONS_TABLE_HEAD = "Conditions_Tabel_Head_DB_Checker";
	/**
	 * Head of Sets table.
	 */
	public final String SETS_TABLE_HEAD = "Sets_Tabel_Head_DB_Checker";
	/**
	 * Add button of table.
	 */
	public final String ADD_TABLE = "Add_Table_Button_DB_Checker"; 
	
	/**
	 * Edit button of table
	 */
	public final String EDIT_TABLE = "Edit_Table_Button_DB_Checker";
	
	/**
	 * Remove button of table
	 */
	public final String REMOVE_TABLE = "Remove_Table_Button_DB_Checker";
	/**
	 * Get button for conditions table;
	 */
	public final String GET_TABLE = "Get_Table_Button_DB_Checker";
	
	/**
	 * Radio button for configure a conditions set.
	 */
	public final String CONFIG_CONDITIONS_SET = "Configure_Conditions_Set_DB_Checker";
	
	/**
	 * Radio button for choose a conditions set.
	 */
	public final String CHOOSE_CONDITIONS_SET = "Choose_Conditions_Set_DB_Checker";
	
	/**
	 * Radio button check using all available conditions set.
	 */
	public final String ALL_CONDITIONS_SETS = "All_Conditions_Sets_DB_Checker";
	
	/**
	 * Title of get file conditions dialog;
	 */
	public final String FILE_CONDITIONS_DIALOG_TITLE = "File_Conditions_Dialog_Title_DB_Checker";
	
	/**
	 * Check box of checker frame
	 */
	public final String CHECK_BUTTON = "Check_Button_DB_Checker";
	/**
	 * Cancel button of checker frame
	 */
	public final String CANCEL_BUTTON = "Cancel_Button_DB_Checker";
	
	/**
	 * Title for file chooser used to add url in tableFiles
	 */
	public final String FILE_CHOOSER_TITLE = "File_Chooser_Title_DB_Checker";
	/**
	 * Action button in file chooser.
	 */
	public final String FILE_CHOOSER_BUTTON = "File_Chooser_Button_DB_Checker";
	
	/**
	 * Add button in dialog
	 */
	public final String ADD_BUTTON_IN_DIALOGS = "Add_Button_Dialog_DB_Checker";
	
	/**
	 * Tag for file table rows.
	 */
	public final String FILE_TABLE_ROWS = "File_Table_Rows_DB_Checker";

	/**
	 * Tag for conditions table rows.
	 */
	public final String CONDITIONS_TABLE_ROWS = "Conditions_Table_Rows_DB_Checker";

	/**
	 * Button for get conditions from current documents.
	 */
	public final String GET_DOCUMENT_CONDITIONS_BUTTON = "Get_Document_Conditions_Button_DB_Checker";

	/**
	 * Button for get conditions from current documents.
	 */
	public final String GET_DOCUMENT_CONDITIONS_TOOLTIP = "Get_Document_Conditions_Button_Tool_Tip_DB_Checker";

	
	/**
	 * Reported progress status. 
	 */
	public final String PROGRESS_STATUS = "Progress_Status_DB_Checker"; 
	
	/**
	 * Reported fail status.
	 */
	public final String FAIL_STATUS = "Failed_Status_DB_Checker";
	
	/**
	 * Reported success status.
	 */
	public final String SUCCESS_STATUS = "Success_Status_DB_Checker";

	/**
	 * Title for configure conditions dialog(Dialog for add/edit conditions in conditions table).
	 */
	public final String CONFIGURE_CONDITIONS_DIALOG_TITLE = "Configure_Conditions_Dialog_Title_DB_Checker";
	
	/**
	 * Label for select document type in add conditions dialog.
	 */
	public final String SELECT_DOCUMENT_TYPE = "Select_Document_Type_Name_DB_Checker";

	/**
	 * Label for in dialog to add document type name.
	 */
	public final String INSERT_DOC_TYPE_LABEL = "Insert_Document_Type_Label_DB_Checker";

	
	/**
	 * Message in progress dialog. 
	 */
	public final String PROGRESS_DIALOG_MESSAGE = "Progress_Monitor_Message_DB_Checker";

	/**
	 * Warning message showed when conditions are undefined.
	 */
	public final String WARNING_MESSAGE_UNDEFINED_CONDITIONS = "Warning_Undefined_Conditions_DB_Checker";
	
	/**
	 * Text added in radioButton for select to use all conditions available, when
	 * wasn't found a conditions set.  
	 */
	public final String USPECIFIED_CONDITIONS = "Unspecified_Conditions_DB_Checker";

	/**
	 * Message displayed when the conditions table is empty and check button is pressed.
	 */
	public final String EMPTY_CONDITIONS_TABLE = "Empty_Conditions_Table_Message_DB_Checker";

	/**
	 * Message displayed when wasn't found profiling conditions in documents.
	 */
	public final String NOT_FOUND_CONDITIONS = "Not_Found_Conditions_Message_DB_Checker";
	
	/**
	 * Title for hierarchy report dialog.
	 */
	public final String HIERARCHY_REPORT_DIALOG_TITLE = "Hierarchy_Report_Dialog_Title_DB_Checker";
	/**
	 * Label for quick search
	 */
	public final String QUICK_SEARCH_LABEL = "Quick_Search_Label_DB_Checker";
	/**
	 * Button for save report.
	 */
	public final String SAVE_REPORT_BUTTON = "Save_Report_Button_DB_Checker";
}

