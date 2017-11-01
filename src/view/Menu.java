package view;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import controller.ActionDH;
import controller.ActionMenu;

public class Menu {
	
	private JLabel lblNewLabel;
	private JPanel painelInicial;
	
	public Menu(JFrame telaInicial) throws IOException{
		
		criaPainelInicial(telaInicial);

	}

	
	public void criaPainelInicial(JFrame telaInicial) throws IOException{
		
		
		painelInicial = new JPanel();
		painelInicial.setLayout(null);
		painelInicial.setLocation((telaInicial.getWidth()-painelInicial.getWidth())/2,(telaInicial.getHeight()-painelInicial.getHeight())/2);
		
		setTitle("APRENDA QEE!");
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		lblNewLabel = new JLabel("Bem vindo à  APRENDA QEE!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(40, 32, 208, 16);
		painelInicial.add(lblNewLabel);
		
		JLabel lblEscolhaQualA = new JLabel("Escolha qual a simulação que deseja prosseguir:");
		lblEscolhaQualA.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaQualA.setBounds(40, 60, 312, 16);
		painelInicial.add(lblEscolhaQualA);
		
		JButton btnDistoroHarmnica = new JButton("DISTORÇÃO HARMÔNICA");
		btnDistoroHarmnica.addActionListener(new ActionDH(telaInicial));
		btnDistoroHarmnica.setBounds(73, 159, 305, 29);
		telaInicial.getContentPane().add(painelInicial);
		painelInicial.add(btnDistoroHarmnica);
		
		JButton btnFluxoDePotncia = new JButton("FLUXO DE POTÊNCIA FUNDAMENTAL");
		btnFluxoDePotncia.addActionListener(new ActionMenu(telaInicial));
		btnFluxoDePotncia.setBounds(73, 104, 305, 29);
		telaInicial.getContentPane().add(painelInicial);
		painelInicial.add(btnFluxoDePotncia);
		
		JButton btnNewButton = new JButton("FLUXO DE POTÊNCIA HARMÔNICO");
		btnNewButton.setBounds(73, 214, 305, 29);
		telaInicial.getContentPane().add(painelInicial);
		painelInicial.add(btnNewButton);
		
		telaInicial.setVisible(true);
		
	}

	private void setBounds(int i, int j, int k, int l) {
	}

	private void setTitle(String string) {	
	}
}
