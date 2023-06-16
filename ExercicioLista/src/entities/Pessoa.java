package entities;
/*Crie uma classe pessoa com os atributos: nome, idade, telefone. Faça na classe principal uma lista 
 * que incremente uma nova pessoa e depois imprima todas as pessoas cadastradas.
 */
public class Pessoa {
	
	private String nome;
	private String telefone;
	private double idade;
	
	//from superclass cria o construtor padrao 
	
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public double getIdade() {
		return idade;
	}

	public void setIdade(double idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
	
		return "Nome: " + nome
				+ "\nTelefone: " + telefone
				+"\nIdade" +idade;
	}
	}
	

	 
