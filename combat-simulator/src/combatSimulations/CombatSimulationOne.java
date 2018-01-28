/*
 * The initial draft of combat where losing defenders could dodge using maneuverability 
 */

package combatSimulations;

import java.util.ArrayList;
import util.DiceRoller;

public class CombatSimulationOne {
	public static CombatSimulationResultsStruct oneVersusOne(int numberOfTrials, int numberOfAttackerDice, int numberOfDefenderDice, int defenderManeuverability){
			CombatSimulationResultsStruct results = new CombatSimulationResultsStruct();
			int attackerRoll = 0;
			int defenderRoll = 0;
			int manuveriablityRoll = 0;
			
			for(int trialsDone = 0; trialsDone < numberOfTrials; trialsDone++){
				attackerRoll = DiceRoller.rollD6(numberOfAttackerDice);
				defenderRoll = DiceRoller.rollD6(numberOfDefenderDice);
				
				if(attackerRoll < defenderRoll){
					results.numberOfDefenderWins++;
				} else {	
					manuveriablityRoll = DiceRoller.rollD6(1);
					
					if(manuveriablityRoll > defenderManeuverability){
						results.numberOfDefenderDodges++;
					} else {
						results.numberOfAttackerWins++;
					}
				}
			}
			 
			results.percentAttackerWins = Math.round((results.numberOfAttackerWins/numberOfTrials)*100);
			results.percentDefenderWins = Math.round((results.numberOfDefenderWins/numberOfTrials)*100);
			results.percentDefenderDodges = Math.round((results.numberOfDefenderDodges/numberOfTrials)*100);
			
			return results;
		}
		
		public static ArrayList<CombatSimulationResultsStruct> tableResults(){
			ArrayList<CombatSimulationResultsStruct> results = new ArrayList<CombatSimulationResultsStruct>();
			
			return results;
		}
}
