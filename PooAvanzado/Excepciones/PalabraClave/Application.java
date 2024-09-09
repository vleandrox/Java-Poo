package PooAvanzado.Excepciones.PalabraClave;

import java.util.Scanner;
import PooAvanzado.Excepciones.PalabraClave.Modelos.PalabraClave;

public class Application {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        PalabraClave palabraClave = new PalabraClave();
        boolean resultado = false;
        do {
            System.out.print("Ingresar palabra clave : ");
            String clave = entrada.nextLine();
            try {
                resultado = palabraClave.ingresarPalabraClave(clave);
                if (resultado) {
                    System.out.println("EXCELENTE. ¡Tu Clave Cumple con los requisitos!");
                }
            } catch (Exception e) {
                System.out.println("Error al generar tu Clave !!! : " + e.getMessage());
            }
        } while (!resultado);
    }
}
