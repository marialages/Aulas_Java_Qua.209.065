package principal;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*fa�a um programa que receba 50 n�meros, mostre os n�meros pares 
		* contidos em cada posi��o do vetor e a sua posi��o (indice) do vetor;*/
		
		/*System.out.println("Quantos nomes deseja salvar na memoria?");
		int qtd = sc.nextInt();
		sc.nextLine();//quando s�o dados diferente e preciso colocar esse comando pra assim  o software entender que tem que ir pra outra linha , isso � um bug do sistema
		
		String[]nomes = new String[qtd];
		//for para inserir os dados 
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println("Entre com o nome:");
			nomes[contador] = sc.nextLine();
		}
		//for para exibir os dados
		for(int contador = 0; contador < nomes.length; contador++) {
			System.out.println(nomes[contador]);
		}
		//quero verificar se na posicao do meu array um dado bate com o outro 
		String verificar ="Luan";
		if(nomes[0].equals(verificar)) {// se colocarmos apenas o == nao aparece o "� igual" pq o == so compara o valor , ja o egual vai comparar tipo e o valor! nota: a partir do momento que coloco o new ele se torna um tipo referencia
			System.out.println("� igual");
		}
		for(String nome : nomes) {
			System.out.println(nome);
		}*/
		
		/*int soma = 0;
		for(int contador = 0; contador <= 25 ; contador++){
		if(contador %2 != 0) {
		System.out.print(contador + " ");//so tirar o ln e acrescentar aspas, ou "\t"
		soma = soma + contador;
		}*/
		Scanner sc = new Scanner(System.in);
		
		int[]numeros = new int[5];
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.println("Entre com os numeros:");
			numeros[contador] = sc.nextInt();
		}
		for(int i = 0 ; i <= numeros.length; i++) {
			if(i %2 != 0) {
				System.out.println("Numero: " + numeros[i] + " Posicao do vetor:" + i);
				
			}
		}
			
			sc.close();

		
	}

}
