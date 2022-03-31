package quest_1_Produto;

public class Produto {

	Integer id;
	String nome;
	String descricao;
	Float preco;
	Integer quantidade;
	
	public Produto(Integer id, String nome, String descricao, Float preco, Integer quantidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Float getPreco() {
		return preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}
	
	

	
	
}
