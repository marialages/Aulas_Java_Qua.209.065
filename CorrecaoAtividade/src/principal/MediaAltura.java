package principal;

import java.util.Scanner;

public class MediaAltura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1.Fa�a um programa que leia a altura de 5 pessoas e mostre a media de altura entre elas;	
		 2.Fa�a um programa onde o 1 � sim e 0 � n�o, toda vez que for sim entre em um bloco de c�digo e some mais 1 a uma
		 vari�vel contadora;
		3.Fa�a o mesmo programa do exerc�cio 1 mas usando while;*/
		
		
		Scanner sc = new Scanner(System.in);
		
		double somaAltura = 0;
		double altura = 0;
		int contador = 0;
		
		/*for(int contador = 1; contador <= 5; contador++) {
			System.out.println("Insira a altura:");
			altura = sc.nextDouble();
			somaAltura += altura;
			System.out.println("A media das alturas �:" + (somaAltura /5));
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
		System.out.println("A m�dia das alturas � "+ (somaAltura /contador));
		sc.close();
		}
}
