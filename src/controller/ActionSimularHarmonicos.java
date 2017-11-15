package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.ModelDistorcaoHarmonica;
import view.SimuladorHarmonico;

public class ActionSimularHarmonicos implements ActionListener{

	JFrame simuladorHarmonico;
	JPanel panel1, panel2, panel3, panel4, panel5, panel6;
	JComboBox parimpar;
	JSpinner numeroOrdem;
	ModelDistorcaoHarmonica botaoSimularHarmonicos;
	
	public ActionSimularHarmonicos(JFrame simuladorHarmonico,JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5,
			JPanel panel6, JComboBox parimpar, JSpinner numeroOrdem) {
		super();
		this.simuladorHarmonico = simuladorHarmonico;
		this.panel1 = panel1;
		this.panel2 = panel2;
		this.panel3 = panel3;
		this.panel4 = panel4;
		this.panel5 = panel5;
		this.panel6 = panel6;
		this.parimpar = parimpar;
		this.numeroOrdem = numeroOrdem;

	}
	
	public void actionPerformed(ActionEvent e) {
		
		SimuladorHarmonico telaSimuladorHarmonico = new SimuladorHarmonico();
		telaSimuladorHarmonico.setSize(1100,650);
		telaSimuladorHarmonico.setVisible(true);
		
		int numeroHarmonico = Integer.parseInt(numeroOrdem.getValue().toString());
		
		try{
			
			if(numeroHarmonico == 1){
				panel1.setVisible(true);
			} else if (numeroHarmonico == 2){
				panel1.setVisible(true);
				panel2.setVisible(true);
			} else if(numeroHarmonico == 3) {
				panel1.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(true);
			} else if(numeroHarmonico == 4) {
				panel1.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
			} else if(numeroHarmonico == 5) {
				panel1.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
				panel5.setVisible(true);
			} else if (numeroHarmonico == 6){
				panel1.setVisible(true);
				panel2.setVisible(true);
				panel3.setVisible(true);
				panel4.setVisible(true);
				panel5.setVisible(true);
				panel6.setVisible(true);
			}else if (numeroHarmonico >= 7 || numeroHarmonico < 0){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
		}catch(IllegalArgumentException e1) {
				JOptionPane.showMessageDialog(null, "O Número de Harmônicos deve estar entre 0 e 6");
			}
	}

}
