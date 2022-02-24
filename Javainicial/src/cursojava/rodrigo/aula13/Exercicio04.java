package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite as 4 notas bimestrais"
				+ "para calcular a média: ");
		
		double nota1 = valor.nextDouble();
		double nota2 = valor.nextDouble();
		double nota3 = valor.nextDouble();
		double nota4 = valor.nextDouble();
		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		System.out.println("A média é: " + media);

	}

}
