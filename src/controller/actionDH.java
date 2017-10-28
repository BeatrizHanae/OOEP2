package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.DH_simulacao;

public class actionDH implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		DH_simulacao DH1 = new DH_simulacao();
		DH1.setVisible(true);
	
	}
};
