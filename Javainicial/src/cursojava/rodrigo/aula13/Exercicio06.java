package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor do raio"
				+ " para calcular a �rea do c�rculo: ");
		double raio = valor.nextDouble();
		double area = (Math.PI) * (Math.pow(raio, 2));
		System.out.println("A �rea do c�rculo �: " + area);
		

	}

}
