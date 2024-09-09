package PooAvanzado.Excepciones.SaludoUsuario;

import java.util.Scanner;

public class Application {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Ingresa tu nombre: ");
            String nombre = nombre();
            System.out.println("Hola " + nombre);
        } catch (Exception e) {
            System.out.println("Algo salio mal : " + e.getMessage());
        } finally {
            entrada.close();
            System.out.println("Scanner cerrado correctamente.");
        }
    }

    public static String nombre() throws Exception {
        String nombre = entrada.nextLine();
        if (nombre.length() <= 2) {
            throw new Exception("El nombre debe tener mas de 2 caracteres");
        }
        return nombre;
    }
}
