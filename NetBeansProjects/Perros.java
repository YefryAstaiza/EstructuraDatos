
package com.mycompany.mavenproject3;



    public class Perros {
    
    String  raza;
    String tamaño; 
    String color;        
    String edad;  
    String nombredeldueño;
    String genero;
    String nombredelperro;
    String tipodesangre;
 
    
    
    public void avanzar(){
    
}
    
    public static void main(String[]args){
                
                Perros obj1 = new Perros(); 
               
                System.out.println(obj1.raza);
                
                obj1.raza = "BullDog";
                System.out.println(obj1.raza);
                
                 
                System.out.println(obj1.tamaño);
                obj1.tamaño = 31+"cm";
                System.out.println(obj1.tamaño);
                
                 
                System.out.println(obj1.color);
                obj1.color = "negro y blanco";
                System.out.println(obj1.color);
                
                
                System.out.println(obj1.edad);
                obj1.edad = "2023";
                System.out.println(obj1.edad);
                
                
                Perros obj2 = new Perros(); 
                
                System.out.println(obj2.nombredeldueño);
                
                obj2.nombredeldueño = "Yefry Astaiza";
                System.out.println(obj2.nombredeldueño);
                
                 
                System.out.println(obj2.genero);
                obj2.genero = "Hembra";
                System.out.println(obj2.genero);
                
                 
                System.out.println(obj2.nombredelperro);
                obj2.nombredelperro = "Ambar";
                System.out.println(obj2.nombredelperro);
                
                
                System.out.println(obj2.tipodesangre);
                obj2.tipodesangre = "O+";
                System.out.println(obj2.tipodesangre);
    }
  
    
}  

