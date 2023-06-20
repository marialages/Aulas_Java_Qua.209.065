package principal;

import java.util.Scanner;

public class InversoDolar {
	public static void main(String[] args) {
		
		/*1) Faça um programa que receba um valor em real e converta para dólares na cotação
atual, faça o inverso também;
Faça um programa com uma função que recebe dois parâmetros (valorDoProduto, lucroProduto) os produtos a serem 
vendidos recebem o preço de custo e retorna o valor com uma porcentagem aplicada de lucro, por exemplo: se um produto 
custa 10,00
 e é aplicada uma taxa de 10 % de lucro, o produto será vendido por 11,00;*/
		
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("Entre com o valor em dolar: ");
		double valorReal = sc.nextDouble();
		System.out.println("Entre com o valor em real: ");
		double valorDolar = sc.nextDouble();
		
		valorDolar(valorReal);
		valorReal(valorDolar);
		
		sc.close();
	}

	static void valorDolar(double valorReal) {
		double valorDolar = valorReal * 5.02;
		System.out.println(valorReal + " dolar equivale a" + valorDolar+ "reais.");
		
}
	static void valorReal(double valorDolar) {
		double valorReal = valorDolar / 5.02;
		System.out.println( valorDolar + " reais equivale a " + valorReal + " reais.");
}*/
		
		System.out.println("Entre com o valor do dolar:");
		double valorCotacao = sc.nextDouble();
		
		System.out.println("Entre com o valor a ser convertido:");
		double valorAConverter = sc.nextDouble();
		
		converterDolar(valorCotacao, valorAConverter);

	}
	
	static void converterDolar(double cotacao, double valor) {
		double valorConvertidoParaDolar = valor/cotacao;
		double valorConvertidoParaReal = valor*cotacao;
		System.out.printf("Valor convertido do real para dolar: %.2f", valorConvertidoParaDolar);
		System.out.printf("\nValor convertido do dolar para real: %.2f", valorConvertidoParaReal);

	}
	
}



