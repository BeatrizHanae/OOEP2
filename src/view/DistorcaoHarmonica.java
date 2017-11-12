package view;

import java.awt.GridLayout;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JSpinner;

import controller.ActionRetornaMenu;
import controller.ActionSimularComponente;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class DistorcaoHarmonica {

	private JPanel painelDH;

	public DistorcaoHarmonica(JFrame telaInicial) throws IOException{
		criaPainelDistorcaoHarmonica(telaInicial);
	}
	
	public void criaPainelDistorcaoHarmonica (JFrame telaInicial) {
		
		painelDH = new JPanel();
		
		setTitle("APRENDA QEE! - Distorção Harmônica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1015, 576);
		
		telaInicial.setContentPane(painelDH);
		painelDH.setLayout(null);
		
		JLabel simulacao2 = new JLabel("DISTORÇÃO HARMÔNICA");
		simulacao2.setBounds(424, 16, 167, 16);
		painelDH.add(simulacao2);
		
		JPanel panelFundamental = new JPanel();
		panelFundamental.setBounds(52, 44, 946, 145);
		painelDH.add(panelFundamental);
		panelFundamental.setLayout(null);
		
		JLabel lblComponente = new JLabel("Componente Fundamental");
		lblComponente.setBounds(6, 6, 165, 16);
		panelFundamental.add(lblComponente);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(16, 34, 69, 16);
		panelFundamental.add(lblAmplitude);
		
		JLabel lblAngulo = new JLabel("Angulo:");
		lblAngulo.setBounds(16, 62, 54, 16);
		panelFundamental.add(lblAngulo);
		
		JSpinner amplitude1 = new JSpinner();
		amplitude1.setBounds(111, 29, 54, 26);
		panelFundamental.add(amplitude1);
		
		JSpinner angulo1 = new JSpinner();
		angulo1.setBounds(111, 57, 54, 26);
		panelFundamental.add(angulo1);
		
		JPanel panelGrafico4 = new JPanel();
		panelGrafico4.setBounds(290, 6, 618, 128);
		panelFundamental.add(panelGrafico4);
		
		panelGrafico4.setLayout(new GridLayout(0,1,0,0));
		List<Double> Lista4 = new ArrayList<>();
		
		GraphPanel grafico4 = new GraphPanel(Lista4);
		panelGrafico4.add(grafico4);
		grafico4.setLayout(null);
		
		JButton botaoSimularComponenteFundamental = new JButton("Simular Componente Fundamental");
		botaoSimularComponenteFundamental.setBounds(16, 95, 241, 29);
		botaoSimularComponenteFundamental.setActionCommand("Simular Tensão");
		botaoSimularComponenteFundamental.addActionListener(new ActionSimularComponente(amplitude1, angulo1, grafico4, Lista4, panelFundamental, painelDH, telaInicial));
		panelFundamental.add(botaoSimularComponenteFundamental);
		
		JPanel panelOrdemHarmonicos = new JPanel();
		panelOrdemHarmonicos.setBounds(52, 201, 382, 145);
		painelDH.add(panelOrdemHarmonicos);
		panelOrdemHarmonicos.setLayout(null);
		
		JLabel lblHarmonicas = new JLabel("Harmônicas");
		lblHarmonicas.setBounds(6, 6, 83, 16);
		panelOrdemHarmonicos.add(lblHarmonicas);
		
		JLabel labelOrdemD = new JLabel("Número de ordens harmônicas:");
		labelOrdemD.setBounds(16, 34, 197, 16);
		panelOrdemHarmonicos.add(labelOrdemD);
		
		JSpinner numeroHarmonico = new JSpinner();
		numeroHarmonico.setBounds(252, 29, 55, 26);
		panelOrdemHarmonicos.add(numeroHarmonico);
		
		JLabel lblHarmnicos = new JLabel("Harmônicos:");
		lblHarmnicos.setBounds(26, 67, 89, 16);
		panelOrdemHarmonicos.add(lblHarmnicos);
		
		JComboBox<String> comboxharmonicos = new JComboBox<String>();
		comboxharmonicos.addItem("ÍMPAR");
		comboxharmonicos.addItem("PAR");
		comboxharmonicos.setBounds(232, 67, 100, 27);
		panelOrdemHarmonicos.add(comboxharmonicos);
		
		JButton botaoSimularHarmnicos = new JButton("Simular Harmônicos");
		botaoSimularHarmnicos.setBounds(52, 97, 161, 29);
		panelOrdemHarmonicos.add(botaoSimularHarmnicos);
		
		JLabel lblSaida = new JLabel("Saídas - Série de Fourier");
		lblSaida.setBounds(52, 372, 160, 16);
		painelDH.add(lblSaida);
		
		JPanel panelGrafico5 = new JPanel();
		panelGrafico5.setBounds(62, 400, 618, 128);
		painelDH.add(panelGrafico5);
		
		panelGrafico5.setLayout(new GridLayout(0,1,0,0));
		
		GraphPanel grafico5 = new GraphPanel(Lista4);
		panelGrafico5.add(grafico5);
		grafico5.setLayout(null);
		
		JButton botaoSimular2 = new JButton("SIMULAR");
		botaoSimular2.setBounds(811, 481, 117, 29);
		painelDH.add(botaoSimular2);
		
		JButton botaoRetornarAoMenu = new JButton("RETORNAR AO MENU");
		botaoRetornarAoMenu.setBounds(791, 519, 160, 29);
		botaoRetornarAoMenu.setActionCommand("RETORNAR AO MENU");
		botaoRetornarAoMenu.addActionListener(new ActionRetornaMenu(painelDH, telaInicial));
		painelDH.add(botaoRetornarAoMenu);
		
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
}
