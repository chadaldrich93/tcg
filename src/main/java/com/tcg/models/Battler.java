package com.tcg.models;

import java.util.ArrayList;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.tcg.models.Card;
import com.tcg.models.Card.Category;
import com.tcg.models.Pokemon.Type;

@Data
@EqualsAndHashCode(callSuper=false)
public class Battler extends Pokemon{
    
	private static final int DAMAGE_IMMUNE = 1000;
	
	private int currentHP;
	private ArrayList<Card> energy;
	private ArrayList<Card> plusPowers;
	private ArrayList<Card> defenders;
	private boolean isAsleep;
	private boolean isParalyzed;
	private boolean isPoisoned;
	private boolean isToxiced;
	private boolean isConfused;
	private boolean isImmuneToEffects;
	private int damageProtected;
	//rare effects, often move specific
	private boolean isBonded;
	private boolean isTrapped;
	private Move underAmnesia;
	
	public Battler(String name, Category category, Type type, int baseHP, 
		       int retreatCost, int evolutionStage, Type weakness, 
		       Type resistance, Move m1, Move m2) {
	super(name, category, type, baseHP, retreatCost, evolutionStage,
		  weakness, resistance, m1, m2);
	}
	
	public int getEnergyAmount() {
		int amount = 0;
		for (Card c : this.getEnergy()) {
			if (c.getName() == "Double_Colorless_Energy") {
				amount += 2;
			}
			else {
				amount += 1;
			}
		}
		return amount;
	}
}
