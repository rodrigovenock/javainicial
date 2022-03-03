package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o primeiro número: ");
		int primeiroNum = valor.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNum = valor.nextInt();
		
		if (primeiroNum > segundoNum) {
			System.out.println(primeiroNum + " é maior que " + segundoNum);
			}
		else {
			System.out.println(segundoNum + " é maior que " + primeiroNum);
		   }
	}

}
