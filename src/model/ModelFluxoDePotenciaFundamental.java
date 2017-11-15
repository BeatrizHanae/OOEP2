package model;

import java.lang.Math;

public class ModelFluxoDePotenciaFundamental {
	
	private static double frequenciaAngular = 120*Math.PI;
	public static double amplitudeVRMS;
	public static double anguloVRMS;
	public static double amplitudeIRMS;
	public static double anguloIRMS;
	
	//VRMS = amplitude da Tensao
	//IRMS = amplitude da Corrente
	
	public static double getFrequenciaAngular() {
		return frequenciaAngular;
	}
	public void setFrequenciaAngular(double frequenciaAngular) {
		ModelFluxoDePotenciaFundamental.frequenciaAngular = frequenciaAngular;
	}
	
	public double OndaTensao(double amplitudeVRMS, double t, double anguloVRMS) {
		return amplitudeVRMS*Math.cos(Math.toRadians(getFrequenciaAngular()*t) + anguloVRMS);
	}
	public double OndaCorrente(double amplitudeIRMS, double t, double anguloIRMS) {
		return amplitudeIRMS*Math.cos(Math.toRadians(getFrequenciaAngular()*t )+ anguloIRMS);
	}
	public double OndaPotenciaInstanea(double amplitudeVRMS, double t, double anguloVRMS, double anguloIRMS, double amplitudeIRMS) {
		return OndaTensao(amplitudeVRMS,t,anguloVRMS)*OndaCorrente(amplitudeIRMS,t,anguloIRMS);
	}
	public double ValorPotAtiva(double amplitudeVRMS, double anguloVRMS, double anguloIRMS, double amplitudeIRMS) {
		return Math.round(amplitudeVRMS*amplitudeIRMS*Math.cos(Math.toRadians(anguloVRMS-anguloIRMS)));
	}
	public double ValorPotReativa(double amplitudeVRMS, double anguloVRMS, double anguloIRMS, double amplitudeIRMS) {
		return Math.round(amplitudeVRMS*amplitudeIRMS*Math.sin(Math.toRadians(anguloVRMS - anguloIRMS)));
	}
	public double ValorPotAparente(double amplitudeVRMS, double amplitudeIRMS) {
		return Math.round(amplitudeVRMS*amplitudeIRMS);
	}
	public double ValorFatorPot(double anguloVRMS, double anguloIRMS) {
		return Math.cos(Math.toRadians(anguloVRMS-anguloIRMS));
	}
	
	
}
