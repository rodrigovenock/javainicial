package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int num01 = valor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int num02 = valor.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		int num03 = valor.nextInt();
		
		if (num01 > num02 && num01 > num03) {
			System.out.println(num01 + " é o maior número!");
		} else if (num02 > num01 && num02 > num03) {
			System.out.println(num02 + " é o maior número!");
		} else {
			System.out.println(num03 + " é o maior número!");
		}
	}

}
