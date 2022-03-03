package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite um número para saber se é par ou ímpar: ");
		int numero = valor.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println(numero + " é par!");
		} else {
			System.out.println(numero + " é ímpar!");
		}

	}

}
