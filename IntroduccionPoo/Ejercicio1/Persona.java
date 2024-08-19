package IntroduccionPoo.Ejercicio1;

public class Persona {
    
    String nombre;
    Integer edad;

    public Persona(){
    }

    public Persona(String nombre,Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatos(){
        System.out.println("Tu nombre es : " + nombre + " y tu edad es : " + edad);
    }

}
