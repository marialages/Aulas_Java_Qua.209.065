package principal;

import java.util.Scanner;

import entities.CalcularTerreno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		CalcularTerreno ct = new CalcularTerreno();
		System.out.println("Entre com a largura:");
		double largura = sc.nextDouble();
		System.out.println("Entre com o comprimento:");
		double comprimento = sc.nextDouble();
		
		
		ct.areaTerreno (largura, comprimento);
		sc.close();

	}

}
