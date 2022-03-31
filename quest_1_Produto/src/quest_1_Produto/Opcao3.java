package quest_1_Produto;

import java.sql.Connection;
import java.sql.SQLException;

public class Opcao3 {

	int id = 2;
	
	public void deletarItem(Connection connection) throws SQLException {
		
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		produtoDao.deletarItem(id);
		
	}
}
