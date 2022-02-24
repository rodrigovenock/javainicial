package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor de 2 números para realizar a soma: ");
		
		int numero = valor.nextInt();
		int numero2 = valor.nextInt();
		int soma = numero + numero2;
		System.out.println("A soma é: " + soma);

	}

}
