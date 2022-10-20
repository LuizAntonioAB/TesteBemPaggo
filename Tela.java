package br.luiz.bempaggo;

public class Tela {
	
	
	public void inicial() {
		System.out.println("+-------------------------------+");
		System.out.println("|            MENU               |");
		System.out.println("| 1: Para entrar na sua conta   |");
		System.out.println("| 2: Para criar uma conta       |");
		System.out.println("|                               |");
		System.out.println("+-------------------------------+");
	}
	
	public void logado() {
		System.out.println("+----------------------------+");
		System.out.println("|            MENU            |");
		System.out.println("| 1: Consultar saldo         |");
		System.out.println("| 2: Sacar dinheiro          |");
		System.out.println("| 3: Visualizar extrato      |");
		System.out.println("| 4: Transferir dinheiro     |");
		System.out.println("| 5: Depositar dinheiro      |");
		System.out.println("| 6: Realizar pagamento      |");
		System.out.println("| 7: Criar nova conta        |");
		System.out.println("| 8: Encerrar conta          |");
		System.out.println("|                            |");
		System.out.println("| 0: Encerrar sessao e sair  |");
		System.out.println("|                            |");
		System.out.println("+----------------------------+");
	}
	
	public void criarConta() {
		System.out.println("+-------------------------------+");
		System.out.println("|         CRIANDO CONTA         |");
		System.out.println("| Digite seu nome e em seguida  |");
		System.out.println("| a sua identidade:             |");
		System.out.println("|                               |");
		System.out.println("+-------------------------------+");
	}
	
	public void logarConta() {
		System.out.println("+-------------------------------+");
		System.out.println("|             LOGIN             |");
		System.out.println("| Digite seu nome ou identidade |");
		System.out.println("| para entrar:                  |");
		System.out.println("|                               |");
		System.out.println("+-------------------------------+");
	}
	
	public void mensagem(String mensagem) {
		System.out.println("+-------------------------------+");
		System.out.println(mensagem);
		System.out.println("+-------------------------------+");
	}
}
