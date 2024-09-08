package ActividadIntegradoraPoo.SistemaGestion;

import java.util.ArrayList;
import java.util.Scanner;

import ActividadIntegradoraPoo.SistemaGestion.Modelos.Empleado;

import java.util.Collections;

public class Application {

    public static Scanner entrada = new Scanner(System.in);
    public static ArrayList<Empleado> empleados = new ArrayList<>();

    public static void main(String[] args) {
        empleados.add(new Empleado("Pedro", 25, 5000, "Gerente"));
        empleados.add(new Empleado("Maria", 30, 4000, "Programador"));
        empleados.add(new Empleado("Juan", 35, 3000, "Admnistrador"));
        empleados.add(new Empleado("Victor", 30, 4000, "Programador"));
        empleados.add(new Empleado("Carmen", 35, 3000, "Recursos Humanos"));
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Crear Empleado");
            System.out.println("2. Mostrar todos los empleados ");
            System.out.println("3. Filtra Empleados");
            System.out.println("4. Ordernar Empleados");
            System.out.println("5. Mostrar por Nombres");
            System.out.println("6. Incrementar Salario");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    crearEmpleado();
                    break;
                case 2:
                    imprimirEmpleados();
                    break;
                case 3:
                    filtraEmpleados();
                    break;
                case 4:
                    ordenarEmpleados();
                    break;
                case 5:
                    mostrarPorNombres();
                    break;
                case 6:
                    incrementarSalario();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 0);
    }

    public static void crearEmpleado() {
        System.out.println("Ingresar datos del Empleado");
        System.out.print("Ingresa el nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingresa la edad: ");
        int edad = entrada.nextInt();
        System.out.print("Ingresa el sueldo: ");
        int sueldo = entrada.nextInt();
        System.out.print("Ingresa el cargo: ");
        String cargo = entrada.nextLine();
        entrada.nextLine();
        Empleado nuevoEmpleado = new Empleado(nombre, edad, sueldo, cargo);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado correctamente.");
    }

    public static void imprimirEmpleados() {
        System.out.println("Empleados registrados: ");
        for (Empleado e : empleados) {
            System.out
                    .println("Empleado: " + e.getNombre() + " - Edad: " + e.getEdad() + " - Sueldo: " + e.getSalario());
        }
    }

    public static void filtraEmpleados() {
        System.out.println("Filtrar empleado: ");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        System.out.println("3. Por sueldo");
        System.out.println("4. Por departamento");
        System.out.print("Ingresa una opcion: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Por nombre");
                System.out.print("Ingresar nombre a buscar : ");
                String nombre = entrada.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                        System.out.println(
                                empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
                    }
                }
                break;
            case 2:
                System.out.println("Por edad");
                System.out.print("Ingresar edad a buscar : ");
                int edad = entrada.nextInt();
                entrada.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getEdad() == edad) {
                        System.out.println(
                                empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
                    }
                }
                break;
            case 3:
                System.out.println("Por sueldo");
                System.out.print("Ingresar sueldo a buscar : ");
                int sueldo = entrada.nextInt();
                entrada.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getSalario() == sueldo) {
                        System.out.println(
                                empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
                    }
                }
                break;
            case 4:
                System.out.println("Por departamento");
                System.out.print("Ingresar departamento a buscar : ");
                String departamento = entrada.nextLine();
                for (Empleado empleado : empleados) {
                    if (empleado.getDepartamento().equalsIgnoreCase(departamento)) {
                        System.out.println(
                                empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
                    }
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void ordenarEmpleados() {
        System.out.println("Ordernar empleados: ");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        System.out.println("3. Por sueldo");
        System.out.println("4. Por departamento");
        System.out.print("Ingresa una opcion: ");
        int opcion = entrada.nextInt();
        entrada.nextLine();
        switch (opcion) {
            case 1:
                System.out.println("Por nombre");
                Collections.sort(empleados, (e1, e2) -> e1.getNombre().compareToIgnoreCase(e2.getNombre()));
                for (Empleado empleado : empleados) {
                    System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario()
                            + " - " + empleado.getDepartamento());
                }
                break;
            case 2:
                System.out.println("Por edad");
                Collections.sort(empleados, (e1, e2) -> Integer.compare(e1.getEdad(), e2.getEdad()));
                for (Empleado empleado : empleados) {
                    System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario()
                            + " - " + empleado.getDepartamento());
                }
                break;
            case 3:
                System.out.println("Por sueldo");
                Collections.sort(empleados, (e1, e2) -> Integer.compare(e1.getSalario(), e2.getSalario()));
                for (Empleado empleado : empleados) {
                    System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario()
                            + " - " + empleado.getDepartamento());
                }
                break;
            case 4:
                System.out.println("Por departamento");
                Collections.sort(empleados, (e1, e2) -> e1.getDepartamento().compareToIgnoreCase(e2.getDepartamento()));
                for (Empleado empleado : empleados) {
                    System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario()
                            + " - " + empleado.getDepartamento());
                }
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }

    public static void mostrarPorNombres() {
        System.out.println("Por nombre");
        System.out.print("Ingresar nombre a buscar : ");
        String nombre = entrada.nextLine();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
            }
        }

    }

    public static void incrementarSalario() {
        System.out.print("Ingresar nombre empelado a incrementar el sueldo : ");
        String nombre = entrada.nextLine();
        for (Empleado empleado : empleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
                System.out.print("Ingresar porcentaje a incrementar : ");
                int porcentaje = entrada.nextInt();
                entrada.nextLine();
                int nuevoSueldo = empleado.getSalario() + (empleado.getSalario() * porcentaje / 100);
                System.out.println("Sueldo actualizado !!!");
                empleado.setSalario(nuevoSueldo);
                System.out.println(empleado.getNombre() + " - " + empleado.getEdad() + " - " + empleado.getSalario());
            }
        }
    }
}
