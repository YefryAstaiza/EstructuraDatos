
package ejercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        int CantidadStock = 0;
       int precio;
        ArrayList<Producto> Producto = new ArrayList<>();
         while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("****** Listas Java.********\n"
                    + "******* Aplicacion Gestionar Productos ********\n"
                    + "1. Agregar un nuevo producto\n"
                    + "2. Mostrar Lista de productos\n"
                    + "3. Buscar producto por nombre\n"
                    + "4. Total\n"
                    + "5. Salir"));
            switch (menu) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
                    precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del producto"));
                    CantidadStock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos en Stock"));
                    Producto pro = new Producto(nombre, precio, CantidadStock);
                    Producto.add(pro);
                    break;

                case 2:
                    System.out.println("Lista de Contactos:");
                    for (Producto aux : Producto) {
                        System.out.println("El nombre del Producto es : "+aux.getNombre()+"el precio del Producto es: "+aux.getPrecio()+"La cantidad de productos en Stock: "+aux.getCantidadStock());
                    }
                    break;

                case 3:
                String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre del producto para buscarlo:");
                boolean encontrado = false;
                for (Producto aux : Producto) {
                    if (aux.getNombre().equalsIgnoreCase(nombreBuscar))
                    { // Corregir la comparación aquí
            System.out.println("Producto encontrado - Nombre: " + aux.getNombre());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Contacto no encontrado.");
    }
    break;

                case 4:
                   int total = 0;
    for (Producto arg : Producto) {
        total += arg.getPrecio();
    }
    int promedioEdades = (int) total * CantidadStock;
    System.out.println("El total: " + promedioEdades);
    break;
                        
                        
                    
    
                    
                    
                   
                case 5:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    
                    
                    
            }
        }
    }
}    