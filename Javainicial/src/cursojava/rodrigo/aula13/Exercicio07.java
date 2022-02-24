package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor do lado do quadrado para"
				+ " calcular sua área: ");
		double lado = valor.nextDouble();
		double area = Math.pow(lado, 2);
		double dobroArea = area * 2;
		System.out.println("O dobro da área do quadrado é: " + dobroArea);

	}

}
