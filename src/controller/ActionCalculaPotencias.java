package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.ModelFluxoDePotenciaFundamental;
import view.FluxoPotenciaFundamental;
import view.GraphPanel;

public class ActionCalculaPotencias implements ActionListener {

	private JTextField potenciaAtiva, potenciaReativa, potenciaAparente, fatorPotencia;
	public GraphPanel grafico3;
	private List <Double> lista3;
	FluxoPotenciaFundamental painel;
	private ModelFluxoDePotenciaFundamental botaoSimular;
	
	public ActionCalculaPotencias(JTextField potenciaAtiva, JTextField potenciaReativa, JTextField potenciaAparente, JTextField fatorPot,GraphPanel grafico3,List<Double> lista3, JPanel painelFPF, JFrame telaInicial){
		super();
		this.potenciaAtiva = potenciaAtiva;
		this.potenciaReativa = potenciaReativa;
		this.potenciaAparente = potenciaAparente;
		this.fatorPotencia = fatorPot;
		this.grafico3 = grafico3;
		this.lista3 = lista3;
		botaoSimular = new ModelFluxoDePotenciaFundamental();
	}
	
	public void actionPerformed(ActionEvent arg0) {
		
		 double amplitudeTensao = ModelFluxoDePotenciaFundamental.amplitudeVRMS;
		 double anguloTensao = ModelFluxoDePotenciaFundamental.anguloVRMS; 
		 double amplitudeCorrente = ModelFluxoDePotenciaFundamental.amplitudeIRMS;
		 double anguloCorrente = ModelFluxoDePotenciaFundamental.anguloIRMS;
		 double fatorPot = botaoSimular.ValorFatorPot(anguloTensao, anguloCorrente);
		 fatorPot = Double.valueOf(String.format(Locale.US, "%.2f", fatorPot));
		 
		 potenciaAtiva.setText(String.valueOf(botaoSimular.ValorPotAtiva(amplitudeTensao,anguloTensao, anguloCorrente,  amplitudeCorrente)));
		 potenciaReativa.setText(String.valueOf(botaoSimular.ValorPotReativa(amplitudeTensao,anguloTensao,anguloCorrente, amplitudeCorrente)));
		 potenciaAparente.setText(String.valueOf(botaoSimular.ValorPotAparente(amplitudeTensao, amplitudeCorrente)));
		 fatorPotencia.setText(String.valueOf(fatorPot));
		 
		 grafico3.revalidate();
		 lista3.clear();
		 
		 for (double i=0; i<180;i++) {
			 lista3.add(botaoSimular.OndaPotenciaInstanea(amplitudeTensao,i, anguloTensao, anguloCorrente, amplitudeCorrente));
			 grafico3.setScores(lista3);
		 }
		
		 
	}
	
}
