package com.tcg.models;

public class EnergyDamageBoostEffect extends Effect{

	public static final boolean OPPONENTS_ENERGY_BOOST = true;
	public static final boolean WATER_ENERGY_BOOST = true;;
	
	private final boolean boostByOpponentsEnergy;
	private final boolean boostByWaterEnergy;
	
	public EnergyDamageBoostEffect(boolean boostByOpponentsEnergy) {
		super(Effect.Target.OPPONENT, Effect.ALWAYS_HAPPENS);
		this.boostByOpponentsEnergy = OPPONENTS_ENERGY_BOOST;
		this.boostByWaterEnergy = Effect.BOOL_NOT_USED;
	}
	
	public EnergyDamageBoostEffect(boolean boostByOpponentsEnergy,
			                       boolean boostByWaterEnergy) {
		super(Effect.Target.OPPONENT, Effect.ALWAYS_HAPPENS);
		this.boostByOpponentsEnergy = BOOL_NOT_USED;
		this.boostByWaterEnergy = WATER_ENERGY_BOOST;
	}
	
	public final EnergyDamageBoostEffect boostByEnergy = 
			         new EnergyDamageBoostEffect(OPPONENTS_ENERGY_BOOST);
	
	public final EnergyDamageBoostEffect boostByWater =
			         new EnergyDamageBoostEffect(Effect.BOOL_NOT_USED,
			        		                     WATER_ENERGY_BOOST);
}
