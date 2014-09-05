/**
 * 
 */
package com.mtg.core.io;

import java.io.IOException;

/**
 * @author Sean
 *
 */
public interface ICompressor {

	/**
	 * 
	 * @return Type of the compressor
	 */
	public String getCompressorType();

	/**
	 * Compress target byte array
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public byte[] compress(byte[] data) throws IOException;

	/**
	 * Decompress target byte array with original length
	 * @param data
	 * @param length
	 * @return
	 * @throws IOException 
	 */
	public byte[] decompress(byte[] data, int length) throws IOException;

	/**
	 * Decompress target byte array with default length of 40960
	 * @param data
	 * @return
	 * @throws IOException 
	 */
	public byte[] decompress(byte[] data) throws IOException;
}
