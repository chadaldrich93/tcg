package com.tcg.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class HealingEffect extends Effect{

	public static final int ALL_DAMAGE = 1000;
	public static final boolean REQUIRES_ENERGY = true;
	public static final boolean REQUIRES_DAMAGE = true;
	public static final double HALF_DAMAGE_DONE = 0.5;
	public static final double ALL_DAMAGE_DONE = 1;
	
	private final int healingAmount;
	private final double healingRatio;
	private final boolean requiresDamageInflictionToHeal;
	private final boolean requiresEnergyRemoval;
	
	//this signature refers to Moves that heal proportional to damage done
	//ex Absorb, Mega Drain, Leech Life
	public HealingEffect(double healingRatio) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.healingRatio = healingRatio;
		this.healingAmount = Effect.INT_NOT_USED;
		this.requiresDamageInflictionToHeal = BOOL_NOT_USED;
		this.requiresEnergyRemoval = BOOL_NOT_USED;
	}
	
	//signature refers only to the Move: Leech Seed, always heals 10
	//requires damage infliction to take affect
	public HealingEffect(boolean requiresDamageInflictionToHeal) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.healingAmount = 10;
		this.requiresDamageInflictionToHeal = REQUIRES_DAMAGE;
		this.healingRatio = Effect.INT_NOT_USED;
		this.requiresEnergyRemoval = BOOL_NOT_USED;
	}
	
	//signature refers only to Move: Spacing Out
	public HealingEffect() {
		super(Effect.Target.SELF, FLIP_COIN);
		this.healingAmount = 10;
		this.requiresDamageInflictionToHeal = BOOL_NOT_USED;
		this.healingRatio = Effect.INT_NOT_USED;
		this.requiresEnergyRemoval = BOOL_NOT_USED;
	}
	
	//takes unused amount variable to distinguish method signature
	//signature refers to Recover, which heals all damage always
	public HealingEffect(int amount, boolean requiresEnergyRemoval) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.healingAmount = HealingEffect.ALL_DAMAGE;
		this.requiresDamageInflictionToHeal = BOOL_NOT_USED;
		this.healingRatio = Effect.INT_NOT_USED;
		this.requiresEnergyRemoval = requiresEnergyRemoval;
	}
	
	public final HealingEffect recoverAll = new HealingEffect(
			                                  HealingEffect.ALL_DAMAGE, 
			                                  REQUIRES_ENERGY);
	
	public final HealingEffect healHalfDamageDone = new HealingEffect(
			                                     HealingEffect.HALF_DAMAGE_DONE);
			                                               
	public final HealingEffect healAllDamageDone = new HealingEffect(
                                                HealingEffect.ALL_DAMAGE_DONE);  
	
	public final HealingEffect healIfDamageDone = new HealingEffect(
			                              HealingEffect.REQUIRES_DAMAGE);
			                              
	public final HealingEffect rngBasedHeal = new HealingEffect(
			                                        Effect.FLIP_COIN);
}
