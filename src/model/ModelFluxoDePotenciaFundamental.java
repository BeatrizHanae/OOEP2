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
		return VRMS*Math.cos(Math.toRadians(frequenciaAngular*t) + angulov);
	}
	public double OndaCorrente(double IRMS, double t, double anguloi) {
		return IRMS*Math.cos(Math.toRadians(frequenciaAngular*t )+ anguloi);
	}
	public double OndaPotenciaInstanea(double VRMS, double t, double angulov, double anguloi, double IRMS) {
		return OndaTensao(VRMS,t,angulov)*OndaCorrente(IRMS,t,anguloi);
	}
	public double ValorPotAtiva(double VRMS, double angulov, double anguloi, double IRMS) {
		return Math.round(VRMS*IRMS*Math.cos(Math.toRadians(angulov-anguloi)));
	}
	public double ValorPotReativa(double VRMS, double angulov, double anguloi, double IRMS) {
		return Math.round(VRMS*IRMS*Math.sin(Math.toRadians(angulov - anguloi)));
	}
	public double ValorPotAparente(double VRMS, double IRMS) {
		return Math.round(VRMS*IRMS);
	}
	public double ValorFatorPot(double angulov, double anguloi) {
		return Math.cos(Math.toRadians(angulov)- Math.toRadians(anguloi));
	}
	
	
}
