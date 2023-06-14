package principal;

import java.util.Scanner;

import entities.Estoque;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Estoque estoque = new Estoque("Maçã", 1.56, 10);
		
		//System.out.println(estoque);
		
		System.out.println("Entre com a descrição do produto: ");
		String nome = sc.nextLine();
		//estoque.setDescricao(sc.nextLine());
		System.out.println("Digite a quantidade: ");
		int qtd = sc.nextInt();
		//estoque.adicionaProduto(sc.nextInt());
		System.out.println("Digite o valor ");
		double valor = sc.nextDouble();
		//estoque.setPreco(sc.nextDouble());
		
		Estoque estoque = new Estoque(nome, valor, qtd);
			
		System.out.println(estoque);
		
		System.out.println("Quantidade a ser removida: ");
		estoque.removeProduto(sc.nextInt());
		
		System.out.println(estoque);
		
		sc.close();

	}
}