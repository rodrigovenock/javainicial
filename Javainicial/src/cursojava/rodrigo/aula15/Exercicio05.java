package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite a primeira nota: ");
		double nota01 = valor.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota02 = valor.nextDouble();
		
		double media = (nota01 + nota02) / 2;
		
		if (media >= 70 && media <= 99) {
			System.out.println("Aprovado, m�dia = " + media);
		} else if (media < 70) {
			System.out.println("Reprovado, m�dia = " + media);
		} else {
			System.out.println("Aprovado com Distin��o, m�dia = " + media);
		}
	}

}
