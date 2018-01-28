package combatSimulations;

public class CombatSimulationResultsStruct {
	public int numberOfAttackerWins;
	public int numberOfDefenderWins;
	public int numberOfDefenderDodges;
	public float percentAttackerWins;
	public float percentDefenderWins;
	public float percentDefenderDodges;
	
	public CombatSimulationResultsStruct(){
		numberOfAttackerWins = 0;
		numberOfDefenderWins = 0;
		numberOfDefenderDodges = 0;
		percentAttackerWins = 0;
		percentDefenderWins = 0;
		percentDefenderDodges = 0;
	}
}
