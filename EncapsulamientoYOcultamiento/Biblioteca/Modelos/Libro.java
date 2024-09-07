package EncapsulamientoYOcultamiento.Biblioteca.Modelos;

public class Libro {
    
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(){

    }

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

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
    public int getPaginas() {
        return paginas;
    }
    public void setPaginas(int paginasIngresadasPorUsuario) {
        this.paginas = paginasIngresadasPorUsuario * 7;
    }

    // Método que imprime los detalles del libro
    public void imprimirDetalles() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginas);
    }
}
