package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		int num01 = valor.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num02 = valor.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int num03 = valor.nextInt();
		
		if (num01 > num02 && num01 > num03) {
			System.out.println(num01 + " � o maior n�mero!");
		} else if (num02 > num01 && num02 > num03) {
			System.out.println(num02 + " � o maior n�mero!");
		} else {
			System.out.println(num03 + " � o maior n�mero!");
		}
	}

}
