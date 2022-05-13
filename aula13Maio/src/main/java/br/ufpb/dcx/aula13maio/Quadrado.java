package br.ufpb.dcx.aula13maio;

public class Quadrado implements Figura{

    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    public Quadrado(){
        this(0.0);
    }

    public double getLado(){
        return this.lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    @Override
    public String toString(){
        return "Quadrado de lado "+this.lado+" e que tem área "+ this.calcularArea();
    }

    @Override
    public double calcularArea(){
        return this.lado * this.lado;
    }

}
