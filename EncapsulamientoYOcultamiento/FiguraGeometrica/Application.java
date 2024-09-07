package EncapsulamientoYOcultamiento.FiguraGeometrica;

import java.util.Scanner;

import EncapsulamientoYOcultamiento.FiguraGeometrica.Modelos.Circulo;
import EncapsulamientoYOcultamiento.FiguraGeometrica.Modelos.Rectangulo;
import EncapsulamientoYOcultamiento.FiguraGeometrica.Modelos.Triangulo;

public class Application {
    
    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {       
        ingresoDatos();
    }

    public static void ingresoDatos() {
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar datos del rectangulo");
            System.out.println("2. Ingresar datos del triangulo");
            System.out.println("3. Ingresar datos del circulo");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("RECTANGULO");
                    System.out.print("Ancho del rectangulo: ");
                    double ancho = entrada.nextDouble();
                    System.out.print("Alto del rectangulo: ");
                    double alto = entrada.nextDouble();
                    Rectangulo objRectangulo1 = new Rectangulo();
                    objRectangulo1.setAncho(ancho);                  
                    objRectangulo1.setAltura(alto);
                    objRectangulo1.imprimirArea();
                    objRectangulo1.imprimirPerimetro();
                    break;
                case 2:
                    System.out.println("TRIANGULO");
                    System.out.print("Altura del triangulo: ");
                    double altoTriangulo = entrada.nextDouble();
                    System.out.print("Base del triangulo: ");
                    double baseTriangulo = entrada.nextDouble();
                    Triangulo objTriangulo1 = new Triangulo();                    
                    objTriangulo1.setAltura(altoTriangulo);
                    objTriangulo1.setBase(baseTriangulo);
                    objTriangulo1.imprimirArea();
                    objTriangulo1.imprimirPerimetro();
                    break;
                case 3:
                    System.out.println("CIRCULO");
                    System.out.print("Radio del circulo: ");
                    double radio = entrada.nextDouble();
                    Circulo objCirculo1 = new Circulo();
                    objCirculo1.setRadio(radio);
                    objCirculo1.imprimirArea();
                    objCirculo1.imprimirPerimetro();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            
        } while (opcion != 0);
    }
}
