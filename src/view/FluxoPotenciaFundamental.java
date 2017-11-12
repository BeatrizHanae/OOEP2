package view;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import controller.ActionCorrente;
import controller.ActionTensao;

import javax.swing.JTextField;


public class FluxoPotenciaFundamental{
	
	private JPanel painelFPF;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	public FluxoPotenciaFundamental(JFrame telaInicial) throws IOException{
		criaPainelFluxoFundamental(telaInicial);
	}
	

	public void criaPainelFluxoFundamental(JFrame telaInicial) throws IOException {
		
		painelFPF = new JPanel();
		
		setTitle("APRENDA QEE! - Fluxo de Potência Fundamental");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		telaInicial.setContentPane(painelFPF);
		painelFPF.setLayout(null);
		
		JLabel labelFluxoDePotencia = new JLabel("FLUXO DE POTÊNCIA FUNDAMENTAL");
		labelFluxoDePotencia.setBounds(384, 6, 231, 16);
		labelFluxoDePotencia.setHorizontalAlignment(SwingConstants.CENTER);
		painelFPF.add(labelFluxoDePotencia);
		
		JButton botaoSimular = new JButton("SIMULAR");
		botaoSimular.setBounds(832, 613, 117, 29);
		painelFPF.add(botaoSimular);
		
		JButton botaoRetornarAoMenu = new JButton("RETORNAR AO MENU");
		botaoRetornarAoMenu.setBounds(806, 643, 176, 29);
		painelFPF.add(botaoRetornarAoMenu);
		
		JPanel panelTensao = new JPanel();
		panelTensao.setBounds(17, 26, 742, 210);
		painelFPF.add(panelTensao);
		setContentPane(panelTensao);
		panelTensao.setLayout(null);
		
		JLabel Amplitude = new JLabel("Amplitude:");
		Amplitude.setBounds(24, 25, 69, 16);
		panelTensao.add(Amplitude);
		
		JLabel Tensao = new JLabel("Tensão");
		Tensao.setBounds(6, 6, 45, 16);
		panelTensao.add(Tensao);
		
		JLabel AnguloDeFases = new JLabel("Ângulo de fases:");
		AnguloDeFases.setBounds(24, 53, 105, 16);
		panelTensao.add(AnguloDeFases);
		
		JSpinner amplitude1 = new JSpinner();
		amplitude1.setBounds(147, 20, 33, 26);
		panelTensao.add(amplitude1);
		
		JSpinner angulo1 = new JSpinner();
		angulo1.setBounds(147, 48, 33, 26);
		panelTensao.add(angulo1);
		
		JPanel panelGrafico1 = new JPanel();
		panelGrafico1.setBounds(212, 6, 507, 198);;
		
		List <Double> Lista1 = new ArrayList<>();
		
		panelGrafico1.setLayout(new GridLayout(0,1,0,0));
		panelTensao.add(panelGrafico1);
		
		GraphPanel grafico1 = new GraphPanel(Lista1);
		panelGrafico1.add(grafico1);
		grafico1.setLayout(null);
		
		JButton botaoSimularTensao = new JButton("Simular Tensão");
		botaoSimularTensao.setBounds(24, 175, 140, 29);
		botaoSimularTensao.setActionCommand("Simular Tensão");
		botaoSimularTensao.addActionListener(new ActionTensao(amplitude1, angulo1, grafico1, Lista1, panelTensao, painelFPF, telaInicial));
		panelTensao.add(botaoSimularTensao);
		
		JPanel panelCorrente = new JPanel();
		panelCorrente.setBounds(17, 237, 742, 207);
		painelFPF.add(panelCorrente);
		panelCorrente.setLayout(null);
		setContentPane(panelCorrente);
		
		JLabel labelAmplitude = new JLabel("Amplitude:");
		labelAmplitude.setBounds(26, 32, 69, 16);
		panelCorrente.add(labelAmplitude);
		
		JLabel labelAngulo = new JLabel("Ângulo de fases:");
		labelAngulo.setBounds(26, 60, 149, 16);
		panelCorrente.add(labelAngulo);
		
		JLabel Corrente = new JLabel("Corrente");
		Corrente.setBounds(6, 6, 54, 16);
		panelCorrente.add(Corrente);
		
		JSpinner amplitude2 = new JSpinner();
		amplitude2.setBounds(155, 27, 33, 26);
		panelCorrente.add(amplitude2);
		
		JSpinner angulo2 = new JSpinner();
		angulo2.setBounds(155, 55, 33, 26);
		panelCorrente.add(angulo2);
		
		JPanel panelGrafico2 = new JPanel();
		panelGrafico2.setBounds(212, 6, 512, 195);;
		
		List <Double> Lista2 = new ArrayList<>();
		
		panelGrafico2.setLayout(new GridLayout(0,1,0,0));
		panelCorrente.add(panelGrafico2);
		
		GraphPanel grafico2 = new GraphPanel(Lista2);
		panelGrafico2.add(grafico2);
		grafico2.setLayout(null);
		
		JButton botaoSimularCorrente = new JButton("Simular Corrente");
		botaoSimularCorrente.setBounds(26, 172, 149, 29);
		botaoSimularCorrente.setActionCommand("Simular Corrente");
		botaoSimularCorrente.addActionListener(new ActionCorrente(amplitude2,angulo2,grafico2, Lista2,panelCorrente,painelFPF,telaInicial));
		panelCorrente.add(botaoSimularCorrente);
		
		JPanel panelResultado = new JPanel();
		panelResultado.setBounds(17, 448, 742, 210);
		painelFPF.add(panelResultado);
		setContentPane(panelResultado);
		panelResultado.setLayout(null);
	
		JLabel labelPotenciaReativa = new JLabel("Reativa:");
		labelPotenciaReativa.setBounds(28, 42, 61, 16);
		panelResultado.add(labelPotenciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Aparente:");
		lblPotenciaAparente.setBounds(28, 98, 66, 16);
		panelResultado.add(lblPotenciaAparente);
		
		JLabel lblAtiva = new JLabel("Ativa:");
		lblAtiva.setBounds(28, 70, 52, 16);
		panelResultado.add(lblAtiva);
		
		JLabel FatorDePotncia = new JLabel("Fator de Potência");
		FatorDePotncia.setBounds(28, 126, 108, 16);
		panelResultado.add(FatorDePotncia);
		
		JLabel lblPotnciaAtiva = new JLabel("Potência");
		lblPotnciaAtiva.setBounds(6, 11, 61, 16);
		panelResultado.add(lblPotnciaAtiva);
		
		textField = new JTextField();
		textField.setBounds(101, 42, 99, 16);
		textField.setEditable(false);
		textField.setColumns(10);
		panelResultado.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 70, 99, 16);
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		panelResultado.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 98, 99, 16);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		panelResultado.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(38, 154, 130, 26);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		panelResultado.add(textField_3);
		
		JPanel panelGrafico3 = new JPanel();
		panelGrafico3.setBounds(212, 6, 507, 198);;
		
		List <Double> Lista3 = new ArrayList<>();
		
		panelGrafico3.setLayout(new GridLayout(0,1,0,0));
		panelResultado.add(panelGrafico3);
		
		GraphPanel grafico3 = new GraphPanel(Lista3);
		panelGrafico3.add(grafico3);
		grafico3.setLayout(null);
		
		telaInicial.setVisible(true);
		
	}
	private void setContentPane(JPanel painelFPF) {
		
	}

	public void printaTela() {	
		painelFPF.setVisible(true);
	}
	
	private void setBounds(int i, int j, int k, int l) {
		
	}

	private void setTitle(String string) {
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
	
		
	}
}
