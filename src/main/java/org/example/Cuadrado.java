package org.example;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, String name, double x, double y) {
        super(name, x, y);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
}
