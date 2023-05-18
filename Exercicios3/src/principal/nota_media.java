package principal;

import java.util.Scanner;

public class nota_media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner nota = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double media;
		
		
		System.out.println("Insira nota 1");
		nota1 = nota.nextDouble();
		
		System.out.println("Insira nota 2");
		nota2 = nota.nextDouble();
		
		System.out.println("Insira nota 3");
		nota3 = nota.nextDouble();
		
		System.out.println("Insira nota 4");
		nota4 = nota.nextDouble();
		
		media = ((nota1 + nota2 + nota3 + nota4))/4;
		
		if(media < 6){
			System.out.println("Reprovado! media:" + media);
		}
		else if ((media == 6)&& (media < 7)) {
			System.out.println("Recuperação! media:" + media);
		} 
		else if((media > 7) && (media < 10)){
			System.out.println("Aprovado! media:" + media);
		}
		else{
			System.out.println("Aprovado com honras!" + media);	
		}
		nota.close();
	}

}
