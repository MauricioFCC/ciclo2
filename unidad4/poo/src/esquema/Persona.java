// Clase que representa a una person
import java.util.Scanner;
public class Persona {
    //Atributos: deben ser privados y de primero
    private String nombre;
    private String apellido;
    private int edad;
    
    //constructor
    public Persona(String nombre, String apellido){
        //this.nombre -> Atributo (Es global)
        //nombre -> Parametro (local)
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        System.out.println("Hola soy objeto tipo persona, soy " + nombre);
    }
    /**********************
     * METODOS CONSULTORES
     **********************/

     public String getNombre(){
        return nombre;
     }
     public String getApellido(){
        return apellido;
     }
     public int getEdad(){
        return edad;
     }

    /************************
     * METODOS MODIFICADORES
     ************************/
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }
    public void SetApellido(String apellido) {
        this.apellido = apellido;
    }
    public void SetEdad(int edad) {
        this.edad = edad;
    }
}   

