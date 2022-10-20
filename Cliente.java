package br.luiz.bempaggo;
import java.util.List;


public class Cliente {
	private String nome;
	private String cpf;
	private String cnpj;
	private String endereco;
	public List<Conta> contas;
	
	public Cliente(String nome, String identidade, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		if(identidade.length() == 11)
			this.cpf = identidade;
		else
			this.cnpj = identidade;
	}
	
	public void atualizarCadastro (String novoEndereco) {
		this.endereco = novoEndereco;
	}
	
	public void pedirEmprestimo (Integer valor) {
		System.out.println("Seu pedido esta sendo analisado. \nPor favor aguarde...");
	}
	
	public void pagarBoleto (String codigoBoleto) {
		System.out.println("O pagamento esta sendo processado. \nPor favor aguarde...");
	}
}
