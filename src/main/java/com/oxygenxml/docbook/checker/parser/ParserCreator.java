package com.oxygenxml.docbook.checker.parser;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;
import org.xml.sax.SAXNotRecognizedException;
import org.xml.sax.SAXNotSupportedException;
import org.xml.sax.XMLReader;

/**
 * Parser creator.
 * @author intern4
 *
 */
public interface ParserCreator {

	/**
	 * Create a XMLReader
	 * @return The XMLReader.
	 * @throws SAXNotRecognizedException
	 * @throws SAXNotSupportedException
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 */
	 XMLReader createXMLReader() throws ParserConfigurationException, SAXException;
}
