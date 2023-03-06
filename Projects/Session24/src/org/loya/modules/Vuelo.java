package org.loya.modules;

import java.util.Date;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fecha;
    private Integer cantpasajeros;

    public Vuelo(String nombre, String origen, String destino, Date fecha, Integer cantpasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.cantpasajeros = cantpasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public Integer getCantpasajeros() {
        return cantpasajeros;
    }

    @Override
    public String toString() {
        return "Aviones{" +
                "nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fecha=" + fecha +
                ", cantpasajeros=" + cantpasajeros +
                '}';
    }
}
