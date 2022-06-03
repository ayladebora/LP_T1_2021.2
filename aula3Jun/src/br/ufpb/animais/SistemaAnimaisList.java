package br.ufpb.animais;

import java.util.LinkedList;
import java.util.List;

public class SistemaAnimaisList implements SistemaAnimais {

    private List<Animal> animais;

    public SistemaAnimaisList() {
        this(new LinkedList<>());
    }

    public SistemaAnimaisList(List<Animal> animais) {
        this.animais = animais;
    }

    @Override
    public boolean cadastrarAnimal(Animal a) {
        if (this.animais.contains(a)) {
            return false;
        } else {
            this.animais.add(a);
            return true;
        }
    }

    @Override
    public int pesquisarIdadeDoAnimal(String codigo) {
        for (Animal a : this.animais) {
            if (a.getCodigo().equals(codigo)) {
                return a.getIdade();
            }
        }
        return -1;
    }

    @Override
    public boolean apagarAnimal(String codigo) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public List<Animal> pesquisaAnimaisDoTipo(String tipo) {
        // TODO Auto-generated method stub
        return null;
    }

}
