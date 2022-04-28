public class Produto {

    private String nome;
    private double preco;

    public Produto(){
        this("", 0.0);
//        this.nome = "";
//        this.preco = 0.0;
    }

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }




}
