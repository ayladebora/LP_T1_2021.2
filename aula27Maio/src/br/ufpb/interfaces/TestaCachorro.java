package br.ufpb.interfaces;

import javax.swing.*;

public class TestaCachorro {

    public static void main(String [] args){

        SerComunicante animal = new Cachorro("Bob", "Pequinês");
        System.out.println(animal.emitirSom());


        Cachorro dog1 = (Cachorro) animal;
        System.out.println(dog1.getNome());

        Cachorro dog2 = new Cachorro("Lulu", "Poodle");

        SerComunicante animal2 = dog2;

        SerComunicante animal3 = new Gato("Fifi", "Angorá");

        Gato gato5 = (Gato) animal3;

        String nomeAnimal6 = JOptionPane.showInputDialog("Digite o nome do cachorro");
        String racaAnimal6 = JOptionPane.showInputDialog("Digite a raça do cachorro");

        Cachorro animal6 = new Cachorro(nomeAnimal6, racaAnimal6);


    }
}
