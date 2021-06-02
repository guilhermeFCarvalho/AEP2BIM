package aep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



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
                System.out.println("Opa, acho que o banco j� estava criado...");
            }
			conexao = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/bd-aep","sa","");			
			PreparedStatement psCreateTable = conexao.prepareStatement("create table if not exists aluno ("
					+ "nome varchar(255) not null, "
					+ "matricula varchar(255) not null,"
					+ "idAluno number not null,"
					+ "totalFaltas number,"
					+ "presente boolean not null,"
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
					"insert into aluno(idAluno, nome, matricula, totalFaltas, presente) values (?, ?, ?, ?, ?)");
			psInsert.setInt(1, novo.getIdAluno());
			psInsert.setString(2, novo.getNome());
			psInsert.setString(3, novo.getMatricula());
			psInsert.setInt(4, novo.getFalta());
			psInsert.setBoolean(5, novo.isPresente());
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
			System.out.println("Tabela deletada");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	
	public void atualizar(Aluno aluno) {
		try {
			PreparedStatement psUpdate =  conexao.prepareStatement("update aluno set nome = ?, matricula = ?, totalFaltas = ?, presente = ? where idAluno = ?");
			psUpdate.setString(1, aluno.getNome());
			psUpdate.setString(2, aluno.getMatricula());
			psUpdate.setInt(3, aluno.getFalta());
			psUpdate.setInt(4, aluno.getIdAluno());
			psUpdate.setBoolean(5, aluno.isPresente());
			psUpdate.execute();
			psUpdate.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Aluno> getTodos(){
		List<Aluno> todos =  new ArrayList<>();
		try {
			PreparedStatement psSelect = conexao.prepareStatement(
					"select idAluno, nome, matricula, presente, totalFaltas from aluno");
			ResultSet rsTodos = psSelect.executeQuery();
			while (rsTodos.next()) {
				Aluno selecionado = new Aluno(
						rsTodos.getInt("idAluno"), 
						rsTodos.getString("nome"), 
						rsTodos.getString("matricula"),
						rsTodos.getBoolean("presente"),
						rsTodos.getInt("totalFaltas")
						);
						todos.add(selecionado);
			}
			psSelect.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return todos;
	}
	
	public void darFalta(Aluno aluno) {
		System.out.println("Deseja dar falta para o aluno? **fazer verifica��o");
		aluno.setPresente(false);
		aluno.setFalta();
		try {
			PreparedStatement psUpdate =  conexao.prepareStatement("update aluno set presente = ?, totalFaltas = ? where idAluno = ?");
			psUpdate.setBoolean(1, aluno.isPresente());
			psUpdate.setInt(2, aluno.getFalta());
			psUpdate.setInt(3, aluno.getIdAluno());
			psUpdate.execute();
			psUpdate.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}
	
}

