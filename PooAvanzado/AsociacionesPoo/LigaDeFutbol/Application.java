package PooAvanzado.AsociacionesPoo.LigaDeFutbol;

import java.util.Scanner;
import PooAvanzado.AsociacionesPoo.LigaDeFutbol.Modelos.Equipo;
import PooAvanzado.AsociacionesPoo.LigaDeFutbol.Modelos.Jugador;
import java.util.ArrayList;

public class Application {

    public static Scanner entrada = new java.util.Scanner(System.in);
    public static ArrayList<Equipo> equipos = new ArrayList<>();
    public static ArrayList<Jugador> jugadores = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Crear Equipo");
            System.out.println("3. Asignar equipo a jugador");
            System.out.println("4. Actualizar equipos a jugadores");
            System.out.println("5. Mostrar lista de jugadores");
            System.out.println("6. Mostrar lista de equipos");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();// Limpiar el buffer de entrada
            switch (opcion) {
                case 1:
                    crearJugador();
                    break;
                case 2:
                    crearEquipo();
                    break;
                case 3:
                    asignarJugadorEquipo();
                    break;
                case 4:
                    actualizarJugadoresEquipos();
                    break;
                case 5:
                    mostrarJugadores();
                    break;
                case 6: 
                    mostrarEquipos();
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                default:
                    break;
            }
        } while (opcion != 0);
    }

    public static void crearJugador() {
        System.out.println("CREAR JUGADOR");
        System.out.print("Ingresa el nombre del jugador: ");
        String nombre = entrada.nextLine();
        if (buscarJugador(nombre) != null) {
            System.out.println("El jugador ya existe.");
            return;
        }
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles");
            jugadores.add(new Jugador(nombre, null));

        } else {
            System.out.println("EQUIPOS DISPONIBLES:");
            for (Equipo equipo : equipos) {
                System.out.println("- " + equipo.getNombreEquipo());
            }
            System.out.print("Ingresa el nombre del equipo para el jugador: ");
            String nombreEquipo = entrada.nextLine();
            Equipo equipo = buscarEquipo(nombreEquipo);
            if (equipo != null) {
                jugadores.add(new Jugador(nombre, equipo));
                System.out.println("Jugador creado y asignado al equipo " + equipo.getNombreEquipo());
            } else {
                System.out.println("El equipo ingresado no existe. El jugador será creado sin equipo.");
                jugadores.add(new Jugador(nombre, null));
            }
        }
    }

    public static void crearEquipo() {
        System.out.println("CREAR EQUIPO");
        System.out.print("Ingresa el nombre del equipo: ");
        String nombre = entrada.nextLine();

        if (buscarEquipo(nombre) != null) {
            System.out.println("El equipo ya existe.");
        } else {
            equipos.add(new Equipo(nombre));
            System.out.println("Equipo creado correctamente.");
        }
    }

    public static void mostrarEquipos() {
        System.out.println("EQUIPOS:");
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos creados.");
        } else {
            for (Equipo equipo : equipos) {
                System.out.println(equipo.getNombreEquipo());
            }
        }
    }

    public static void mostrarJugadores() {
        System.out.println("JUGADORES:");
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores creados.");
        } else {
            for (Jugador jugador : jugadores) {
                String equipo = (jugador.getEquipo() != null) ? jugador.getEquipo().getNombreEquipo() : "Sin equipo";
                System.out.println(jugador.getNombreJugador() + " - " + equipo);
            }
        }
    }

    public static void asignarJugadorEquipo() {
        System.out.println("ASIGNAR JUGADORES SIN EQUIPO");
        for (Jugador jugador : jugadores) {
            if (jugador.getEquipo() == null) {
                System.out.println(jugador.getNombreJugador() + " - "
                        + (jugador.getEquipo() != null ? jugador.getEquipo().getNombreEquipo()
                                : "Sin equipo asignado"));
            }
        }
        System.out.print("Ingresa el nombre del jugador: ");
        String nombreJugador = entrada.nextLine();
        for (Jugador jugador : jugadores) {
            if (jugador.getNombreJugador().equals(nombreJugador)) {
                System.out.println("MOSTRAR EQUIPOS");
                for (Equipo equipo : equipos) {
                    System.out.println(equipo.getNombreEquipo());
                }
                System.out.println("Ingresa el nombre del equipo: ");
                String nombreEquipo = entrada.nextLine();

                for (Equipo equipo : equipos) {
                    if (equipo.getNombreEquipo().equals(nombreEquipo)) {
                        jugador.setEquipo(equipo);
                        jugador.setNombreJugador(nombreJugador);
                        break;
                    }
                }
            }
        }
    }

    public static void actualizarJugadoresEquipos() {
        System.out.println("ASIGNAR JUGADOR A EQUIPO");
        System.out.print("Ingresa el nombre del jugador: ");
        String nombreJugador = entrada.nextLine();
        Jugador jugador = buscarJugador(nombreJugador);

        if (jugador == null) {
            System.out.println("El jugador no existe.");
            return;
        }

        if (jugador.getEquipo() != null) {
            System.out.println("El jugador ya está asignado al equipo " + jugador.getEquipo().getNombreEquipo());
        }

        System.out.println("EQUIPOS DISPONIBLES:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombreEquipo());
        }

        System.out.print("Ingresa el nombre del equipo al que deseas asignar al jugador: ");
        String nombreEquipo = entrada.nextLine();
        Equipo equipo = buscarEquipo(nombreEquipo);

        if (equipo != null) {
            jugador.setEquipo(equipo);
            System.out.println(
                    "Jugador " + jugador.getNombreJugador() + " asignado al equipo " + equipo.getNombreEquipo());
        } else {
            System.out.println("El equipo ingresado no existe.");
        }
    }

    // Método para buscar un equipo por nombre
    public static Equipo buscarEquipo(String nombreEquipo) {
        for (Equipo equipo : equipos) {
            if (equipo.getNombreEquipo().equalsIgnoreCase(nombreEquipo)) {
                return equipo;
            }
        }
        return null;
    }

    // Método para buscar un jugador por nombre
    public static Jugador buscarJugador(String nombreJugador) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombreJugador().equalsIgnoreCase(nombreJugador)) {
                return jugador;
            }
        }
        return null;
    }
}
