package com.tcg.models;

public class PreviousDamageBoostEffect extends Effect{

	public static final boolean BOOST_SELF_DAMAGE = true;
	public static final boolean BOOST_OPPONENT_DAMAGE = true;
	
    private final boolean boostBySelfDamage;
	private final boolean boostByOpponentsDamage;
	   
	public PreviousDamageBoostEffect(boolean boostBySelfDamage) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.boostBySelfDamage = BOOST_SELF_DAMAGE;
		this.boostByOpponentsDamage = Effect.BOOL_NOT_USED;
	}
	
	public PreviousDamageBoostEffect(boolean boostBySelfDamage, 
			                         boolean boostByOpponentDamage) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.boostBySelfDamage = Effect.BOOL_NOT_USED;
		this.boostByOpponentsDamage = BOOST_OPPONENT_DAMAGE;
	}
	
}
