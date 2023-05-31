package principal;

import java.util.Scanner;

public class Temperatura_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner celsius = new Scanner(System.in);

		double temperatura;
		
		System.out.println("Insira temperatura em graus Fahrenheit:");
		temperatura = celsius.nextDouble();
		
		System.out.println("Sua temperatura em graus Celsius é: " + 5*((temperatura -32)/9));
		
		
		celsius.close();
	}

}
