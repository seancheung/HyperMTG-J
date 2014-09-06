/**
 * 
 */
package com.mtg.core.common;

/**
 * @author Sean
 *
 */
public enum Color {

	Red(0, "Red", "R"), Blue(1, "Blue", "U"), Green(2, "Green", "G"), Black(3,
			"Black", "B"), White(4, "White", "W"), Colorless(5, "Colorless",
			"C");

	private String name;
	private int index;
	private String code;

	private Color(int index, String name, String code) {
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
	 * Get Color by its index
	 * 
	 * @param index
	 * @return
	 */
	public static Color getColor(int index) {
		for (Color color : Color.values()) {
			if (color.getIndex() == index) {
				return color;
			}
		}
		return null;
	}

	/**
	 * Get Color by its ColorCode
	 * 
	 * @param code
	 * @return
	 */
	public static Color getColor(String code) {
		for (Color color : Color.values()) {
			if (color.getCode() == code) {
				return color;
			}
		}
		return null;
	}
}
