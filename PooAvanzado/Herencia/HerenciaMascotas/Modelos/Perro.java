package PooAvanzado.Herencia.HerenciaMascotas.Modelos;
import java.util.Objects;
public class Perro extends Animal {
    
    private String raza;

    public Perro() {
        super();
    }
    public Perro(String nombre, int edad) {
        super(nombre, edad);    
    }
    public Perro(String nombre, Integer edad,  String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void ladrar(){
        System.out.println("Guau");
    }

    @Override
    public void comer() {
        System.out.println("El perro " + nombre + " está comiendo croquetas.");
    }

    @Override
    public void dormir() {
        System.out.println("El perro " + nombre + " está durmiendo en su cama.");
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, raza);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Perro perro = (Perro) obj;
        return edad == perro.edad &&
                Objects.equals(nombre, perro.nombre) &&
                Objects.equals(raza, perro.raza);
    }
}
