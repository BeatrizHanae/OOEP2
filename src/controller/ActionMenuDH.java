package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.DistorcaoHarmonica;

public class ActionMenuDH implements ActionListener {
	
	private JPanel painelInicial;
	private JFrame telaInicial;
	
	public ActionMenuDH(JPanel painelInicial, JFrame telaInicial) {
		this.painelInicial = painelInicial;
		this.telaInicial = telaInicial;
	}
	
	public void actionPerformed(ActionEvent e) {
		
		painelInicial.setVisible(false);
		try {
			new DistorcaoHarmonica(telaInicial);
		} catch (IOException e1) {
			System.out.println("Arquivo txt inexistente");
		}
	}
};
