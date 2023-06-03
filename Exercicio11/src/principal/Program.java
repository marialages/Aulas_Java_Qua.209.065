package principal;

import java.util.Scanner;

import entities.Triangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com valor x:");
		int x = sc.nextInt();
		System.out.println("Entre com valor y:");
		int y = sc.nextInt();
		System.out.println("Entre com valor z:");
		int z = sc.nextInt();
		
		triangulo.retornaTipoTriangulo(x, y, z);
		System.out.println(triangulo.tipoTriangulo);

		sc.close();
	}

}
