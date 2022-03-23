package com.ayladebora.testacalculos;

import java.util.Scanner;

public class TestaSomatorioComFor {

	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número cujo somatório de 1 a ele você quer calcular");
		int numero = Integer.parseInt(leitor.nextLine());
		
		int soma = 0;
		
		for ( int cont = 1 ; cont<=numero ;  cont++ ) {
			soma+=cont;
		}
		
		
		System.out.println("A soma de 1 até "+numero +" é "+soma);
		
		
		leitor.close();
		
	}
	
}
