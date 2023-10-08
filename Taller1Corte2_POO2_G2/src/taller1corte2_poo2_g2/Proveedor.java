
package taller1corte2_poo2_g2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Proveedor {
   private double idProveedor;
    private String nombreProveedor;

    // Constructor
    public Proveedor(double idProveedor, String nombreProveedor) {
        this.idProveedor = idProveedor;
        this.nombreProveedor = nombreProveedor;
    }

    // Método para registrar los datos del proveedor en un archivo de texto
    public void registrarDatosProveedor(String gerentes, String direccion, String email, String telefono) {
        String Archivo = "DatosProveedor.txt";

        try {
            FileWriter fileWriter = new FileWriter(Archivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Id del proveerdor: " + idProveedor);
            printWriter.println("Nombre del Proveedor: " + nombreProveedor);
            printWriter.println("Gerentes: " + gerentes);
            printWriter.println("Dirección: " + direccion);
            printWriter.println("Email: " + email);
            printWriter.println("Teléfono: " + telefono);
            printWriter.close();
            JOptionPane.showMessageDialog(null, "Los datos Fueron Registrados en: " + Archivo);
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "El archivo de texto no se puede crear correctamente, por favor, verificar la ruta de creación");
        }
    }

   
    
        public void leerArchivo() throws FileNotFoundException,IOException{
        
        File arch = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Taller1Corte2_POO2_G2\\DatosProveedor.txt");
        FileReader fr = new FileReader(arch);
        BufferedReader br = new BufferedReader(fr);
        String linea;
        while((linea =br.readLine())!=null){
            System.out.println(" "+linea);
        }
      
            
        }
          public void  leerArchivo2(){
              try{
                  leerArchivo();
                  
              }catch(FileNotFoundException ex1){
                  System.out.println("No se ha encontrado el archivo deseado, por favor verificar la ruta");
              }catch(IOException x2){
                  System.out.println("Ha ocurrido una excepcion verificada");
              }
              System.out.println("El archivo finalizo correctamente");
          }
              public void  proveedor(){
                  
              
    }
}



