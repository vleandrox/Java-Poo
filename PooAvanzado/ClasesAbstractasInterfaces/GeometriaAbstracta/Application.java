package PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta;

import PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos.Circulo;
import PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos.Dibujable;
import PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos.Figura;
import PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos.Rectangulo;
import PooAvanzado.ClasesAbstractasInterfaces.GeometriaAbstracta.Modelos.Triangulo;

public class Application {
    
    public static void main(String[] args) {
 
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(3, 4, 3, 4, 5);

        Dibujable[] figuras = { (Dibujable) circulo, (Dibujable) rectangulo, (Dibujable) triangulo };

        for (Dibujable figura : figuras) {
            figura.dibujar();
            System.out.println("Área: " + ((Figura) figura).calcularArea());
            System.out.println("Perímetro: " + ((Figura) figura).calcularPerimetro());
            System.out.println();
        }
    }
}
