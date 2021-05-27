package aep;

public class Aluno {
	
	private int idAluno;
	private String nome;
	private String matricula;
	private int falta;
	
	public Aluno(int idAluno, String nome, String matricula) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	
	public int getIdAluno() {
		return idAluno;
	}

	public String getNome() {
		return nome;
	}


	public String getMatricula() {
		return matricula;
	}

}
