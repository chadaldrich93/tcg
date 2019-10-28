package com.tcg.models;

import lombok.Data;

@Data
public class Effect {
	
	public static enum Target{SELF, OPPONENT, RANDOMOPPONENT, RANDOM, 
		                      ALLBENCH, SELFBENCH}
	
	//public static final int CHAIN_LIGHTNING = -1;
	//public static final int LEEK_SLAP = 3;
	
	public static final boolean BOOL_NOT_USED = false;
	public static final boolean ALWAYS_HAPPENS = false;
	public static final boolean FLIP_COIN = true;
	public static final int INT_NOT_USED = -1;
	
	private final Target target;
	private final boolean requiresCoinFlip;
	
	public Effect(Target target) {
		this.requiresCoinFlip = ALWAYS_HAPPENS;
		this.target = target;
	}
	
	public Effect(Target target, boolean requiresCoinFlip) {
		this.target = target;
		this.requiresCoinFlip = FLIP_COIN;
	}
	
	//private final int removesEnergy;
	
	//private final boolean forcesSwitch; 
	//private final boolean returnsToHand;
	//private final boolean devolution;
	
	//these refer to effects that are rare/move specific
	//private final boolean opponentCantAttack;
	//number refers to move that is amnesia'd, 1 for m2, 2 for m2, 0 means none
	//3 means leek slap, which stays amnesia'd indefinitely, others last 1 turn
	//private final int amnesia;
	//private final boolean immuneToEffects;
	//involve drawing, card management
	//private final boolean drawsCard;
	//private final boolean scavenges;
	//private final boolean energyConversion;
	//for rearrange deck, negative numbers refer to opponents deck
	//positive numbers refer to own
	//private final int rearrangeDeck;
	//private final int discardDeck;
	//
	//private final boolean ignoresWeaknessResistance;
	//private final boolean callsFamily;
	//private final boolean callsFriend;
	//private final boolean mirrorsOpponent;
	//conversions
	//private final boolean conversion1;
	//private final boolean conversion2;
}
