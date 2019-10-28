package com.tcg.models;

public class InaccurateAttackEffect extends Effect{

	public static final boolean HITS_INDEFINITELY = true;
	public static final boolean HITS_PER_ENERGY = true;
	
	private final int numberOfHits;
	private final boolean hitsPerEnergy;
	private final boolean hitsIndefinitely;
	
	//signature for attacks that hit once, and require coin flip
	//to damage
	public InaccurateAttackEffect() {
		super(Effect.Target.OPPONENT, Effect.FLIP_COIN);
		this.numberOfHits = 1;
		this.hitsPerEnergy = Effect.BOOL_NOT_USED;
		this.hitsIndefinitely = Effect.BOOL_NOT_USED;
	}
	
	//signature refers to many multi hit moves where each hit
	//is determined by a coin flip
	public InaccurateAttackEffect(int numberOfHits) {
		super(Effect.Target.OPPONENT, Effect.FLIP_COIN);
		this.numberOfHits = numberOfHits;
		this.hitsPerEnergy = Effect.BOOL_NOT_USED;
		this.hitsIndefinitely = Effect.BOOL_NOT_USED;
	}
	
	//signature refers only to Stone Barrage
	public InaccurateAttackEffect(boolean hitsIndefinitely) {
		super(Effect.Target.OPPONENT, Effect.FLIP_COIN);
		this.numberOfHits = Effect.INT_NOT_USED;
		this.hitsIndefinitely = hitsIndefinitely;
		this.hitsPerEnergy = Effect.BOOL_NOT_USED;
	}
	
	//signature refers only to Big Eggsplosion
	public InaccurateAttackEffect(boolean hitsIndefinitely, 
			                      boolean hitsPerEnergy) {
		super(Effect.Target.OPPONENT, Effect.FLIP_COIN);
		this.numberOfHits = Effect.INT_NOT_USED;
		this.hitsIndefinitely = hitsIndefinitely;
		this.hitsPerEnergy = hitsPerEnergy;
	}
	
	public final InaccurateAttackEffect hitsOnce = new InaccurateAttackEffect();
	public final InaccurateAttackEffect hitsTwice = new InaccurateAttackEffect(2);
	public final InaccurateAttackEffect hitsThrice = new InaccurateAttackEffect(3);
	public final InaccurateAttackEffect hitsQuad = new InaccurateAttackEffect(4);
	
	public final InaccurateAttackEffect hitUntilTails =
			                             new InaccurateAttackEffect(HITS_INDEFINITELY);
	
	public final InaccurateAttackEffect hitPerEnergy = 
			                                 new InaccurateAttackEffect(HITS_INDEFINITELY,
			                                		 HITS_PER_ENERGY);
}
