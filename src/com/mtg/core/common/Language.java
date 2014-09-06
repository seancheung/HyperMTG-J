/**
 * 
 */
package com.mtg.core.common;

/**
 * @author Sean
 *
 */
public enum Language {

	English(0, "English", "en"), ChineseSimplified(1, "简体中文", "cn"), ChineseTraditional(
			2, "繁體中文", "tw"), German(3, "Deutsch", "de"), French(4,
			"Français", "fr"), Italian(5, "Italiano", "it"), Japanese(6, "日本語", "jp"), Korean(
			7, "한국어", "ko"), Portuguese(8, "Português", "pt"), Russian(
			9, "Русский", "ru"), Spanish(10, "Español", "es");

	private String name;
	private int index;
	private String code;

	private Language(int index, String name, String code) {
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
	 * Get language by its index
	 * 
	 * @param index
	 * @return
	 */
	public static Language getLanguage(int index) {

		for (Language lang : Language.values()) {
			if (lang.getIndex() == index) {
				return lang;
			}
		}
		return null;
	}

	/**
	 * Get language by its code
	 * 
	 * @param code
	 *            LangCode
	 * @return
	 */
	public static Language getLanguage(String code) {

		for (Language lang : Language.values()) {
			if (lang.getCode() == code) {
				return lang;
			}
		}
		return null;
	}
}
