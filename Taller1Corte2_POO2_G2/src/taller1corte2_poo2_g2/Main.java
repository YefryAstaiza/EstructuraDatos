
package taller1corte2_poo2_g2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import javax.swing.JOptionPane;

public class Main {
    
    String gerentes;
    String direccion;
    String email;
    String telefono;

    public static void main(String[] args)throws FileNotFoundException,IOException, ParseException {
        
        
        Articulo art = new Articulo(0, null, Double.NaN, null);
        Categoria cat = new Categoria(0, "");
        
        int menu;
        while (true) {            
             menu = Integer.parseInt(JOptionPane.showInputDialog("******* REGISTRO DE DATOS SUPERMERCATIENDA ********\n" +
                    "Distribuidora mayorista de productos alimenticios, viveres y abarrotes:\n"+
                    "1. REGISTRO DE ARTICULOS\n" +
                    "2. REGISTRO DE CATEGORIAS\n" +
                    "3. REGISTRO DE PROVEEDORES\n" + 
                    "4. Salir\n" + 
                    "Escija una opcion de menu para el registro:"));
            switch (menu) {
                case 1:
                art.mostrarDatos();
                break;  
                case 2:
                cat.mostrarDatosC();
                break;
                case 3:
                    
                    double idProveedor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el ID del Proveedor:"));
                    String nombreProveedor = JOptionPane.showInputDialog("Ingrese el Nombre del Proveedor:");
                    Proveedor proveedor = new Proveedor(idProveedor, nombreProveedor);
                    
                    String gerentes = ("Yefry Esteban Astaiza Solano ******** Edixon Alexis Pencue Ortega");
                    String direccion = JOptionPane.showInputDialog("Ingrese la Dirección:");
                    String email = JOptionPane.showInputDialog("Ingrese el Email:");
                    String telefono = JOptionPane.showInputDialog("Ingrese el Telefono:");

                    proveedor.registrarDatosProveedor(gerentes, direccion, email, telefono);
                    proveedor.leerArchivo2();
                break;   
   
                case 4:  
                System.exit(0);
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Digite una opción correcta");
                       
            }
        }
    }
}



                
                    
                    

                         

                    
          