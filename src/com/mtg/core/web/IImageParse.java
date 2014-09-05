/**
 * 
 */
package com.mtg.core.web;

import com.mtg.core.base.Card;
import com.mtg.core.common.Language;

/**
 * @author Sean
 *
 */
public interface IImageParse {

	/**
	 * Download file into byte array
	 * 
	 * @param card
	 * @param lang
	 * @return
	 */
	public byte[] download(Card card, Language lang);

	/**
	 * Download file into byte array with default language of English
	 * 
	 * @param card
	 * @return
	 */
	public byte[] download(Card card);
}
