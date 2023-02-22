import javax.swing.*;

public class NombreLargo {
    public static void main(String[] args) {
       String nombre1 =JOptionPane.showInputDialog("Escriba el primer nombre (Nombre \"espacio\" Apellido");
       String nombre2 =JOptionPane.showInputDialog("Escriba el segundo nombre (Nombre \"espacio\" Apellido");
       String nombre3 =JOptionPane.showInputDialog("Escriba el tercer nombre (Nombre \"espacio\" Apellido");

       String nombremax = nombre1.length()>nombre2.length()? nombre1:nombre2;
       nombremax= nombremax.length()>nombre3.length()? nombremax:nombre3;
       String [] nombrefinal = nombremax.split(" ");
        System.out.println(nombrefinal[0] +" tiene el nombre más largo");
    }
}
