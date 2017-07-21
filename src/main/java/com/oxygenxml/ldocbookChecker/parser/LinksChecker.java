package com.oxygenxml.ldocbookChecker.parser;

import java.net.URL;
import java.util.List;

public interface LinksChecker {

	/**
	 * Check the links from the content of a given url.
	 * @param url the url
	 * @return set with invalid links.
	 */
	public List<Link> check(URL url, boolean checkExternal);
}
