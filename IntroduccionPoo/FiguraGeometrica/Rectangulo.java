package IntroduccionPoo.FiguraGeometrica;
public class Rectangulo {

    Double ancho = 0.0;
    Double alto = 0.0;
    static Integer contadorRectangulos = 0;

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }
    public Double area(){
        Double area = ancho * alto;        
        return area;
    }
    public Double perimetro(){
        Double perimetro = (ancho * 2) + (alto * 2);
        return perimetro;
    }
    public void imprimirArea(Double area){
        System.out.println("El area del rectangulo es: " + area);
    }
    public void imprimirPerimetro(Double perimetro){
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
