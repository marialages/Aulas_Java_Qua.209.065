package principal;

import java.util.Random;

public class JogoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa para gerar 3 n�meros aleat�rios para 3 dados, mostre a soma dos n�meros 
		 * que sa�ram. Se 2 dados sa�rem com a mesma numera��o o jogador ganha 2 pontos de b�nus, 
		 * se os 3 dados sa�rem com a mesma numera��o ele ganha 6 pontos de b�nus e deve aparecer a
		 *  mensagem "voc� � muito sortudo". Se o total da soma dos dados mais o b�nus for menor que 
		 *  15 o jogador perde e apresenta a mensagem "Lamento, mas voc� perdeu" , se for maior ou 
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
	
	
	if((dado1 == dado2)&& (dado1 == dado3)){
		System.out.println("jogador gamhou 2 pontos!"+ soma + 2);
	}else if ((dado1 == dado2 )&& (dado1 == dado3)){
		System.out.println("Voc� � muito sortudo!"+ soma + 6);
	}else if(soma < 15) {
		System.out.println("Lamento mas voc� perdeu!!");
	}else if(soma > 15) {
		System.out.println("Parabens ,voc� ganhou!!");
	}else {
		System.out.println("Fim jogo");
	}
		}
	}
