/**
 * 
 */
package com.mtg.core.io;

import com.mtg.core.base.Bin;
import com.mtg.core.base.Card;
import com.mtg.core.base.Set;
import com.mtg.core.common.Language;

/**
 * @author Sean
 *
 */
public interface IDBWriter {

	public String getDBType();

	public Language getLanguage();

	public boolean insert(Card card);

	public boolean insert(Card[] cards);

	public boolean update(Card card);

	public boolean update(Card[] cards);

	public boolean delete(Card card);

	public boolean delete(Card[] cards);

	public boolean insert(Set set);

	public boolean insert(Set[] sets);

	public boolean update(Set set);

	public boolean update(Set[] sets);

	public boolean delete(Set set);

	public boolean delete(Set[] sets);

	public boolean insert(Bin bin, ICompressor compressor);

	public boolean insert(Bin[] bins, ICompressor compressor);

	public boolean update(Bin bin, ICompressor compressor);

	public boolean update(Bin[] bins, ICompressor compressor);

	public boolean delete(Bin bin, ICompressor compressor);

	public boolean delete(Bin[] bins, ICompressor compressor);
}
