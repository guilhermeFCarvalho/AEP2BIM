package aep;

public class AppChamada {
	public static void main(String[] args) {
		
		AlunoRepositorio a1 =  new AlunoRepositorio();
		
		Aluno aluno1 =  new Aluno("Guilherme", "200523782");
		
		a1.inserir(aluno1);
	}

}
