package com.tcg.models;

import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.tcg.models.Battler;
import com.tcg.models.Card;

@Data
@RequiredArgsConstructor
public class Player {

	//private boolean isHuman;
	private ArrayList<Card> deck;
	private ArrayList<Card> hand;
	private ArrayList<Battler> bench;
	private ArrayList<Card> prizes;
	private ArrayList<Card> discardPile;
	private Battler active;
	
	private boolean playsFirst;
	private boolean isHeadached;
	
	
	
}
