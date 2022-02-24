package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		System.out.println(" SISTEMA DE CÁLCULO DE SALÁRIO E DESCONTOS ");
		System.out.println();
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor da sua hora trabalhada: ");
		double valorHora = valor.nextDouble();
		
		System.out.println("Digite o número de horas trabalhadas no mês: ");
		double horaMes = valor.nextDouble();
		
		double salarioBruto = valorHora * horaMes;
		double inss = (salarioBruto * 8) / 100;
		double sindicato = (salarioBruto * 5) / 100;
		double impostoRenda = (salarioBruto * 11) / 100;
		double descontos = inss + sindicato + impostoRenda;
		double salarioLiquido = salarioBruto - descontos;
		
		System.out.println("Salário Bruto: R$" + salarioBruto);
		System.out.println("Imposto de Renda: R$" + impostoRenda);
		System.out.println("INSS: R$" + inss);
		System.out.println("Sindicato: R$" + sindicato);
		System.out.println("Salário Líquido: R$" + salarioLiquido);				

	}

}
