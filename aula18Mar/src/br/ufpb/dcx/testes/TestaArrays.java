package br.ufpb.dcx.testes;

import java.util.Scanner;

public class TestaArrays {
	
	
	public static void main(String [] args) {
		if (args.length == 0) {
			System.out.println("Este programa não recebeu argumentos");
			
		} else {
			int quant = args.length;
			System.out.println("Esse programa tem "+ quant + " argumentos");
			for (int k=0; k< quant; k++) {
				System.out.println(args[k]);
			}
		}
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Quantos nomes?");
		int quantNomes  = Integer.parseInt(leitor.nextLine());
		
		String [] nomes = new String [quantNomes];
		
		for (int k=0; k< quantNomes; k++) {
			System.out.println("Digite um nome");
			nomes[k] = leitor.nextLine();
		}
		
		System.out.println("Os nomes lidos foram:");
		for (int k=0; k< nomes.length; k++) {
			System.out.println("NOme lido:"+nomes[k]);
			System.out.println("Primeira letra do nome:"+nomes[k].charAt(0));
			System.out.println("quantidade de letras:"+ nomes[k].length());
		}
		System.out.println("Fim");
		leitor.close();
	}

}
