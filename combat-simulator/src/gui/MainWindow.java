package gui;


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import combatSimulations.*;

public class MainWindow extends JFrame implements KeyListener{
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
	
	public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
        	resetWindow();
        	loadMainMenu();
        }
    }
	
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}	
	
	private void loadCombatSimulationOne(){	
		//reset window gui elements
		resetWindow();
		//sim one
		JButton oneVersusOneButton = new JButton("Load Simulation One");	
		oneVersusOneButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CombatSimulationResultsStruct data = CombatSimulationOne.oneVersusOne(100, 3, 3, 3);
				System.out.println(data.numberOfAttackerWins + " " + data.numberOfDefenderWins + " " + data.numberOfDefenderDodges);
			}
		});
		
		buttons.add(oneVersusOneButton);
		
		render();
	}
	
	private void loadCombatSimulationTwo(){
		CombatSimulationResultsStruct data = CombatSimulatorTwo.oneVersusOne(100000, 4, 4);
		CombatSimulationResultsStruct data2 = CombatSimulatorTwo.oneVersusOne(100000, 3, 3);
		CombatSimulationResultsStruct data3 = CombatSimulatorTwo.oneVersusOne(100000, 2, 2);
		CombatSimulationResultsStruct data4 = CombatSimulatorTwo.oneVersusOne(100000, 1, 1);
		
		System.out.println("4 attacker % " + data.percentAttackerWins + " defender % " + data.percentDefenderWins);
		System.out.println("3 attacker % " + data2.percentAttackerWins + " defender % " + data2.percentDefenderWins);
		System.out.println("2 attacker % " + data3.percentAttackerWins + " defender % " + data3.percentDefenderWins);
		System.out.println("1 attacker % " + data4.percentAttackerWins + " defender % " + data4.percentDefenderWins);
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
		for(JButton oldButton: buttons){
			remove(oldButton);
		}
		
		for(JLabel oldLabel: labels){
			remove(oldLabel);
		}
		
		buttons = new ArrayList<JButton>();
		labels = new ArrayList<JLabel>();
	}
}
