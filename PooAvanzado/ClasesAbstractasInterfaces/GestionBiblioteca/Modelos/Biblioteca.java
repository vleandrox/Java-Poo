package PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> catalogo;
    private ArrayList<Persona> personas;

    public Biblioteca() {
        this.catalogo=new ArrayList<>();
        this.personas=new ArrayList<>();
    }
 
    public void agregarLibro(Libro libros) {
        catalogo.add(libros); 
        System.out.println("Libro agregado al catálogo: " + libros.getTitulo());
    }
    public void agregarPersona(Persona persona) {
        personas.add(persona);
        System.out.println("Persona agregada: " + persona.getNombreCompleto());
    }
    public void mostrarCatalogo() {
        for (Libro libro : catalogo) {
            libro.obtenerInformacion();   
            System.out.println();
        }
    }
    public void prestarLibro(Integer dni, String titulo) {
        Persona persona = buscarPersona(dni);
        if (persona == null) {
            System.out.println("Persona no encontrada.");
            return;
        }
        for (Libro libro : catalogo) {
            if (libro.getTitulo().equals(titulo) && !libro.getPrestado()) {
                libro.prestar();
                persona.agregarLibro(libro);
                System.out.println("Libro " + titulo + " prestado a " + persona.getNombreCompleto());
                return;
            }
        }
        System.out.println("El libro no está disponible o no existe en el catálogo.");
    }
    public void devolverLibro(Integer dni, String titulo) {
        Persona persona = buscarPersona(dni);
        if (persona == null) {
            System.out.println("Persona no encontrada.");
            return;
        }
        for (Libro libro : persona.getLibrosPrestados()) {
            if (libro.getTitulo().equals(titulo)) {
                libro.devolver();
                persona.devolverLibro(libro);
                System.out.println("Libro " + titulo + " devuelto por " + persona.getNombreCompleto());
                return;
            }
        }
        System.out.println("El libro no se encontró en la lista de préstamos de " + persona.getNombreCompleto());
    }

    public void mostrarLibrosPrestados() {
        for (Persona persona : personas) {
            System.out.println("Libros prestados por " + persona.getNombreCompleto() + ":");
            for (Libro libro : persona.getLibrosPrestados()) {
                System.out.println("- " + libro.getTitulo());
            }
            System.out.println();
        }
    }

    private Persona buscarPersona(Integer dni) {
        for (Persona persona : personas) {
            if (persona.getDni().equals(dni)) {
                System.out.println("Retornando persona " + persona.getDni());
                return persona;
            }
        }
        return null;
    }
}
