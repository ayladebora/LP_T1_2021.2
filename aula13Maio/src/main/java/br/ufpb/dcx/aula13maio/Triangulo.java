package br.ufpb.dcx.aula13maio;

public class Triangulo implements Figura{

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public String toString(){
        return "Triângulo de base "+this.base+", altura "+this.altura+" e que tem área "+this.calcularArea();
    }

    @Override
    public double calcularArea(){
        return (this.base * this.altura) / 2;
    }
}
