package org.loya.zoologico;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamiferos[] mamiferos= new Mamiferos[5];
        Mamiferos leon = new Leon("Sur Africa",65f,255f,235f,"Panthera leo"
        ,50f,60,5,140f);
        Mamiferos tigre = new Trige("Sur Africa",75f,230f,220f,"Panthera tigris"
                ,70f,75,"sondaica");
        Mamiferos guepardo = new Guepardo("NorAfrica",70f,225f,270f,"Acinonyx jubatus"
                ,65f,120);
        Mamiferos lobo = new Lobo("Norte America",45f,165f,76f,"Cannis Luppus",
                "Blanco",35f,2,"Lobo Comun");
        Mamiferos perro = new Perro("SudAmerica",36f,120f,15f,"Cannis familiaris",
                "Negro",35f,35);
        mamiferos[0]= leon;
        mamiferos[1]= tigre;
        mamiferos[2]= guepardo;
        mamiferos[3]= lobo;
        mamiferos[4]= perro;
        for(Mamiferos m: mamiferos){
            System.out.println(m);
            System.out.println();
        }
        for(Mamiferos m: mamiferos){
            System.out.println(m.comer());
            System.out.println();
        }
    }
}