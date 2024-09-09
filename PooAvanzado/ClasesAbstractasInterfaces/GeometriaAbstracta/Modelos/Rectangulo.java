package PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos;

public class Rectangulo extends Figura implements Dibujable{

    private double ancho;
    private double alto;
    
    
    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo");
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
    
}
