package com.oxygenxml.docbook.checker.checkboxtree;

/**
 * The leaf in JCheckBoxTree.
 * @author Cosmin Duna
 *
 */
public class LeafNode {
	/**
	 * The attribute of conditions
	 */
	private String attrib;
	/*
	 * The value of conditions
	 */
	private String value;
	
	/**
	 * Constructor
	 * @param atrib The attribute. 
	 * @param value The value.
	 */
	public LeafNode( String atrib, String value) {
		super();
		this.value = value;
		this.attrib = atrib;
	}

	/**
	 * Get the value.
	 * @return The value
	 */
	public String getValue() {
		return value;
	}
	
	
	@Override
	public int hashCode() {
		return (value+attrib).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean toReturn; 
		if(obj instanceof LeafNode){
			toReturn = (this.value.equals( ((LeafNode)obj).value ) && 
					this.attrib.equals(((LeafNode)obj).attrib));
		}else{
			toReturn = super.equals(obj);
		}
		return toReturn;
	}
}
