package aep;

public class Aluno {
	
	private int idAluno;
	private String nome;
	private String matricula;
	private int falta = 0;
	private boolean presente =  true;
	
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



	public boolean isPresente() {
		return presente;
	}



	public void setPresente(boolean presenca) {
		this.presente = presenca;
	}



	public int getFalta() {
		return falta;
	}



	public void setFalta() {
		this.falta++;
	}



	

}
