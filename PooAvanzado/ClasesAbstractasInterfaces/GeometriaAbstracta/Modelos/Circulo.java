package PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos;
 
public class Circulo extends Figura implements Dibujable{

    private double radio;
    
    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {        
        System.out.println("Dibujando un círculo");
    }

    @Override
    public double calcularArea() {
       return Math.PI * (radio * radio);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
