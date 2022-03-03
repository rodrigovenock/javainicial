package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.print("Digite um número entre 1 e 7 para verificar o dia"
				+ " da semana correspondente: ");
		int numero = valor.nextInt();
		System.out.println("");
		
		switch (numero) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Terça-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quinta-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Valor inválido!");
		}

	}

}
