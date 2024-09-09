package PooAvanzado.AsociacionesPoo.LigaDeFutbol.Modelos;

public class Jugador {
    
    private String nombreJugador;
    private Equipo equipo;

    public Jugador(){
    }

    public Jugador(String nombreJugador, Equipo equipo){
        this.nombreJugador = nombreJugador;        
        this.equipo = equipo;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
}

