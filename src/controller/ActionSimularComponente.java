package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.ModelDistorcaoHarmonica;
import view.GraphPanel;

public class ActionSimularComponente implements ActionListener {

	private JSpinner amplitude;
	private JSpinner angulo;
	public GraphPanel grafico4;
	private List<Double> lista4;
	private ModelDistorcaoHarmonica botaoSimularComponenteFundamental;
	
	public ActionSimularComponente(JSpinner amplitude, JSpinner angulo, GraphPanel grafico4, List<Double> lista4, JPanel panelFundamental,JPanel painelDH, JFrame telaInicial) {
		super();
		this.amplitude = amplitude;
		this.angulo = angulo;
		this.grafico4 = grafico4;
		this.lista4 = lista4;
		botaoSimularComponenteFundamental = new ModelDistorcaoHarmonica();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		double amplitudeV = Double.parseDouble(amplitude.getValue().toString());
		double anguloV = Double.parseDouble(angulo.getValue().toString());
		
		try{
			if(amplitudeV < 0 || amplitudeV > 220){
				IllegalArgumentException e1 = new IllegalArgumentException();
				throw e1;
			}
			else if(anguloV < -180 || anguloV > 180){
				RuntimeException e2 = new RuntimeException();
				throw e2;
			}else{
					grafico4.revalidate();
					lista4.clear();
					for(int t = 0 ; t<180 ; t++){
						lista4.add(botaoSimularComponenteFundamental.OndaTensao(amplitudeV, t, anguloV));
						grafico4.setScores(lista4);
					}
				}
			}catch(IllegalArgumentException e1){	
				JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme valores entre 0 e 220");
		} catch(RuntimeException e2){
			JOptionPane.showMessageDialog(null, "Valor inválido!\nInforme angulo entre -180 e 180 graus");
		}
		
	}
	
	
}
