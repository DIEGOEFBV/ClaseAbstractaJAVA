package org.example;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio, String name,double x, double y) {
        super(name, x, y);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double resultado;
        double pi = 3.14;
        return resultado = pi * radio * radio;
    }
}
