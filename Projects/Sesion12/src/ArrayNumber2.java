import java.util.Scanner;

public class ArrayNumber2 {
    public static void main(String[] args) {
        Double[] arreglo= new Double[7];
        double sumanegativos=0.0, sumapositivos=0.0;
        Scanner s= new Scanner(System.in);
        double conteoPositivios=0.0, conteoNegativos=0.0, conteoCero=0.0;
        for (int i = 0; i < arreglo.length; i++){
            System.out.print("Escribe el "+(i+1)+" número ");
            arreglo[i]=s.nextDouble();
        }
        for (int i = 0; i <arreglo.length;i++){
            if(arreglo[i]<0){
                sumanegativos+=arreglo[i];
                conteoNegativos++;
            }else if(arreglo[i]>0){
                sumapositivos+=arreglo[i];
                conteoPositivios++;
            }
            else {
                conteoCero++;
            }
        }

        double promedioNegativos=0.0,promedioPositivos=0.0;
        promedioNegativos= sumanegativos/conteoNegativos;
        promedioPositivos=sumapositivos/conteoPositivios;

        System.out.println("El promedio de los negativos es = " + promedioNegativos);
        System.out.println("El promedio de los positivos es = " + promedioPositivos);
        System.out.println("El número cero apareció " + conteoCero+" veces.");
    }
}
