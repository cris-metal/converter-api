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
	}

	@Test
	public void montaDezena(){
		assertEquals(conversorService.converteNumeralParaExtenso(23), "Vinte e Três");
		assertNotEquals(conversorService.converteNumeralParaExtenso(23), "Doze");

	}

	@Test
	public void montaCentena(){
		assertEquals(conversorService.converteNumeralParaExtenso(207), "Duzentos e Sete");
		assertEquals(conversorService.converteNumeralParaExtenso(291), "Duzentos e Noventa e Um");
		assertNotEquals(conversorService.converteNumeralParaExtenso(231), "Doze");

	}
}
