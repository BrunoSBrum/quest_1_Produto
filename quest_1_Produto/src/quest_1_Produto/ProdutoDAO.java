package quest_1_Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ProdutoDAO {
	
	private Connection connection;
	
	public ProdutoDAO(Connection connection) {
		this.connection = connection;
			
	}
	public void atualizar(int id, String descricao, String nome, float preco) throws SQLException {
		
		
		try(PreparedStatement pstm = connection.prepareStatement("UPDATE ESTOQUE SET NOME = ?, DESCRICAO = ?, PRECO = ? WHERE ID = ? ")){
		
		pstm.setString(1, nome);	
		pstm.setString(2, descricao); 
		pstm.setFloat(3, preco);
		pstm.setInt(4, id);
			
			int atualizacaoConfirmada = pstm.executeUpdate();
			
			if(atualizacaoConfirmada > 0) {
				System.out.println("Atualização concluida com sucesso");
				
			}else {
				System.out.println("erro na atualiazação");
			}
			
			
		}
	}
	
	public void limpar() throws SQLException {
		
		PreparedStatement stm = connection.prepareStatement("DELETE FROM ESTOQUE WHERE ID > ?");
			stm.setInt(1, 0);
			stm.execute();
		
			
	}
	
	public void salvar(Produto produto) throws SQLException {
		
		String sql =  "INSERT INTO ESTOQUE (ID, NOME, DESCRICAO, PRECO, QUANTIDADE) VALUES (?,?,?,?,?)";
		
		try(PreparedStatement pstm = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)){
			
			pstm.setInt(1, produto.getId());
			pstm.setString(2, produto.getNome());
			pstm.setString(3, produto.getDescricao());
			pstm.setFloat(4, produto.getPreco());
			pstm.setInt(5, produto.getQuantidade());
			pstm.execute();
		}
	}
	
	public void listar() throws SQLException{
		
		
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO, PRECO, QUANTIDADE from ESTOQUE");
		stm.execute();
		
		ResultSet rst = stm.getResultSet();
		
		while(rst.next()) {
			
			Integer id = rst.getInt("ID");
			String nome = rst.getString("NOME");
			String descricao = rst.getString("DESCRICAO");
			Float preco = rst.getFloat("PRECO");
			Integer quantidade = rst.getInt("QUANTIDADE");		
			
			System.out.println(id + " - " + nome + " - " + descricao + " - R$" + preco + " - " + "Qts: " + quantidade);
			}
		
		
		
	}
	
	public void deletarItem(int id)throws SQLException{
		
		try(PreparedStatement pstm = connection.prepareStatement("DELETE FROM ESTOQUE WHERE ID = ? ")){
			
			pstm.setInt(1, id);
			pstm.execute();
			
		System.out.println("Item " + id + " Removido da lista");
	}

}
	}
