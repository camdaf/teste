package model;

import java.sql.*;

public class Conexao {
	private String host;
	private String usuario;
	private String senha;
	private String banco;

	public Conexao() {

		this.host = "127.0.0.1"; // localhost
		this.banco = "tec_prog_2023_sistema_aluno";
		this.usuario = "root";
		this.senha = "";
	}

	public Connection getConexao() {
		String url="jdbc:mysql://" + this.host + ":3306/" + this.banco + "?enabledTLSProtocols=TLSv1.2&verifyServerCertificate=false&useSSL=true";
		try {
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException ex) {
			System.out.println("Conex�o com MYSQL n�o realizada");
			ex.printStackTrace();
		}
		return null;
	}

}
