package PooAvanzado.AsociacionesPoo.LigaDeFutbol.Modelos;
import java.util.ArrayList;
public class Equipo {

    private String nombre;
    private static ArrayList<Equipo> equipos = new ArrayList<Equipo>();

    public Equipo() {        
    }
    public Equipo(String nombre) {
        this.nombre = nombre;
        equipos.add(this);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void imprimirEquipo() {
        System.out.println("Equipos guardados:");
        for (Equipo equipo : equipos) {
            System.out.println(equipo.getNombre());
        }
    }
}
