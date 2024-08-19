package IntroduccionPoo.Ejercicio2;

public class Auto {

    String marca;
    String modelo;
    Integer año;

    public Auto(){

    }
    public Auto(String marca, String modelo,Integer año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    public Auto(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public Auto(String marca){
        this.marca = marca;
    }

    public void imprimirDatos(){
        System.out.println();
        System.out.println("MARCA: " + marca + ", MODELO: " + modelo+ ", AÑO: " + año);
    }

}
