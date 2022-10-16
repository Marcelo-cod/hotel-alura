package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		
		ComboPooledDataSource comboPooleDataSource = new ComboPooledDataSource();
		comboPooleDataSource.setJdbcUrl("jdbc:mysql://localhost/hotelalurabr?useTimezone=true&serverTimezone=UTC");
		comboPooleDataSource.setUser("root");
		comboPooleDataSource.setPassword("4398");
		
		dataSource = comboPooleDataSource;
		
	}
	
	public Connection recuperarConexao() {
		
		try {
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}
