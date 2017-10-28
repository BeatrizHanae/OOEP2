package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JFrame {

	private JPanel contentPane;
	private JButton FPF;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
			menu frame = new menu();
			frame.setVisible(true);
	}

	
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Bem vindo à  APRENDA QEE!");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblNewLabel.setBounds(40, 32, 208, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblEscolhaQualA = new JLabel("Escolha qual a simulação que deseja prosseguir:");
		lblEscolhaQualA.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscolhaQualA.setBounds(40, 60, 312, 16);
		contentPane.add(lblEscolhaQualA);
		
		JButton btnDistoroHarmnica = new JButton("DISTORÇÃO HARMÔNICA");
		btnDistoroHarmnica.setBounds(73, 159, 305, 29);
		contentPane.add(btnDistoroHarmnica);
		
		JButton btnFluxoDePotncia = new JButton("FLUXO DE POTÊNCIA FUNDAMENTAL");
		btnFluxoDePotncia.setBounds(73, 104, 305, 29);
		contentPane.add(btnFluxoDePotncia);
		
		JButton btnNewButton = new JButton("FLUXO DE POTÊNCIA HARMÔNICO");
		btnNewButton.setBounds(73, 214, 305, 29);
		contentPane.add(btnNewButton);
		
		
		
	}
}
