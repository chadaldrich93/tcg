package com.tcg.models;

public class RecoilEffect extends Effect{

	public static final boolean ENTIRE_BP = true;
	
	private int recoilAmount;
	private boolean recoilIsEntireBP;
	
	public RecoilEffect(int recoilAmount) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.recoilAmount = recoilAmount;
		this.recoilIsEntireBP = Effect.BOOL_NOT_USED;
	}
	
	public RecoilEffect(int recoilAmount, boolean dependsOnCoinFlip) {
		super(Effect.Target.SELF, Effect.FLIP_COIN);
		this.recoilAmount = recoilAmount;
		this.recoilIsEntireBP = Effect.BOOL_NOT_USED;
	}
	
	public RecoilEffect(boolean recoilIsEntireBP) {
		super(Effect.Target.SELF, Effect.ALWAYS_HAPPENS);
		this.recoilAmount = Effect.INT_NOT_USED;
		this.recoilIsEntireBP = ENTIRE_BP;
	}
	
	public final RecoilEffect recoilOf10 = new RecoilEffect(10);
	public final RecoilEffect recoilOf20 = new RecoilEffect(20);
	public final RecoilEffect recoilOf30 = new RecoilEffect(30);
	public final RecoilEffect rngBasedRecoilOf10 = new RecoilEffect(10, 
			                                            Effect.FLIP_COIN);
	public final RecoilEffect rngBasedRecoilOf30 = new RecoilEffect(30,
			                                            Effect.FLIP_COIN);
	public final RecoilEffect recoilBasePower = new RecoilEffect(ENTIRE_BP);
	//add Thunderstorm later
}
