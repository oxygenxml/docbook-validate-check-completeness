package com.oxygenxml.docbook.checker.parser;

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;

/**
 * Contains lists with found links, IDs and conditions .
 * 
 * @author Cosmin Duna
 *
 */
public class DocumentDetails {
	/**
	 * List with external links.
	 */
	private List<Link> externalLinks;
	/**
	 * List with images links.
	 */
	private List<Link> imgLinks;
	/**
	 * List with paragraph IDs(without duplicate).
	 */
	private List<Id> validParaIds;

	/**
	 * List with duplicate paragraph IDs.
	 */
	private List<Id> duplicateParaIds;
	/**
	 * List with internal links.
	 */
	private List<Link> internalLinks;
	
	/**
	 * Set with all conditions with details from document.
	 */
	private LinkedHashSet<ConditionDetails> allConditions;

	/**
	 * List with all assembled files(topics) with IDs. 
	 */
	private List<AssemblyTopicId> assemblyTopicIds;
	
	/**
	 * List with assembly links.
	 */
	private List<Link> assemblyLinks;
	
	/**
	 * List with xiInclude files. The list contains stacks. The stack contains the location for the xi-included files.
	 */
	private List<Stack<URL>> xiIncludeFiles; 
	
	
	/**
	 * Constructor
	 * @param externalLinks External links list.
	 * @param imgLinks 	Images list.
	 * @param validParaIds Valid paragraph id list.
	 * @param duplicateParaIds duplicate paragraph id list.
	 * @param internalLinks Internal links list.
	 */
	public DocumentDetails(List<Link> externalLinks, List<Link> imgLinks, List<Id> validParaIds, List<Id> duplicateParaIds,
			List<Link> internalLinks, List<Stack<URL>> xiIncludeFiles) {
		this.externalLinks = externalLinks;
		this.imgLinks = imgLinks;
		this.validParaIds = validParaIds;
		this.duplicateParaIds = duplicateParaIds;
		this.internalLinks = internalLinks;
		this.xiIncludeFiles = xiIncludeFiles;
		
	}

	/**
	 * Constructor
	 */
	public DocumentDetails() {
		this.externalLinks = new ArrayList<Link>();
		this.imgLinks = new ArrayList<Link>();
		this.internalLinks = new ArrayList<Link>();
		this.validParaIds = new ArrayList<Id>();
		this.duplicateParaIds = new ArrayList<Id>();
		this.allConditions = new LinkedHashSet<ConditionDetails>() ;
		this.assemblyTopicIds = new ArrayList<AssemblyTopicId>();
		this.assemblyLinks = new ArrayList<Link>();
		this.xiIncludeFiles = new ArrayList<Stack<URL>>();
	}

	
	// Getters and setter
	public LinkedHashSet<ConditionDetails> getAllConditions() {
		return allConditions;
	}

	public void setAllConditions(LinkedHashSet<ConditionDetails> allConditions) {
		this.allConditions = allConditions;
	}
	
	public List<Link> getExternalLinks() {
		return externalLinks;
	}

	public List<Link> getImgLinks() {
		return imgLinks;
	}

	public List<Id> getValidParaIds() {
		return validParaIds;
	}
	
	public List<Id> getDuplicateParaIds() {
		return duplicateParaIds;
	}
	
	public List<Link> getInternalLinks() {
		return internalLinks;
	}

	public List<AssemblyTopicId> getAssemblyFilesAndIds() {
		return assemblyTopicIds;
	}

	public List<Link> getAssemblyLinks() {
		return assemblyLinks;
	}

	public List<Stack<URL>> getXiIncludeFiles() {
		return xiIncludeFiles;
	}

	/**
	 * Add operation
	 * @param documentDetails 
	 * @return The results of add
	 */
	public DocumentDetails add(DocumentDetails documentDetails) {

		this.externalLinks.addAll(documentDetails.externalLinks);
		this.internalLinks.addAll(documentDetails.internalLinks);
		this.imgLinks.addAll(documentDetails.imgLinks);
		this.assemblyTopicIds.addAll(documentDetails.assemblyTopicIds);
		this.assemblyLinks.addAll(documentDetails.assemblyLinks);

		//iterate over validParaIds from a given documentDetails
		Iterator<Id> givenValidIdIter = documentDetails.getValidParaIds().iterator();
		while (givenValidIdIter.hasNext()) {
			//add the Id 
			Id givenValidId =  givenValidIdIter.next();
			this.addId(givenValidId);
		}

		this.duplicateParaIds.addAll(documentDetails.getDuplicateParaIds());
		
		return this;
	}

	/**
	 * Add the given Id in validParaId, or in duplicateParaIds if this is already in validParaId list.
	 * @param id The id.
	 *
	 */
	public void addId(Id id){

		//get the index of Id from the validParaIds
		int indexOfID = validParaIds.indexOf(id);
		
		//if element exist in validParaIds
		if(indexOfID != -1){
			Id idValidList = validParaIds.get(indexOfID);
			
			//test if the existent element is filter and if the given element isn't.
			if(idValidList.isFilterByConditions() && !id.isFilterByConditions()){
				
				//add the element that isn't filter in Valid list 
				validParaIds.remove(indexOfID);
				validParaIds.add(indexOfID, id);
				
				//add the filter element in duplicate list
				duplicateParaIds.add(idValidList);
			}else{
				// add given element in duplicateParaIds 
				duplicateParaIds.add(id);
			}
		
		}else{
			//add the element in valid list if it's not there. 
			validParaIds.add(id);
		}
	}
	
	/**
	 * Add the given link in externalLinks list.
	 * @param link The link.
	 */
	public void addExternalLink(Link link){
		externalLinks.add(link);
	}
	
	/**
	 * Add the given link in internalLinks list.
	 * @param link The link.
	 */
	public void addInternalLink(Link link){
		internalLinks.add(link);
	}
	
	/**
	 * Add the given link in imageLinks list.
	 * @param link The link.
	 */
	public void addImage(Link link){
		imgLinks.add(link);
	}
	
	/**
	 * Add the given assembled file(topic) in assemblyTopicIds list.
	 * @param assemblyFileId The assembly file.
	 */
	public void addAssemblyTopic(AssemblyTopicId assemblyFileId){
		assemblyTopicIds.add(assemblyFileId);
	}
	
	/**
	 * Add the given link in assemblyLinks list.
	 * @param link The link.
	 */
	public void addAssemblyLink(Link link){
		assemblyLinks.add(link);
	}
	
	/**
	 * Add the given stack that corresponds with a xi-include file in xiIncludeFiles list.
	 * @param xiIncludeFile The stack that corresponds with a xi-include file
	 */
	public void addXiIncludeFile(Stack<URL> xiIncludeFile){
		xiIncludeFiles.add(xiIncludeFile);
	}

	@Override
	public String toString() {
		return "DocumentDetails [externalLinks=" + externalLinks + ", imgLinks=" + imgLinks + ", validParaIds="
				+ validParaIds + ", duplicateParaIds=" + duplicateParaIds + ", internalLinks=" + internalLinks
				+ ", allConditions=" + allConditions + ", assemblyTopicIds=" + assemblyTopicIds + ", assemblyLinks="
				+ assemblyLinks + "]";
	}

	
	
}
