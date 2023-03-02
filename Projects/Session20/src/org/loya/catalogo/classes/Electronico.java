package org.loya.catalogo.classes;

import org.loya.catalogo.interfaces.IElectronico;

abstract public class Electronico extends Producto implements IElectronico {
    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    @Override
    public String getFabricante() {
        return this.fabricante;
    }

    @Override
    public String toString() {
        String sb = super.toString();
        return sb + "\tfabricante='" + fabricante;
    }
}
