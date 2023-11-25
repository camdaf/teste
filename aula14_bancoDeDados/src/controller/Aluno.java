package controller;

public class Aluno {

	//POJO
	private int id;
	private String nome;
	private int matricula;
	
	public Aluno(int id, String nome, int matricula) {
		this.id= id;
		this.nome = nome;
		this.matricula = matricula;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}
	
	
}
