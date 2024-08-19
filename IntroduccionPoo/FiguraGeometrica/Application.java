package IntroduccionPoo.FiguraGeometrica;
import java.util.Arrays;
import java.util.Scanner;
public class Application {

    public static Scanner entrada = new Scanner(System.in);
    public static Double[] anchosmedidas = new Double[3];
    public static Double[] altosmedidas = new Double[3];
    public static void main(String[] args) {
        // Rectangulo objRectangulo1 = new Rectangulo(10.0, 5.0);
        // objRectangulo1.imprimirArea(objRectangulo1.area());
        // objRectangulo1.imprimirPerimetro(objRectangulo1.perimetro());
        // Rectangulo objRectangulo2 = new Rectangulo(10.0, 8.0);
        // objRectangulo2.imprimirArea(objRectangulo2.area()); 
        // objRectangulo2.imprimirPerimetro(objRectangulo2.perimetro());
        // System.out.println("Se ejecuto [ " + Rectangulo.contadorRectangulos + " ] instancias del objeto Rectangulo");
        ingresoDatos();
        System.out.print("Array de anchos" + Arrays.toString(anchosmedidas));
    }

    public static void ingresoDatos() {
        int opcion = 0;
        do {
            System.out.println("MENU");
            System.out.println("1. Ingresar datos del rectangulo");
            System.out.println("2. Imprimir datos del rectangulo");
            System.out.println("0. Salir");
            System.out.print("Elige una función: ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingresar datos del rectangulo");                                        
                    
                    
                    for(int i = 0; i<anchosmedidas.length;i++){
                        System.out.print("Ingresa el ancho del rectangulo : ");
                        anchosmedidas[i] = entrada.nextDouble();
                    }
                    for(int i = 0; i<altosmedidas.length;i++){
                        System.out.print("Ingresa el alto del rectangulo : ");
                        altosmedidas[i] = entrada.nextDouble();
                    }
                    break;
            }
            
        } while (opcion != 0);
    }
}
