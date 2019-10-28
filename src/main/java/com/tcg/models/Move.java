package com.tcg.models;

import java.util.ArrayList;

import lombok.Data;

import com.tcg.models.DamagingEffects;
import com.tcg.models.HealingEffects;
import com.tcg.models.StatusEffects;

@Data
public class Move {

	private final int[] energyCost;
	private final int basePower;
	
	//these patterns represent different energy costs
	//first index of array represents number of energy of same type
	//as user, second index represents number of colorless energy
	//a few rare moves will require a Psychic energy despite user
	//being non psychic, this will be indicated by negative value in 
	//first index
	//names will indicate the amounts, T for typed energy, C for colorless
	//P for psychic energy on non-psychic pokemon
	public static final int[] T = {1,0};
	public static final int[] C = {0,1};
	public static final int[] TT = {2,0};
	public static final int[] TC = {1,1};
	public static final int[] CC = {0,2};
	public static final int[] TTT = {3,0};
	public static final int[] TTC = {2,1};
	public static final int[] TCC = {1,2};
	public static final int[] CCC = {0,3};
	public static final int[] TTTT = {4,0};
	public static final int[] TTTC = {3,1};
	public static final int[] TTCC = {2,2};
	public static final int[] TCCC = {1,3};
	public static final int[] CCCC = {0,4};
	public static final int[] P = {-1,0};
	
	private final ArrayList<Effect> beforeDamage;
	private final ArrayList<Effect> afterDamage;
}
