package com.campos.conversor.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConversorServiceTest {

	ConversorService conversorService;

	@Test
	private void montaUnidade(int numeral){
		conversorService.converteNumeralParaExtenso(15);
	}
}
