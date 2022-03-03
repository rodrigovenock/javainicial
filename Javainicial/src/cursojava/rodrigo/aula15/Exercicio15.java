package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println(" Digite o valor de 3 lados de um tri�ngulo:");
		double ladoA = valor.nextDouble();
		double ladoB = valor.nextDouble();
		double ladoC = valor.nextDouble();
		
		if (ladoA + ladoB <= ladoC ||
		ladoB + ladoC <= ladoA ||
		ladoA + ladoC <= ladoB) {
			System.out.println("Esses valores n�o podem representar um Tri�ngulo!");
		} else if (ladoA == ladoB && ladoA == ladoC && ladoB == ladoC) {
			System.out.println("� um Tri�ngulo Equil�tero, pois tem 3 lados iguais!");
		} else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("� um Tri�ngulo Is�sceles, pois tem 2 lados iguais!");
		} else {
			System.out.println("� um Tri�ngulo Escaleno, pois tem 3 lados diferentes!");
		}

	}

}
