package br.ufpb.ayla.produtos;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaGerenciadorDeProdutos {
    public static void main(String[] args) {
        SistemaGerenteDeProdutos sistema = new SistemaGerenteDeProdutos();
        boolean continuar = true;
        Scanner leitor = new Scanner(System.in);
        while (continuar) {
            System.out.println(
                    "Digite uma opção:\n1.Cadastrar produto\n2.Pesquisar produto pelo nome\n3.Pesquisar produto pelo preço\n4.Sair");
            String opcao = leitor.nextLine();
            if (opcao.equals("1")) {
                System.out.println("Qual o código do produto");
                String codP1 = leitor.nextLine();
                System.out.println("Qual o nome do produto");
                String nomeP1 = leitor.nextLine();
                System.out.println("Qual a descrição do produto");
                String descP1 = leitor.nextLine();
                System.out.println("Qual o preço do produto");
                double precoP1 = Double.parseDouble(leitor.nextLine());
                Produto p1 = new Produto(codP1, nomeP1, descP1, precoP1);
                sistema.cadastraProduto(p1);
                System.out.println("Produto cadastrado com sucesso");
            } else if (opcao.equals("2")) {
                System.out.println("Qual o nome do produto que você quer pesquisar?");
                String nomeProduto = leitor.nextLine();
                Produto produtoAchado = sistema.pesquisaProdutoPeloNome(nomeProduto);
                if (produtoAchado == null) {
                    System.out.println("Produto não encontrado");
                } else {
                    System.out.println("Produto achado:" + produtoAchado.toString());
                }
            } else if (opcao.equals("3")) {
                System.out.println("Qual o valor a pesquisar?");
                double valorPesquisa = Double.parseDouble(leitor.nextLine());
                ArrayList<Produto> lista = sistema.pesquisaProdutosQueCustamMenosDe(valorPesquisa);
                if (lista.size() == 0) {
                    System.out.println("Não foi encontrado nenhum produto mais barato que R$ " + valorPesquisa);
                } else {
                    for (Produto p : lista) {
                        System.out.println(p.toString());
                    }
                }
            } else if (opcao.equals("4")) {
                continuar = false;
                System.out.println("Fim do programa! Até mais");
            } else {
                System.out.println("Opção inválida. Tente novamente");
            }
        }

        leitor.close();
    }
}
