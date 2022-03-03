package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro produto: ");
		double produto01 = valor.nextDouble();
		
		System.out.println("Digite o valor do segundo produto: ");
		double produto02 = valor.nextDouble();
		
		System.out.println("Digite o valor do terceiro produto: ");
		double produto03 = valor.nextDouble();
		
		if (produto01 == produto02 && produto01 == produto03 
				&& produto02 == produto03) {
			System.out.println("Os produtos tem o mesmo valor, compre "
					+ " o que mais gostar!");
		} else if (produto01 < produto02 && produto01 == produto03
				&& produto03 < produto02) {
			System.out.println("O produto no valor de R$" + produto01 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto02 < produto01 && produto02 == produto03 
				&& produto03 < produto01) {
			System.out.println("O produto no valor de R$" + produto02 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto01 < produto03 && produto01 == produto02 
				&& produto02 < produto03) {
			System.out.println("O produto no valor de R$" + produto01 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto01 < produto02 && produto01 < produto03 
				&& produto02 <= produto03) {
			System.out.println("O produto no valor de R$" + produto01 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto01 < produto02 && produto01 < produto03 
				&& produto03 <= produto02) {
			System.out.println("O produto no valor de R$" + produto01 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto02 < produto01 && produto02 < produto03 
				&& produto01 <= produto03) {
			System.out.println("O produto no valor de R$" + produto02 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto02 < produto01 && produto02 < produto03 
				&& produto03 <= produto01) {
			System.out.println("O produto no valor de R$" + produto02 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else if (produto03 < produto02 && produto03 < produto01 
				&& produto02 <= produto01) {
			System.out.println("O produto no valor de R$" + produto03 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		} else {
			System.out.println("O produto no valor de R$" + produto03 + ""
					+ " reais é  o que tem o menor valor, portanto é o que você deve comprar.");
		}

	}

}
