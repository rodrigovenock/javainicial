package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor de 2 n�meros inteiros: ");
		int numeroInteiro = valor.nextInt();
		int numeroInteiro2 = valor.nextInt();
		
		System.out.println("Digite o valor de um n�mero real: ");
		double numeroReal = valor.nextDouble();
		
		double produto = (numeroInteiro * 2) * (numeroInteiro2 / 2);
		double soma = (numeroInteiro * 3) + numeroReal;
		double potencia = Math.pow(numeroReal, 3);
		
		System.out.println("O produto do dobro do primeiro com"
				+ " metade do segundo �: " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro �: " + soma);
		System.out.println("O terceiro elevado ao cubo �: " + potencia);
		

	}

}
