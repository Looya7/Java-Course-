package org.loya.zoologico;

public class Lobo extends Caninos{
    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitad, Float altura, Float largo,
                Float peso, String nombreCientifico, String color,
                Float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo " +this.especieLobo + " esta comiendo.";
    }

    @Override
    public String dormir() {
        return "El lobo "+this.especieLobo+ " esta durmiendo.";
    }

    @Override
    public String correr() {
        return "El lobo "+this.especieLobo+ " esta corriendo en el "+ this.habitad;
    }

    @Override
    public String comunicarse() {
        return "El lobo "+ this.especieLobo+ " esta aullando";
    }

    @Override
    public String toString() {
        return "Lobo{" +
                "numCamada=" + numCamada +
                ", especieLobo='" + especieLobo + '\'' +
                ", color='" + color + '\'' +
                ", tamanoColmillos=" + tamanoColmillos +
                ", habitad='" + habitad + '\'' +
                ", altura=" + altura +
                ", largo=" + largo +
                ", peso=" + peso +
                ", nombreCientifico='" + nombreCientifico + '\'' +
                '}';
    }
}
