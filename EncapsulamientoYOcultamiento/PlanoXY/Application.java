package EncapsulamientoYOcultamiento.PlanoXY;

import java.util.Scanner;
import EncapsulamientoYOcultamiento.PlanoXY.Modelos.Punto;
import java.util.ArrayList;


public class Application {

    public static Scanner entrada = new Scanner(System.in);
    public static Punto punto = new Punto();
    public static ArrayList<Punto> puntos = new ArrayList<>();
    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            System.out.println("MENU");
            System.out.println("1. Crear un punto.");
            System.out.println("2. Calcular la distancia desde el origen.");
            System.out.println("3. Calcular la distancia entre dos puntos.");
            System.out.println("4. Determinar si tres puntos están alineados.");
            System.out.println("5. Mostrar todos los puntos.");
            System.out.println("6. Salir.");
            System.out.print("Elija una opción: ");
            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1 -> crearPunto();
                case 2 -> calcularDistanciaDesdeOrigen();
                case 3 -> calcularDistanciaEntrePuntos();
                case 4 -> determinarAlineacion();
                case 5 -> mostrarPuntos();
                case 6 -> salir = true;

                default -> System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    public static void crearPunto() {   
        System.out.println("Crear punto");
        System.out.print("X: ");
        double x = entrada.nextDouble();
        System.out.print("Y: ");
        double y = entrada.nextDouble();
        puntos.add(new Punto(x, y));
    }

    public static void calcularDistanciaDesdeOrigen() {
        for (Punto punto : puntos) {
            double distancia = punto.distanciaDesdeOrigen();
            System.out.println("La distancia desde el punto (" + punto.getX() + ").(" + punto.getY() + ") desde origen es: " + distancia);
        }
    }

    public static void calcularDistanciaEntrePuntos() {
        if(puntos.size()>=2){
            for (int i = 0; i < puntos.size(); i++) {
                for (int j = i + 1; j < puntos.size(); j++) {
                    double distancia = Punto.calcularDistancia(puntos.get(i), puntos.get(j));
                    System.out.println("La distancia entre los puntos (" + puntos.get(i).getX() + ").(" + puntos.get(i).getY() + ") y (" + puntos.get(j).getX() + ").(" + puntos.get(j).getY() + ") es: " + distancia);
                }
            }
        }else{
            System.out.println("No hay suficientes puntos");
        }
        
    }

    public static void determinarAlineacion(){
        if (puntos.size() >= 3) {
            for (int i = 0; i < puntos.size(); i++) {
                for (int j = i + 1; j < puntos.size(); j++) {
                    for (int k = j + 1; k < puntos.size(); k++) {
                        boolean alineados = Punto.estanAlineados(puntos.get(i), puntos.get(j), puntos.get(k));
                        if (alineados) {
                            System.out.println("¿Están alineados? " + alineados);
                        }
                    }
                }
            }
        }
        else{
            System.out.println("No hay suficientes puntos");
        }                        
    }

    public static void mostrarPuntos(){
        System.out.println("Puntos");
        for (Punto punto : puntos) {
            System.out.println("X: " + punto.getX() + " Y: " + punto.getY());
        }
    }
}
