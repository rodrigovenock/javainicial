package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite seu sal�rio mensal: " + "\n");
		double salario = valor.nextDouble();
		double aumento20 = (salario * 20) / 100;
		double salario20 = salario + aumento20;
		double aumento15 = (salario * 15) / 100;
		double salario15 = salario + aumento15;
		double aumento10 = (salario * 10) / 100;
		double salario10 = salario + aumento10;
		double aumento5 = (salario * 5) / 100;
		double salario5 = salario + aumento5;
		
		if (salario > 0 && salario <= 280.00) {
			System.out.println("Seu sal�rio � R$" + salario + " reais.");
			System.out.println("Voc� teve um aumento de 20% no seu sal�rio");
			System.out.println("Recebeu um reajuste de R$" + aumento20 + " reais.");
			System.out.println("Seu novo sal�rio � R$" + salario20 + " reais.");
		} else if (salario > 280.00 && salario <= 700.00) {
			System.out.println("Seu sal�rio � R$" + salario + " reais.");
			System.out.println("Voc� teve um aumento de 15% no seu sal�rio");
			System.out.println("Recebeu um reajuste de R$" + aumento15 + " reais.");
			System.out.println("Seu novo sal�rio � R$" + salario15 + " reais.");
		} else if (salario > 700.00 && salario <= 1500.00) {
			System.out.println("Seu sal�rio � R$" + salario + " reais.");
			System.out.println("Voc� teve um aumento de 10% no seu sal�rio");
			System.out.println("Recebeu um reajuste de R$" + aumento10 + " reais.");
			System.out.println("Seu novo sal�rio � R$" + salario10 + " reais.");
		} else if (salario > 1500.00) {
			System.out.println("Seu sal�rio � R$" + salario + " reais.");
			System.out.println("Voc� teve um aumento de 5% no seu sal�rio");
			System.out.println("Recebeu um reajuste de R$" + aumento5 + " reais.");
			System.out.println("Seu novo sal�rio � R$" + salario5 + " reais.");
		} else {
			System.out.println("Sal�rio com valor inv�lido, digite o "
					+ "valor novamente!");
		}

	}

}
