package com.chetan.gamblingsimulator;
import java.util.Random;
public class GamblingSimulator {
	
	
	private static final int EVERY_DAY_STAKE = 100;
	private static final int PER_GAME_STAKE = 1;
	
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	private static int winstack = 0;
	private static int loosestack = 0;
	
	
	public static void gameStatus()
	{
		System.out.println("Every Day Stake:"+EVERY_DAY_STAKE);
		System.out.println("Per Game Stake:"+PER_GAME_STAKE);
		System.out.println("winning stack:"+winstack);
		System.out.println("Loose Stack:"+loosestack);
		System.out.println("-----------------------------");
	}
	public static void playgame()
	{
		
		while(true) {
			gameStatus();	
		
		Random randam = new Random();
		int playstatus = randam.nextInt(9)%2;
	   
		System.out.println("Play status:"+playstatus);
		
		if(playstatus == LOOSE)
		{
			System.out.println("Loose");
			loosestack += 1;
		}
		else
		{
			System.out.println("Winning");
			winstack += 1;
		}
		if(winstack == EVERY_DAY_STAKE/2)
		{
			break;
		}
		if(loosestack == EVERY_DAY_STAKE/2)
		{
			break;
		}
		
	}  
	}

	public static void main(String[] args) {
		
		System.out.println("Well Come to Gambling Simulator Project");
		
		playgame();
		
	
	}

}
