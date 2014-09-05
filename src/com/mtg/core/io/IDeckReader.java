/**
 * 
 */
package com.mtg.core.io;

import java.util.stream.Stream;

import com.mtg.core.base.Card;
import com.mtg.core.base.Deck;

/**
 * @author Sean
 *
 */
public interface IDeckReader {

	/**
	 * 
	 * @return File extension
	 */
	public String getFileExt();

	/**
	 * 
	 * @return Type of the deck
	 */
	public String getDeckType();

	/**
	 * Load deck from stream
	 * 
	 * @param input
	 * @param database
	 * @return
	 */
	public Deck read(Stream<?> input, Card[] database);
}
