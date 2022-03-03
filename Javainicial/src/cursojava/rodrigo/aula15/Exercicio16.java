package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		System.out.println(" PROGRAMA CALCULO DE EQUAÇÃO DE 2° GRAU " + "\n");
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite o valor de a: ");
		double valorA = valor.nextDouble();
		
		if (valorA == 0) {
			System.out.println("A igual = " + valorA + "\n"
					+ "Portanto, não é uma equação do 2° grau!"); 
		} else {		
		System.out.print("Digite o valor de b: ");		
		double valorB = valor.nextDouble();
		System.out.print("Digite o valor de c: ");
		double valorC = valor.nextDouble();
		
		if (valorB == 0 && valorC == 0) {
			System.out.println("Esta equação está incompleta, sua resolução não é"
					+ " possível, pois os valor de b e c são iguais á 0!");
		} else {
			double delta = (valorB * valorB) -4 * valorA *valorC;
			if (delta < 0 ) {
				System.out.println("A equação não possui raízes reais!");
			} else {
				double raiz01 = ((- valorB) + Math.sqrt(delta)) / (2 * valorA);
				double raiz02 = ((- valorB) - Math.sqrt(delta)) / (2 * valorA);
			if (delta == 0) {
				System.out.println("A equação só possui uma raiz = " + raiz01);
			} else {
				System.out.println("A equação possui duas raizes reais");
				System.out.println("Raiz01 = " + raiz01);
				System.out.println("Raiz02 = " + raiz02);
			}
			}
		}
		} 
	}
}
