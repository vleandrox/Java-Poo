package PooAvanzado.Herencia.EjercicioComplementario.GestionEdificios.Modelos;

public class Polideportivo extends Edificio {
    
    private String nombre;
    private String tipoInstalacion;
    private static int techados = 0;
    private static int abiertos = 0;

    public Polideportivo() {
        super();
    }

    public Polideportivo(double ancho, double alto, double largo,String nombre, String tipoInstalacion) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
        if(tipoInstalacion.equalsIgnoreCase("Techado")) {
            techados++;
        } else if(tipoInstalacion.equalsIgnoreCase("Abierto")) {
            abiertos++;
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipoInstalacion() {
        return tipoInstalacion;
    }
    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public  int contarPolideportivosTechados() {
        return techados;
    }

    public  int contarPolideportivosAbiertos() {
        return abiertos;
    }

    @Override
    public double calcularSuperficie() {
        return ancho * largo;
    }

    @Override
    public double calcularVolumen() {
        return ancho * largo * alto;
    }
    
}
