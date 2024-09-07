package EncapsulamientoYOcultamiento.FiguraGeometrica.Modelos;

public class Circulo {    

    private double radio;

    public Circulo() {
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area() {
        return 3.14 * radio * radio;
    }
    public double perimetro() {
        return 2 * 3.14 * radio;
    }
    public void imprimirArea() {
        System.out.println("El area del circulo es: " + area());
    }
    public void imprimirPerimetro() {
        System.out.println("El perimetro del circulo es: " + perimetro());
    }
}
