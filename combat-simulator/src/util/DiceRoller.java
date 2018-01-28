package util;

public class DiceRoller {	
	public int rollD6(int numDiceToRoll){
		int rollTotal = 0;
		
		for(int diceRolled=0; diceRolled < numDiceToRoll; diceRolled++){
			int diceRoll = (int)(Math.random()*6)+1;
			
			rollTotal += diceRoll;
		}
		
		return rollTotal;
	}
}
