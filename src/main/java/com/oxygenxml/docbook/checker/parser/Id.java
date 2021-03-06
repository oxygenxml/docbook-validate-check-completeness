package com.oxygenxml.docbook.checker.parser;

/**
 * Id found.
 * 
 * @author Cosmin Duna
 *
 */
public class Id {

	/**
	 * The id founded.
	 */
	private String id;

	/**
	 * The document where Id was found.
	 */
	private String parentDocument; 
	
	/**
	 * Location(line) of the reference.
	 */
	private int line;

	/**
	 * Location(column) of the reference.
	 */
	private int column;
	
	/**
	 * If the id is filter by conditions.
	 */
	private boolean isFilterByConditions = false;

	/**
	 * Constructor
	 * 
	 * @param id
	 *          The id.
	 * @param isFilter
	 *          <code>true</code> if it's filter, <code>false</code> otherwise.
	 * @param documentLinkFound The document URL where link was found.
	 * @param line 	The number of line.
	 * @param column The number of column.
	 */
	public Id(String id, boolean isFilter, String documentLinkFound, int line, int column) {
		this.id = id;
		this.isFilterByConditions = isFilter;
		this.parentDocument = documentLinkFound;
		this.line = line;
		this.column = column;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getLinkFoundDocumentUrl() {
		return parentDocument;
	}


	public int getLine() {
		return line;
	}

	public int getColumn() {
		return column;
	}

	
	/**
	 * Return if the Id is filter by conditions
	 * 
	 * @return <code>true</code> if it's filter, <code>false</code> otherwise.
	 */
	public boolean isFilterByConditions() {
		return isFilterByConditions;
	}

	@Override
	public boolean equals(Object obj) {
		boolean toReturn;
		if(obj instanceof Id){
			toReturn = (obj instanceof Id) && (((Id)obj).getId()).equals(this.getId());
		}else{
			toReturn = super.equals(obj);
		}
	
		return toReturn;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	
}
