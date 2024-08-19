package IntroduccionPoo.Ejercicio2;

public class Application {

    public static void main(String[] arrays) {
        Auto objAuto1 = new Auto();
        objAuto1.imprimirDatos();
        Auto objAuto2 = new Auto("Toyota");
        objAuto2.imprimirDatos();
        Auto objAuto3 = new Auto("Ford", "Explore");
        objAuto3.imprimirDatos();
        Auto objAuto4 = new Auto("Audi", "Sedan", 2018);
        objAuto4.imprimirDatos();
    }

}
