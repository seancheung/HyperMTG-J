/**
 * 
 */
package com.mtg.core.common;

/**
 * @author Sean
 *
 */
public enum Rarity {

	Common(0, "Common", "C"), Uncommon(1, "Uncommon", "U"), Rare(2, "Rare", "R"), MythicRare(
			3, "Mythic Rare", "M");

	private String name;
	private int index;
	private String code;

	private Rarity(int index, String name, String code) {
		this.name = name;
		this.index = index;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public int getIndex() {
		return index;
	}

	/**
	 * Get Rarity by its index
	 * 
	 * @param index
	 * @return
	 */
	public static Rarity getRarity(int index) {
		for (Rarity rarity : Rarity.values()) {
			if (rarity.getIndex() == index) {
				return rarity;
			}
		}
		return null;
	}

	/**
	 * Get rarity by its RarityCode
	 * 
	 * @param code
	 * @return
	 */
	public static Rarity getRarity(String code) {
		for (Rarity rarity : Rarity.values()) {
			if (rarity.getCode() == code) {
				return rarity;
			}
		}
		return null;
	}
}
