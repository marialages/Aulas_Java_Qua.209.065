package entities;

public class Pessoa {

	public String nome;
	public char sexo;
	public int idade;
	
	//funções em classes são chamadas de metodo;
	public void retornaIdade(int anoInserido) {
		idade = 2023 - anoInserido;
		
	}
}
