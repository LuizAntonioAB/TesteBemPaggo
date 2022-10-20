package br.luiz.bempaggo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TesteConta {
	@Test
	void criarConta() throws Exception {
		Integer soma = new Conta(Integer.valueOf(1), 6).saldo;
		assertEquals(Integer.valueOf(1), soma );
	}
}
