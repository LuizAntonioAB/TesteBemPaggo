package br.luiz.bempaggo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TesteGerenciaConta {
	@Test
	void criarConta() throws Exception {
		GerenciaContas testando = new GerenciaContas();
		testando.criarConta();
		//assertEquals(Boolean.TRUE, (Object) testando.estaLogado());
	}
}
