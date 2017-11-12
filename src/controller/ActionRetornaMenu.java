/*package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import view.Menu;
import view.MenuInicial;

public class ActionRetornaMenu implements ActionListener {

	private JPanel painelFPF;
	private JFrame telaInicial;
	
	public ActionRetornaMenu(JPanel painelFPF, JFrame telaInicial) {
		this.painelFPF = painelFPF;
		this.telaInicial = telaInicial;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		painelFPF.setVisible(false);
		try {
			MenuInicial menu = new MenuInicial(janela);
			menu.mostrarTela();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}*/
