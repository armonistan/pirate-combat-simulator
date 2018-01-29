package gui;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import combatSimulations.*;

public class MainWindow extends JFrame{
	private ArrayList<JButton> buttons;
	private ArrayList<JLabel> labels;
	
	public MainWindow(){
		setSize(500,500);
		setTitle("Pirates Combat Sim 0.0.2");
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();
		loadMainMenu();
	}
	
	private void loadCombatSimulationOne(){	
		CombatSimulationResultsStruct data = CombatSimulationOne.oneVersusOne(100, 3, 3, 3);
		
		System.out.println(data.numberOfAttackerWins + " " + data.numberOfDefenderWins + " " + data.numberOfDefenderDodges);
	}
	
	private void loadCombatSimulationTwo(){
		CombatSimulationResultsStruct data = CombatSimulatorTwo.oneVersusOne(100, 3, 3);
		
		System.out.println(data.numberOfAttackerWins + " " + data.numberOfDefenderWins);
	}
	
	private void loadMainMenu(){
		//sim one
		JButton loadSimulationOneButton = new JButton("Load Simulation One");	
		loadSimulationOneButton.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        loadCombatSimulationOne();
		    }
		});
		//sim two 
		JButton loadSimulationTwoButton = new JButton("Load Simulation Two");	
		loadSimulationTwoButton.addActionListener( new ActionListener()
		{
		    public void actionPerformed(ActionEvent e)
		    {
		        loadCombatSimulationTwo();
		    }
		});
		
		buttons.add(loadSimulationOneButton);
		buttons.add(loadSimulationTwoButton);
		
		render();
	}
	
	private void render(){
		for(JButton newButton: buttons){
			add(newButton);
		}
		
		for(JLabel newLabel: labels){
			add(newLabel);
		}		
	}
	
	private void resetWindow(){
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();
	}
}
