package com.tcg.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class StatusEffect extends Effect {

	public static enum Status{NONE, CONFUSION, POISON, TOXIC, PARALYSIS, 
		                      SLEEP, FAINTED, POWDERED, FOULED}
}
