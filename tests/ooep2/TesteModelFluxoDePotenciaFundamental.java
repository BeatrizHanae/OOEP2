package ooep2;

import static org.junit.Assert.*;

import org.junit.Test;

import model.ModelFluxoDePotenciaFundamental;

public class TesteModelFluxoDePotenciaFundamental {

	private ModelFluxoDePotenciaFundamental teste = new ModelFluxoDePotenciaFundamental();
	private double t, amplitudeVRMS, anguloVRMS, amplitudeIRMS, anguloIRMS, valorTeste, valorEsperado;
	
	@Test
	public void testaOndaTensao() {
		amplitudeVRMS = 220;
		anguloVRMS = 30;
		t= 0;	
		valorTeste = teste.OndaTensao(amplitudeVRMS, t, anguloVRMS);
		valorEsperado = 33.93531;
		
		assertEquals(valorEsperado,valorTeste,0.01);	
	}
	
	@Test
	public void testaOndaCorrente() {
		amplitudeIRMS = 50;
		anguloIRMS = 45;
		t = 0;
		valorTeste = teste.OndaCorrente(amplitudeIRMS, t, anguloIRMS);
		valorEsperado = 26.266;
		
		assertEquals(valorEsperado,valorTeste,0.01);	
	}
	
	@Test
	public void testaPotenciaInst() {
		amplitudeVRMS = 220;
		anguloVRMS = 30;
		amplitudeIRMS = 50;
		anguloIRMS = 45;	
		t = 0;
		valorTeste = teste.OndaPotenciaInstanea(amplitudeVRMS, t, anguloVRMS, anguloIRMS, amplitudeIRMS);
		valorEsperado = 891.3484;
		
		assertEquals(valorEsperado,valorTeste,0.03);	
	}
	
	@Test
	public void testaAtiva() {
		amplitudeVRMS = 220;
		anguloVRMS = 0;
		amplitudeIRMS = 39;
		anguloIRMS = 35;	
		valorTeste = teste.ValorPotAtiva(amplitudeVRMS, anguloVRMS, anguloIRMS, amplitudeIRMS);
		valorEsperado = 7028;
		
		assertEquals(valorTeste,valorEsperado,0);	
	}
	
	@Test
	public void testaReativa() {
		amplitudeVRMS = 220;
		anguloVRMS = 0;
		amplitudeIRMS = 39;
		anguloIRMS = 35;
		valorTeste = teste.ValorPotReativa(amplitudeVRMS, anguloVRMS, anguloIRMS, amplitudeIRMS);
		valorEsperado = -4921;
		
		assertEquals(valorEsperado,valorTeste,0.01);	
	}
	
	@Test
	public void testaPotenciaAparente() {
		amplitudeVRMS = 220;
		amplitudeIRMS = 39;
		valorTeste = teste.ValorPotAparente(amplitudeVRMS, amplitudeIRMS);
		valorEsperado = 8580;
		
		assertEquals(valorEsperado,valorTeste,0);	
	}
	
	@Test
	public void testaFatorPot() {
		anguloVRMS = 0;
		anguloIRMS = 35;
		valorTeste = teste.ValorFatorPot(anguloVRMS, anguloIRMS);
		valorEsperado = 0.82;
		
		assertEquals(valorEsperado,valorTeste,0.01);

	}


}
