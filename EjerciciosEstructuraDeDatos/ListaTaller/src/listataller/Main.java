
package listataller;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {

   
    public static void main(String[] args) {
    
ArrayList<Contacto> contactos = new ArrayList<>();




        while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("****** Zona Virtual S.A.********\n"
                    + "******* Aplicación de Lista de Contactos ********\n"
                    + "1. Agregar un Nuevo Contacto\n"
                    + "2. Mostrar Lista de Contactos\n"
                    + "3. Buscar contacto por nombre\n"
                    + "4. Salir"));
 
            switch (menu) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
                    Long numero = Long.parseLong(JOptionPane.showInputDialog("Ingrese el numero del contacto:"));
                    Contacto  obje = new Contacto(nombre, numero);
                    contactos.add(obje);
                    break;

                case 2:
                    System.out.println("Lista de Contactos:");
                    for (Contacto aux : contactos) {
                        System.out.println("El nombre es: "+aux.getNombre()+"EL numero es: "+aux.getNumero());
                    }
                    break;

                case 3:
                String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar:");
                boolean encontrado = false;
                for (Contacto aux : contactos) {
                    if (aux.getNombre().equalsIgnoreCase(nombreBuscar))
                    { // Corregir la comparación aquí
            System.out.println("Contacto encontrado - Nombre: " + aux.getNombre() + ", Numero: " + aux.getNumero());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Contacto no encontrado.");
    }
    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}    
        
        
    
