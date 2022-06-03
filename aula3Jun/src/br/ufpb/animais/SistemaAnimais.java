package br.ufpb.animais;

import java.util.List;

public interface SistemaAnimais {

    boolean cadastrarAnimal(Animal a);

    int pesquisarIdadeDoAnimal(String codigo);

    boolean apagarAnimal(String codigo);

    List<Animal> pesquisaAnimaisDoTipo(String tipo);

}
