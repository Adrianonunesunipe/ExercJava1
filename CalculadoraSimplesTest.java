package com.db1.db1start;

import org.junit.Test;
import org.junit.Assert;

public class CalculadoraSimplesTest {
	
	private CalculadoraSimples CalculadoraSimples;
	
	
	public void numeros(){
		CalculadoraSimples = new CalculadoraSimples (2,10,35.5,42.3,60.7);
	}
	
	@Test
	public void deveSomarDoisValores(){
		int soma = CalculadoraSimples.somar();
		Assert.assertEquals(12, soma);
		
	}

	@Test
	public void deveSubtrairDoisValores(){
		int subtrair = CalculadoraSimples.subtrair();
		Assert.assertEquals(8, subtrair);
	}
	
	@Test
	public void deveMultiplicarDoisValores(){
		int multiplicar = CalculadoraSimples.multiplicar();
		Assert.assertEquals(20, multiplicar);
	}
	
	@Test
	public void deveDividirDoisValores(){
		int dividir = CalculadoraSimples.dividir();
		Assert.assertEquals(5, dividir);
	}	
	
	@Test
	public void par(){
		int par = CalculadoraSimples.par();
		Assert.assertEquals(0, par);
	}
	
	@Test
	public void maior(){

		int maior = CalculadoraSimples.maior();
		Assert.assertEquals(10, maior);
	
	}
	@Test
	public void impar(){

		int impar = CalculadoraSimples.impar();
		Assert.assertEquals(50, impar);
	
	}
	
	@Test
	public void MenorValorEntreDoisDoubles() {
		double menorValor = CalculadoraSimples.menorValorEntreDoisDoubles();
		Assert.assertEquals(35.5, menorValor, 0.0001);
	}
	
	@Test 
	public void MenorValorEntreTresDoubles() {
		double menorValor = CalculadoraSimples.menorValorEntreTresDoubles();
		Assert.assertEquals(35.5, menorValor, 0.0001);
	}
	
	@Test
	public void mediaDeTresValores() {
		double media = CalculadoraSimples.mediaDeTresValores();
		Assert.assertEquals(46.1666, media, 0.0001);
	}
	
	@Test
	public void areaTriangulo() {
		double area = 	CalculadoraSimples.areaTriangulo();
		Assert.assertEquals(1.077, area, 0.0001);
	}

}	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	