package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.Menu;

public class ActionRetornaMenu implements ActionListener {

	private JPanel painelVolta;
	private JFrame telaInicial;
	
	public ActionRetornaMenu(JPanel painelVolta, JFrame telaInicial) {
		this.painelVolta = painelVolta;
		this.telaInicial = telaInicial;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		painelVolta.setVisible(false);
		try {
			new Menu(telaInicial);
		} catch (IOException e1) {
			System.out.println("Arquivo txt inexistente");
		}
	}

};
