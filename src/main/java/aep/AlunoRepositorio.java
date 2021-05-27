package aep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoRepositorio {
	private Connection conexao;
	public AlunoRepositorio(){
		abrirConexao();
	}
	private void abrirConexao() {
		try {
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
	public void inserir(Aluno novo) {
		try {
			PreparedStatement psInsert = conexao.prepareStatement(
					"insert into alunos(nome, matricula) values (?, ?)");
			psInsert.setString(1, novo.getNome());
			psInsert.setString(1, novo.getMatricula());
			psInsert.execute();
			psInsert.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
}
