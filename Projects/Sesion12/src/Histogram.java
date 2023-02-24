import java.util.Arrays;
import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Integer[] arreglo=new Integer[12];
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Escribe el "+(i+1)+" número ");
            arreglo[i]=s.nextInt();
            if (arreglo[i]<1 || arreglo[i]>6){
                System.err.println("El número introducido es incorrecto, empiece de nuevo.");
                main(args);
            }
        }
        Arrays.sort(arreglo);
        Integer[]arreglo2= new Integer[6];
        int k=0;
        for (int i =0; i<arreglo.length;i++){
            int conteo=0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i].equals(arreglo[j])) {
                    conteo++;
                }
            }
            if(arreglo[i]!=k+1) {
                arreglo2[k++] = 0;
                i --;
            }
            else{
                arreglo2[k++]=conteo;
                i+=conteo-1;
            }
        }
        for(int i =0; i<arreglo2.length;i++) {
            System.out.print((i+1+".- "));
            if(arreglo2[i]==0){
                System.out.print("");
            }
            else {
                for (int j = 0; j < arreglo2[i]; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        }

}
