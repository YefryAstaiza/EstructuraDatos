
package taller2estructura;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.List;

public class Main {

    
    public static void main(String[] args) {
        int Edad;
        ArrayList<Persona> Persona = new ArrayList<>();
         while (true) {
            int menu = Integer.parseInt(JOptionPane.showInputDialog("****** Listas Java.********\n"
                    + "******* Aplicacion Gestionar Personas ********\n"
                    + "1. Agregar nueva persona\n"
                    + "2. Mostrar Lista de personas\n"
                    + "3. Buscar persona por nombre\n"
                    + "4. Promedio de la edad de las personas\n"
                    + "5. Salir"));
            switch (menu) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona:");
                    String genero = JOptionPane.showInputDialog("Ingrese el Genero de la persona:");
                    Edad = Integer.parseInt(JOptionPane.showInputDialog("La edad de la persona"));
                    Persona  obje = new Persona(Edad, nombre, genero);
                    Persona.add(obje);
                    break;

                case 2:
                    System.out.println("Lista de Contactos:");
                    for (Persona aux : Persona) {
                        System.out.println("El nombre es: "+aux.getNombre()+"La edad es: "+aux.getEdad()+"El genero es: "+aux.getGenero());
                    }
                    break;

                case 3:
                String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar:");
                boolean encontrado = false;
                for (Persona aux : Persona) {
                    if (aux.getNombre().equalsIgnoreCase(nombreBuscar))
                    { // Corregir la comparación aquí
            System.out.println("Contacto encontrado - Nombre: " + aux.getNombre());
            encontrado = true;
            break;
        }
    }
    if (!encontrado) {
        System.out.println("Contacto no encontrado.");
    }
    break;

                case 4:
                   int totalEdades = 0;
    for (Persona arg : Persona) {
        totalEdades += arg.getEdad();
    }
    double promedioEdades = (double) totalEdades / Persona.size();
    System.out.println("El promedio de las edades es: " + promedioEdades);
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