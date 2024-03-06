package com.chetan.gamblingsimulator;

public class GamblingSimulator {
	
	
	private static final int EVERY_DAY_STAKE = 100;
	private static final int PER_GAME_STAKE = 1;
	
	public static void gameStatus()
	{
		System.out.println("Every Day Stake:"+EVERY_DAY_STAKE);
		System.out.println("Per Game Stake:"+PER_GAME_STAKE);
		
	}

	public static void main(String[] args) {
		
		System.out.println("Well Come to Gambling Simulator Project");
		
		gameStatus();
	}

}
