package IntroduccionPoo.EjercicioComplementario;

import java.util.Scanner;

public class Application {

    public static Scanner entrada = new Scanner(System.in);
    
    public static String marca;
    public static String modelo;
    public static int año;

    public static void main(String[] args) {
        ingresoDatos();
    }

    public static void ingresoDatos() {
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar datos del auto");
            System.out.println("2. Imprimir datos del auto");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar datos del auto");
                    System.out.print("Ingresa la marca: ");
                    marca = entrada.nextLine();
                
                    System.out.print("Ingresa el modelo: ");
                    modelo = entrada.nextLine();

                    System.out.print("Ingresa el año: ");
                    año = entrada.nextInt();

                    break;
                case 2:
                    System.out.println("Imprimir datos del auto");
                    Auto objAuto1 = new Auto(marca, modelo, año);
                    objAuto1.imprimirDatos();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }
}
