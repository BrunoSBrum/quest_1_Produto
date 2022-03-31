package quest_1_Produto;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class CriarConexao {
	
	public DataSource dataSource;
	
	public CriarConexao() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/produto?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("102030");
		comboPooledDataSource.setMaxPoolSize(16);
		
		this.dataSource = comboPooledDataSource;
		
	}
	
	
	public Connection recuperarConexao() throws SQLException {
		return this.dataSource.getConnection();
				
				
		
	}
	
}
