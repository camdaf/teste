package view;

import java.sql.Connection;
import java.util.ArrayList;

import controller.Aluno;
import model.AlunoDAO;
import model.Conexao;

public class Main {
	public static void main(String[] args) {

//		Connection conexao = new Conexao().getConexao();

		
		AlunoDAO alunos= new AlunoDAO();
		ArrayList<Aluno> a= alunos.selecionarTodosAlunos();
		
		for (Aluno aluno : a) {
			System.out.println(aluno.getId() + " - "+  aluno.getMatricula() + " - "+aluno.getNome());
		}
		
	}
}
