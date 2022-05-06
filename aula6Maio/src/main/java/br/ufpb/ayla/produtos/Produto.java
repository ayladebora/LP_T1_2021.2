package br.ufpb.ayla.produtos;

public class Produto {

    private double preco;
    private String nome;
    private String descricao;
    private String codigo;

    public Produto(String codigo, String nome, String descricao, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Produto() {
        this("0", "", "", 0.0);
    }

    @Override
    public String toString() {
        return "Produto de código " + this.codigo + ", de nome " + this.nome + ", cuja descrição é:" + this.descricao
                + " e que custa R$ " + this.preco;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

}