package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o valor em metros para transformar "
				+ "em centimetros: ");
		
		double metros = valor.nextDouble();
		double centimetros = metros * 100;
		System.out.println(metros + " metros = " + centimetros + " centimetros.");

	}

}
