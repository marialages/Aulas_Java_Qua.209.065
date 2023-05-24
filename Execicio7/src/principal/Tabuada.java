package principal;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um programa que receba o tipo de operação a ser realizada 
		 * (soma, divisão, multiplicação, subtração) e imprima a tabuada desse número. ex.: 1x2 = 2, 1x3 = 3... */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o tipo de operação que deseja:");
		char operacao = sc.next().charAt(0);
		
		System.out.println("A tabuada de qual número deseja?");
		int numero =sc.nextInt();
	
	
	switch (operacao) {
	case '+':
		for(int i = 1; i <= 10; i++ ) {
 		System.out.println(numero + "+" + i + " = " + (i + numero) );
		}
		break;
	case '-':
		int aux = numero;
		for(int i = 1; i <= 10; i++){
	 		System.out.println((aux+1)+ " - " + (numero) + " = " +((aux)- numero));
			}
		break;
	case '*':
		for(int i = 1; i <= 10; i++) {
			System.out.println(numero + "*" + i + "=" +(i* numero));
		}
		break;
	case '/':
		for(int i = 1; i <= 10; i++) {
			System.out.println((numero * i)+ "/" + numero + " = "+ (numero * 1 / numero));
		}
		break;
	
	default:
		System.out.println("Opção não encontrada!");
		break;
	}
	}}	
	
	
	
