package principal;

import java.util.Scanner;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaPoupanca contaPoupanca = new ContaPoupanca("Maria",1411,411);
		Conta conta = new Conta ("Luan",8855,6625);
		ContaCorrente contaCorrente = new ContaCorrente("João",992,44789);
		
		contaPoupanca.depositar(500);
		conta.depositar(500);
		contaCorrente.depositar(500);
		
		contaPoupanca.sacar(500);
		conta.sacar(500);
		contaCorrente.sacar(500);
		
		System.out.println(contaPoupanca);
		System.out.println(conta);
		System.out.println(contaCorrente);

		
		
		/*System.out.println("Entre com o titular da conta: ");
		contaPoupanca.setNomeTitular(sc.nextLine());
		conta.setNomeTitular(sc.nextLine());
		
		System.out.println("Entre com o  numero da conta: ");
		contaPoupanca.setNumeroConta(sc.nextInt());
		conta.setNumeroConta(sc.nextInt());
		
		System.out.println("Entre com a agencia: ");
		contaPoupanca.setAgencia(sc.nextInt());
		conta.setAgencia(sc.nextInt());
		
		System.out.println("Entre com o valor do deposito: ");
		contaPoupanca.depositar(sc.nextDouble());
		conta.depositar(sc.nextDouble());
		
		System.out.println("Dados da conta: ");
		System.out.println("Conta poupança: "+ contaPoupanca);
		System.out.println("Conta:" + conta);
		
		System.out.println("Entre com o valor do saque: ");
		contaPoupanca.sacar(sc.nextDouble());
		conta.sacar(sc.nextDouble());
		
		System.out.println("Dados da conta: ");
		System.out.println("Conta poupança: "+ contaPoupanca);
		System.out.println("Conta:" + conta);*/
		
		
		sc.close();
	}

}
