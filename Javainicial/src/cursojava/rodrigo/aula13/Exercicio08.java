package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Qual o valor da hora trabalhada? ");
		double valorHora = valor.nextDouble();
		
		System.out.println("Quantas horas trabalhou no m�s? ");
		double qtdHoras = valor.nextDouble();
		
		double salario = valorHora * qtdHoras;
		System.out.println("O seu sal�rio mensal � R$" + salario + " reais");
		
		
	}

}
