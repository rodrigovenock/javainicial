package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor da temperatura em graus"
				+ " Celsius para transformar em Farenheit: ");
		
		double tempC = valor.nextDouble();
		double tempF = (tempC * 1.8) + 32;
		System.out.println(tempC + " °C = " + tempF + " °F");

	}

}
