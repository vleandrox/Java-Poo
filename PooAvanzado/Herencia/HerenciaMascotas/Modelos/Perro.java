package PooAvanzado.Herencia.HerenciaMascotas.Modelos;

public class Perro extends Animal {
    
    private String raza;

    public Perro() {
        super();
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
        super.comer();
        System.out.println("El perro está comiendo croquetas");
    }

    @Override
    public void dormir() {
        super.dormir();
        System.out.println("El perro esta durmiendo");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((raza == null) ? 0 : raza.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Perro other = (Perro) obj;
        if (raza == null) {
            if (other.raza != null)
                return false;
        } else if (!raza.equals(other.raza))
            return false;
        return true;
    }

    
}
