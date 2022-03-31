package quest_1_Produto;


import java.sql.Connection;
import java.sql.SQLException;



public class Main {

	public static void main(String[] args) throws SQLException {
	
		
		
		try(Connection connection = new CriarConexao().recuperarConexao()){
			
			InserirScanner iniciar = new InserirScanner();
			ProdutoDAO produtoDao = new ProdutoDAO(connection);
			Opcao1 opcao1 = new Opcao1();
			Opcao2 opcao2 = new Opcao2();
			Opcao3 opcao3 = new Opcao3();
				
			int nValidacao = 1;
			
			iniciar.iniciaScanner();
			
			while(nValidacao <= 1) {
				
			if(iniciar.getNumero() == 1) {
				
				opcao1.opcao1(connection);
				produtoDao.listar();
				iniciar.iniciaScanner();
				
				
			}else if(iniciar.getNumero() == 2) {
				
				opcao2.atualizar(connection);
				produtoDao.listar();
				iniciar.iniciaScanner();
				
				
			}else if(iniciar.getNumero() == 3) {
				
				opcao3.deletarItem(connection);
				produtoDao.listar();
				iniciar.iniciaScanner();
				
			}else if(iniciar.getNumero() == 0) {
				
				System.out.println("SESSÃO CONCLUÍDA");
				break;
				
			}else if(iniciar.getNumero() > 3) {
				
				iniciar.iniciaScanner();
			}
			
			
			}
			
			
			
					
		}
	}

}
