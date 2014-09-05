/**
 * 
 */
package com.mtg.core.base;

import java.sql.Date;

/**
 * @author Sean
 *
 */
public class Set {

	/**
	 * Last update time
	 */
	public Date LastUpdate;

	/**
	 * Whether this set is stored locally
	 */
	public boolean Local;

	/**
	 * Set code
	 */
	public String SetCode;

	/**
	 * Set name
	 */
	public String SetName;

	/**
	 * 
	 * @return Set full name e.g. 'Theros(THS)'
	 */
	public String getFullName() {

		return String.format("{0}({1})", SetName, SetCode);
	}
}
