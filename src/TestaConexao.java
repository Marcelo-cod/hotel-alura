import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperarConexao();
		System.out.println("Conectado");
		Statement stm = connection.createStatement();
		stm.execute("SELECT ID, NOME, SOBRENOME FROM HOSPEDES");
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			Integer id = rst.getInt("ID");
			System.out.println(id);
			String nome = rst.getString("NOME");
			System.out.println(nome);
			String sobrenome = rst.getString("SOBRENOME");
			System.out.println(sobrenome);
		}
				connection.close();
	}

}
