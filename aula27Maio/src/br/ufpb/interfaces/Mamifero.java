package br.ufpb.interfaces;

import java.util.Objects;

public class Mamifero {

    private String nome;
    private int numMesesGestacao;

    public Mamifero(String nome, int numMesesGestacao){
        this.nome = nome;
        this.numMesesGestacao = numMesesGestacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mamifero mamifero = (Mamifero) o;
        return numMesesGestacao == mamifero.numMesesGestacao && Objects.equals(nome, mamifero.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numMesesGestacao);
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNumMesesGestacao() {
        return numMesesGestacao;
    }

    public void setNumMesesGestacao(int numMesesGestacao) {
        this.numMesesGestacao = numMesesGestacao;
    }
}
