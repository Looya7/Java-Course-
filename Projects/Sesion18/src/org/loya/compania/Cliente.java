package org.loya.compania;

public class Cliente extends Persona{
    private int clienteid;

    public Cliente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Cliente(String nombre, String apellido, int clienteid) {
        super(nombre, apellido);
        this.clienteid = clienteid;
    }

    public int getClienteid() {
        return clienteid;
    }

    @Override
    public String toString() {
        String s= super.toString();
        return s+ "Cliente{" +
                "clienteid=" + clienteid +
                '}';
    }
}
