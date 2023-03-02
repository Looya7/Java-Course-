package org.loya.verduleria;

public class EjemploVerduleria {
    public static void main(String[] args) {
        Producto[] arreglo = new Producto[8];
        Lacteo lala = new Lacteo("Lala",2.99,3,4);
        Lacteo sanMarcos = new Lacteo("San Marcos",1.49,4,6);
        Fruta manzana = new Fruta("Manzana",1.49,30,"Rojo");
        Fruta pera = new Fruta("Pera",2.25,30,"amarillo");
        Limpieza trapeador = new Limpieza("Trapeador",3.49,"Palo",0);
        Limpieza glade = new Limpieza("Glade",2.99,"Detergente",2);
        NoPerecedero frijol = new NoPerecedero("Frijol",2.49,50,399);
        NoPerecedero arroz = new NoPerecedero("Arroz",1.47,100,200);
        arreglo[0]=lala;
        arreglo[1]=sanMarcos;
        arreglo[2]=manzana;
        arreglo[3]=pera;
        arreglo[4]=trapeador;
        arreglo[5]=glade;
        arreglo[6]=frijol;
        arreglo[7]=arroz;


        for(int i=0; i< arreglo.length;i++){
            System.out.println(arreglo[i]);
        }
    }
}
