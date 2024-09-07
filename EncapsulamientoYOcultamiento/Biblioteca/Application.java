package EncapsulamientoYOcultamiento.Biblioteca;

import java.util.Scanner;
import EncapsulamientoYOcultamiento.Biblioteca.Modelos.Libro;
import java.util.ArrayList;

public class Application {

    public static Scanner entrada = new Scanner(System.in);

    // Usando arraysList
    public static ArrayList<Libro> libros = new ArrayList<Libro>();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar datos del libro");
            System.out.println("2. Mostrar datos del libro");
            System.out.println("3. Imprimir solos los libros");
            System.out.println("0. Salir");
            System.out.print("Elige una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                    crearLibro();
                    break;
                case 2:
                    imprimirDetallesLibros(); 
                    break;
                case 3:
                    imprimirTitulos();
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

    public static void crearLibro() {
        System.out.print("Ingresa el titulo del libro: ");
        String titulo = entrada.nextLine();
        System.out.print("Ingresa el autor del libro: ");
        String autor = entrada.nextLine();
        System.out.print("Ingresa las paginas del libro: ");
        int paginasBase = entrada.nextInt(); 

        Libro nuevoLibro = new Libro(titulo, autor, paginasBase);
        libros.add(nuevoLibro);
        System.out.println("Libro agregado correctamente.");
    }

    // Método para imprimir los detalles de todos los libros
    public static void imprimirDetallesLibros() {
        System.out.println("Detalles de los libros:");
        for (Libro libro : libros) {
            libro.imprimirDetalles(); // Llamamos al método que imprime los detalles
        }
    }

    // Método para imprimir solo los títulos de los libros
    public static void imprimirTitulos() {
        System.out.println("Títulos de los libros:");
        for (Libro libro : libros) {
            System.out.println(" * " + libro.getTitulo());
        }
    }
}
