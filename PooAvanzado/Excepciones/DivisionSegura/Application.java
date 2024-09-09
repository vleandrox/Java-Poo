package PooAvanzado.Excepciones.DivisionSegura;

import java.util.Scanner;

public class Application {
     
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Numerador: ");
            int numerador = obtenerNumerador();
            System.out.println("Denominador: ");
            int denominador = entrada.nextInt();
            int resultado = numerador / denominador;
            System.out.println("El resultado es: " + resultado);
        } catch (Exception e) {
            System.out.println("Algo salio mal : " + e.getMessage());
        }                
    }

    public static int obtenerNumerador() throws Exception {
        int numerador = entrada.nextInt();
        if (numerador == 0) {
            throw new Exception("No se puede dividir entre 0");
        }
        return numerador;
    }
    
}
