package principal;

import java.util.Scanner;

public class altura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Fa�a um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;	
		 2.Fa�a um programa onde o 1 � sim e 0 � n�o, toda vez que for sim entre em um bloco de c�digo e some mais 1 a uma
		 vari�vel contadora;
		3.Fa�a o mesmo programa do exerc�cio 1 mas usando while;*/
		
		
		/*Scanner altura = new Scanner(System.in);
		
		double alt1;
		double alt2;
		double alt3;
		double alt4;
		double alt5;
		
		System.out.println("Insira altura 1:");
		alt1 = altura.nextDouble();
		
		System.out.println("Insira altura 2:");
		alt2 = altura.nextDouble();
		
		System.out.println("Insira altura 3:");
		alt3 = altura.nextDouble();
		
		System.out.println("Insira altura 4:");
		alt4 = altura.nextDouble();
		
		System.out.println("Insira altura 5:");
		alt5 = altura.nextDouble();
		
		
		double soma = ((alt1+ alt2+ alt3+ alt4 + alt5)/(5));
		
		System.out.println("A media de altra �:" + soma + " m");
		
		altura.close();*/
		
		/*System.out.println("Deseja continuar?");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while( opcao == 's') {
			j++;
			System.out.println("Deseja continuar?");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Entrou no while:" + j);*/
		
		
		Scanner sn = new Scanner(System.in);
		System.out.println("escreva sim ou n�o:");
		char opcao = sn.next().charAt(0);
		int s = 0;
		while (opcao == 'sim' ) {
			s++;
			if(sim != 0)
			System.out.println("n�o");
			opcao = sn.next().charAt(s);
		}
		
		
		}

}
