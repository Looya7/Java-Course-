public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        String nombre1 = ("Adrian");
        String nombre2 = ("Marisol");
        String nombre3 = ("Jesus");
        String[] arreglo = new String[]{nombre1,nombre2, nombre3};
        StringBuilder[] arreglo2= new StringBuilder[3];
        StringBuilder stringFinal= new StringBuilder(" ");
        for (int i =0 ; i < arreglo.length; i++)
        {
            StringBuilder buffer= new StringBuilder(arreglo[i]);
            char segundo = buffer.charAt(1);
            StringBuilder sbsegundo = new StringBuilder(Character.toString(segundo).toUpperCase());
            arreglo2[i]=sbsegundo;
            arreglo2[i].delete(1,arreglo2.length+2);
            arreglo2[i].append(".").append(arreglo[i].substring(arreglo[i].length()-2));
            stringFinal.append(arreglo2[i].append("_"));
             if (i==arreglo.length-1){
                 System.out.println(stringFinal.delete(stringFinal.length()-1,stringFinal.length()));
             }

        }

    }

}
