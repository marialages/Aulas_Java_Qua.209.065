package principal;

import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/**Fa�a um programa que receba o nome do
aluno e as 4 notas bimestrais desse aluno e mostre a media;
*fa�a um programa que receba 50 n�meros, mostre os n�meros pares 
* contidos em cada posi��o do vetor e a sua posi��o (indice) do vetor;
*Usando o random fa�a uma simula��o de um sorteio, cadastrando 10 pessoas,
* apenas uma pessoa ser� a ganhadora para a proxima turma de java do senai;*/
		/*Scanner sc = new Scanner(System.in);

		System.out.println("Quantos nomes deseja salvar na memoria?");
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
		
		
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[4];
		
		System.out.println("Entre com o nome do Aluno :");
		String nomeAluno = sc.nextLine();
		
		double somaNotas = 0;
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Entre com a nota" + (i + 1) + ":");
			notas[i] = sc.nextDouble();
			somaNotas = somaNotas + notas[i];
			//somaNotas +=[i];versao mais curta do codigo acima
		}
		
	System.out.println("A media do aluno" + nomeAluno + "�:" + (somaNotas/ notas.length));
	
		
	sc.close();	
	}
}
