package cursojava.rodrigo.aula15;

import java.util.Scanner;

public class Exercicio17 {

public static void main(String[] args){
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o ano para saber se é bissexto ou não.");
		int ano = valor.nextInt();
		
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " é um ano Bissexto!");
		}
		else {
			System.out.println(ano + " não é um ano Bissexto!");
			}
		}
	}
