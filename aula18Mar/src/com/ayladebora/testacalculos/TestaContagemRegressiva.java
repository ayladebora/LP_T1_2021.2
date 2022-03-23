package com.ayladebora.testacalculos;

import java.util.Scanner;

public class TestaContagemRegressiva {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = Integer.parseInt(leitor.nextLine());
		System.out.println("Contagem regressiva...");
		for (int k = numero; k > 0; k--) {
			System.out.println(k);
		}

		leitor.close();
	}

}
