package aep;


public class AppChamada implements InterfaceAlunos {
	public static void main(String[] args) {
		

		a1.inserir(aluno01);
		a1.inserir(aluno02);
		a1.inserir(aluno03);
		a1.inserir(aluno04);
		a1.inserir(aluno05);
		a1.inserir(aluno06);
		a1.inserir(aluno07);
		a1.inserir(aluno08);
		a1.inserir(aluno09);
		a1.inserir(aluno10);
		

		
       /* int totalA1 = a1.getTotalFaltas(aluno01);
        int totalA2 = a1.getTotalFaltas(aluno02);
        
        System.out.println("a1: " + totalA1 );
        System.out.println("a2: " + totalA2 );*/
        
		a1.iniciarChamada();
		apresentarTodos(a1);
	    
		a1.darFalta(aluno01);
		
		a1.darFalta(aluno02);
		
		
		apresentarTodos(a1);
		
		
		
		
	}
	
	
	private static void apresentarTodos(AlunoRepositorio repo){
		System.out.println("\n_____________________________");
		int total;
        for (Aluno a : repo.getTodos()) {
        	System.out.println(a.getIdAluno()+ " " + a.getNome() + " " + a.getMatricula() + " " + a.isPresente() + " " + a.getFalta());
	
        }
        System.out.println("_____________________________");
		
	}
	

}
