package principal;

import java.util.Scanner;

public class Argumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Fa�a um programa, com uma fun��o que necessite de tr�s argumentos, e que forne�a a soma desses tr�s argumentos

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero 1:");
		int numero1 = sc.nextInt();
		System.out.println("Insira o numero 2: ");
		int numero2 = sc.nextInt();
		System.out.println("Insira o numero 3: ");
		int numero3 = sc.nextInt();

		/* ou 
		 * System.out.println("Estre com  os 3 numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3= sc.nextInt();*/

		somaNumeros(numero1, numero2, numero3);
		sc.close();
	}
	
	static void somaNumeros(int x, int y, int z) {
		System.out.println("A somatoria dos n�meros �:");
		System.out.println(x + y + z);
	}


}
