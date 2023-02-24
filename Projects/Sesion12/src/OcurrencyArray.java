import java.util.Scanner;

public class OcurrencyArray {
    public static void main(String[] args) {
        Integer[] arreglo=new Integer[10];
        Scanner s= new Scanner(System.in);
        for (int i = 0; i < arreglo.length; i++){
            System.out.println("Escribe el "+(i+1)+" número ");
            arreglo[i]=s.nextInt();
            if (arreglo[i]<1 || arreglo[i]>9){
                System.err.println("El número introducido es incorrecto, empiece de nuevo.");
                main(args);
            }
        }
        int ocurrencia=0, ocurrenciaAux=0, indice=0;
        boolean bandera=false;

        for (int i =0; i < arreglo.length;i++){
            for (int j=i; j<arreglo.length;j++){
                if(arreglo[i].equals(arreglo[j])){
                    ocurrenciaAux++;
                }
            }
            if(ocurrencia==0) {
                ocurrencia = ocurrenciaAux;
                indice=i;
            }else if(ocurrenciaAux>ocurrencia){
                ocurrencia=ocurrenciaAux;
                indice=i;
                bandera=false;
                }
            else if(ocurrenciaAux==ocurrencia) {
                bandera =true;
                indice=i;
            }
            ocurrenciaAux=0;

            }
        if(bandera){
            System.out.println("El conjunto es multimodal");
            System.out.println("Uno de los números que más apareció fue " + arreglo[indice]);
            System.out.println("El número apareció = " + ocurrencia + " veces");
        }
        else {
            System.out.println("El número que más apareció fue " + arreglo[indice]);
            System.out.println("El número apareció = " + ocurrencia + " veces");
        }
    }
}
