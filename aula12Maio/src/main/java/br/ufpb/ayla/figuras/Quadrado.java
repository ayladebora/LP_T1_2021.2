package br.ufpb.ayla.figuras;

public class Quadrado implements Figura {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }
}
