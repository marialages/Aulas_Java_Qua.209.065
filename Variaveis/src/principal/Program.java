package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  variaveis s�o espa�os alocados na memoria que
		  salvam uma informacao (um dado)
		  
		  o tipo int armazena n�meros inteiros, int s�o numeros 1,2,3,10,150...
		  o tipo double s�o numero com casas decimais : 10.50, 25.99...
		  o tipo char armazena um caractere , � um tipo "literal" e a sua inicializa��o � feitoa com aspas simples : exemplo : c, d, a, 1, 2,...
		  o tipo String � uma classe do java utilizada para armazenar cadeias de caracteres (frases por exemplo)
		  sua inicializa��o � feita com aspas duplas 
		  exemplo se string : nomes,locais....
		 */
		
		int numero = 10;
		double precoDaCamisa = 20.52;
		String nome = " Luan Muruk ";
		char sexo = 'M';
		
		int numero1 = 5;
		int numero2 = 10;
		int resultado = numero1 + numero2;
		
		String nome1 = "Maria Claudia";
		int idade = 27;
		double saldoConta = 50.00;
		
		System.out.println(numero);
		System.out.println(precoDaCamisa);
		System.out.println(nome);
		System.out.println(sexo);
		
		precoDaCamisa = 50.65 ;
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.println(nome);
		System.out.println(sexo);
		System.out.println(precoDaCamisa);
		System.out.println();
		System.out.println();
		
		System.out.print(nome + " " + sexo + " " + " " + precoDaCamisa);
		System.out.println();
		
		System.out.print(nome + " comprou uma camisa com valor de: " + precoDaCamisa);
		
		
		System.out.println();
		System.out.print(nome + " comprou uma camisa com valor de: " + precoDaCamisa);
		System.out.println();
		System.out.println(2+2);
		System.out.println(numero1 + numero2);
		System.out.println(" O ressultado �: " + resultado);
		System.out.println();
		System.out.println(" O ressultado �: " + (numero1 + numero2));

		/*crie uma variavel com seu nome
		  crie uma variavel com sua idade 
		  crie uma variavel com um salo de conta 
		  mostre na tela 
		  Luan Muruk tem 32 anos e possui 5 reais na conta */
		
		
		System.out.print(nome1 + " tem " + idade + " anos e possui " + saldoConta + " reais na conta. ");
		System.out.println();
		
		/*algotitmo e uma sequencia logica afim de se obter um resultado alterado */
		
}
		
}
