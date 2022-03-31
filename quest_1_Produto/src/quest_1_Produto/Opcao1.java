package quest_1_Produto;

import java.sql.Connection;
import java.sql.SQLException;

public class Opcao1 {

	
	public void opcao1(Connection connection) throws SQLException {
		

			
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
				produtoDao.limpar();
				
			Produto comada = new Produto(1, "Fusca", "Ano 1995, Cor: Preto", 27999.99f, 1);
				produtoDao.salvar(comada);
			Produto television = new Produto(2, "KIT Turbo", "Suspenção a ar, Nitro, ar concionado", 15000f, 1);
				produtoDao.salvar(television);
			Produto computador = new Produto(3, "Gasolina free", "Um ano de gasolina por nossa conta", 0f, 1);
				produtoDao.salvar(computador);
	
	}
	
}
	
