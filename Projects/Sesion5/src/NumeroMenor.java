import java.util.Scanner;

public class NumeroMenor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Integer[] arreglo = new Integer[10];
        int numero= 0;
        for (int i =0; i<10 ;i++){
            System.out.println("Escribe el número "+ (i+1) + " del arreglo de 10 números");
            arreglo[i]=s.nextInt();
        }
        int longitud= arreglo.length;
        principal:
        for (int i = 0; i< longitud; i++) {
            secun:
            for(int k= i+1; k<=longitud; k++){
                if (k==longitud) {
                    numero = arreglo[i];
                    break principal;
                } else if (arreglo[i] < arreglo[k]) {
                    continue secun;

                } else{
                    continue principal;
                }
            }
        }
        System.out.println("El menor número es = " + numero);
        if (numero<10){
            System.out.println("El numero menor es menor que 10!");
        } else {
            System.out.println("El numero menor es igual o mayor que 10!");
        }

    }
}