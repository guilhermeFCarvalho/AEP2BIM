package aep;

public class Aluno {
	
	private int idAluno;
	private String nome;
	private String matricula;
	private int falta;
	private boolean presente;
	
	public Aluno(int idAluno, String nome, String matricula, boolean presente, int falta) {
		this.idAluno = idAluno;
		this.nome = nome;
		this.matricula = matricula;
		this.presente =  presente;
		this.falta = falta;
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



	public void setFalta(int falta) {
		this.falta = falta;
	}



	

}
