import java.util.Scanner;

public class ArrayNumber {
    public static void main(String[] args) {
        Integer[] arreglo= new Integer[7];
        Scanner s= new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Escribe un número entre el 11-99");
            arreglo[i]=s.nextInt();
            if(arreglo[i]<11 || arreglo[i]>99){
                System.err.println("Número inválido, intenté de nuevo");
                System.exit(-1);
            }else {
                continue;
            }
        }
        int max=0;
        for (int i = 0; i <arreglo.length;i++){
            if(max==arreglo[i]){
                continue;
            }
            max= max>arreglo[i]?max:arreglo[i];
        }
        System.out.println("El número más grande es = " + max);
    }
}
