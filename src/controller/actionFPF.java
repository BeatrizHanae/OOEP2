package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.FPF_simulacao;

public class actionFPF implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		FPF_simulacao FPF1 = new FPF_simulacao();
		FPF1.setVisible(true);
	
	}
};
