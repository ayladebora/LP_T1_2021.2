package br.ufpb.interfaces;

public class Cachorro extends Mamifero implements SerComunicante, Comparable<Cachorro>{


    private String raca;

    public static final String RACA_POODLE = "Poodle";
    public static final String RACA_DOG_ALEMAO = "Dog Alemão";


    public Cachorro(String nome, String raca){
        super(nome, 2);
        this.raca = raca;
    }



    @Override
    public String emitirSom() {
        return "au au";
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public int compareTo(Cachorro o) {
        if (this.raca.compareTo(o.getRaca())<0){
            return -1;
        } else if (this.raca.compareTo(o.getRaca())==0){
            return 0;
        } else {
            return 1;
        }
    }
}
