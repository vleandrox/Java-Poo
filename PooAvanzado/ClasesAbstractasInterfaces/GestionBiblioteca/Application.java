package PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca;

import java.util.Scanner;

import PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos.Biblioteca;
import PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos.Catalogable; 
import PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos.Libro;
import PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos.Persona;
import PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos.Revista;

public class Application {

    public static void main(String[] args) {   
        Revista revista1 = new Revista(1, 10, "Vogue");
        Revista revista2 = new Revista(2, 30, "Cosmos");
        Revista revista3 = new Revista(3, 20, "People");
        Revista revista4 = new Revista(4, 15, "Cosas");
        Revista revista5 = new Revista(5, 25, "Soho");

        // Agregar libros a la biblioteca
        Biblioteca biblioteca = new Biblioteca();
        // Persona persona = new Persona("Juan", "Pérez");

        Catalogable[] itemsBiblioteca = { revista1, revista2, revista3, revista4, revista5 };

        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú de Biblioteca");
            System.out.println("1. Prestar Revista");
            System.out.println("2. Devolver Revista");
            System.out.println("3. Mostrar Información de Revistas");
            System.out.println("4. Agregar Libros");
            System.out.println("5. Mostrar Catálogo de Libros");
            System.out.println("6. Agregar Personas");
            System.out.println("7. Prestar Libros");
            System.out.println("8. Devolver Libros");
            System.out.println("9. Mostrar Libros Prestados");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    mostrarRevistas(itemsBiblioteca);
                    System.out.print("Seleccione la revista para prestar: ");
                    int indicePrestar = scanner.nextInt() - 1;
                    if (indicePrestar >= 0 && indicePrestar < itemsBiblioteca.length) {
                        ((Revista) itemsBiblioteca[indicePrestar]).prestar();
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    System.out.println("Tiene 7 dias para la devolucion de la revista. ");
                    break;
                case 2:
                    mostrarRevistas(itemsBiblioteca);
                    System.out.print("Seleccione la revista para devolver: ");
                    int indiceDevolver = scanner.nextInt() - 1;
                    if (indiceDevolver >= 0 && indiceDevolver < itemsBiblioteca.length) {
                        ((Revista) itemsBiblioteca[indiceDevolver]).calcularMultas();
                        ((Revista) itemsBiblioteca[indiceDevolver]).devolver();
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;
                case 3:
                    for (Catalogable item : itemsBiblioteca) {
                        item.obtenerInformacion();
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Ingrese el título del titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Ingrese el autor del titulo: ");
                    String autor = scanner.nextLine();
                    System.out.println("Ingrese el número de páginas del libro: ");
                    int numeroDePaginas = scanner.nextInt();
                    Libro libro = new Libro(titulo, autor, numeroDePaginas, false);
                    biblioteca.agregarLibro(libro);
                    break;
                case 5:
                    biblioteca.mostrarCatalogo();
                    break;
                case 6:
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el apellido de la persona: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Ingrese el dni de la persona: ");
                    Integer dni = scanner.nextInt();
                    Persona persona = new Persona(nombre, apellido,dni);
                    biblioteca.agregarPersona(persona);
                    break;
                case 7:
                    System.out.print("Ingrese el DNi de la persona: ");
                    dni = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el título del libro a prestar: ");
                    titulo = scanner.nextLine();
                    biblioteca.prestarLibro(dni, titulo);
                    break;
                case 8:
                    System.out.print("Ingrese el DNi de la persona: ");
                    dni = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ingrese el título del libro a devolver: ");
                    titulo = scanner.nextLine();
                    biblioteca.devolverLibro(dni, titulo);
                    break;
                case 9:
                    biblioteca.mostrarLibrosPrestados();
                    break;
                case 10:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 10);
        scanner.close();
    }

    private static void mostrarRevistas(Catalogable[] itemsBiblioteca) {
        for (int i = 0; i < itemsBiblioteca.length; i++) {
            System.out.println((i + 1) + ". " + ((Revista) itemsBiblioteca[i]).getNombreRevista());
        }
    }
}
