public class Produto {

    private double preco;
    private String nome;
    private String descricao;
    private String codigo;

    public Produto(String codigo, String nome, String descricao, double preco){
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Produto(){
        this("0", "", "", 0.0);
    }

    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
}
