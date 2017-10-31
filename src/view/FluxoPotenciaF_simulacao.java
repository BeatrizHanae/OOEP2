package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class FPF_simulacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FPF_simulacao frame = new FPF_simulacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FPF_simulacao() {
		setTitle("APRENDA QEE! - Fluxo de Potência Fundamental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(26, 54, 75, 16);
		contentPane.add(lblAmplitude);
		
		JLabel lblAnguloDeFases = new JLabel("Ângulo de fases:");
		lblAnguloDeFases.setBounds(26, 148, 105, 16);
		contentPane.add(lblAnguloDeFases);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(109, 78, 52, 27);
		contentPane.add(comboBox);
		
		JButton btnSimular = new JButton("SIMULAR");
		btnSimular.setBounds(26, 231, 117, 29);
		contentPane.add(btnSimular);
		
		JLabel lblFluxoDePotncia = new JLabel("FLUXO DE POTÊNCIA FUNDAMENTAL");
		lblFluxoDePotncia.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoDePotncia.setBounds(97, 16, 256, 16);
		contentPane.add(lblFluxoDePotncia);
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(36, 82, 61, 16);
		contentPane.add(lblTenso);
		
		JLabel lblCorrente = new JLabel("Corrente");
		lblCorrente.setBounds(36, 110, 75, 16);
		contentPane.add(lblCorrente);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(109, 109, 61, 27);
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(64, 176, 52, 27);
		contentPane.add(comboBox_2);
	}
}
