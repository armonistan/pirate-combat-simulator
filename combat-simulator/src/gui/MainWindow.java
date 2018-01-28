package gui;

import java.awt.Button;
import java.awt.Label;
import java.util.ArrayList;

import javax.swing.JFrame;

import combatSimulations.CombatSimulationOne;
import combatSimulations.CombatSimulationResultsStruct;

public class MainWindow extends JFrame{
	private ArrayList<Button> buttons;
	private ArrayList<Label> labels;
	
	public MainWindow(){
		setSize(500,500);
		setTitle("Pirates Combat Sim 0.0.1");
		setVisible(true);
		loadCombatSimulationOne();
	}
	
	private void loadCombatSimulationOne(){	
		CombatSimulationResultsStruct data = CombatSimulationOne.oneVersusOne(100, 3, 3, 3);
		
		System.out.println(data.numberOfAttackerWins + " " + data.numberOfDefenderWins + " " + data.numberOfDefenderDodges);
	}
}
