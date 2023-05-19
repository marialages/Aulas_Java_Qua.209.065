package principal;

public class NumImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*1 Programa em Java que mostra os números ímpares ate 25

		2 Altere o primeiro programa para mostrar a soma dos números impares
		3 altere novamente o programa para mostrar os números impares um abaixo do outro e depois um ao lado do outro*/
	
		/*for(int contador = 0; contador < 10; contador++){
			System.out.println("valor sw contador:" +contador);
		}//++ = somar  mais um.*/
		
		/*for(int contador = 0; contador <= 25 ; contador++){
			if(contador %2 != 0) {
			System.out.println(contador);
			}
		}*/
		
		/*int soma = 0;
		for(int contador = 0; contador <= 25 ; contador++){
		if(contador %2 != 0) {
		System.out.println(contador);
		soma = soma + contador;
		}
	}
		System.out.println("A soma dos numeros impares:" + soma);*/
		
		int soma = 0;
		for(int contador = 0; contador <= 25 ; contador++){
		if(contador %2 != 0) {
		System.out.print(contador + " ");//so tirar o ln e acrescentar aspas, ou "\t"
		soma = soma + contador;
		}
	}
		System.out.println( " A soma dos numeros impares:" + soma);
		
		
	
	}
}
	

