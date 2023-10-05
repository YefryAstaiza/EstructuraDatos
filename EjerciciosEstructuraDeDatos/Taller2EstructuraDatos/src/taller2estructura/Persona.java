
package taller2estructura;


public class Persona {
    private int edad;
    private String Nombre;
    private String genero;

    public Persona(int edad, String Nombre, String genero) {
        this.edad = edad;
        this.Nombre = Nombre;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getGenero() {
        return genero;
    }

}
