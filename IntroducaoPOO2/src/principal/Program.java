package principal;

import java.util.Scanner;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Nome:");
		pessoa.nome = sc.nextLine();
		System.out.println("Ano do nascimento: ");
		int ano = sc.nextInt();
		//pessoa.retornaIdade(sc.nextInt());podemos fazer assim tambem mas não é uma boa pratica
		System.out.println("Sexo:");
		pessoa.sexo = sc.next().charAt(0);
		
		pessoa.retornaIdade(ano);
				
		sc.close();
		
	
		
		/*pessoa.nome = "Maria";
		pessoa.sexo = 'F';
		pessoa.idade = 27;*/
		
		System.out.println(pessoa.nome + ",do sexo " + pessoa.sexo+ ","+ pessoa.idade +" anos.");

	}

}
