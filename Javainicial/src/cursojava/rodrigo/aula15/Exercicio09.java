package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite três números diferentes e mostre em "
				+ "ordem decrescente: " + "\n");
		System.out.print("Primeiro número: ");
		int num01 = valor.nextInt();
		
		System.out.print("Segundo número: ");
		int num02 = valor.nextInt();
		
		System.out.print("Terceiro número: ");
		int num03 = valor.nextInt(); 
		
		System.out.println("");
		if (num01 > num02 && num01 > num03 && num02 > num03) {
			System.out.println(num01 + "\n" + num02 + "\n" + num03); // 1,2,3
		} else if (num01 > num02 && num01 > num03 && num02 < num03) {
			System.out.println(num01 + "\n" + num03 + "\n" + num02); // 1,3,2
		} else if (num02 > num01 && num02 > num03 && num01 > num03) {
			System.out.println(num02 + "\n" + num01 + "\n" + num03); // 2,1,3
		} else if (num02 > num01 && num02 > num03 && num01 < num03) {
			System.out.println(num02 + "\n" + num03 + "\n" + num01); // 2,3,1
		} else if (num03 > num01 && num03 > num02 && num01 > num02) {
			System.out.println(num03 + "\n" + num01 + "\n" + num02); // 3,1,2
		} else if (num03 > num01 && num03 > num02 && num01 < num02) {
			System.out.println(num03 + "\n" + num02 + "\n" + num01); // 3,2,1
		} else {
			System.out.println("Condição inválida, digite os números novamente. ");
		}

	}

}
