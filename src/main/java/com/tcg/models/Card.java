package com.tcg.models;

import lombok.Data;

@Data
public class Card {
    public static enum Category{ POKEMON, ENERGY, TRAINER}; 
    
    private final String name;
    private final Category category;
    
    public Card(String name, Category category) {
    	this.name = name;
    	this.category = category;
    }
    
    public static final Card fireEnergy = new Card("Fire_Energy", Category.ENERGY);
    public static final Card fightingEnergy = new Card("Fighting_Energy", Category.ENERGY);
    public static final Card waterEnergy = new Card("Water_Energy", Category.ENERGY);
    public static final Card grassEnergy = new Card("Grass_Energy", Category.ENERGY);
    public static final Card psychicEnergy = new Card("Psychic_Energy", Category.ENERGY);
    public static final Card electricEnergy = new Card("Electric_Energy", Category.ENERGY);
    public static final Card doubleColorlessEnergy = new Card("Double_Colorless_Energy",
    		                                             Category.ENERGY);
}
