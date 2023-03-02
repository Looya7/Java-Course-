package org.loya.compania;
public class EjemploCompania {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Adrian","Loya","555-555","Calle 28 x31 Mexico",2499);
        gerente.setPresupuesto(1200.99);

        imprimir(gerente);
        gerente.setRemuneracion(gerente.aumentoSueldo(30));
        imprimir(gerente);


    }



    public static void imprimir(Persona persona) {
        System.out.println(persona);

    }
}
