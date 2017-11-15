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

import controller.ActionCalculaPotencias;
import controller.ActionCorrente;
import controller.ActionRetornaMenu;
import controller.ActionTensao;

import javax.swing.JTextField;


public class FluxoPotenciaFundamental{
	
	private JPanel painelFPF;
	private JTextField potAtiva;
	private JTextField potReativa;
	private JTextField potAparente;
	private JTextField fatorPotencia;
	
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
		
		JButton botaoRetornarAoMenu = new JButton("RETORNAR AO MENU");
		botaoRetornarAoMenu.setBounds(794, 625, 160, 29);
		botaoRetornarAoMenu.setActionCommand("RETORNAR AO MENU");
		botaoRetornarAoMenu.addActionListener(new ActionRetornaMenu(painelFPF, telaInicial));
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
		amplitude1.setBounds(147, 20, 53, 26);
		panelTensao.add(amplitude1);
		
		JSpinner angulo1 = new JSpinner();
		angulo1.setBounds(147, 48, 53, 26);
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
		labelAmplitude.setBounds(24, 32, 69, 16);
		panelCorrente.add(labelAmplitude);
		
		JLabel labelAngulo = new JLabel("Ângulo de fases:");
		labelAngulo.setBounds(24, 60, 105, 16);
		panelCorrente.add(labelAngulo);
		
		JLabel Corrente = new JLabel("Corrente");
		Corrente.setBounds(6, 6, 54, 16);
		panelCorrente.add(Corrente);
		
		JSpinner amplitude2 = new JSpinner();
		amplitude2.setBounds(147, 27, 53, 26);
		panelCorrente.add(amplitude2);
		
		JSpinner angulo2 = new JSpinner();
		angulo2.setBounds(147, 55, 53, 26);
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
		botaoSimularCorrente.setBounds(24, 172, 140, 29);
		botaoSimularCorrente.setActionCommand("Simular Corrente");
		botaoSimularCorrente.addActionListener(new ActionCorrente(amplitude2,angulo2,grafico2, Lista2,panelCorrente,painelFPF,telaInicial));
		panelCorrente.add(botaoSimularCorrente);
		
	
		JLabel labelPotenciaReativa = new JLabel("Potência Reativa:");
		labelPotenciaReativa.setBounds(17, 525, 119, 16);
		painelFPF.add(labelPotenciaReativa);
		
		JLabel lblPotenciaAparente = new JLabel("Potência Aparente:");
		lblPotenciaAparente.setBounds(16, 544, 120, 16);
		painelFPF.add(lblPotenciaAparente);
		
		JLabel lblAtiva = new JLabel("Potência Ativa:");
		lblAtiva.setBounds(17, 504, 99, 16);
		painelFPF.add(lblAtiva);
		
		JLabel lblFatorDePotncia = new JLabel("Fator de Potência:");
		lblFatorDePotncia.setBounds(17, 582, 119, 16);
		painelFPF.add(lblFatorDePotncia);
		
		potAtiva = new JTextField();
		potAtiva .setBounds(139, 504, 93, 16);
		potAtiva .setEditable(false);
		potAtiva .setColumns(10);
		painelFPF.add(potAtiva);
		
		potReativa = new JTextField();
		potReativa.setBounds(139, 525, 93, 16);
		potReativa.setEditable(false);
		potReativa.setColumns(10);
		painelFPF.add(potReativa);
		
		potAparente = new JTextField();
		potAparente.setBounds(139, 544, 93, 16);
		potAparente.setEditable(false);
		potAparente.setColumns(10);
		painelFPF.add(potAparente);;
		
		fatorPotencia = new JTextField();
		fatorPotencia.setEditable(false);
		fatorPotencia.setBounds(40, 607, 130, 26);
		painelFPF.add(fatorPotencia);
		fatorPotencia.setColumns(10);
		
		List <Double> Lista3 = new ArrayList<>();
		
		JPanel panelGrafico3 = new JPanel();
		panelGrafico3.setBounds(235, 456, 507, 198);
		painelFPF.add(panelGrafico3);
		
		panelGrafico3.setLayout(new GridLayout(0,1,0,0));
		
		GraphPanel grafico3 = new GraphPanel(Lista3);
		panelGrafico3.add(grafico3);
		grafico3.setLayout(null);
	
		JButton botaoSimular = new JButton("SIMULAR");
		botaoSimular.setBounds(815, 594, 117, 29);
		botaoSimular.setActionCommand("SIMULAR");
		botaoSimular.addActionListener(new ActionTensao(amplitude1, angulo1, grafico1, Lista1, panelTensao, painelFPF, telaInicial));
		botaoSimular.addActionListener(new ActionCorrente(amplitude2,angulo2,grafico2, Lista2,panelCorrente,painelFPF,telaInicial));
		botaoSimular.addActionListener(new ActionCalculaPotencias(potAtiva, potReativa, potAparente, fatorPotencia, grafico3, Lista3, painelFPF, telaInicial));
		painelFPF.add(botaoSimular);
		
		
		telaInicial.setVisible(true);
		
	}
	private void setContentPane(JPanel painelFPF) {
		
	}
	
	private void setBounds(int i, int j, int k, int l) {
		
	}

	private void setTitle(String string) {
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
	
		
	}
}
