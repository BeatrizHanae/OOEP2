package view;

import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class FluxoPotenciaF_simulacao {
	
	private JPanel painelFPF;
	

	public FluxoPotenciaF_simulacao(JFrame telaInicial) throws IOException{
		
		criaPainelFluxoPF(telaInicial);
	}
	
	public void criaPainelFluxoPF(JFrame telaInicial) throws IOException {
		
		painelFPF = new JPanel();
		painelFPF.setLayout(null);
		painelFPF.setLocation((telaInicial.getWidth()-painelFPF.getWidth())/2,(telaInicial.getHeight()-painelFPF.getHeight())/2);
		
		telaInicial.setTitle("APRENDA QEE! - Fluxo de Potência Fundamental");
		telaInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		telaInicial.setBounds(100, 100, 450, 300);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(36, 70, 75, 16);
		painelFPF.add(lblAmplitude);
		
		JLabel lblAnguloDeFases = new JLabel("Ângulo de fases:");
		lblAnguloDeFases.setBounds(36, 94, 105, 16);
		painelFPF.add(lblAnguloDeFases);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 66, 61, 27);
		painelFPF.add(comboBox);
		
		JButton btnSimular = new JButton("SIMULAR");
		btnSimular.setBounds(234, 326, 117, 29);
		painelFPF.add(btnSimular);
		
		JLabel lblFluxoDePotncia = new JLabel("FLUXO DE POTÊNCIA FUNDAMENTAL");
		lblFluxoDePotncia.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoDePotncia.setBounds(214, 16, 256, 16);
		painelFPF.add(lblFluxoDePotncia);
		
		JLabel lblTenso = new JLabel("Tensão");
		lblTenso.setBounds(26, 45, 61, 16);
		painelFPF.add(lblTenso);
		
		JLabel lblCorrente = new JLabel("Corrente");
		lblCorrente.setBounds(26, 126, 75, 16);
		painelFPF.add(lblCorrente);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(153, 90, 61, 27);
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		painelFPF.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(153, 169, 61, 27);
		painelFPF.add(comboBox_2);
		
		JLabel label = new JLabel("Amplitude:");
		label.setBounds(36, 149, 75, 16);
		painelFPF.add(label);
		
		JLabel label_1 = new JLabel("Ângulo de fases:");
		label_1.setBounds(36, 173, 105, 16);
		painelFPF.add(label_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(153, 145, 61, 27);
		painelFPF.add(comboBox_3);
	}
}
