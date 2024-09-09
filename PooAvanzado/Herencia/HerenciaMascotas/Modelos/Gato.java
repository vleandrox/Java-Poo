package PooAvanzado.Herencia.HerenciaMascotas.Modelos;

public class Gato extends Animal{
    
    private String raza;

    public Gato() {
        super();
    }
    public Gato(String nombre, Integer edad,  String raza) {
        super(nombre, edad);
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void maullar(){
        System.out.println("Miau");
    }
    @Override
    public void comer() {        
        System.out.println("El gato " + nombre + " está comiendo pescado.");
    }
    @Override
    public void dormir() {        
        System.out.println("El gato " + nombre + " está durmiendo encima del sofá.");
    }      
}
