package com.tcg.models;

public class DamageBenchEffect extends Effect{

	public static final boolean HITS_USER_BENCH = true;
	public static final boolean HITS_OPPONENT_BENCH = true;
	public static final int BLIZZARD_DAMAGE = 10;
	public static final int THUNDERSTORM_DAMAGE = 20;
	
	private final int damageAmount;
	private final int numberOfTargets;
	private boolean targetsUserBench;
	private boolean targetsOpponentBench;
	
	//signature refers to moves where a set number of battlers on the
	//opponents bench are targeted
	public DamageBenchEffect(int damageAmount, int numberOfTargets) {
		super(Effect.Target.OPPONENT, Effect.ALWAYS_HAPPENS);
		this.damageAmount = damageAmount;
		this.numberOfTargets = numberOfTargets;
		this.targetsUserBench = Effect.BOOL_NOT_USED;
		this.targetsOpponentBench = Effect.BOOL_NOT_USED;
	}
	
	//signature refers to self destruct effects, which target both
	//user and opponents bench
	public DamageBenchEffect(int damageAmount, boolean targetsUserBench, 
			                 boolean targetsOpponentBench) {
		super(Effect.Target.OPPONENT, Effect.ALWAYS_HAPPENS);
		this.damageAmount = damageAmount;
		this.numberOfTargets = Effect.INT_NOT_USED;
		this.targetsUserBench = HITS_USER_BENCH;
		this.targetsOpponentBench = HITS_OPPONENT_BENCH;
	}
	
	//signature refers only to Move Earthquake, which damages Users Bench
	public DamageBenchEffect(int damageAmount, boolean targetsUserBench) {
        super(Effect.Target.OPPONENT, Effect.ALWAYS_HAPPENS);
        this.damageAmount = damageAmount;
        this.numberOfTargets = Effect.INT_NOT_USED;
        this.targetsUserBench = HITS_USER_BENCH;
        this.targetsOpponentBench = Effect.BOOL_NOT_USED;
    }
	
	//signature refers only to move Blizzard, which targets either user
	//or opponents bench, depending on result of coin flip
	public DamageBenchEffect(boolean targetsUserBench, 
                             boolean targetsOpponentBench, 
                             boolean requiresCoinFlip) {
        super(Effect.Target.OPPONENT, Effect.FLIP_COIN);
        this.damageAmount = BLIZZARD_DAMAGE;
        this.numberOfTargets = Effect.INT_NOT_USED;
        this.targetsUserBench = HITS_USER_BENCH;
        this.targetsOpponentBench = HITS_OPPONENT_BENCH;
    }
	
	//refers only to move Thunderstorm, which targets users bench or self
	//depending on coin flip result
	public DamageBenchEffect() {
		super(Effect.Target.OPPONENT, Effect.FLIP_COIN);
		this.damageAmount = THUNDERSTORM_DAMAGE;
		this.numberOfTargets = Effect.INT_NOT_USED;
		this.targetsUserBench = HITS_USER_BENCH;
		this.targetsOpponentBench = HITS_OPPONENT_BENCH;
	}
}
