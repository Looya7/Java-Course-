package org.loya.zoologico;

abstract public class Caninos extends Mamiferos{
    protected String color;
    protected Float tamanoColmillos;

    public Caninos(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitad, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
