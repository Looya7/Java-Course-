package org.loya.zoologico;

public class Perro extends Caninos{
    private Integer fuerzaMordida;

    public Perro(String habitad, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitad, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public String comer() {
        return "El perro " +this.nombreCientifico + " esta comiendo.";
    }

    @Override
    public String dormir() {
        return "El perro "+this.nombreCientifico+ " esta durmiendo.";
    }

    @Override
    public String correr() {
        return "El perro "+this.nombreCientifico+ " esta corriendo en el "+ this.habitad;
    }

    @Override
    public String comunicarse() {
        return "El perro  "+ this.nombreCientifico+ " esta aullando";
    }

    @Override
    public String toString() {
        return "Perro{" +
                "fuerzaMordida=" + fuerzaMordida +
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
