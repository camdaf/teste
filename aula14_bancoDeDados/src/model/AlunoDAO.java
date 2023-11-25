package model;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import controller.Aluno;

public class AlunoDAO {

	public ArrayList<Aluno> selecionarTodosAlunos() {
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();

		try {
			Connection conexao = new Conexao().getConexao();

			String query = "select * from aluno ";
			ResultSet dados = conexao.prepareStatement(query).
			executeQuery();
			
			while(dados.next()) {
				String nome=dados.getString("nome");
				int id= dados.getInt("id_aluno");
				int matricula= dados.getInt("matricula");
				
				Aluno a = new Aluno(id, nome, matricula);
				alunos.add(a);
				
			}
			conexao.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return alunos;
	}
}
