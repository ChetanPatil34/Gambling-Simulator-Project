package com.chetan.gamblingsimulator;
import java.util.Random;
public class GamblingSimulator {
	
	
	private static final int EVERY_DAY_STAKE = 100;
	private static final int PER_GAME_STAKE = 1;
	private static final int MONTH_DAYS = 20;
	
	private static final int WIN = 1;
	private static final int LOOSE = 0;
	
	
	
	private static final int[] winAmount = new int[20];
	private static final int[] looseAmount = new int[20];
	
	private static final int[] maxWin = new int[MONTH_DAYS];
	private static final int[] maxLoose = new int[MONTH_DAYS];
 	
	static int maxWon = 0;
	static int maxloss = 0;
	static int indexwin = 0;
	static int indexLoose = 0;
	private static int total_Win_day = 0;
	private static int total_Loose_day = 0;
	
	
	static int playstatus;
	
	public static void gameStatus()
	{
		System.out.println("Every Day Stake:"+EVERY_DAY_STAKE);
		System.out.println("Per Game Stake:"+PER_GAME_STAKE);
		
		
	}
	public static void playgame() 
	{
			
		
		for(int i=0; i<20; i++)
		{
			System.out.println("Day :" + (i+1));
			
		    
			int winstack = 0;
		    int loosestack = 0;
		
		while(true) {
			
			
		Random randam = new Random();
	    playstatus = randam.nextInt(9)%2;
	   
		//System.out.println("Play status:"+playstatus);
		
		if(playstatus == LOOSE)
		{
			//System.out.println("Loose");
			loosestack += 1;
		}
		else
		{
			//System.out.println("Winning");
			winstack += 1;
		}
		if(winstack == EVERY_DAY_STAKE/2)
		{
			total_Win_day += 1;
			
			if(loosestack < winstack)
			{
				maxWin[i] = winstack - loosestack;
				
				if(maxWon < maxLoose[i])
				{
					maxWon = maxLoose[i];
					indexwin =  i+1;
					
				}
				
			}
			
			
			break;
		}
		if(loosestack == EVERY_DAY_STAKE/2)
		{
			total_Loose_day += 1;
			
			if(maxloss < loosestack)
			{
				maxLoose[i] = loosestack - winstack;
				if(maxloss < maxLoose[i])
				{
					maxloss = maxLoose[i];
					indexLoose = i+1;
				}
			}
			  
			break;
		
		
	}  
		winAmount[i] = winstack;
	    looseAmount[i] = loosestack;
	    
	    System.out.println("winning stack = "+winstack);
	    System.out.println("loose stack = "+loosestack);
		System.out.println("-----------------------------");
		
		}
		System.out.println("Total win Day Month = " + total_Win_day );
		System.out.println(indexwin + "is the Lukiest Day, Won Rs : "+maxWon);
		System.out.println("Total Loose Day Month = " + total_Loose_day );
		System.out.println(indexLoose +"is the Unluckiest Day, Lost Rs : "+maxloss);
	}
	}

	public static void main(String[] args) {
		
		System.out.println("Well Come to Gambling Simulator Project");
		
		playgame();
		
	
	}

}
