package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int numero = valor.nextInt();
		
		if (numero >= 0) {
			System.out.println(numero + " � um valor positivo");			
		} else {
			System.out.println(numero + " � um valor negativo");	
		}
		
	}

}
