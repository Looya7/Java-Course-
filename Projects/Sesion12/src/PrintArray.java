import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {

        Integer[] arreglo= new Integer[10];
        Scanner s= new Scanner(System.in);

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("Escribe el número " +i+" del arreglo:");
            arreglo[i]= s.nextInt();
        }
        int cont1= 0;
        int cont2 =arreglo.length-1;
        for (int i = arreglo.length; i>0;i-=2){
            System.out.print(arreglo[cont1++]+" ");
            System.out.println(arreglo[cont2--]);
        }
    }
}