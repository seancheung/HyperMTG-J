/**
 * 
 */
package com.mtg.core.net;

/**
 * @author Sean
 *
 */
public interface IDownloader {

	/**
	 * Downlaod file from the provided url and store it to the provided path
	 * 
	 * @param url
	 * @param path
	 * @param maxTryTimes
	 */
	public void download(String url, String path, int maxTryTimes);

	/**
	 * Downlaod file from the provided url and store it to the provided path
	 * with default try times of 10
	 * 
	 * @param url
	 * @param path
	 */
	public void download(String url, String path);

	/**
	 * Download file into byte array
	 * 
	 * @param url
	 * @param maxTryTimes
	 * @return
	 */
	public byte[] download(String url, int maxTryTimes);

	/**
	 * Download file into byte array with default try times of 10
	 * 
	 * @param url
	 * @return
	 */
	public byte[] download(String url);
}
