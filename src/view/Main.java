package view;

import java.io.IOException;

import javax.swing.JFrame;


public class Main {
	public static void main(String [] args) throws IOException{
		JFrame telaInicial = new JFrame();
		telaInicial = new JFrame("APRENDER QEE!");
		telaInicial.setSize(1000, 1000);
		telaInicial.setLocationRelativeTo(null);
		telaInicial.setResizable(true);
		new Menu(telaInicial);
		
		
	}
}
