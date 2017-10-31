package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.FPF_simulacao;

public class ActionFPF implements ActionListener {
	
	private JFrame frameMenu;
	
	public ActionFPF (JFrame frameMenu) {
		this.frameMenu = frameMenu;
	}
	public void actionPerformed(ActionEvent e) {
		frameMenu.setVisible(false);
		FPF_simulacao telaFPF = new FPF_simulacao();
		telaFPF.setVisible(true);
	}
};
