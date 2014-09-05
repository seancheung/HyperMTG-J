/**
 * 
 */
package com.mtg.core.io;

import com.mtg.core.base.Card;
import com.mtg.core.base.Set;
import com.mtg.core.common.Language;

/**
 * @author Sean
 *
 */
public interface IDBReader {

	/**
	 * 
	 * @return Type of the Database
	 */
	public String getDBType();

	/**
	 * 
	 * @return Language of the database
	 */
	public Language getLanguage();

	/**
	 * Load cards
	 * 
	 * @return
	 */
	public Card[] loadCards();

	/**
	 * Load binary file
	 * 
	 * @param id
	 * @param compressor
	 * @return
	 */
	public byte[] loadBin(String id, ICompressor compressor);

	/**
	 * Load sets
	 * 
	 * @return
	 */
	public Set[] loadSets();
}
