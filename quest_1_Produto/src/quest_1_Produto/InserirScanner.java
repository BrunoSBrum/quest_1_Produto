package quest_1_Produto;

import java.util.Scanner;

public class InserirScanner {

	Scanner texto = new Scanner(System.in);
	int numero;
	
	
	public void iniciaScanner() {
		
		System.out.println("\nOlá, Digite o código da função desejada:\n"
				+ "Listar itens padrões, digite 1\n"
				+ "Fazer upgrade do item 1, digite 2\n"
				+ "Remover o item 2, digite 3\n"
				+ "Encerrar sessão, digite 0\n");
	
		int num = texto.nextInt();
		texto.nextLine();
		numero = num;
		
		
	}


	public int getNumero() {
		return numero;
	}
	
	
	
}

