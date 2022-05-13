package br.ufpb.dcx.aula13maio;

public class Cachorro implements EmissorDeSom{

    private String nome;

    public Cachorro(String nome){
        this.nome = nome;
    }

    public String emitirSom(){
        return "au au";
    }
}
