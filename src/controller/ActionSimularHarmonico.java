package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JSpinner;

import model.ModelDistorcaoHarmonica;
import view.GraphPanel;
import view.SimuladorHarmonico;


public class ActionSimularHarmonico implements ActionListener{
	
	private GraphPanel grafico;
	private List<Double> lista;
	private JSpinner amplitude, angulo, ordem;
	private ModelDistorcaoHarmonica calculo;

	public ActionSimularHarmonico(GraphPanel grafico, List<Double> lista, JSpinner amplitude, JSpinner angulo,
			JSpinner ordem) {
		super();
		this.grafico = grafico;
		this.lista = lista;
		this.amplitude = amplitude;
		this.angulo = angulo;
		this.ordem = ordem;
		calculo = new ModelDistorcaoHarmonica();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		double amplitudeReferencia = Double.parseDouble(amplitude.getValue().toString());
		double anguloReferencia = Double.parseDouble(angulo.getValue().toString());
		double ordemReferencia = Double.parseDouble(ordem.getValue().toString());
		
		try {
			if(amplitudeReferencia< 0 || amplitudeReferencia > 220){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(anguloReferencia <-180 || anguloReferencia > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
				
			}
			else if (ordemReferencia < 0 || ordemReferencia > 15){
				Exception e3 = new Exception();
				throw e3;
			}
			else{
					grafico.revalidate();
					lista.clear();
					for(int i = 0 ; i<100 ; i++){
						lista.add(calculo.OndaHarmonica(amplitudeReferencia,ordemReferencia,i,anguloReferencia));
						grafico.setScores(lista);
					}
				}
			} catch(IllegalArgumentException e1){	
				JOptionPane.showMessageDialog(null, "Valor inválido!\\nInforme valores entre 0 e 220");
			} catch(RuntimeException e2){
				JOptionPane.showMessageDialog(null, "Valor inválido!\\nInforme angulo entre -180 e 180 graus");
			} catch(Exception e3) {
				JOptionPane.showMessageDialog(null, "Valor inválido!\\nInforme a Ordem Harmonica entre 0 e 15");
			}
		
	}
		
}