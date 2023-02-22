import java.util.InputMismatchException;
import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombreFact;
        Double precioProduct1, precioProduct2, totalBruto, impuesto, total;
        try {
            System.out.println("Escriba el nombre de la factura: ");
            nombreFact= scanner.nextLine();
            System.out.println("Escriba el precio del primer producto: ");
            precioProduct1 = scanner.nextDouble();
            System.out.println("Escriba el precio del segundo producto: ");
            precioProduct2 = scanner.nextDouble();
        }catch(InputMismatchException e){
            System.out.println("\n Ingresó valores incorrectos, vuelva a empezar.");
            main(args);
            return;
        }
        totalBruto=(precioProduct1+precioProduct2);
        impuesto = (totalBruto*.19);
        total = totalBruto+impuesto;
        System.out.println("La factura de "+nombreFact+ " tiene como total bruto " + totalBruto + ", más el impuesto de " + impuesto +
            ". El monto después de impuestos es "+ total);
    }
}
