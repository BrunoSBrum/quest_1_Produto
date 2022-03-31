package quest_1_Produto;

import java.sql.Connection;
import java.sql.SQLException;

public class Opcao2 {

	int id = 1;
	float preco = 1599999.99f;
	String descricao = "Ano 2022, cor Prata";
	String nome = " Lamborghini Urus";
	
	public void atualizar(Connection connection) throws SQLException{
			
		ProdutoDAO produtoDao = new ProdutoDAO(connection);
		
		produtoDao.atualizar(id, descricao, nome, preco);
		
		
	}


}
