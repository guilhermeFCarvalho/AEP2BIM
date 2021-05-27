package aep;

public class AppChamada {
	public static void main(String[] args) {
		
		AlunoRepositorio a1 =  new AlunoRepositorio();
		Aluno aluno1 =  new Aluno("Guilherme", "200523782");
		Aluno aluno2 =  new Aluno("Will", "200042982");
		
		a1.inserir(aluno1);
		
		a1.inserir(aluno2);
		
	}

}
