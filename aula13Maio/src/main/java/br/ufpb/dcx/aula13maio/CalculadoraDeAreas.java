package br.ufpb.dcx.aula13maio;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CalculadoraDeAreas {


    public static void main(String [] args){
        List<Figura> figuras = new ArrayList<>();

        Quadrado figura1 = new Quadrado();
        Quadrado figura2 = new Quadrado(2);
        Figura figura3 = new Quadrado(7);
        Triangulo figura4 = new Triangulo(3,6);
        Figura figura5 = new Triangulo(8,9);
        Figura figura6 = new Circulo(10);

        figuras.add(figura1);
        figuras.add(figura2);
        figuras.add(figura3);
        figuras.add(figura4);
        figuras.add(figura5);
        figuras.add(figura6);

        double somaAreas = 0.0;
        for(Figura f: figuras){
            double area = f.calcularArea();
            somaAreas+= area;
            System.out.println(area);
            System.out.println(f.toString());
        }

        System.out.println("A área total é "+ somaAreas);


//        List<Figura> figuras2 = new LinkedList<>();
//        figuras2.addAll(figuras);


    }
}
