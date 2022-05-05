package br.ufpb.ayla.produtos;

import java.util.ArrayList;

public class SistemaGerenteDeProdutos {

    private ArrayList<Produto> produtos;

    public SistemaGerenteDeProdutos() {
        this.produtos = new ArrayList<>();
    }

    public void cadastraProduto(Produto p) {
        this.produtos.add(p);
    }

    public ArrayList<Produto> pesquisaProdutosQueCustamMenosDe(double valor) {
        ArrayList<Produto> produtosPorValor = new ArrayList<>();
        for (Produto p : this.produtos) {
            if (p.getPreco() < valor) {
                produtosPorValor.add(p);
            }
        }
        return produtosPorValor;
    }

    // public Produto pesquisaProdutoPeloNome(String nome) {
    // for (int k = 0; k < this.produtos.size(); k++) {
    // Produto p = this.produtos.get(k);
    // if (p.getNome().equals(nome)) {
    // return p;
    // }
    // }
    // return null;
    // }

    public Produto pesquisaProdutoPeloNome(String nome) {
        for (Produto p : this.produtos) {
            if (p.getNome().equals(nome)) {
                return p;
            }
        }
        return null;
    }
}
