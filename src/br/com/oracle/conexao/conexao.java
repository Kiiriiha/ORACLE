package br.com.oracle.conexao;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {
	
	private final static String link = "jdbc:mysql://localhost:3306";
	private final static String usuario = "root";
	private final static String senha = "";

	
	public static Connection ObterConexao() throws SQLException {
		return DriverManager.getConnection(link, usuario, senha);
	}
}
