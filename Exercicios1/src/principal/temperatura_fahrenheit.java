package principal;

import java.util.Scanner;

public class temperatura_fahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fahrenheit = new Scanner(System.in);

		double temperatura;
		
		System.out.println("Insira temperatura em graus Celsius:");
		temperatura = fahrenheit.nextDouble();
		
		System.out.println("Sua temperatura em graus Fahrenheit é: " + ((temperatura *(1.8))+32));
		
		
		fahrenheit.close();

	}

}
