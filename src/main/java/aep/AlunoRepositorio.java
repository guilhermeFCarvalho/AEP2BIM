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
					+ "idAluno number not null"
					+ "primary key(idAluno)"
					+ ")");
			psCreateTable.execute();
			psCreateTable.close();
			System.out.println("Banco criado.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void inserir(Aluno novo) {
		try {
			PreparedStatement psInsert = conexao.prepareStatement(
					"insert into aluno(idAluno, nome, matricula) values (?,?, ?)");
			psInsert.setInt(1, novo.getIdAluno());
			psInsert.setString(2, novo.getNome());
			psInsert.setString(3, novo.getMatricula());
			psInsert.execute();
			psInsert.close();
			System.out.println("Insert realizado");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	public void deletar(Aluno aluno) {
		try {
			PreparedStatement psDelete =  conexao.prepareStatement(
					"delete from aluno where idAluno = ? ");
			psDelete.setInt(1, aluno.getIdAluno());
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
