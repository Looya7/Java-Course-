import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class InstruccionTareas {
    public static void main(String[] args) {
        int opcionIndice = 0;
        boolean bandera=false;
// los Map (o mapas) los veremos mas adelante en el curso en profundidad
// pero son como un arreglo asociativo, asocia un nombre (o indice) a un valor
// también se les conoce como diccionarios para almacenar datos en base a un nombre.
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();
        do {


            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());

                // aca un if o switch para las distintas opciones.
            }
            if (opcionIndice == 1) {
                JOptionPane.showMessageDialog(null, "Usuario Actualiado!");
            }
            if (opcionIndice == 2) {
                JOptionPane.showMessageDialog(null, "Usuario Eliminado!");
            }
            if (opcionIndice == 3) {
                JOptionPane.showMessageDialog(null, "Usuario Agregado!");
            }
            if (opcionIndice == 4) {
                JOptionPane.showMessageDialog(null, "Lista de Usuarios!");
            }
            if (opcionIndice == 5) {
                JOptionPane.showMessageDialog(null, "Ha salido con exito!");
                bandera=true;
            }
        }while (!bandera);
    }
}
