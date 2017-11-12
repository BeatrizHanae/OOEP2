package model;

public class ModelDistorcaoHarmonica {
		
	public double frequenciaAngular = 120*Math.PI;
	public static double amplitude;
	public static double ordemHarmonica;
	public static double anguloDeFase;
	
	
	public double OndaTensao(double VRMS, double t, double angulov) {
		return VRMS*Math.cos(Math.toRadians(frequenciaAngular*t) + angulov);
	}
	
	public double OndaHarmonica(double VRMS, double ordemHarmonica, double t, double anguloh) {
		return VRMS*Math.cos(Math.toRadians((ordemHarmonica*frequenciaAngular*t)+anguloh));
	}
	
	
}
