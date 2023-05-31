package principal;

import java.util.Scanner;

public class Valor_horas_trabalhadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner valor = new Scanner(System.in);
		
		double valorHora;
		int  horasTrabalhadas;
		int diasTrabalhados;
		
		System.out.println("insira valor por hora trabalhada:");
		valorHora = valor.nextDouble();
		
		System.out.println("insira horas trabalhadas:");
		horasTrabalhadas = valor.nextInt();
		
		System.out.println("insira dias trabalhadas:");
		diasTrabalhados= valor.nextInt();
		
		System.out.println("Salario mensal é = R$" + valorHora * horasTrabalhadas * diasTrabalhados);
		
		
		
		valor.close();
	}

}
