package principal;

import java.util.Scanner;

public class Informar_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println(" Escreva o numero: ");
		numero = leia.nextInt();
		
		System.out.println( "O numero informado foi " + numero);
		
		leia.close();
		

	}

}
