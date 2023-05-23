package principal;

import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Faça um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;	
		 2.Faça um programa onde o 1 é sim e 0 é não, toda vez que for sim entre em um bloco de código e some mais 1 a uma
		 variável contadora;
		3.Faça o mesmo programa do exercício 1 mas usando while;*/
		
		
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0;
		double altura = 0;
		int contador = 0;
		
		/*for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Insira a altura:");
			altura = sc.nextDouble();
			somaAltura += altura;
			System.out.println("A media das alturas é:" + (somaAltura /5));
			sc.close();
			
		}*/
		
		while(contador < 5) {
		System.out.println("Insira a altura:" );
		altura = sc.nextDouble();
		somaAltura += altura;
		System.out.println(contador);
		contador++;
		}
		System.out.println(contador);
		System.out.println("A média das alturas é "+ (somaAltura /contador));
		sc.close();
		}
}
