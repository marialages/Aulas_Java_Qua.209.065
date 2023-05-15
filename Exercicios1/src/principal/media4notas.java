package principal;

import java.util.Scanner;

public class media4notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner medianota = new Scanner(System.in);
	
	double nota1;
	double nota2;
	double nota3;
	double nota4;
	
	System.out.println(" Escreva o nota 1: ");
	nota1 = medianota.nextDouble();
	
	System.out.println(" Escreva o nota 2: ");
	nota2 = medianota.nextDouble();
	
	System.out.println(" Escreva o nota 3: ");
	nota3 = medianota.nextDouble();
	
	System.out.println(" Escreva o nota 4: ");
	nota4 = medianota.nextDouble();
	
	System.out.println("A media de notas é:" + ((nota1+ nota2+ nota3+ nota4 )/ 4));
	
	medianota.close();

	}

}
