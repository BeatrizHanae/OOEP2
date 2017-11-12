package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.ModelFluxoDePotenciaFundamental;
import view.GraphPanel;

public class ActionCorrente implements ActionListener {
	
	private JSpinner amplitude;
	private JSpinner angulo;
	public GraphPanel grafico2;
	private List <Double> lista2;
	private ModelFluxoDePotenciaFundamental botaoSimularCorrente;

		public ActionCorrente(JSpinner amplitude, JSpinner angulo, GraphPanel grafico2, List<Double> lista2, JPanel painelCorrente, JPanel painelFPF, JFrame telaInicial) {
			super();
			this.amplitude = amplitude;
			this.angulo = angulo;
			this.grafico2 = grafico2;
			this.lista2 = lista2;
			botaoSimularCorrente = new ModelFluxoDePotenciaFundamental();
		}

		public void actionPerformed(ActionEvent e) {
			double amplitudeI = Double.parseDouble(amplitude.getValue().toString());
			double anguloI = Double.parseDouble(angulo.getValue().toString());
			grafico2.revalidate();
			lista2.clear();
			for(double t=0;t<=90;t++) {
			lista2.add(botaoSimularCorrente.OndaCorrente(amplitudeI,t,anguloI));
			grafico2.setScores(lista2);
			}
			//painelFPF.setVisible(false);
		}
		
};
