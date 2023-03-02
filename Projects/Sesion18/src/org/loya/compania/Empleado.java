package org.loya.compania;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleado=0;
    private int indiceempleado;
    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.empleado= ++indiceempleado;
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleado= ++indiceempleado;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleado() {
        return empleado;
    }

    public double aumentoSueldo(float porcentaje){
        return (this.remuneracion)+((this.remuneracion*porcentaje)/100);
    }
    @Override
    public String toString() {
        String s = super.toString();
        return s +"\nESTO SE IMPRIME EN Empleado\n"+
                "Empleado: " + empleado+
                " \tremuneracion=" + remuneracion;
    }
}
