package org.loya.verduleria;

public class Fruta extends Producto{
    private double peso;
    private String  color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        String s =super.toString();
        return s+  "\tpeso=" + peso +
                ", color='" + color ;
    }
}
