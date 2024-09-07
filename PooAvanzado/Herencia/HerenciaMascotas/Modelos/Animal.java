package PooAvanzado.Herencia.HerenciaMascotas.Modelos;

public class Animal {
    protected String nombre;
    protected Integer edad;

    public Animal() {
        super();
    }
    public Animal(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public void dormir(){
        System.out.println("Estoy durmiendo");
    }    
}
