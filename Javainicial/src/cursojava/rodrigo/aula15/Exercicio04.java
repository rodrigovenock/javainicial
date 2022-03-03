package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite uma letra");
		String letra = valor.nextLine();
		
		switch (letra) {
		case "a":
		case "e":
		case "i":
		case "o":
		case "u":
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": System.out.println("É uma vogal"); break;
		default: System.out.println("É uma consoante");			
		}		
	}

}
