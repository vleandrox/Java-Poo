package PooAvanzado.Herencia.EjercicioComplementario.GestionEdificios.Modelos;

public class EdificioDeOficinas extends Edificio{
    
    private Integer numeroDeOficinas;
    private Integer numeroDePersonas;
    private Integer numeroDePisos;

    public EdificioDeOficinas() {
        super();
    }

    public EdificioDeOficinas(double ancho, double alto, double largo, Integer numeroDeOficinas, Integer numeroDePersonas, Integer numeroDePisos) {
        super(ancho, alto, largo);
        this.numeroDeOficinas = numeroDeOficinas;
        this.numeroDePersonas = numeroDePersonas;
        this.numeroDePisos = numeroDePisos;
    }

    public Integer getNumeroDeOficinas() {
        return numeroDeOficinas;
    }

    public void setNumeroDeOficinas(Integer numeroDeOficinas) {
        this.numeroDeOficinas = numeroDeOficinas;
    }

    public Integer getNumeroDePersonas() {
        return numeroDePersonas;
    }

    public void setNumeroDePersonas(Integer numeroDePersonas) {
        this.numeroDePersonas = numeroDePersonas;
    }

    public Integer getNumeroDePisos() {
        return numeroDePisos;
    }

    public void setNumeroDePisos(Integer numeroDePisos) {
        this.numeroDePisos = numeroDePisos;
    }

    public int cantidadPersonas(){
        return this.getNumeroDePersonas() * this.getNumeroDePisos() * this.getNumeroDeOficinas();
    }
}
