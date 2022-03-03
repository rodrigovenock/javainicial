package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		System.out.println(" PROGRAMA CALCULO DE EQUA��O DE 2� GRAU " + "\n");
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		double valorA = valor.nextDouble();
		
		if (valorA == 0) {
			System.out.println("A igual = " + valorA + "\n"
					+ "Portanto, n�o � uma equa��o do 2� grau!"); 
		} else {		
		System.out.print("Digite o valor de b: ");		
		double valorB = valor.nextDouble();
		System.out.print("Digite o valor de c: ");
		double valorC = valor.nextDouble();
		
		if (valorB == 0 && valorC == 0) {
			System.out.println("Esta equa��o est� incompleta, sua resolu��o n�o �"
					+ " poss�vel, pois os valor de b e c s�o iguais � 0!");
		} else {
			double delta = (valorB * valorB) -4 * valorA *valorC;
			if (delta < 0 ) {
				System.out.println("A equa��o n�o possui ra�zes reais!");
			} else {
				double raiz01 = ((- valorB) + Math.sqrt(delta)) / (2 * valorA);
				double raiz02 = ((- valorB) - Math.sqrt(delta)) / (2 * valorA);
			if (delta == 0) {
				System.out.println("A equa��o s� possui uma raiz = " + raiz01);
			} else {
				System.out.println("A equa��o possui duas raizes reais");
				System.out.println("Raiz01 = " + raiz01);
				System.out.println("Raiz02 = " + raiz02);
			}
			}
		}
		} 
	}
}
