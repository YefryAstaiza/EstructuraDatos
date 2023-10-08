
package taller1corte2_poo2_g2;

import javax.swing.JOptionPane;


public class Categoria {
    private int idCategoria;
    private String nombreCategoria;

    public Categoria(int idCategoria, String nombreCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
    }
    public void mostrarDatosC(){
        String input;
 do {// Bucle do-while para validar que el usuario ingrese un número como id.
    input = JOptionPane.showInputDialog("Ingrese el id de la categoria");// Solicitamos el id del artículo.

    try {// try-catch para capturar la excepción NumberFormatException en caso de que el usuario ingrese una cadena.
        idCategoria = Integer.parseInt(input);// Convertimos la entrada del input a un número entero.
        
        // Si ingresamos un número, salimos del bucle.
        
    } catch (NumberFormatException ex) {// Si la entrada  no es un número, se mostrara el mensaje de error y volvemos a solicitar el id.
        JOptionPane.showMessageDialog(null,"Por favor, introduzca valores numericos en la caja de texto del ID de la categoria");
    }
} while (!input.matches(".*\\d.*"));// Expresión regular para validar que la entrada del usuario sea un número.
        
        nombreCategoria = JOptionPane.showInputDialog("Ingrese el nombre de la Categoria");
        
        
                        JOptionPane.showMessageDialog(null, "El Id de la Categoria  es:  "+idCategoria+"\nEl nombre de la Categoria es: " +nombreCategoria);

        
       

        }
        
    }