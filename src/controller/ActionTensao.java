package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.ModelFluxoDePotenciaFundamental;
import view.GraphPanel;

public class ActionTensao implements ActionListener {
	
	private JSpinner amplitude;
	private JSpinner angulo;
	public GraphPanel grafico1;
	private List <Double> lista1;
	private ModelFluxoDePotenciaFundamental botaoSimularTensao;

		public ActionTensao(JSpinner amplitude, JSpinner angulo,
				GraphPanel grafico1, List<Double> lista1, JPanel painelTensao, JPanel painelFPF, JFrame telaInicial) {
			super();
			this.amplitude = amplitude;
			this.angulo = angulo;
			this.grafico1 = grafico1;
			this.lista1 = lista1;
			botaoSimularTensao = new ModelFluxoDePotenciaFundamental();
		}

		public void actionPerformed(ActionEvent e) {
			double amplitudeV = Double.parseDouble(amplitude.getValue().toString());
			double anguloV = Double.parseDouble(angulo.getValue().toString());
			
			ModelFluxoDePotenciaFundamental.amplitudeVRMS = amplitudeV;
			ModelFluxoDePotenciaFundamental.anguloVRMS = anguloV;
			
			
			try{
				if(amplitudeV < 0 || amplitudeV > 220){
					IllegalArgumentException e1 = new IllegalArgumentException();
					throw e1;
				}
				else if(anguloV < -180 || anguloV > 180){
					RuntimeException e2 = new RuntimeException();
					throw e2;
				}else{
						grafico1.revalidate();
						lista1.clear();
						for(int t = 0 ; t<180 ; t++){
							lista1.add(botaoSimularTensao.OndaTensao(amplitudeV, t, anguloV));
							grafico1.setScores(lista1);
						}
					}
				}catch(IllegalArgumentException e1){	
					JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme valores entre 0 e 220");
			} catch(RuntimeException e2){
				JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme angulo entre -180 e 180 graus");
			}
		}
		
};