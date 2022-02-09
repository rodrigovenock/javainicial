package cursojava.rodrigo.variaveis;

import java.util.Scanner;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		Scanner dados = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		
		int Idade = dados.nextInt();
		
		System.out.println("Sua idade é: " + Idade + " anos");
		
	}

}
