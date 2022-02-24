package cursojava.rodrigo.aula13;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo para download em MB:");
		double tamanhoArquivo = valor.nextDouble();
		
		System.out.println("Digite a velocidade do link de internet em Mbps:");
		double velocidadeLink = valor.nextDouble();
		
		double tempoDownload = tamanhoArquivo * velocidadeLink;
		System.out.println("O tempo aproximado de "
				+ "download do arquivo é " + tempoDownload + " minutos.");
		

	}

}
