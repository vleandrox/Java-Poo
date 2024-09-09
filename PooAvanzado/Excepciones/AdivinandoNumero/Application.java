package PooAvanzado.Excepciones.AdivinandoNumero;
 
import java.util.Scanner;
 
public class Application {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int numeroSecreto = (int) (Math.random() * 50 + 1);
        System.out.println(" El numero secreto es : " + numeroSecreto);
        int numero = 0;
        int contadorIntentos = 0;
        do {
            try {
                System.out.print("Ingresa un numero: ");
                numero = verificarIngreso();
                contadorIntentos++;
                if (numero > numeroSecreto) {
                    System.out.println("El numero secreto es menor. Intenta de nuevo");
                } else if (numero < numeroSecreto) {
                    System.out.println("El numero secreto es mayor. Intenta de nuevo");
                }
                
            } catch (Exception  e) {
                System.out.println(e.getMessage());
                contadorIntentos++;
            }
            
        } while (numero != numeroSecreto);
        System.out.println(
                "Felicidades, acertaste el numero Secreto es : " + numeroSecreto + ", Intentos:" + contadorIntentos);
    }

    public static int verificarIngreso() throws Exception {
        try {
            return entrada.nextInt();
        } catch (Exception e) {
            entrada.next();  
            throw new Exception("Por favor, ingresa un número válido.");
        }
    }
}
