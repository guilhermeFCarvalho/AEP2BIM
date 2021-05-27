package aep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AlunoRepositorio {
	private Connection conexao;
	public AlunoRepositorio(){
		abrirConexão();
	}
	private void abrirConexão() {
		try {
			try {
				conexao = DriverManager.getConnection("jdbc:h2:~/bd-aep","sa","");
				conexao.close();
			} catch (Exception e) {
				System.out.println("Opa, acho que o banco já estava criado...");
			}
			conexao = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/bd-aep","sa","");			
			PreparedStatement psCreateTable = conexao.prepareStatement("create table if not exists aluno ("
					+ "nome varchar(255) not null, "
					+ "matricula varchar(255) not null"
					+ ")");
			psCreateTable.execute();
			psCreateTable.close();
			System.out.println("Foi.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
