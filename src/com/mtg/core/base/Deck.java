/**
 * 
 */
package com.mtg.core.base;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import com.mtg.core.common.Format;
import com.mtg.core.common.Mode;

;

/**
 * @author Sean
 *
 */
public class Deck {

	public String comment;

	public String name;

	public Format format;

	public Mode mode;

	public ObservableList<Card> mainBoard;

	public ObservableList<Card> sideBoard;

	public Deck() {
		name = "";
		mainBoard = FXCollections.emptyObservableList();
		sideBoard = FXCollections.emptyObservableList();
		comment = "";
		format = Format.Default;
		mode = Mode.Default;
	}
}
