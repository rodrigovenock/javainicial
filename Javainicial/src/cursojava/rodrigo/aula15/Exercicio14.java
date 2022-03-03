package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		System.out.println(" PROGRAMA CÁLCULO DE MÉDIA " + "\n");
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota01 = valor.nextDouble();		
		System.out.print("Digite a segunda nota: ");
		double nota02 = valor.nextDouble();
		double media = (nota01 + nota02) / 2;
		
		System.out.println("");
		
		if (media >= 0 && media < 4.0) {
			System.out.println("Primeira nota: " + nota01);
			System.out.println("Segunda nota: " + nota02);
			System.out.println("Média: " + media);
			System.out.println("Conceito E");
			System.out.println("REPROVADO");
		} else if (media > 4.0 && media <= 6.0) {
			System.out.println("Primeira nota: " + nota01);
			System.out.println("Segunda nota: " + nota02);
			System.out.println("Média: " + media);
			System.out.println("Conceito D");
			System.out.println("REPROVADO");
		} else if (media > 6.0 && media <= 7.5) {
			System.out.println("Primeira nota: " + nota01);
			System.out.println("Segunda nota: " + nota02);
			System.out.println("Média: " + media);
			System.out.println("Conceito C");
			System.out.println("REPROVADO");
		} else if (media > 7.5 && media <= 9.0) {
			System.out.println("Primeira nota: " + nota01);
			System.out.println("Segunda nota: " + nota02);
			System.out.println("Média: " + media);
			System.out.println("Conceito B");
			System.out.println("APROVADO");
		} else if (media > 9.0 && media <= 10.0) {
			System.out.println("Primeira nota: " + nota01);
			System.out.println("Segunda nota: " + nota02);
			System.out.println("Média: " + media);
			System.out.println("Conceito A");
			System.out.println("APROVADO");
		} else {
			System.out.println("Valor inválido!");
		}	
	}

}
