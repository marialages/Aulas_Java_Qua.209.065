package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int[] numeros = new int [5];
		int[] numeros2 = { 100, 250, 02, 25, 88};
		
		numeros[0] = 10;
		numeros[1] = 24;
		numeros[2] = 1;
		numeros[3] = 99;
		numeros[4] = 33;
		
		System.out.println(numeros[4]);
		System.out.println(numeros2[2]); */
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos nomes deseja salvar na memoria?");
		int qtd = sc.nextInt();
		sc.nextLine();//quando são dados diferente e preciso colocar esse comando pra assim  o software entender que tem que ir pra outra linha , isso é um bug do sistema
		
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
		if(nomes[0].equals(verificar)) {// se colocarmos apenas o == nao aparece o "é igual" pq o == so compara o valor , ja o egual vai comparar tipo e o valor! nota: a partir do momento que coloco o new ele se torna um tipo referencia
			System.out.println("É igual");
		}
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		/*String nome1 = new String("Luan");
		String nome2 = new String("Luan");
		String nome3 = "Luan";
		
		System.out.println(nome1 == nome2);//vai da falso pq so verifica o valor, cmo estao em locais diferentes é falso
		System.out.println(nome1.equals(nome2));//vai da verdadeiro porque vrifica o valor e o tipo.*/
		
		sc.close();
	
	}

}
