package br.ufpb.ayla.produtos;

import java.util.Scanner;

public class TestaProduto {
    public static void main(String[] args) {
        Produto p = new Produto();
        System.out.println(p.toString());
        Produto p2 = new Produto("123", "Caneta Bic", "Caneta BIC 4 cores, na cor azul", 4.00);
        System.out.println(p2.toString());
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual o código do produto");
        String codP3 = leitor.nextLine();
        System.out.println("Qual o nome do produto");
        String nomeP3 = leitor.nextLine();
        System.out.println("Qual a descrição do produto");
        String descP3 = leitor.nextLine();
        System.out.println("Qual o preço do produto");
        double precoP3 = Double.parseDouble(leitor.nextLine());
        Produto p3 = new Produto(codP3, nomeP3, descP3, precoP3);
        System.out.println(p3.toString());

        leitor.close();
    }
}
