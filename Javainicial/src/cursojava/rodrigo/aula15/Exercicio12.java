package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite quantas horas trabalhou no mês: ");
		double quantidadeHoras = valor.nextDouble();
		System.out.print("Digite o valor que ganha por hora: ");		
		double valorHora = valor.nextDouble();
		
		double salarioBruto = quantidadeHoras * valorHora;
		double sindicato = (salarioBruto * 3) / 100;
		double fgts = (salarioBruto * 11) / 100;
		double inss = (salarioBruto * 10) / 100;
		double impostoRenda5 = (salarioBruto * 5) / 100;
		double impostoRenda10 = (salarioBruto * 10) / 100;
		double impostoRenda20 = (salarioBruto * 20) / 100;
		double salarioLiquido = salarioBruto - (sindicato + inss);
		double salarioLiquido5 = salarioBruto - (sindicato + inss + impostoRenda5);
		double salarioLiquido10 = salarioBruto - (sindicato + inss + impostoRenda10);
		double salarioLiquido20 = salarioBruto - (sindicato + inss + impostoRenda20);
		
		System.out.println("");
		
		if (quantidadeHoras <= 0 || valorHora <= 0) {
			System.out.println("Salário inválido, digite o valor novamente!");
		} else if (salarioBruto > 0 && salarioBruto <= 900.00) {
			System.out.println("Salário Bruto: R$" + salarioBruto + " reais.");
			System.out.println("Teve isenção no Imposto de Renda");
			System.out.println("FGTS: R$" + fgts + " reais.");
			System.out.println("Inss: R$" + inss + " reais.");
			System.out.println("Sindicato: R$" + sindicato + " reais.");
			System.out.println("Salário líquido: R$" + salarioLiquido + " reais.");
		} else if (salarioBruto > 900.00 && salarioBruto <= 1500.00) {
			System.out.println("Salário Bruto: R$" + salarioBruto + " reais.");
			System.out.println("Imposto de Renda: R$" + impostoRenda5 + " reais.");
			System.out.println("FGTS: R$" + fgts + " reais.");
			System.out.println("Inss: R$" + inss + " reais.");
			System.out.println("Sindicato: R$" + sindicato + " reais.");
			System.out.println("Salário líquido: R$" + salarioLiquido5 + " reais.");
		} else if (salarioBruto > 1500.00 && salarioBruto <= 2500.00) {
			System.out.println("Salário Bruto: R$" + salarioBruto + " reais.");
			System.out.println("Imposto de Renda: R$" + impostoRenda10 + " reais.");
			System.out.println("FGTS: R$" + fgts + " reais.");
			System.out.println("Inss: R$" + inss + " reais.");
			System.out.println("Sindicato: R$" + sindicato + " reais.");
			System.out.println("Salário líquido: R$" + salarioLiquido10 + " reais.");
		} else if (salarioBruto > 2500.00) {
			System.out.println("Salário Bruto: R$" + salarioBruto + " reais.");
			System.out.println("Imposto de Renda: R$" + impostoRenda20 + " reais.");
			System.out.println("FGTS: R$" + fgts + " reais.");
			System.out.println("Inss: R$" + inss + " reais.");
			System.out.println("Sindicato: R$" + sindicato + " reais.");
			System.out.println("Salário líquido: R$" + salarioLiquido20 + " reais.");
		} else {
			System.out.println("Salário inválido, digite o valor novamente!");
		}
	}

}
