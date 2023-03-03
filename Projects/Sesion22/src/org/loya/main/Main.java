package org.loya.main;


import org.loya.supermercado.Fruta;
import org.loya.supermercado.Lacteo;
import org.loya.supermercado.Limpieza;
import org.loya.supermercado.NoPerecible;
import java.util.Iterator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        BolsaSupermercado<Lacteo> lacteos=new BolsaSupermercado<>();
        lacteos.addProducto(new Lacteo("Lala",25d,2,30));
        lacteos.addProducto(new Lacteo("Lala",25d,2,30));
        lacteos.addProducto(new Lacteo("Lala",25d,2,30));
        lacteos.addProducto(new Lacteo("Lala",25d,2,30));
        lacteos.addProducto(new Lacteo("Lala",25d,2,30));
        BolsaSupermercado<Fruta> frutas=new BolsaSupermercado<>();
        frutas.addProducto(new Fruta("Manzana",36d,10,"rojo"));
        frutas.addProducto(new Fruta("Manzana",36d,10,"rojo"));
        frutas.addProducto(new Fruta("Manzana",36d,10,"rojo"));
        frutas.addProducto(new Fruta("Manzana",36d,10,"rojo"));
        frutas.addProducto(new Fruta("Manzana",36d,10,"rojo"));
        BolsaSupermercado<Limpieza> limpieaz=new BolsaSupermercado<>();
        limpieaz.addProducto(new Limpieza("Escoba",25d,"2",30));
        limpieaz.addProducto(new Limpieza("Escoba",25d,"2",30));
        limpieaz.addProducto(new Limpieza("Escoba",25d,"2",30));
        limpieaz.addProducto(new Limpieza("Escoba",25d,"2",30));
        limpieaz.addProducto(new Limpieza("Escoba",25d,"2",30));
        BolsaSupermercado<NoPerecible> noperecible=new BolsaSupermercado<>();
        noperecible.addProducto(new NoPerecible("Lata",25d,2,30));
        noperecible.addProducto(new NoPerecible("Lata",25d,2,30));
        noperecible.addProducto(new NoPerecible("Lata",25d,2,30));
        noperecible.addProducto(new NoPerecible("Lata",25d,2,30));
        noperecible.addProducto(new NoPerecible("Lata",25d,2,30));
        frutas.getProductos().forEach(System.out::println);
        lacteos.getProductos().forEach(System.out::println);
        limpieaz.getProductos().forEach(System.out::println);
        noperecible.getProductos().forEach(System.out::println);

    }
}