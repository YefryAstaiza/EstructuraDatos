
package com.mycompany.mavenproject4;


// clase llamada automovil
    public class Automovil {
    
    String  modelo;
    String color; 
    String km;        
    String year;   
 
    
    // metodo publico de nombre avanzar vacio
    public void avanzar(){
    // System.out.println("el automovil recorrio 10km");
}
    // creo el metodo main
    public static void main(String[]args){
                // crear un objeto
                Automovil obj1 = new Automovil(); 
                //llama a los atributos despues de crear el nuevo objeto
                System.out.println(obj1.modelo);
                //asigno valores a los objetos del atributo modelo de la
                obj1.modelo = "BMW";
                System.out.println(obj1.modelo);
                
                 
                System.out.println(obj1.color);
                obj1.color = "el auto movil es de colorROJO";
                System.out.println(obj1.color);
                
                 
                System.out.println(obj1.km);
                obj1.km = "10000km";
                System.out.println(obj1.km);
                
                
                System.out.println(obj1.year);
                obj1.year = "2023";
                System.out.println(obj1.year);
    }
  
    
}  

