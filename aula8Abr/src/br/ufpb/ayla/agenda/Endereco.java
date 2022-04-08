package br.ufpb.ayla.agenda;

public class Endereco {

    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;


    public String getLogradouro(){
        return this.logradouro;
    }



    public void setLogradouro(String novoLogradouro){
        this.logradouro = novoLogradouro;
    }

    public void setBairro(String novoBairro){
        this.bairro = novoBairro;
    }

    public String getBairro(){
        return this.bairro;
    }

}
