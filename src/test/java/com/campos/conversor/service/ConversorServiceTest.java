package com.campos.conversor.service;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ConversorServiceTest {

	ConversorService conversorService;

	@Before
	public void setUp() throws Exception {
		conversorService = new ConversorService();
	}

	@Test
	public void montaUnidade(){
		assertEquals(conversorService.converteNumeralParaExtenso(15), "Quinze");
		assertNotEquals(conversorService.converteNumeralParaExtenso(15), "Onze");
		assertEquals(conversorService.converteNumeralParaExtenso(19), "Dezenove");
	}

	@Test
	public void montaDezena(){
		assertEquals(conversorService.converteNumeralParaExtenso(23), "Vinte e Três");
		assertEquals(conversorService.converteNumeralParaExtenso(99), "Noventa e Nove");
		assertNotEquals(conversorService.converteNumeralParaExtenso(23), "Doze");

	}

	@Test
	public void montaCentena(){
		assertEquals(conversorService.converteNumeralParaExtenso(207), "Duzentos e Sete");
		assertEquals(conversorService.converteNumeralParaExtenso(291), "Duzentos e Noventa e Um");
		assertEquals(conversorService.converteNumeralParaExtenso(999), "Novecentos e Noventa e Nove");
		assertNotEquals(conversorService.converteNumeralParaExtenso(231), "Doze");

	}

	@Test
	public void montaMilhar(){
		assertEquals(conversorService.converteNumeralParaExtenso(9207), "Nove Mil Duzentos e Sete");
		assertEquals(conversorService.converteNumeralParaExtenso(85291), "Oitenta e Cinco Mil Duzentos e Noventa e Um");
		assertEquals(conversorService.converteNumeralParaExtenso(99999), "Noventa e Nove Mil Novecentos e Noventa e Nove");
		assertNotEquals(conversorService.converteNumeralParaExtenso(95555), "Doze");

	}
}
