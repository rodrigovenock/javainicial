package cursojava.rodrigo.aula15;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite M para Masculino e F para feminino: ");
		String sexo = valor.nextLine();
		
		switch (sexo) {
		case "m":
		case "M": System.out.println("Masculino"); break;
		case "f":
		case "F": System.out.println("Feminino"); break;
		default: System.out.println("Sexo inválido");
		}
		

	}

}
