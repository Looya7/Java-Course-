package org.loya.zoologico;

public class Trige extends Felinos{
    private String especieTrigre;

    public Trige(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String especieTrigre) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTrigre = especieTrigre;
    }

    @Override
    public String comer() {
        return "El tigre " +this.nombreCientifico+ " esta comiendo en "+ this.habitad;
    }

    @Override
    public String dormir() {
        return "El tigre " + this.nombreCientifico+ " esta durmiendo ";
    }

    @Override
    public String correr() {
        return "El tigre "+this.nombreCientifico+ " corre a " + this.velocidad +"km/h";
    }

    @Override
    public String comunicarse() {
        return "El tigre " + this.nombreCientifico+ " esta rugiendo" ;
    }

    @Override
    public String toString() {
        return "Trige{" +
                "especieTrigre='" + especieTrigre + '\'' +
                ", tamanoGarras=" + tamanoGarras +
                ", velocidad=" + velocidad +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
