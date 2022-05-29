package br.ufpb.interfaces;

public class Gato extends Mamifero implements SerComunicante{


    public String raca;

    public Gato(String nome, String raca){
        super(nome, 2);
        this.raca = raca;
    }

    @Override
    public String emitirSom() {
        return "miau";
    }
}
