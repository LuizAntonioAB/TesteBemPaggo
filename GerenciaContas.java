package br.luiz.bempaggo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GerenciaContas {

	private Boolean logado;
	private Conta contaLogada;
	private Tela tela;
	private Scanner teclado;
	//private ;
	
	public GerenciaContas() {
		this.tela = new Tela();
		this.teclado = new Scanner(System.in);
		logado = Boolean.FALSE;
	}
	
	private Connection conectarBanco () {
		String url = "jdbc:postgresql://localhost:5432/DataBaseBank";
		String usuario = "postgres";
		String senha = "admin";
		try {
		    Class.forName("org.postgresql.Driver");
		    Connection conexao = DriverManager.getConnection(url, usuario, senha);
		    return(conexao);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return(null);
		} catch (SQLException e) {
			System.out.println(" Erro! não foi possível se conectar ao banco de dados");
		    e.printStackTrace();
		    return(null);
		}
	}
	
	public Boolean estaLogado() {
		return(this.logado);
	}
	
	public void logarConta () throws SQLException{
		this.tela.logarConta();
		
		String entrada = this.teclado.nextLine();
		String consulta = "SELECT NOME from CLIENTE where NOME = ".concat(entrada);
		Statement baseDados = (Statement) this.conectarBanco();
		ResultSet resposta = baseDados.executeQuery(consulta);
		this.logado = Boolean.TRUE;
	}
	
	public void criarConta () throws SQLException{
		this.tela.criarConta();
		
		String novoNome = this.teclado.nextLine();
		String novaIdentidade = this.teclado.nextLine();
		String consulta = "INSERT INTO CLIENTE (nome, identidade) VALUES ".concat(novoNome).concat(novaIdentidade);
		
		Statement baseDados = (Statement) this.conectarBanco();
		ResultSet resposta = baseDados.executeQuery(consulta);
		
		this.logado = Boolean.TRUE;
	}
	
}
