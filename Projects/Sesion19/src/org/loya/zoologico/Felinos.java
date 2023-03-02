package org.loya.zoologico;

abstract public class Felinos extends Mamiferos{
    protected Float tamanoGarras;
    protected Integer velocidad;

    public Felinos(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitad,altura,largo,peso,nombreCientifico);
        this.tamanoGarras= tamanoGarras;
        this.velocidad= velocidad;

    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }
}
