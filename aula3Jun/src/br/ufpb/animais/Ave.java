package br.ufpb.animais;

public class Ave extends Animal {

    public static final String TIPO_AVE = "Ave";

    private String corDaPena;

    public Ave(String codigo, String nome, int idade, String corDaPena) {
        super(codigo, nome, idade);
        this.corDaPena = corDaPena;
    }

    public Ave() {
        this("", "", 0, "");
    }

    @Override
    public String getTipo() {
        return TIPO_AVE;
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

}
