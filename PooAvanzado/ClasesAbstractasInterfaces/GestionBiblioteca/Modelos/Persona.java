package PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos;

import java.util.ArrayList;

public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private ArrayList<Libro> librosPrestados;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni) {
        this.nombre = nombre;
        this.apellido = apellido;  
        this.dni = dni; 
        this.librosPrestados = new ArrayList<>();     
    }
    
    //Getters and Setters
    public Integer getDni() {
        return dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public void guardarLibroPrestado(Libro libro) {
        librosPrestados.add(libro);        
    }
    public void agregarLibro(Libro libro) {
        librosPrestados.add(libro);
    }
    public void devolverLibro(Libro libro) {
        librosPrestados.remove(libro);
    }
    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }
    public String getNombreCompleto() {
        return nombre + " " + apellido + " (" + dni + ")";
    }
}
