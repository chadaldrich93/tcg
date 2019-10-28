package com.tcg.models;

public class DamageBoostEffect extends Effect{

	public static enum DamageBoostCondition{ENERGY, SELFENERGY, DAMAGE, SELFDAMAGE, 
        BENCH, NIDOKING}


    private final int damageAmount;
    private final double damageRatio;
    private final boolean boostBySelfDamage;
    private final boolean boostByOpponentsDamage;
    private final boolean boostByBenchSize;
    private final boolean boostByNidokings;
    private final boolean damageChangeIsStored;
    
    //public DamageBoostEffect(int damageAmount, )
}
