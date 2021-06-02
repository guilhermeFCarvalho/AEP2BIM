package aep;


public class AppChamada {
	public static void main(String[] args) {
		
		AlunoRepositorio a1 =  new AlunoRepositorio();
		Aluno aluno1 =  new Aluno(1,"Guilherme", "200523782", 0);
		Aluno aluno2 =  new Aluno(2,"Willian", "200042982", 0);
		
		//a1.inserir(aluno1);
		//a1.inserir(aluno2);
		
		//a1.atualizarMatricula(aluno2);
		//a1.atualizarNome(aluno2);
		
		apresentarTodos(a1);
	
		
		
		
	
		
		System.out.println(a1.getTodos());
		
		
	}
	
	
	private static void apresentarTodos(AlunoRepositorio repo){
		System.out.println("---------------");
		for (Aluno a : repo.getTodos()) {
			System.out.println(a.getIdAluno()+ " " + a.getNome() + " " + a.getMatricula());
		}
	}
	

}
