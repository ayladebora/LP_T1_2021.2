package br.ufpb.ayla.agenda;

public class Contato {

    private String nome;
    private Endereco endereco;

    public String getNome(){
        return this.nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public void setEndereco(Endereco end){
        this.endereco = end;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }
}
