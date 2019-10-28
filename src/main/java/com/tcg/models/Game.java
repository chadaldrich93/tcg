package com.tcg.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import com.tcg.models.Card.Category;
import com.tcg.models.Pokemon;

@Data
@RequiredArgsConstructor
public class Game {
    
	public static final int CARD_LIMIT = 4;
	public static final int NO_ENERGY = 0;
	public static final int VALID_DECK_SIZE = 60;
	
	private Player p1;
	private Player p2;
	private int turn = 0;
	private boolean hasWinner = false;
	
	
	//temporary field effects
	private boolean currentMatchupCantAttack;
	private int currentMatchupDamageReduction;
	
	public static boolean validateDeck(ArrayList<Card> deck) {
		if (deck.size() != VALID_DECK_SIZE) {
			return false;
		}
		if (!deckHasBasicPokemon(deck)) {
			return false;
		}
		if (!deckHasValidCopyNumber(deck)) {
			return false;
		}
		return true;
	}
	
	public void manageSwitch(Battler switcher, boolean isRetreat) {
		
	}
	
	//private helper functions
	private static HashMap<String, Integer> countCards(ArrayList<Card> deck){
		HashMap<String, Integer> cardCounts = new HashMap<>();
		for (Card c: deck) {
			Integer count = cardCounts.get(c.getName());
			if (count != null) {
				count++;
			}
			else {
				cardCounts.put(c.getName(), 1);
			}
		}
		return cardCounts;
	}
	
	private static boolean deckHasValidCopyNumber(ArrayList<Card> deck) {
		HashMap<String, Integer> cardCounts = countCards(deck);
		for (Map.Entry<String, Integer> entry : cardCounts.entrySet()) {
			if (entry.getValue() > CARD_LIMIT) {
				String name = entry.getKey();
				if (name != "Psychic_Energy" && name != "Grass_Energy" &&
					name != "Water_Energy" && name != "Fire_Energy" &&
					name != "Fighting_Energy" && name!= "Electric_Energy") {
					return false;
				}
			}
		}
		return true;
	}
	
	private static boolean deckHasBasicPokemon(ArrayList<Card> deck) {
		for (Card c : deck) {
			if (c.getCategory() == Category.POKEMON) {
				if ( ((Pokemon)c).getEvolutionStage() == 1) {
					return true;
				}
			}
		}
		return false;
	}
	
	private boolean flipCoin() {
		
	}
	
	private boolean benchIsEmpty(Player target) {
		return target.getBench().size() == 0;
	}
	
	private boolean hurtByConfusion(Battler confused) {
		if (flipCoin()) {
			return false;
		}
		int currentHP = confused.getCurrentHP();
		int newHP = currentHP-20;
		confused.setCurrentHP(newHP);
		return true;
	}
	
	private Battler getActiveBattler() {
		if ( (this.turn % 2) == 1) {
			return this.p1.getActive();
		}
		return this.p2.getActive();
	}
	
	//returns true if retreat is successful, false otherwise
	private boolean manageRetreatCost(Player controller, Battler retreating) {
		int remainingCost = retreating.getRetreatCost();
		if (getEnergyAmount(retreating) < remainingCost) {
			return false;
		}
		else {
			while (remainingCost != 0) {
				
			}
		}
	}
	
	//returns amount of energy discarded, 2 for double colorless, one otherwise
	private int discardAttachedEnergy(Player controller, Battler possessor, 
			                           Card energy) {
		if (possessor.getEnergy().size() == 0) {
			return NO_ENERGY;
		}
		possessor.getEnergy().remove(energy);
		controller.getDiscardPile().add(energy);
		if (energy.getName() == "Double_Colorless_Energy") {
			return 2;
		}
		return 1;
	}
	
}
