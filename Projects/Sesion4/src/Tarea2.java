import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("¿Cuantos litros tiene el tanque?");
        double capacidad = s.nextDouble();

        if (capacidad == 70){
            System.out.println("Estanque Lleno");
        } else if (60<=capacidad && capacidad < 70) {
            System.out.println("Estanque casi Lleno");
        } else if (40<=capacidad && capacidad < 60) {
            System.out.println("Estanque 3/4");
        } else if (35<=capacidad && capacidad < 40) {
            System.out.println("Medio Estanque");
        } else if (20<=capacidad && capacidad < 35) {
            System.out.println("Suficiente");
        } else if (1<=capacidad && capacidad < 20) {
            System.out.println("Insuficiente");
        } else{
            System.out.println("Valor inválido");
        }


    }
}
