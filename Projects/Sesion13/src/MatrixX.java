import java.util.InputMismatchException;
import java.util.Scanner;


public class MatrixX {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("De cuantas filas y columnas será su matriz cuadrada? (solo numeros enteros positivos)");
        int n=0;
        try{
            n=s.nextInt();
            if(n<0){
                System.err.println("No puede ingresar ese número \t");
                main(args);
            }
        } catch(InputMismatchException e){
            System.err.println("No puede ingresar ese número \t"+ e);
        }
        int [][] matriz = new int[n][n];
        for(int i =0; i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                if(i==j|| matriz.length-1==i+j) {
                    System.out.print("X \t");

                }
                else {
                    System.out.print("_ \t");
                }
            }

            System.out.println();
        }
    }
}