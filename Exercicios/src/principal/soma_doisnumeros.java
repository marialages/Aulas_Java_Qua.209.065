package principal;

import java.util.Scanner;

public class soma_doisnumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner doisnumero = new Scanner(System.in);
		
		int numero1 ;
		int numero2 ;
		
		System.out.println(" Escreva o numero 1: ");
		numero1 = doisnumero.nextInt();
		

		System.out.println(" Escreva o numero 2: ");
		numero2 = doisnumero.nextInt();
		
		System.out.println("a soma do numero 1 + numero 2 = " +( numero1 + numero2));
		
		doisnumero.close();
		
		

	}

}
