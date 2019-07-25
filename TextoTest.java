package com.db1.db1start;

import org.junit.Assert;
import org.junit.Test;

public class TextoTest {
	
	@Test
	public void letraMaiuscula() {
		Texto textos = new Texto ("adriano");
		String texto = textos.letraMaiusculo();
		Assert.assertEquals("ADRIANO", texto);		
	}
	
	@Test
	public void letraMinuscula() {
		Texto textos = new Texto ("ADRIANO");
		String texto = textos.letraMinuscula();
		Assert.assertEquals("adriano", texto);
	}
	
	@Test
	public void numeroDeLetras() {
		Texto textos = new Texto("ADRIANO");
		Integer texto = textos.numeroLetras();
		Assert.assertEquals(7, texto, 0.001);
	}
	
	@Test
	public void numeroDeLetrasEspaco() {
		Texto textos = new Texto(" ADRIANO ");
		int texto = textos.numeroLetrasEspaco();
		Assert.assertEquals(9, texto);
	}
	
	@Test
	public void numeroDeLetrasSemEspaco() {
		Texto textos = new Texto(" ADRIANO ");
		int texto = textos.numeroLetrasSemEspaco();
		Assert.assertEquals(7, texto);
	}
	
	@Test
	public void quatroPrimeirasLetras() {
		Texto textos = new Texto ("ADRIANO");
		String texto = textos.quatroPrimeirasLetras();
		Assert.assertEquals("Adri", texto);
	}
	
	@Test
	public void TerceiraLetra() {
		Texto textos = new Texto ("Adriano Nunes");
		String texto = textos.apartirDaTerceiraLetra();
		Assert.assertEquals("iano Nunes", texto);
	}
	
	@Test
	public void quatroUltimasLetras() {
		Texto textos = new Texto ("Adriano Nunes");
		String texto = textos.quatroUltimasLetras();
		Assert.assertEquals("unes", texto);
	}
	
	@Test
	public void substituiPrimeiroNome() {
		Texto  textos = new Texto ("Adriano Nunes");
		String texto = textos.substituiPrimeiroNome();
		Assert.assertEquals("ADRIANO Nunes", texto);
	}
	
	@Test
	public void textoSeparado() {
		Texto textos = new Texto ("Adriano, Nunes, Silva");
		String[] arreyString = textos.textoSeparadamente();
		String[] esperado = {"Adriano", " Nunes", " Silva"};
		Assert.assertArrayEquals(esperado, arreyString);
	}
	
	@Test
	public void numeroDeVogais() {
		Texto textos = new Texto ("aeioudfg");
		int texto = textos.numeroVogais();
		Assert.assertEquals(5, texto);
	}
	
	@Test
	public void textoInvertido() {
		Texto textos = new Texto ("Adriano");
		String texto = textos.textoInvertido();
		Assert.assertEquals("onairdA", texto);
	}
	


}
