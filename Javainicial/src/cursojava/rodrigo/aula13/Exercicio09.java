package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor da temperatura em graus"
				+ " Farenheit para transformar em Celsius: ");
		
		double tempF = valor.nextDouble();
		double tempC = ((5 * (tempF - 32)) / 9);
		System.out.println(tempF + " °F = " + tempC + " °C");

	}

}
