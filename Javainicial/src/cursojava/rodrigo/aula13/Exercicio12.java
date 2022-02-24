package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		System.out.println(" SISTEMA DE CÁLCULO DE PESO IDEAL ");
		System.out.println();
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite sua altura em centimetros: ");
		double altura = valor.nextDouble();
		double pesoIdeal = (72.7 * altura) - 58;
		System.out.println("Seu peso ideal é: " + pesoIdeal + " kilos.");

	}

}
