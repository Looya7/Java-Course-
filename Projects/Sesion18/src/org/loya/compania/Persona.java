package org.loya.compania;

public class Persona {
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido,String numeroFiscal ){
        this(nombre,apellido);
        this.numeroFiscal= numeroFiscal;
    }
    public Persona(String nombre, String apellido,String numeroFiscal, String direccion){
        this(nombre,apellido,numeroFiscal);
        this.direccion= direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "ESTO SE IMPRIME EN PERSONA\n"+
                "nombre= " + nombre +
                ", apellido='" + apellido +
                ", numeroFiscal='" + numeroFiscal +
                ", direccion='" + direccion;
    }
}
