package principal;

import java.util.Random;

public class JogoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Faça um programa para gerar 3 números aleatórios para 3 dados, mostre a soma dos números 
		 * que saíram. Se 2 dados saírem com a mesma numeração o jogador ganha 2 pontos de bônus, 
		 * se os 3 dados saírem com a mesma numeração ele ganha 6 pontos de bônus e deve aparecer a
		 *  mensagem "você é muito sortudo". Se o total da soma dos dados mais o bônus for menor que 
		 *  15 o jogador perde e apresenta a mensagem "Lamento, mas você perdeu" , se for maior ou 
		 *  igual a 15 ele ganha e apresenta a mensagem "
		 */

	Random jogo = new Random();
	
	int dado1 = jogo.nextInt(6)+ 1;
	System.out.println(dado1);
	
	int dado2 = jogo.nextInt(6)+ 1;
	System.out.println(dado2);
	
	int dado3 = jogo.nextInt(6)+ 1;
	System.out.println(dado3);
	
	int soma = dado1 + dado2 + dado3;
	System.out.println("Soma total dos dados é:" + soma );
	
	if((dado1 == dado2|| dado1 == dado3 || dado2 == dado3)) {
		if(dado1 == dado2 && dado2 == dado3) {
			System.out.println("Sortudo.Ganhou mais 6 pontos");
			soma = soma + 6;
			System.out.println(soma);
		}
		else {
			System.out.println("Ganhou mais 2 pontos de bonus");
			soma = soma + 2;
			System.out.println(soma);
		}
	}
	
	if(soma >= 15) {
		System.out.println("Parabens , você ganhou!");
	}
	else {
		System.out.println("Infelizmente você perdeu");
	}
	
	/*if((dado1 == dado2)|| (dado1 == dado3)){
		System.out.println("Você ganhou 2 pontos! =" + (soma + 2));
	}else if((dado1 == dado2 )|| (dado1 == dado3)){
		System.out.println("Você é muito sortudo,ganhou 6 pontos!= " + (soma + 6));
	}
	if ((dado2 == dado3)|| (dado2 == dado1)) {
		System.out.println("Você ganhou 2 pontos! =" + (soma + 2));	
	}
	if(soma < 15) {
		System.out.println("Lamento mas você perdeu!!");
	}else if(soma > 15) {
		System.out.println("Parabens ,você ganhou!!");
	}else {
		System.out.println("Fim jogo");
	}*/
		}
	}
