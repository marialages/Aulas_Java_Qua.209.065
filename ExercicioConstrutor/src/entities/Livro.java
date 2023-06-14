package entities;

public class Livro {
	/*
	 * Ordem sugeria a seguir na classe :
	 *  1º atributos da classe 
	 *  2ºconstrutores
	 *  3º metodos get e set 
	 *  4º demais metodos
	 */
	//1 passo , colocar os atributos
	
	private String nome;
	private String edicao;
	private  double valor;
	//2 se todos os dados sao obrigatorios , tenho que fazer o construtor
	public Livro(String nome, String edicao, double valor) {
		super();
		this.nome = nome;
		this.edicao = edicao;
		this.valor = valor;
	
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		if(valor > 100) {
			this.valor += (valor * 0.3);
		}else {
		this.valor = valor;
	}
	}
	
	@Override
	public String toString() {
		return  "nome do livro:" + nome
						+"\nEdição:" + edicao
						+"\nValor: " + valor;
	}
	
	// o this serve pra diferenciar  o que é atributo da classe do parametro respondido 
	//fazemos o getter e setter (apenas de valor , que foi o que ele pediu);get pra obter , set pra atribuir
	//to string (pra retonar o valor quee desejamos , pois se deixar o padrao reorna o valor do objeto)
	//retira o super.to string e colocamos o que queremos que retorne 
	//\n pra haver a queebra de linha 
	// agora vamos prs principal 
	//vamos atribuir os 30 % no  set pq sao eles  que atribuem um valor ao livro 
}
