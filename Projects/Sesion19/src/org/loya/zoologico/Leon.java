package org.loya.zoologico;

public class Leon extends Felinos{
    private Integer numeroManada;
    private Float potenciaRugido;

    public Leon(String habitad, Float altura, Float largo, Float peso,
                String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numeroManada, Float potenciaRugido) {
        super(habitad, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugido = potenciaRugido;
    }

    @Override
    public String comer() {
        return "El leon " +this.nombreCientifico+ " esta comiendo en "+ this.habitad;
    }

    @Override
    public String dormir() {
        return "El leon " + this.nombreCientifico+ " esta durmiendo ";
    }

    @Override
    public String correr() {
        return "El leon "+this.nombreCientifico+ " corre a " + this.velocidad +"km/h";
    }

    @Override
    public String comunicarse() {
        return "El leon " + this.nombreCientifico+ " esta rugiendo" ;
    }

    @Override
    public String toString() {
        return "Leon{" +
                "numeroManada=" + numeroManada +
                ", potenciaRugido=" + potenciaRugido +
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
