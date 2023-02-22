import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Escribe el radio del circulo (cm) : ");
        double radio  = s.nextDouble();
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("El aréa del círculo con radio de "+ radio+"cm es de: " + area+ " cm^2");
    }
}