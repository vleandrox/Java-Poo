package PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos;

public class Libro extends ItemBiblioteca implements Catalogable {

    private String titulo;
    private String autor;
    private Integer numeroPaginas;
    private Boolean prestado;

    // Constructores
    public Libro() {
    }

    public Libro(String titulo, String autor, Integer numeroPaginas, Boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.prestado = false;  // Inicialmente, el libro no está prestado
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(Integer numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
    public Boolean getPrestado() {
        return prestado;
    }
    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }
    
    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public int calcularMultas() {
        return 0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Libro: " + titulo + ", autor: " + autor + ", numero de paginas: " + numeroPaginas + ", Estado: " + (prestado ? "Prestado" : "Disponible"));
    }    
}
