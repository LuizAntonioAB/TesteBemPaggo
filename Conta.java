package br.luiz.bempaggo;
import java.util.Random;
import java.util.ArrayList;
import java.util.List;

public class Conta {
	public String numero;
	public Integer saldo, tipo;
	public List<Integer> estrato;
	public boolean encerrda;

	public Conta(int saldoInicial, int tipo) {
		this.saldo = saldoInicial;
		this.tipo = tipo;
		this.encerrda = false;

		char numero[] = new char[9];
		Random aleatorio = new Random();
		for (int i = 0; i < 8; i++) {
			numero[i] = (char) (aleatorio.nextInt(10) + (int) '0');
			numero[8] = (char) (((int) numero[8] + (int) numero[i]) % 10);
		}
		numero[8] = (char) ((int) numero[8] + (int) '0');
		this.numero = String.copyValueOf(numero);

		List<Integer> estrato = new ArrayList<>();
		this.estrato = estrato;
	}

	public void sacar(int valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Saque concluido. \nRetire as notas do cache e as verifique.");
		} else
			System.out.println("Saldo insuficiente! \nVerifique os valores de sua conta e saque desejado.");

	}

	public void depositar(int valor) {
		this.saldo += valor;
	}

	public void transferir(int valor, Conta outraConta) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			outraConta.saldo += valor;
			System.out.println("Transferencia realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente! \nVerifique os valores de sua conta e saque desejado.");
		}
	}

	public void consultarSaldo() {
		System.out.println("O saldo da sua conta eh de R$ " + this.saldo / 100 + "," + this.saldo % 100);

	}

	public void encerrarConta() {
		if (this.saldo >= 0) {
			System.out.println("Voce nao pode encerrar a sua conta enquanto possuir debitos nela.");
		} else {
			System.out.printf("Conta encerrada com sucesso");
			this.encerrda = true;
		}
	}

}
