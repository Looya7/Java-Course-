package org.loya.main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BolsaSupermercado <T>{
    private List<T> lista;
    private int indice;
    private int max =5;

    public BolsaSupermercado() {
        this.lista = new ArrayList<>();
    }

    public void addProducto(T t){
        if(this.lista.size()<=max){
            this.lista.add(t);
        } else {
            throw  new RuntimeException("no hay mas espacio.");
        }

    }
    public List<T> getProductos(){
        return lista;
    }



}
