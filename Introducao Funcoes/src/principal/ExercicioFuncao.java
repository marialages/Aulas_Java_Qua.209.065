package principal;

import java.util.Scanner;

public class ExercicioFuncao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o primeiro numero da soma:");
		int numero1 = sc.nextInt();
		System.out.print("Entre com o segundo numero da soma:");
		int numero2 = sc.nextInt();
		
		//somaDoisNumeros(10,20);
	}
	
	static void somaDoisNumeros(int x, int y) {
		int resultado = x +y;
		System.out.println("O resultado da soma é:");
		System.out.println("O resultado de mostrar o resultado da soma" + (x + y));
		
		
		System.out.println("Abaixo os numeros foram atribuidos manualmente");
		somaDoisNumeros(10,20);
	}
	
	}

