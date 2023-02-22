import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese primer numero:");
        double num1= s.nextDouble();
        System.out.println("Ingrese segundo numero");
        double num2= s.nextDouble();
        Double orden[]= new Double[2];

        orden[0] = Math.max(num1, num2);
        orden[1]= Math.min(num1,num2);
        System.out.println("El numero maximo es: " + orden[0]);
        System.out.println("El numero minimo es: " +orden[1]);


    }
}