package principal;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mensagem();
		mensagem2(20.54);
		System.out.println(mensagem3());//fazemos isso quando queremos retornar uma função
		System.out.println(mensagem4(4));//coloquei o numero 44 , pois quando eu informo que a minha funcao vai receber um parametro , eu obrigatoriamente tenho que atribuir um valor
		System.out.println(mensagem4(256));//caso eu queira atribuir outro valor 
		
		int meuNumero = 650;
		System.out.println(mensagem4(meuNumero));
		
		//System.out.println(ecemploDoIgor (16,6));
		
		int numero1;
		int numero2;

		
		
		
		/*String recebemensagem = mensagem3();
		System.out.println(recebemensagem);//inves de usar o codigo acima ,posso fazer isso mas não e muito usal, alem de não ser uma boa pratica*/
	}
	
	static void mensagem () {
		System.out.println("Primeiro void");
	}

	static void mensagem2 (double n ) {
		System.out.println("O numero informado foi:" + n);
	}
	
	static String mensagem3() {
		return "Aqui é minha função numero 3 ";
	}
	
	static String mensagem4(int x) {
		return "Numero informado:" + x;
	}
	/*static int exemploDoIgor (double y) {
		return(int) y);*/ // nao é viavel fazer isso pois ele perde valor depois do arrendondamento 

	}
