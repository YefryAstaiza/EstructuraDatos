
package taller1corte2_poo2_g2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class Articulo {
  private int  idArticulo;
  private String nombreArticulo;
  private Double precio;
  private Date fecha_venta;

    public Articulo(int idArticulo, String nombreArticulo, Double precio, Date fecha_venta) {
        this.idArticulo = idArticulo;
        this.nombreArticulo = nombreArticulo;
        this.precio = precio;
        this.fecha_venta = fecha_venta;
    }

    
    
    
    public void mostrarDatos() throws ParseException{
        String input;// Declaramos una variable de tipo String para almacenar el precio.
        idArticulo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del Articulo"));
        
        nombreArticulo = JOptionPane.showInputDialog("Ingrese el nombre del Articulo");
        

//Excepcion para cuando el usuario digita una cadena en vez de un numero
do {// do-while para validar el ingreso de un número como precio.
    input = JOptionPane.showInputDialog("Ingrese el precio del Articulo");// Solicitamos el precio del artículo que entrara como una cadena.

    try {// try-catch para capturar la excepción NumberFormatException en caso de que el usuario ingrese una cadena pasara al catch.
        precio = Double.parseDouble(input);// Convertimos la entrada del usuario a un número double.
        
        // Si la entrada del usuario es un número, salimos del bucle.
        
    } catch (NumberFormatException ex) {// Si la entrada del usuario es una cadena, mostrara un mensaje de error y volvemos a solicitar el precio.
        JOptionPane.showMessageDialog(null,"Por favor, introduzca valores numericos en la caja de texto del Precio del Articulo");
    }
} while (!input.matches(".*\\d.*"));// Expresión regular para validar que la entrada del usuario sea un número.
        
        // creacion de objeto para el formato de fecha
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        
        String fecha_ingresada = JOptionPane.showInputDialog("Ingrese una fecha en el formato dd-MM-yyyy:");

        // Convertimos la fecha ingresada a un objeto Date
        fecha_venta = dateFormat.parse(fecha_ingresada);
                                                                                                                                                                                                                    // Imprimimos la fecha
                        JOptionPane.showMessageDialog(null, "El Id Registrado del articulo es:  "+idArticulo+"\nEl nombre del articulo Registrado: "+nombreArticulo+"\nEl precio del articulo Registrado $"+precio+"\nLa fecha es:  "+dateFormat.format(fecha_venta));

        
       

        }
        
    }
        
        

   

