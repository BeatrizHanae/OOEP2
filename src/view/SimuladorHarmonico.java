package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.ActionSimularHarmonico;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JLabel;

public class SimuladorHarmonico extends JFrame {
	
	private static final long serialVersionUID = 1L;
	public JPanel panelSimulaHarmonico1;
	public JPanel panelSimulaHarmonico2;
	public JPanel panelSimulaHarmonico3;
	public JPanel panelSimulaHarmonico4;
	public JPanel panelSimulaHarmonico5;
	public JPanel panelSimulaHarmonico6;
	private JPanel painelDeSimuladores;
	
	public SimuladorHarmonico() {
		
		setTitle("Harmônicas");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 1123, 676);
		
		painelDeSimuladores = new JPanel();
		painelDeSimuladores.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelDeSimuladores);
		painelDeSimuladores.setLayout(null);
		
		JPanel panelSimulaHarmonico1 = new JPanel();
		panelSimulaHarmonico1.setBounds(16, 29, 533, 156);
		painelDeSimuladores.add(panelSimulaHarmonico1);
		panelSimulaHarmonico1.setLayout(null);
		
		JSpinner amplitude1 = new JSpinner();
		amplitude1.setBounds(138, 30, 51, 26);
		panelSimulaHarmonico1.add(amplitude1);
		
		JSpinner angulo1 = new JSpinner();
		angulo1.setBounds(138, 58, 51, 26);
		panelSimulaHarmonico1.add(angulo1);
		
		JLabel lblHarmnico = new JLabel("Harmônico 1:");
		lblHarmnico.setBounds(6, 6, 93, 16);
		panelSimulaHarmonico1.add(lblHarmnico);
		
		JLabel lblAmplitude = new JLabel("Amplitude:");
		lblAmplitude.setBounds(16, 35, 69, 16);
		panelSimulaHarmonico1.add(lblAmplitude);
		
		JLabel label_10 = new JLabel("Ângulo de fases:");
		label_10.setBounds(15, 63, 111, 16);
		panelSimulaHarmonico1.add(label_10);
		
		JLabel label_15 = new JLabel("Ordem Harmônica:");
		label_15.setBounds(16, 91, 118, 16);
		panelSimulaHarmonico1.add(label_15);
		
		JSpinner ordem1 = new JSpinner();
		ordem1.setBounds(138, 86, 51, 26);
		panelSimulaHarmonico1.add(ordem1);
		
		JPanel panelHarmonicoGrafico1 = new JPanel();
		panelHarmonicoGrafico1.setBounds(201, 0, 333, 161);;
		
		List <Double> ListaHarmonico1 = new ArrayList<>();
		
		panelHarmonicoGrafico1.setLayout(new GridLayout(0,1,0,0));
		panelSimulaHarmonico1.add(panelHarmonicoGrafico1);
		
		GraphPanel graficoHarmonico1 = new GraphPanel(ListaHarmonico1);
		panelHarmonicoGrafico1.add(graficoHarmonico1);
		graficoHarmonico1.setLayout(null);
		
		JButton botaoSimular1 = new JButton("SIMULAR 1");
		botaoSimular1.setBounds(38, 119, 117, 29);
		panelSimulaHarmonico1.add(botaoSimular1);
		botaoSimular1.setActionCommand("SIMULAR 1");
		botaoSimular1.addActionListener(new ActionSimularHarmonico(graficoHarmonico1, ListaHarmonico1, amplitude1, angulo1, ordem1));
		panelSimulaHarmonico1.add(botaoSimular1);
		
		JPanel panelSimulaHarmonico2 = new JPanel();
		panelSimulaHarmonico2.setBounds(16, 218, 533, 156);
		painelDeSimuladores.add(panelSimulaHarmonico2);
		panelSimulaHarmonico2.setLayout(null);
		
		JLabel lblHarmnico_1 = new JLabel("Harmônico 2:");
		lblHarmnico_1.setBounds(6, 6, 93, 16);
		panelSimulaHarmonico2.add(lblHarmnico_1);
		
		JLabel label = new JLabel("Amplitude:");
		label.setBounds(17, 39, 69, 16);
		panelSimulaHarmonico2.add(label);
		
		JSpinner amplitude2 = new JSpinner();
		amplitude2.setBounds(139, 34, 51, 26);
		panelSimulaHarmonico2.add(amplitude2);
		
		JLabel label_1 = new JLabel("Ângulo de fases:");
		label_1.setBounds(16, 67, 111, 16);
		panelSimulaHarmonico2.add(label_1);
		
		JSpinner angulo2 = new JSpinner();
		angulo2.setBounds(139, 62, 51, 26);
		panelSimulaHarmonico2.add(angulo2);
		
		JLabel label_2 = new JLabel("Ordem Harmônica:");
		label_2.setBounds(17, 95, 118, 16);
		panelSimulaHarmonico2.add(label_2);
		
		JSpinner ordem2 = new JSpinner();
		ordem2.setBounds(139, 90, 51, 26);
		panelSimulaHarmonico2.add(ordem2);
		
		JPanel panelHarmonicoGrafico2 = new JPanel();
		panelHarmonicoGrafico2.setBounds(201, 0, 333, 161);;
		
		List <Double> ListaHarmonico2 = new ArrayList<>();
		
		panelHarmonicoGrafico2.setLayout(new GridLayout(0,1,0,0));
		panelSimulaHarmonico2.add(panelHarmonicoGrafico2);
		
		GraphPanel graficoHarmonico2 = new GraphPanel(ListaHarmonico2);
		panelHarmonicoGrafico2.add(graficoHarmonico2);
		graficoHarmonico2.setLayout(null);
		
		JButton botaoSimular2 = new JButton("SIMULAR 2");
		botaoSimular2.setBounds(40, 121, 117, 29);
		botaoSimular2.setActionCommand("SIMULAR 2");
		botaoSimular2.addActionListener(new ActionSimularHarmonico(graficoHarmonico2, ListaHarmonico2, amplitude2, angulo2, ordem2));
		panelSimulaHarmonico2.add(botaoSimular2);
		
		
		JPanel panelSimulaHarmonico3 = new JPanel();
		panelSimulaHarmonico3.setBounds(16, 403, 533, 156);
		painelDeSimuladores.add(panelSimulaHarmonico3);
		panelSimulaHarmonico3.setLayout(null);
		
		JLabel lblHarmnico_2 = new JLabel("Harmônico 3:");
		lblHarmnico_2.setBounds(6, 6, 93, 16);
		panelSimulaHarmonico3.add(lblHarmnico_2);
		
		JLabel lblAmplitude_2 = new JLabel("Amplitude:");
		lblAmplitude_2.setBounds(17, 39, 69, 16);
		panelSimulaHarmonico3.add(lblAmplitude_2);
		
		JSpinner amplitude3 = new JSpinner();
		amplitude3.setBounds(139, 34, 51, 26);
		panelSimulaHarmonico3.add(amplitude3);
		
		JLabel label_4 = new JLabel("Ângulo de fases:");
		label_4.setBounds(16, 67, 111, 16);
		panelSimulaHarmonico3.add(label_4);
		
		JSpinner angulo3 = new JSpinner();
		angulo3.setBounds(139, 62, 51, 26);
		panelSimulaHarmonico3.add(angulo3);
		
		JLabel label_5 = new JLabel("Ordem Harmônica:");
		label_5.setBounds(17, 95, 118, 16);
		panelSimulaHarmonico3.add(label_5);
		
		JSpinner ordem3 = new JSpinner();
		ordem3.setBounds(139, 90, 51, 26);
		panelSimulaHarmonico3.add(ordem3);
		
		JPanel panelHarmonicoGrafico3 = new JPanel();
		panelHarmonicoGrafico3.setBounds(201, 0, 333, 161);;
		
		List <Double> ListaHarmonico3 = new ArrayList<>();
		
		panelHarmonicoGrafico3.setLayout(new GridLayout(0,1,0,0));
		panelSimulaHarmonico3.add(panelHarmonicoGrafico3);
		
		GraphPanel graficoHarmonico3 = new GraphPanel(ListaHarmonico3);
		panelHarmonicoGrafico3.add(graficoHarmonico3);
		graficoHarmonico3.setLayout(null);
		
		JButton botaoSimular3 = new JButton("SIMULAR 3");
		botaoSimular3.setBounds(38, 119, 117, 29);
		panelSimulaHarmonico3.add(botaoSimular3);
		botaoSimular3.setActionCommand("SIMULAR 3");
		botaoSimular3.addActionListener(new ActionSimularHarmonico(graficoHarmonico3, ListaHarmonico3, amplitude3, angulo3, ordem3));
		panelSimulaHarmonico3.add(botaoSimular3);
		
		JPanel panelSimulaHarmonico4 = new JPanel();
		panelSimulaHarmonico4.setBounds(561, 29, 533, 156);
		painelDeSimuladores.add(panelSimulaHarmonico4);
		panelSimulaHarmonico4.setLayout(null);
		
		JLabel lblHarmnico_3 = new JLabel("Harmônico 4:");
		lblHarmnico_3.setBounds(6, 6, 93, 16);
		panelSimulaHarmonico4.add(lblHarmnico_3);
		
		JLabel label_6 = new JLabel("Amplitude:");
		label_6.setBounds(17, 39, 69, 16);
		panelSimulaHarmonico4.add(label_6);
		
		JSpinner amplitude4 = new JSpinner();
		amplitude4.setBounds(139, 34, 51, 26);
		panelSimulaHarmonico4.add(amplitude4);
		
		JLabel label_7 = new JLabel("Ângulo de fases:");
		label_7.setBounds(16, 67, 111, 16);
		panelSimulaHarmonico4.add(label_7);
		
		JSpinner angulo4 = new JSpinner();
		angulo4.setBounds(139, 62, 51, 26);
		panelSimulaHarmonico4.add(angulo4);
		
		JLabel label_8 = new JLabel("Ordem Harmônica:");
		label_8.setBounds(17, 95, 118, 16);
		panelSimulaHarmonico4.add(label_8);
		
		JSpinner ordem4 = new JSpinner();
		ordem4.setBounds(139, 90, 51, 26);
		panelSimulaHarmonico4.add(ordem4);
		
		JPanel panelHarmonicoGrafico4 = new JPanel();
		panelHarmonicoGrafico4.setBounds(201, 0, 333, 161);;
		
		List <Double> ListaHarmonico4 = new ArrayList<>();
		
		panelHarmonicoGrafico4.setLayout(new GridLayout(0,1,0,0));
		panelSimulaHarmonico4.add(panelHarmonicoGrafico4);
		
		GraphPanel graficoHarmonico4 = new GraphPanel(ListaHarmonico4);
		panelHarmonicoGrafico4.add(graficoHarmonico4);
		graficoHarmonico4.setLayout(null);
		
		JButton botaoSimular4 = new JButton("SIMULAR 4");
		botaoSimular4.setBounds(38, 119, 117, 29);
		panelSimulaHarmonico4.add(botaoSimular4);
		botaoSimular4.setActionCommand("SIMULAR 4");
		botaoSimular4.addActionListener(new ActionSimularHarmonico(graficoHarmonico4, ListaHarmonico4, amplitude4, angulo4, ordem4));
		panelSimulaHarmonico4.add(botaoSimular4);
		
		JPanel panelSimulaHarmonico5 = new JPanel();
		panelSimulaHarmonico5.setBounds(561, 218, 533, 156);
		painelDeSimuladores.add(panelSimulaHarmonico5);
		panelSimulaHarmonico5.setLayout(null);
		
		JLabel lblHarmnico_4 = new JLabel("Harmônico 5:");
		lblHarmnico_4.setBounds(6, 6, 93, 16);
		panelSimulaHarmonico5.add(lblHarmnico_4);
		
		JLabel label_9 = new JLabel("Amplitude:");
		label_9.setBounds(17, 39, 69, 16);
		panelSimulaHarmonico5.add(label_9);
		
		JSpinner amplitude5 = new JSpinner();
		amplitude5.setBounds(139, 34, 51, 26);
		panelSimulaHarmonico5.add(amplitude5);
		
		JLabel label_11 = new JLabel("Ângulo de fases:");
		label_11.setBounds(16, 67, 111, 16);
		panelSimulaHarmonico5.add(label_11);
		
		JSpinner angulo5 = new JSpinner();
		angulo5.setBounds(139, 62, 51, 26);
		panelSimulaHarmonico5.add(angulo5);
		
		JLabel label_12 = new JLabel("Ordem Harmônica:");
		label_12.setBounds(17, 95, 118, 16);
		panelSimulaHarmonico5.add(label_12);
		
		JSpinner ordem5 = new JSpinner();
		ordem5.setBounds(139, 90, 51, 26);
		panelSimulaHarmonico5.add(ordem5);
		
		JPanel panelHarmonicoGrafico5 = new JPanel();
		panelHarmonicoGrafico5.setBounds(201, 0, 333, 161);;
		
		List <Double> ListaHarmonico5 = new ArrayList<>();
		
		panelHarmonicoGrafico5.setLayout(new GridLayout(0,1,0,0));
		panelSimulaHarmonico5.add(panelHarmonicoGrafico5);
		
		GraphPanel graficoHarmonico5 = new GraphPanel(ListaHarmonico5);
		panelHarmonicoGrafico5.add(graficoHarmonico5);
		graficoHarmonico5.setLayout(null);
		
		JButton botaoSimular5 = new JButton("SIMULAR 5");
		botaoSimular5.setBounds(38, 119, 117, 29);
		panelSimulaHarmonico5.add(botaoSimular5);
		botaoSimular5.setActionCommand("SIMULAR 5");
		botaoSimular5.addActionListener(new ActionSimularHarmonico(graficoHarmonico5, ListaHarmonico5, amplitude5, angulo5, ordem5));
		panelSimulaHarmonico5.add(botaoSimular5);
		
		JPanel panelSimulaHarmonico6 = new JPanel();
		panelSimulaHarmonico6.setBounds(561, 403, 533, 156);
		painelDeSimuladores.add(panelSimulaHarmonico6);
		panelSimulaHarmonico6.setLayout(null);
		
		JLabel lblHarmnico_5 = new JLabel("Harmônico 6:");
		lblHarmnico_5.setBounds(6, 6, 93, 16);
		panelSimulaHarmonico6.add(lblHarmnico_5);
		
		JLabel label_13 = new JLabel("Amplitude:");
		label_13.setBounds(17, 41, 69, 16);
		panelSimulaHarmonico6.add(label_13);
		
		JSpinner amplitude6 = new JSpinner();
		amplitude6.setBounds(139, 36, 51, 26);
		panelSimulaHarmonico6.add(amplitude6);
		
		JLabel label_14 = new JLabel("Ângulo de fases:");
		label_14.setBounds(16, 69, 111, 16);
		panelSimulaHarmonico6.add(label_14);
		
		JSpinner angulo6 = new JSpinner();
		angulo6.setBounds(139, 64, 51, 26);
		panelSimulaHarmonico6.add(angulo6);
		
		JLabel label_16 = new JLabel("Ordem Harmônica:");
		label_16.setBounds(17, 97, 118, 16);
		panelSimulaHarmonico6.add(label_16);
		
		JSpinner ordem6 = new JSpinner();
		ordem6.setBounds(139, 92, 51, 26);
		panelSimulaHarmonico6.add(ordem6);
		
		JPanel panelHarmonicoGrafico6 = new JPanel();
		panelHarmonicoGrafico6.setBounds(201, 0, 333, 161);;
		
		List <Double> ListaHarmonico6 = new ArrayList<>();
		
		panelHarmonicoGrafico6.setLayout(new GridLayout(0,1,0,0));
		panelSimulaHarmonico6.add(panelHarmonicoGrafico6);
		
		GraphPanel graficoHarmonico6 = new GraphPanel(ListaHarmonico6);
		panelHarmonicoGrafico6.add(graficoHarmonico6);
		graficoHarmonico6.setLayout(null);
		
		JButton botaoSimular6 = new JButton("SIMULAR 6");
		botaoSimular6.setBounds(38, 119, 117, 29);
		panelSimulaHarmonico6.add(botaoSimular6);
		botaoSimular6.setActionCommand("SIMULAR 6");
		botaoSimular6.addActionListener(new ActionSimularHarmonico(graficoHarmonico6, ListaHarmonico6, amplitude6, angulo6, ordem6));
		panelSimulaHarmonico6.add(botaoSimular6);
		
	}
}
