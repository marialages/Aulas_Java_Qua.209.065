package principal;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner numero = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Insira numero 1");
		numero1 = numero.nextInt();
		
		System.out.println("Insira numero 2");
		numero2 = numero.nextInt();
		
		System.out.println("Insira numero 3");
		numero3 = numero.nextInt();
		
			/*if(numero1 > numero2 && numero1 > numero3){
				System.out.println("O maior numero é: " + numero1);
			}
			if(numero2 > numero1 && numero2 > numero3){
				System.out.println("O maior numero é: " + numero2);
			}
			if(numero3 > numero2 && numero3 > numero1){
				System.out.println("O maior numero é: " + numero3);
			}*/
		if(numero1 > numero2 && numero1 > numero3){
			System.out.println("O maior numero é: " + numero1);
		}
		else if (numero2 > numero3) {
			System.out.println("o maio numero é:" + numero2);
			}
		else {
			System.out.println("O maior numero é:" + numero3);
		}
		numero.close();
		}
	}

