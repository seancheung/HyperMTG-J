/**
 * 
 */
package com.mtg.core.io;

import java.util.stream.Stream;

import com.mtg.core.base.Deck;

/**
 * @author Sean
 *
 */
public interface IDeckWriter {

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
	 * Save deck to stream
	 * 
	 * @param deck
	 * @param output
	 * @return
	 */
	public boolean write(Deck deck, Stream<?> output);
}
