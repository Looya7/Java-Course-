package org.loya.catalogo.classes;

import org.loya.catalogo.interfaces.*;

import java.util.Date;


public class ProyectoCatalogo {
    public static void main(String[] args) {
        Date fecha= new Date();

        IProducto[] productos= new Producto[4];
        Producto iphone = new IPhone(1400,"Apple","Rojo","14 Pro max");
        Producto tv = new TvLcd(39998,"Samsung",42);
        Producto libro =new Libro(450,fecha,"Adrian","Programación for dummies","Loya");
        Producto comic = new Comics(399,fecha,"Jesus","Los 10 mandamientos de las leyes","Sabido","Maria");
        productos[0]= iphone;
        productos[1]= tv;
        productos[2]= libro;
        productos[3]= comic;
        for (IProducto ip:productos){
            System.out.println(ip);
        }

    }
}