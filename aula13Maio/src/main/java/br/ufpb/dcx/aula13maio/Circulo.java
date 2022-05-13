package br.ufpb.dcx.aula13maio;

public class Circulo implements Figura{

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public String toString(){
        return "Círculo de raio "+this.raio
                + " e área "+ this.calcularArea();
    }


    public double calcularArea(){
        return Math.PI * this.raio * this.raio;
    }
}
