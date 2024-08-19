package IntroduccionPoo.EjercicioComplementario;

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

    public void imprimirDatos(){
        System.out.println("MARCA: " + marca + ", MODELO: " + modelo + ", Año: " + año );
    }
}
