package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite M para Matutino, V para Vespertino ou"
				+ " N para Noturno: ");
		String periodo = valor.next();
		
		switch (periodo) {
		case "m": 
		case "M": System.out.println("Bom Dia!"); break;
		case "v": 
		case "V": System.out.println("Boa Tarde!"); break;
		case "n": 
		case "N": System.out.println("Boa Noite!"); break;
		default: System.out.println("Valor Inválido!");		
		}

	}

}
