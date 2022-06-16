package org.example;

public abstract class Figura {
    //protected: solo la clase y sus hijas pueden verlo
    protected double x;
    protected double y;

    protected String nombre;

    protected Figura() {
    }

    protected Figura(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
    }

    //manera de declarar un método abstracto, solo
    public abstract double calcularArea();

       @Override
    public String toString() {
        if (nombre == "Cuadrado") {
            return "Area del " + nombre + ":{ " + calcularArea() + " m² }";
        } else {
            return "Area del " + nombre + ":{ " + calcularArea() + " cm² }";
        }
    }

}
