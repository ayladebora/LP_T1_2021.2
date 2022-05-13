package br.ufpb.dcx.aula13maio;

public class Tambor implements EmissorDeSom {

    private String tamanho;
    private String marca;

    public Tambor(String tamanho, String marca){
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String emitirSom(){
        return "tum tum";
    }

}
