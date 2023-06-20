package principal;

import java.util.Scanner;

public class ano_nascimento {
	
	public static void main(String[] args) {
		
		Scanner ano = new Scanner(System.in);
		
		int anoNascimento;
		int anoAtual;
		
		System.out.println("Digite a sua data de nascimento:");
		anoNascimento = ano.nextInt();
				
		System.out.println("Digite o ano atual");
		anoAtual = ano.nextInt();
		
		System.out.println("Sua idade é :" + (anoAtual - anoNascimento));
		
		ano.close();
	
}
}
