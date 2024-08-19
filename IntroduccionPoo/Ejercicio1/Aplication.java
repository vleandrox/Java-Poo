package IntroduccionPoo.Ejercicio1;

public class Aplication {
 
    public static void main(String[] args) {

        Persona objPersona1 = new Persona("Lucero",27);
        Persona objPersona2 = new Persona("Victor",28);
        objPersona1.imprimirDatos();
        objPersona2.imprimirDatos();

    }

    
    public static void imprimirDatos(Persona objPersona){
        System.out.print("Tu nombre es : " + objPersona.nombre + " y tu edad es : " + objPersona.edad);
    }


}
