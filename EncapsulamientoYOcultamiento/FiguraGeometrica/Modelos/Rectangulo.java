package EncapsulamientoYOcultamiento.FiguraGeometrica.Modelos;

public class Rectangulo {
    
    private double ancho;
    private double altura;

    public Rectangulo(){
    }
    public Rectangulo(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double area(){
        return ancho * altura;
    }

    public double perimetro(){
        return (ancho * 2) + (altura * 2);
    }
    public void imprimirArea(){
        System.out.println("El area del rectangulo es: " + area());
    }
    public void imprimirPerimetro(){
        System.out.println("El perimetro del rectangulo es: " + perimetro());
    }
}
