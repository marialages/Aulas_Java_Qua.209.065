package principal;

import java.util.Scanner;

import entities.Livro;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //1
		
		System.out.println("Entre com o nome do livro:");
		String nome = sc.nextLine();
		System.out.println("Entre com a edição:");
		String edicao = sc.nextLine();
		System.out.println("Entre com o valor:");
		double valor = sc.nextDouble();
		
		Livro livro = new Livro (nome,edicao,valor);//2
		livro.setValor(valor);
		System.out.println(livro);
		
		sc.close();
		
		
	}

}

//1 vamos agora solicitar o que queremos do usuario 
//2 temos que instanciar a classe