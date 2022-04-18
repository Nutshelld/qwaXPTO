package model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private DataSource dataSource;

	public ConnectionFactory() {
		ComboPooledDataSource comboPololedDataSource = new ComboPooledDataSource();
		comboPololedDataSource.setJdbcUrl("jdbc:mysql://localhost/dados?useTimezone=true&serverTimezone=UTC");
		comboPololedDataSource.setUser("root");
		comboPololedDataSource.setPassword("shamanking");
		comboPololedDataSource.setMaxPoolSize(15);
		this.dataSource = comboPololedDataSource;

	}

	public Connection recuperaConexao() throws SQLException {
		return this.dataSource.getConnection();

	}

	public void testcon() {
		try {
			Connection con = recuperaConexao();
			System.out.println(con);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
