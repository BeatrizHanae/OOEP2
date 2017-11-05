package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.ModelFluxoDePotenciaFundamental;
import view.GraphPanel;

public class ActionTensao implements ActionListener {
	
	private JPanel painelFPF;	
	private JPanel painelTensao;
	private JFrame telaInicial;
	private JSpinner amplitude;
	private JSpinner angulo;
	public GraphPanel grafico1;
	private List <Double> lista1;
	private ModelFluxoDePotenciaFundamental botaoSimularTensao;

		public ActionTensao(JSpinner amplitude, JSpinner angulo,
				GraphPanel grafico1, List<Double> lista1, JPanel painelTensao, JPanel painelFPF, JFrame telaInicial) {
			super();
			this.painelFPF = painelFPF;
			this.painelTensao = painelTensao;
			this.telaInicial = telaInicial;
			this.amplitude = amplitude;
			this.angulo = angulo;
			this.grafico1 = grafico1;
			this.lista1 = lista1;
			botaoSimularTensao = new ModelFluxoDePotenciaFundamental();
		}

		public void actionPerformed(ActionEvent e) {
			double amplitude1 = Double.parseDouble(amplitude.getValue().toString());
			double angulo1 = Double.parseDouble(angulo.getValue().toString());
			grafico1.revalidate();
			lista1.clear();
			for(double t=0;t<=90;t++) {
			lista1.add(botaoSimularTensao.OndaTensao(amplitude1,t,angulo1));
			grafico1.setScores(lista1);
			}
			painelFPF.setVisible(false);
		
		}
		
};