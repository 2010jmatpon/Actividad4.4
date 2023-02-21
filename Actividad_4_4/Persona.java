package Actividad_4_4;

public class Persona {
    public String nombre;
    public int edad;
     Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public String toString (){
        String laPersona = this.nombre + " tiene " + this.edad + " años";
        return laPersona;
    }

}
