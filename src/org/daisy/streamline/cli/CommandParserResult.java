package org.daisy.streamline.cli;

import java.util.List;
import java.util.Map;

/**
 * Provides a parser result.
 * @author Joel Håkansson
 *
 */
public interface CommandParserResult {

	/**
	 * Gets the unnamed/positional arguments.
	 * 
	 * @return returns the unnamed arguments
	 */
	public List<String> getRequired();

	/**
	 * Gets the optional arguments.
	 * 
	 * @return returns the optional arguments
	 */
	public Map<String, String> getOptional();

	/**
	 * Converts the command parser result into a key-value map.
	 * 
	 * @param prefix the prefix to use for unnamed/positional arguments
	 * @return returns a map of arguments
	 */
	public Map<String, String> toMap(String prefix);

}
