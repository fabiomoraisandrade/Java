package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sqlSelect = "SELECT * FROM pessoas WHERE nome = ?";
		
		System.out.println("Informe o nome da pessoa para ser atualizada: ");
		String nomePessoa = entrada.nextLine();
		
		PreparedStatement stmt = conexao.prepareStatement(sqlSelect);
		stmt.setString(1, nomePessoa);
		ResultSet resultadoConsulta = stmt.executeQuery();
		
		Pessoa pessoaBanco = null;
		
		while(resultadoConsulta.next()) {
			int codigo = resultadoConsulta.getInt("codigo");
			String nome = resultadoConsulta.getString("nome");
			pessoaBanco = new Pessoa(codigo, nome);
		}
		
		System.out.println("A pessoa selecionada e: " + pessoaBanco.getNome() + " com codigo: " + pessoaBanco.getCodigo());
		
		System.out.println("Informe qual o nome para ser atualizado");
		String novoNome = entrada.nextLine();
		
		String sqlUpdate = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		PreparedStatement newSmtm = conexao.prepareStatement(sqlUpdate);
		newSmtm.setString(1, novoNome);
		newSmtm.setInt(2, pessoaBanco.getCodigo());
		System.out.println(newSmtm);
		
		newSmtm.execute();
		System.out.println("Pessoa atualizada com sucesso");
		
		
		conexao.close();
		entrada.close();
	}
}
