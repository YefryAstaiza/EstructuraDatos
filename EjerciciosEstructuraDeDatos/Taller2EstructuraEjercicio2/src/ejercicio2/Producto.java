
package ejercicio2;
public class Producto {
    private String nombre;
    private int precio;
    private int CantidadStock;

    public Producto(String nombre, int precio, int CantidadStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.CantidadStock = CantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadStock() {
        return CantidadStock;
    }
    
}
