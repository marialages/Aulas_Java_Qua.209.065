package principal;

import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
/*Fa�a um programa que tenha uma classe funcion�rio com os atributos nome, cargo, salario.
 *  Verifique o salario e o cargo, se for gerente e ganhar menos que 5 mil, 
 *  recebe um b�nus no salario de 1.5 % no valor do salario base, se for funcion�rio e ganhar
 *   menos que 1500 ganha 2% sobre o salario base. 
 * Mostre o valor do salario bruto atualizado e os dados do funcion�rio;*/		

		Funcionario funcionario = new Funcionario();
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Entre com o nome:");
		funcionario.nome = sc.nextLine();
		System.out.println("Entre com o cargo:");
		funcionario.cargo = sc.nextLine();
		System.out.println("Entre com o salario:");
		funcionario.salario = sc.nextDouble();
		
		System.out.println("Salario: ");
		funcionario.verificaComissao();
		sc.close();
		
	}

}
