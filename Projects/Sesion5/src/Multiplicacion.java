import java.util.Scanner;

public class Multiplicacion {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Escribe el multiplicando:");
        int multiplicando= s.nextInt();
        System.out.println("Escribe el multiplicador:");
        int multiplicador= s.nextInt();
        int resultado = 0;
        if (multiplicador>0 && multiplicando<0){
            for (int i=multiplicando; i<0; i++) {
                resultado -= multiplicador;
            }
        } else if (multiplicador<0 && multiplicando>0) {
            for (int i=multiplicador; i<0; i++) {
                resultado -= multiplicando;
            }

        }
        else if (multiplicador<0 && multiplicando<0){
            for (int i=multiplicador; i<0; i++) {
                resultado -= multiplicando;
            }
        } else if (multiplicador==0 || multiplicando ==0) {
            resultado=0;
        } else {
            for (int i=multiplicador; i>0; i--) {
                resultado += multiplicando;
            }
        }

        System.out.println("El resultado de multiplicar "+ multiplicando+" por "+multiplicador+" es: " + resultado);
    }
}
