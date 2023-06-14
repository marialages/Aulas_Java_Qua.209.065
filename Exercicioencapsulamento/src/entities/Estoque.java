package entities;

public class Estoque {
	
	private String descricao;
	private double preco;
	private int quantidade;
	//private double valorTotal;
	
	public Estoque() {
		super();
	}
	
	public Estoque(String descricao, double preco, int quantidade) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}




	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}



	public int getQuantidade() {
		return quantidade;
	}



	/*public double getValorTotal() {
		return valorTotal;
	}*/

	public void adicionaProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public double retornaTotalEmEstoque() {
		return quantidade * preco;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto: " + descricao + "\nQuantidade: " + quantidade + "\nTotal em estoque: " + String.format("%.2f", retornaTotalEmEstoque());
	}
	
}