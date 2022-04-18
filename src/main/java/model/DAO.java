package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/dados?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "shamanking";

	public Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	/*
	 * public void testaConexao() { try { Connection con = conectar();
	 * System.out.println(con); con.close();
	 * 
	 * } catch (Exception e) { System.out.println(e); }
	 * 
	 * }
	 */

	/* CRUD create */
	public void inserirCandidato(Pessoa candidato) {
		String create = "insert into dados (nome,sobrenome,cpf,datanascimento,idade,maior_idade,vaga) values(?,?,?,?,?,?,?)";
		try {
			
				Connection con = conectar();
				PreparedStatement pst = con.prepareStatement(create);
				pst.setString(1, candidato.getNome());
				pst.setString(2, candidato.getSobrenome());
				pst.setString(3, candidato.getCpf());
				pst.setString(4, candidato.getDataNascimento());
				pst.setString(5, candidato.getIdade());
				pst.setString(6, candidato.getMaiorIdade());
				pst.setString(7, candidato.getVaga());
				pst.executeUpdate();
				con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

//READ
	public ArrayList<Pessoa> listarCandidato() {
		ArrayList<Pessoa> candidatos = new ArrayList<>();
		String read = "select * from dados order by vaga;";
		try {

			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(read);
			ResultSet rs = pst.executeQuery();
			// laço
			while (rs.next()) {
				// variaveis do banco
				String nome = rs.getString("nome");
				String sobrenome = rs.getString("sobrenome");
				String cpf = rs.getString("cpf");
				String datanascimento = rs.getString("datanascimento");
				String idade = rs.getString("idade");
				String maioridade = rs.getString("maior_idade");
				String vaga = rs.getString("vaga");
				candidatos.add(new Pessoa(nome, sobrenome, cpf, datanascimento, idade, maioridade, vaga));

			}
			con.close();
			return candidatos;
		} catch (Exception e) {
			System.out.println(e);
			return null;

		}

	}

}
