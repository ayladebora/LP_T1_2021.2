package br.ufpb.dcx.aula13maio;

import java.util.ArrayList;

public class CaixaDeSom {

    private ArrayList<EmissorDeSom> emissores;

    public CaixaDeSom(){
        this.emissores = new ArrayList<>();
    }

    public void adicionarEmissor(EmissorDeSom e){
        this.emissores.add(e);
    }

    public boolean removerEmissor(EmissorDeSom e){
        return this.emissores.remove(e);
    }

    public ArrayList<EmissorDeSom> getEmissores(){
        return this.emissores;
    }

    public void tocarTodosOsEmissores(){
        for (EmissorDeSom e: this.emissores){
            System.out.println(e.emitirSom());
        }
    }


}
