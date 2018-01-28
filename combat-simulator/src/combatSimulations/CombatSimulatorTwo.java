package combatSimulations;

import java.util.ArrayList;

import util.DiceRoller;

public class CombatSimulatorTwo {
	public static CombatSimulationResultsStruct oneVersusOne(int numberOfTrials, int numberOfAttackerDice, int numberOfDefenderDice){
		CombatSimulationResultsStruct results = new CombatSimulationResultsStruct();
		int attackerRoll = 0;
		int defenderRoll = 0;
		
		for(int trialsDone = 0; trialsDone < numberOfTrials; trialsDone++){
			attackerRoll = DiceRoller.rollD6(numberOfAttackerDice);
			defenderRoll = DiceRoller.rollD6(numberOfDefenderDice);
			
			if(attackerRoll < defenderRoll){
				results.numberOfDefenderWins++;
			} else {	
				results.numberOfAttackerWins++;
			}
		}
		 
		results.percentAttackerWins = Math.round((results.numberOfAttackerWins/numberOfTrials)*100);
		results.percentDefenderWins = Math.round((results.numberOfDefenderWins/numberOfTrials)*100);
		
		return results;
	}
	
	public static ArrayList<CombatSimulationResultsStruct> tableResults(){
		ArrayList<CombatSimulationResultsStruct> results = new ArrayList<CombatSimulationResultsStruct>();
		
		return results;
	}
}
