package principal;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		int opcao = random.nextInt(8) + 1;
		System.out.println(opcao);
		
		switch (opcao) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunta");
			break;
		case 3:
			System.out.println("Terça!");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;
			
			 
			default:
				System.out.println("Não corresponde a um dia da semana");
				break;
		}
	
		
		/*if(opcao.equals("Sexta-feira")) {
			System.out.println("Sextou");
		}else{
			System.out.println("Não sextou");
		}*/
		
			
		
	}

}
