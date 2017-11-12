package model;

public class ModelFluxoDePotenciaFundamental {
	public double frequenciaAngular = 120*Math.PI;
	public static double amplitudeV;
	public static double anguloV;
	public static double amplitudeI;
	public static double anguloI;
	
	//VRMS = amplitude da Tensao
	//IRMS = amplitude da Corrente
	public double OndaTensao(double VRMS, double t, double angulov) {
		return VRMS*Math.cos(frequenciaAngular*t + angulov);
	}
	public double OndaCorrente(double IRMS, double t, double anguloi) {
		return IRMS*Math.cos(frequenciaAngular*t + anguloi);
	}
	public double OndaPotenciaInstanea(double VRMS, double t, double angulov, double anguloi, double IRMS) {
		return OndaTensao(VRMS,t,angulov)*OndaCorrente(IRMS,t,anguloi);
	}
	public double ValorPotAtiva(double VRMS, double angulov, double anguloi, double IRMS) {
		return VRMS*IRMS*Math.cos(angulov-anguloi);
	}
	public double ValorPotReativa(double VRMS, double angulov, double anguloi, double IRMS) {
		return VRMS*IRMS*Math.sin(angulov - anguloi);
	}
	public double ValorPotAparente(double VRMS, double IRMS) {
		return VRMS*IRMS;
	}
	public double ValorFatorPot(double angulov, double anguloi) {
		return Math.cos(angulov-anguloi);
	}
	
	
}
