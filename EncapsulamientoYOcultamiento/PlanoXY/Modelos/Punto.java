package EncapsulamientoYOcultamiento.PlanoXY.Modelos;
import java.util.ArrayList;
public class Punto {
    
    private double x;
    private double y;

    public Punto() {
        this(0, 0);        
    }
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    // Método de instancia que calcula la distancia desde el origen (0,0)
    public double distanciaDesdeOrigen() {
        double distancia = (x*x) + (y*y);
        return Math.sqrt(distancia);
    }
    // Método estático que calcula la distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    // Método estático que verifica si tres puntos están alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        return (p2.getY() - p1.getY())*(p3.getX() - p1.getX()) == (p3.getY() - p1.getY())*(p2.getX() - p1.getX());
    }
}
