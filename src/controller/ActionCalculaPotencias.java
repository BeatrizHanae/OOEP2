package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ModelFluxoDePotenciaFundamental;
import view.GraphPanel;

public class ActionCalculaPotencias implements ActionListener {

	private JTextField potenciaAtiva, potenciaReativa, potenciaAparente, fatorPotencia;
	public GraphPanel grafico3;
	private List <Double> lista3;
	private ModelFluxoDePotenciaFundamental calcula;
	
	public ActionCalculaPotencias(JTextField potenciaAtiva, JTextField potenciaReativa, JTextField potenciaAparente, JTextField fatorPotencia,GraphPanel grafico3,List<Double> lista3,JPanel painelCorrente, JPanel painelFPF, JFrame telaInicial){
		super();
		this.potenciaAtiva = potenciaAtiva;
		this.potenciaReativa = potenciaReativa;
		this.potenciaAparente = potenciaAparente;
		this.fatorPotencia = fatorPotencia;
		this.grafico3 = grafico3;
		this.lista3 = lista3;
		calcula = new ModelFluxoDePotenciaFundamental();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		 double amplitudeT = ModelFluxoDePotenciaFundamental.amplitudeV;
		 double anguloT = ModelFluxoDePotenciaFundamental.anguloV; 
		 double amplitudeC = ModelFluxoDePotenciaFundamental.amplitudeI;
		 double anguloC = ModelFluxoDePotenciaFundamental.anguloI;
		
		 for (double i=0; i<180;i++) {
			 lista3.add(calcula.OndaPotenciaInstanea(amplitudeT,i, anguloT,amplitudeC, anguloC));
			 grafico3.setScores(lista3);
		 }
		 
		 potenciaAtiva.setText(String.valueOf(calcula.ValorPotAtiva(amplitudeT,anguloT, amplitudeC, anguloC)));
		 potenciaReativa.setText(String.valueOf(calcula.ValorPotReativa(amplitudeC,anguloC,amplitudeT,anguloT)));
		 potenciaAparente.setText(String.valueOf(calcula.ValorPotAparente(amplitudeT, amplitudeC)));
		 fatorPotencia.setText(String.valueOf(calcula.ValorFatorPot(anguloT, anguloC)));
		
	}
	
}
