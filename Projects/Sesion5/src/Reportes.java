import java.util.Scanner;

public class Reportes {
    public static void main(String[] args) {
        boolean error=true;
        bucle:
        while(error) {
            Scanner s = new Scanner(System.in);
            Double[] notas= new Double[20];
            double suma=0.0, suma2 =0.0,suma3= 0.0;
            double conteo=0.0, conteo2=0.0,conteo3=0.0,conteo4=0.0;
            for (int i =0; i<20;i++){
                System.out.println("Escribe la nota del alumno "+ (i+1) + " de 20.");
                notas[i]=s.nextDouble();
                if (notas[i]<1 || notas[i]>7){
                    error =false;
                    System.out.println("Error: Finalizando el programa");
                    break bucle;
                }
            }
            for(double num:notas){
                if (num<4 && num!=1){
                    suma+=num;
                    conteo++;
                } else if (num>5 && num!=1) {
                    suma2+=num;
                    conteo2++;
                } else if (num==1) {
                    conteo3++;
                }
            }
            for (double num: notas){
                suma3 +=num;
                conteo4++;
            }
            double promedio= suma/conteo;
            double promedio2 = suma2/conteo2;
            double promedioTotal = suma3/conteo4;
            System.out.println("El promedio de todas las calificaciones es = " + promedioTotal);
            System.out.println("El promedio de las calificaciones mayores a 5 es = " + promedio2);
            System.out.println("El promedio de las clificaciones menores a 4 es = " + promedio);
            System.out.println("La cantidad de notas \" 1\" es de = " + (int)conteo3);

    }}
}
