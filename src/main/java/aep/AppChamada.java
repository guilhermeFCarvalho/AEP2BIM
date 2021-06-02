package aep;


public class AppChamada {
	public static void main(String[] args) {
		
		AlunoRepositorio a1 =  new AlunoRepositorio();
		Aluno aluno01 =  new Aluno(1,"Guilherme", "200523782", true , 0);
        Aluno aluno02 =  new Aluno(2,"Willian", "200042982", true , 0);
        Aluno aluno03 =  new Aluno(3,"Maria", "20007982", true ,0);
        Aluno aluno04 =  new Aluno(4,"Joao", "20009075",true , 0);
        Aluno aluno05 =  new Aluno(5,"Marcos", "20009591",true , 0);
        Aluno aluno06 =  new Aluno(6,"Rafael", "20005409",true , 0);
        Aluno aluno07 =  new Aluno(7,"Aparecido", "20008660",true , 0);
        Aluno aluno08 =  new Aluno(8,"Arthur", "20006831", true ,0);
        Aluno aluno09 =  new Aluno(9,"Giovana", "20008581",true , 0);
        Aluno aluno10 =  new Aluno(10,"Fernanda","20003569",true , 0);
		
		a1.inserir(aluno01);
		a1.inserir(aluno02);
		

		
		apresentarTodos(a1);
	    
		
		
		apresentarTodos(a1);
		
		
		
		
	}
	
	
	private static void apresentarTodos(AlunoRepositorio repo){
		System.out.println("\n_____________________________");
        for (Aluno a : repo.getTodos()) {
        	System.out.println(a.getIdAluno()+ " " + a.getNome() + " " + a.getMatricula() + " " + a.isPresente() + " " + a.getFalta());
        }
        System.out.println("_____________________________");
		
	}
	

}
