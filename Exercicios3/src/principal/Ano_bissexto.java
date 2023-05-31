package principal;

import java.util.Scanner;

public class Ano_bissexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner anoBissexto = new Scanner(System.in);
		
		int ano;
		
		
		System.out.println("Digita  o ano:");
		ano = anoBissexto.nextInt();
		
		if(ano % 4 == 0 ) {
			System.out.println("ano é bissexto!");
		}else {
			System.out.println("ano não é bissexto!");
		}
		anoBissexto.close();
	}

}

