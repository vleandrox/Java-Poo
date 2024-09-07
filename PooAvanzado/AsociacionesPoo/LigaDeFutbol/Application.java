package PooAvanzado.AsociacionesPoo.LigaDeFutbol;

import PooAvanzado.AsociacionesPoo.LigaDeFutbol.Modelos.Equipo;
import PooAvanzado.AsociacionesPoo.LigaDeFutbol.Modelos.Jugador;

public class Application {

    public static java.util.Scanner entrada = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        // Equipo equipo1 = new Equipo("Real Madrid");
        // Equipo equipo2 = new Equipo("Barcelona");
        // Jugador jugador1 = new Jugador("Cristiano Ronaldo", equipo1);
        // Jugador jugador2 = new Jugador("Messi", equipo2);
        // jugador1.imprimirJugador();
        // jugador2.imprimirJugador();
        // equipo1.setNombre("AlNassar");
        // equipo2.setNombre("Inter Miami");
        // jugador1.imprimirJugador();
        // jugador2.imprimirJugador();
        ingresoDatos();         
    }

    public static void ingresoDatos() {
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Crear Equipo");
            System.out.println("3. Asignar jugador a equipo");
            System.out.println("4. Mostrar lista de jugadores");
            System.out.println("5. Mostrar lista de equipos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:                    
                    break;
                case 2:
                    System.out.print("Ingresar nombre del equipo : ");
                    String nombreEquipo = entrada.nextLine();
                    new Equipo(nombreEquipo);
                    break;
                case 3:
                    break;
                case 4:                    
                    break;
                case 5:
                    Equipo equipo2 = new Equipo();
                    equipo2.imprimirEquipo();
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }
}
