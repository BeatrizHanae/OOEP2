package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.SimuladorHarmonico;


public class ActionSimularHarmonico implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		SimuladorHarmonico janela = new SimuladorHarmonico();
		janela.setVisible(true);
	}
}
	