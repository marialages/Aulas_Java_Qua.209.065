package principal;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for usado quando sabemos a quantidade de vezes que irá repetir
		for (int i = 0; i < 10; i++) {
			System.out.println(i);//i de intera ;incremento
		}
		
		// while usado quando não sabemos a quantidade de vezes que vai repetir 
		int i = 0;
		while (i < 10){//enquanto 
			System.out.println(i);
			i++;
		}
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Deseja continuar?");
		char opcao = sc.next().charAt(0);
		int j = 0;
		while( opcao == 's') {
			j++;
			System.out.println("Deseja continuar?");
			opcao = sc.next().charAt(0);
		}
		System.out.println("Entrou no while:" + j);
		sc.close();
		
		}
	}


