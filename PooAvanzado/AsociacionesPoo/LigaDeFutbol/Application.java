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
        jugadores.add(new Jugador("Jesus", null));
        jugadores.add(new Jugador("Marco", null));
        jugadores.add(new Jugador("David", new Equipo("Barcelona")));
        jugadores.add(new Jugador("Jose", new Equipo("Real Madrid")));
        jugadores.add(new Jugador("Alberto", new Equipo("Barcelona")));
        equipos.add(new Equipo("Barcelona"));
        equipos.add(new Equipo("Real Madrid"));
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Crear Jugador");
            System.out.println("2. Crear Equipo");
            System.out.println("3. Asignar equipo a jugador");
            System.out.println("4. Actualizar equipos a jugadores");
            System.out.println("5. Mostrar lista de jugadores");
            System.out.println("6. Mostrar lista de equipos");
            System.out.println("7. Eliminar jugador");
            System.out.println("8. Eliminar equipo");
            System.out.println("9. Selecionar Jugador");
            System.out.println("10. Selecionar Equipo");
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
                case 7:
                    eliminarJugador();
                    break;
                case 8:
                    eliminarEquipo();
                    break;
                case 9:
                    seleccionarJugador();
                    break;
                case 10:
                    selecionarEquipo();
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

    public static void eliminarJugador() {
        System.out.println("ELIMINAR JUGADOR");
        System.out.print("Ingresa el nombre del jugador: ");
        String nombreJugador = entrada.nextLine();
        Jugador jugador = buscarJugador(nombreJugador);

        if (jugador == null) {
            System.out.println("El jugador no existe");
        } else {
            System.out.println("Jugador encontrado: " + jugador.getNombreJugador() + " - "
                    + (jugador.getEquipo() != null ? jugador.getEquipo().getNombreEquipo() : "Sin equipo"));
            System.out.println("¿Desea eliminar jugador? 1. Si 2. No");
            int op = entrada.nextInt();
            if (op == 1) {
                jugadores.remove(jugador);
                System.out.println("Jugador eliminado");
            } else {
                System.out.println("Operación cancelada");
            }
        }
    }

    public static void eliminarEquipo() {
        System.out.println("ELIMINAR EQUIPO");
        System.out.print("Ingresa el nombre del equipo: ");
        String nombreEquipo = entrada.nextLine();
        Equipo equipo = buscarEquipo(nombreEquipo);

        if (equipo == null) {
            System.out.println("El equipo no existe");
        } else {
            System.out.println("Equipo encontrado: " + equipo.getNombreEquipo());
            System.out.println("¿Desea eliminar el equipo? 1. Si 2. No");
            int op = entrada.nextInt();
            if (op == 1) {
                equipos.remove(equipo);
                System.out.println("Equipo eliminado");
            } else {
                System.out.println("Operación cancelada");
            }
        }
    }

    public static void seleccionarJugador() {
        System.out.println("SELECCIONAR JUGADOR");
        System.out.print("Ingresa el nombre del jugador: ");
        String nombreJugador = entrada.nextLine();
        Jugador jugador = buscarJugador(nombreJugador);

        if (jugador == null) {
            System.out.println("El jugador no existe");
        } else {
            int op;
            do {
                System.out.println("1. Ver detalles");
                System.out.println("2. Cambiar nombre");
                System.out.println("3. Cambiar equipo");
                System.out.println("0. Regresar al menú principal");
                op = entrada.nextInt();
                entrada.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Jugador: " + jugador.getNombreJugador() + " - "
                                + (jugador.getEquipo() != null ? jugador.getEquipo().getNombreEquipo() : "Sin equipo"));
                        break;
                    case 2:
                        System.out.print("Ingresa el nuevo nombre: ");
                        String nuevoNombre = entrada.nextLine();
                        jugador.setNombreJugador(nuevoNombre);
                        System.out.println("Nombre del jugador actualizado");
                        break;
                    case 3:
                        System.out.print("Ingresa el nombre del nuevo equipo: ");
                        String nuevoEquipo = entrada.nextLine();
                        Equipo equipo = buscarEquipo(nuevoEquipo);
                        if (equipo != null) {
                            jugador.setEquipo(equipo);
                            System.out.println("Equipo del jugador actualizado");
                        } else {
                            System.out.println("El equipo no existe");
                        }
                        break;
                    case 0:
                        System.out.println("Regresando al menú principal");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (op != 0);
        }
    }

    public static void selecionarEquipo() {
        System.out.println("SELECCIONAR EQUIPO");
        System.out.print("Ingresa el nombre del equipo: ");
        String nombreEquipo = entrada.nextLine();
        Equipo equipo = buscarEquipo(nombreEquipo);

        if (equipo == null) {
            System.out.println("El equipo no existe");
        } else {
            int op;
            do {
                System.out.println("1. Ver detalles");
                System.out.println("2. Cambiar nombre del equipo");
                System.out.println("3. Agregar jugador al equipo");
                System.out.println("4. Mostrar jugadores del equipo");
                System.out.println("0. Regresar al menú principal");
                op = entrada.nextInt();
                entrada.nextLine();

                switch (op) {
                    case 1:
                        System.out.println("Equipo: " + equipo.getNombreEquipo());
                        break;
                    case 2:
                        System.out.print("Ingresa el nuevo nombre del equipo: ");
                        String nuevoNombreEquipo = entrada.nextLine();
                        for (Jugador jugador : jugadores) {
                            if (jugador.getEquipo() != null
                                    && jugador.getEquipo().getNombreEquipo().equals(equipo.getNombreEquipo())) {
                                jugador.getEquipo().setNombreEquipo(nuevoNombreEquipo);
                            }
                        }
                        equipo.setNombreEquipo(nuevoNombreEquipo);
                        System.out.println("Nombre del equipo actualizado");
                        break;
                    case 3:
                        System.out.println("Jugadores sin equipo o de otro equipo:");
                        for (Jugador jugador : jugadores) {
                            if (jugador.getEquipo() == null
                                    || !jugador.getEquipo().getNombreEquipo().equals(equipo.getNombreEquipo())) {
                                System.out.println("* " + jugador.getNombreJugador());
                            }
                        }
                        System.out.print("Ingresa el nombre del jugador a agregar: ");
                        String nombreJugador = entrada.nextLine();
                        Jugador jugador = buscarJugador(nombreJugador);
                        if (jugador != null && (jugador.getEquipo() == null
                                || !jugador.getEquipo().getNombreEquipo().equals(equipo.getNombreEquipo()))) {
                            jugador.setEquipo(equipo);
                            System.out.println("Jugador agregado al equipo " + equipo.getNombreEquipo());
                        } else {
                            System.out.println("Jugador no válido o ya pertenece al equipo");
                        }
                        break;
                    case 4:
                        System.out.println("Jugadores del equipo " + equipo.getNombreEquipo() + ":");
                        for (Jugador jugadorEnEquipo : jugadores) {
                            if (jugadorEnEquipo.getEquipo() != null
                                    && jugadorEnEquipo.getEquipo().getNombreEquipo().equals(equipo.getNombreEquipo())) {
                                System.out.println("* " + jugadorEnEquipo.getNombreJugador());
                            }
                        }
                        break;
                    case 0:
                        System.out.println("Regresando al menú principal");
                        break;
                    default:
                        System.out.println("Opción no válida");
                }
            } while (op != 0);
        }
    }

}
