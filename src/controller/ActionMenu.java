package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ActionMenu implements ActionListener {
		
		private JFrame telaInicial;
		
		public ActionMenu(JFrame telaInicial) {
			this.telaInicial = telaInicial;
		}
		
		public void actionPerformed(ActionEvent e) {
			painelInicial.setVisible(false);
		}

};
