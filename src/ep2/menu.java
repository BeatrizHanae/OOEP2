package ep2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class menu extends JFrame {

	private JPanel contentPane;
	private JTextField txtBemVindoa;
	private JTextField txtSeleciona;
	private JButton FPF;

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBemVindoa = new JTextField();
		txtBemVindoa.setText("Bem vindo à Aprender QEE");
		txtBemVindoa.setBounds(45, 42, 181, 19);
		contentPane.add(txtBemVindoa);
		txtBemVindoa.setColumns(10);
		
		txtSeleciona = new JTextField();
		txtSeleciona.setText("Escolha qual a simulação que deseja prosseguir:");
		txtSeleciona.setBounds(49, 50 , 181, 19);
		contentPane.add(txtSeleciona);
		txtSeleciona.setColumns(10);
		
		JButton FPF = new JButton("Fluxo De Potencia Fundamental");
		FPF.setBounds(60, 70 , 181 ,19);
		FPF.add(FPF);
		
		
		
	}
}
