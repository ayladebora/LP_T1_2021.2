package br.ufpb.dcx.testes;

import java.util.Scanner;

public class TestaArrays2 {
	
	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo");
		String nomeCompleto = leitor.nextLine();
		
		String [] listaDosNomes = nomeCompleto.split(" ");
		System.out.println("O nome quebrado é esse:");
		for (int k=0; k<listaDosNomes.length; k++) {
			System.out.println(listaDosNomes[k]);
		}
		
		leitor.close();
		
	}

}
