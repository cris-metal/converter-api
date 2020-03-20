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
		assertEquals(conversorService.converteNumeralParaExtenso(15), "quinze");
		assertNotEquals(conversorService.converteNumeralParaExtenso(15), "onze");
		assertEquals(conversorService.converteNumeralParaExtenso(19), "dezenove");
	}

	@Test
	public void montaDezena(){
		assertEquals(conversorService.converteNumeralParaExtenso(23), "vinte e três");
		assertEquals(conversorService.converteNumeralParaExtenso(99), "noventa e nove");
		assertNotEquals(conversorService.converteNumeralParaExtenso(23), "doze");

	}

	@Test
	public void montaCentena(){
		assertEquals(conversorService.converteNumeralParaExtenso(207), "duzentos e sete");
		assertEquals(conversorService.converteNumeralParaExtenso(-207), "menos duzentos e sete");
		assertEquals(conversorService.converteNumeralParaExtenso(100), "cem");
		assertEquals(conversorService.converteNumeralParaExtenso(102), "cento e dois");
		assertEquals(conversorService.converteNumeralParaExtenso(291), "duzentos e noventa e um");
		assertEquals(conversorService.converteNumeralParaExtenso(999), "novecentos e noventa e nove");
		assertNotEquals(conversorService.converteNumeralParaExtenso(231), "doze");

	}

	@Test
	public void montaMilhar(){
		assertEquals(conversorService.converteNumeralParaExtenso(9207), "nove mil duzentos e sete");
		assertEquals(conversorService.converteNumeralParaExtenso(9007), "nove mil e sete");
		assertEquals(conversorService.converteNumeralParaExtenso(85291), "oitenta e cinco mil duzentos e noventa e um");
		assertEquals(conversorService.converteNumeralParaExtenso(-85291), "menos oitenta e cinco mil duzentos e noventa e um");
		assertEquals(conversorService.converteNumeralParaExtenso(99999), "noventa e nove mil novecentos e noventa e nove");
		assertEquals(conversorService.converteNumeralParaExtenso(4200), "quatro mil e duzentos");
		assertNotEquals(conversorService.converteNumeralParaExtenso(95555), "doze");

	}
}
