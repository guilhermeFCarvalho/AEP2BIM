package aep;

public class Aluno {
	
	private String nome;
	private String matricula;
	private int falta;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}

}
