package view;

import java.awt.Font;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import controller.ActionMenu;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class FluxoPotenciaF{
	
	private JPanel painelFPF;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public FluxoPotenciaF(JFrame telaInicial) throws IOException{
		
		criaPainelFluxoPF(telaInicial);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void criaPainelFluxoPF(JFrame telaInicial) throws IOException {
		
		painelFPF = new JPanel();
		painelFPF.setLayout(null);
		
		setTitle("APRENDA QEE! - Fluxo de Potência Fundamental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JLabel Amplitude = new JLabel("Amplitude:");
		Amplitude.setBounds(36, 77, 75, 16);
		painelFPF.add(Amplitude);
		
		JLabel AnguloDeFases = new JLabel("Ângulo de fases:");
		AnguloDeFases.setBounds(36, 105, 105, 16);
		painelFPF.add(AnguloDeFases);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(153, 73, 61, 27);
		painelFPF.add(comboBox);
		
		JButton Simular = new JButton("SIMULAR");
		Simular.setBounds(183, 492, 117, 29);
		painelFPF.add(Simular);
		
		JLabel lblFluxoDePotncia = new JLabel("FLUXO DE POTÊNCIA FUNDAMENTAL");
		lblFluxoDePotncia.setHorizontalAlignment(SwingConstants.CENTER);
		lblFluxoDePotncia.setBounds(290, 16, 256, 16);
		painelFPF.add(lblFluxoDePotncia);
		
		JLabel Tensao = new JLabel("Tensão");
		Tensao.setBounds(22, 50, 61, 16);
		painelFPF.add(Tensao);
		
		JLabel Corrente = new JLabel("Corrente");
		Corrente.setBounds(22, 181, 75, 16);
		painelFPF.add(Corrente);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(153, 101, 61, 27);
		comboBox_1.addItem("9");
		comboBox_1.addItem("10");
		comboBox_1.addItem("11");
		painelFPF.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(153, 233, 61, 27);
		painelFPF.add(comboBox_2);
		
		JLabel label = new JLabel("Amplitude:");
		label.setBounds(36, 209, 75, 16);
		painelFPF.add(label);
		
		JLabel label_1 = new JLabel("Ângulo de fases:");
		label_1.setBounds(36, 237, 105, 16);
		painelFPF.add(label_1);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(153, 204, 61, 27);
		painelFPF.add(comboBox_3);
		
		JButton SimularTenso = new JButton("Simular Tensão");
		SimularTenso.setBounds(46, 140, 131, 29);
		painelFPF.add(SimularTenso);
		
		JButton SimularCorrente = new JButton("Simular Corrente");
		SimularCorrente.setBounds(46, 272, 131, 29);
		painelFPF.add(SimularCorrente);
		
		JButton RetornarAoMenu = new JButton("RETORNAR AO MENU");
		RetornarAoMenu.setBounds(483, 492, 170, 29);
		painelFPF.add(RetornarAoMenu);
		
		telaInicial.getContentPane().add(painelFPF);
		
		JLabel lblPotnciaAtiva = new JLabel("Potência");
		lblPotnciaAtiva.setBounds(22, 313, 61, 16);
		painelFPF.add(lblPotnciaAtiva);
		
		JLabel lblPotnciaReativa = new JLabel("Reativa:");
		lblPotnciaReativa.setBounds(36, 366, 61, 16);
		painelFPF.add(lblPotnciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Aparente:");
		lblPotenciaAparente.setBounds(36, 394, 66, 16);
		painelFPF.add(lblPotenciaAparente);
		
		JLabel lblAtiva = new JLabel("Ativa:");
		lblAtiva.setBounds(36, 338, 52, 16);
		painelFPF.add(lblAtiva);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(106, 366, 130, 16);
		painelFPF.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(106, 338, 130, 16);
		painelFPF.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(106, 394, 130, 16);
		painelFPF.add(textField_2);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Potência");
		lblFatorDePotncia.setBounds(22, 433, 108, 16);
		painelFPF.add(lblFatorDePotncia);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(106, 454, 130, 26);
		painelFPF.add(textField_3);
		textField_3.setColumns(10);
		telaInicial.setVisible(true);
	}

	private void setBounds(int i, int j, int k, int l) {
		
	}

	private void setTitle(String string) {
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
	
		
	}
}
