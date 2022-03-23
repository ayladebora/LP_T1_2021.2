package com.ayladebora.testacalculos;

import java.util.Scanner;

public class TestaSomatorio {

	public static void main(String [] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o número cujo somatório de 1 a ele você quer calcular");
		int numero = Integer.parseInt(leitor.nextLine());
		
		int soma = 0;
		
		int cont = 1;
		while(cont<=numero) {
			soma+=cont;
			cont++;
			
			
//			soma = soma + cont;
//			cont = cont+1;
		}
		
		System.out.println("A soma de 1 até "+numero +" é "+soma);
		
		
		leitor.close();
		
	}
}
