package Actividad_4_4;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Zisko", 18);
        Persona persona2 = new Persona("Antonio", 57);
        Persona persona3 = new Persona("Paco", 24);
        Persona[] personas = {persona1, persona2, persona3};
        for (Persona  x: personas){
            System.out.println(x);
        }
    }
}
