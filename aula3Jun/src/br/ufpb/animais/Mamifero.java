package br.ufpb.animais;

public class Mamifero extends Animal {

    public static final String TIPO_MAMIFERO = "Mamífero";

    private int diasGestacao;

    public Mamifero(String codigo, String nome, int idade, int diasGestacao) {
        super(codigo, nome, idade);
        this.diasGestacao = diasGestacao;
    }

    public Mamifero() {
        this("", "", 0, 0);
    }

    public int getDiasGestacao() {
        return diasGestacao;
    }

    public void setDiasGestacao(int diasGestacao) {
        this.diasGestacao = diasGestacao;
    }

    @Override
    public String getTipo() {
        return TIPO_MAMIFERO;
    }

}
