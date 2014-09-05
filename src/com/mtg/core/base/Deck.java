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

	public String Comment;

	public String Name;

	public Format Format;

	public Mode Mode;

	public ObservableList<Card> MainBoard;

	public ObservableList<Card> SideBoard;

	public Deck() {
		Name = "";
		MainBoard = FXCollections.emptyObservableList();
		SideBoard = FXCollections.emptyObservableList();
		Comment = "";
		Format = Format.Default;
		Mode = Mode.Default;
	}
}
