package org.loya.zoologico;

public class Guepardo extends Felinos{
    public Guepardo(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }
    @Override
    public String comer() {
        return "El guepardo " +this.nombreCientifico+ " esta comiendo en "+ this.habitad;
    }

    @Override
    public String dormir() {
        return "El guepardo " + this.nombreCientifico+ " esta durmiendo ";
    }

    @Override
    public String correr() {
        return "El guepardo "+this.nombreCientifico+ " corre a " + this.velocidad +"km/h";
    }

    @Override
    public String comunicarse() {
        return "El guepardo " + this.nombreCientifico+ " esta maullando" ;
    }

    @Override
    public String toString() {
        return "Guepardo{" +
                "tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
