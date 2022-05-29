package br.ufpb.interfaces;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TestaStrings {

    public static void main(String [] args){

        List<String> listaDeNomes = new LinkedList<>();
        for (int k=0; k<5; k++){
            String nome = JOptionPane.showInputDialog("Digite o nome");
            listaDeNomes.add(nome);
        }

        Collections.sort(listaDeNomes);
        for (String s: listaDeNomes) {
            System.out.println(s);
        }

        List<Cachorro> listaDogs = new ArrayList<>();
        for (int k=0; k<5; k++){
            String nome = JOptionPane.showInputDialog("Digite o nome do cachorro");
            String raca = JOptionPane.showInputDialog("Digite a raça");
            Cachorro dog = new Cachorro(nome, raca);
            listaDogs.add(dog);
        }



        Collections.sort(listaDogs);

        for (Cachorro c: listaDogs){
            System.out.println(c.getNome()+" , raça: "+c.getRaca());
        }

    }
}
