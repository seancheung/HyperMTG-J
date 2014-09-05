/**
 * 
 */
package com.mtg.core.io.compressor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import com.mtg.core.io.ICompressor;

/**
 * @author Sean
 *
 */
public class GZip implements ICompressor {

	@Override
	public String getCompressorType() {

		return "GZip";
	}

	@Override
	public byte[] compress(byte[] data) throws IOException {

		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		GZIPOutputStream gzip = new GZIPOutputStream(stream);
		gzip.write(data);
		gzip.close();
		return stream.toByteArray();
	}

	@Override
	public byte[] decompress(byte[] data, int length) throws IOException {

		ByteArrayOutputStream streamOut = new ByteArrayOutputStream();
		ByteArrayInputStream streamIn = new ByteArrayInputStream(data);
		GZIPInputStream gzip = new GZIPInputStream(streamIn);
		byte[] buffer = new byte[length];
		int n;
		while ((n = gzip.read(buffer)) >= 0) {

			streamOut.write(buffer, 0, n);
		}

		return streamOut.toByteArray();
	}

	@Override
	public byte[] decompress(byte[] data) throws IOException {

		return decompress(data, 40960);
	}

}
