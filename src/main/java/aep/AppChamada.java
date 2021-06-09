package aep;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class AppChamada implements InterfaceAlunos {
	public static void main(String[] args) {
		

		/*a1.inserir(aluno01);
		a1.inserir(aluno02);
		a1.inserir(aluno03);
		a1.inserir(aluno04);
		a1.inserir(aluno05);
		a1.inserir(aluno06);
		a1.inserir(aluno07);
		a1.inserir(aluno08);
		a1.inserir(aluno09);
		a1.inserir(aluno10);*/
		

		
       /* int totalA1 = a1.getTotalFaltas(aluno01);
        int totalA2 = a1.getTotalFaltas(aluno02);
        
        System.out.println("a1: " + totalA1 );
        System.out.println("a2: " + totalA2 );*/
        
		//a1.iniciarChamada();
		/*AlunoRepositorio.apresentarTodos(a1);
	    
		a1.darFalta(aluno01);
		
		a1.darFalta(aluno02);*/
		
		
		int opt = -1;
		
		String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
		Scanner input = new Scanner(System.in);
		
		a1.iniciarChamada();
		System.out.println("Data:" + timeStamp + "\r\nIniciando chamada");
		
		do{
			AlunoRepositorio.apresentarTodos(a1);
			System.out.println("Insira o número do aluno que deseja dar falta: ");
			
			opt = input.nextInt();
			switch (opt) {
			case 0:
				System.out.println("Finalizando chamada...");
				break;
			default:
				if (a1.buscarAluno(opt) != null) {
					a1.darFalta(a1.buscarAluno(opt));
				}else {
					System.out.println("Aluno não encontrado");
				}
				break;
			}
						
		} while (opt != 0);
		System.out.println("Relatório diário:");
		AlunoRepositorio.apresentarTodos(a1);
		
		
	}
	
	
	
	

}
