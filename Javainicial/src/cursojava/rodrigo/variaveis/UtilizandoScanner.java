package cursojava.rodrigo.variaveis;

import java.util.Scanner;

public class UtilizandoScanner {

	public static void main(String[] args) {
		
		System.out.println("Digite Seu nome: ");
		Scanner valor = new Scanner(System.in);
		String nome = valor.nextLine();
		System.out.println("Seu nome é " + nome);
	}

}
