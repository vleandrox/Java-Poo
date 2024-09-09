package PooAvanzado.ClasesAbstractasInterfaces.GestionBiblioteca.Modelos;

import java.util.Scanner;

public class Revista extends ItemBiblioteca implements Catalogable {

    private Integer nroEdicion;
    private Integer cantidadEjemplares;
    private String nombreRevista;
    private Integer diasDevolucion;
    private static Integer limiteDiasPrestamo = 7;

    //Constructores
    public Revista() {
    }
    public Revista(Integer nroEdicion, Integer cantidadEjemplares, String nombreRevista) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreRevista = nombreRevista;
    }

    //Getters and Setters
    public Integer getNroEdicion() {
        return nroEdicion;
    }
    public void setNroEdicion(Integer nroEdicion) {
        this.nroEdicion = nroEdicion;
    }
    public Integer getCantidadEjemplares() {
        return cantidadEjemplares;
    }
    public void setCantidadEjemplares(Integer cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    public String getNombreRevista() {
        return nombreRevista;
    }
    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }
    public Integer getDiasDevolucion() {
        return diasDevolucion;
    }
    public void setDiasDevolucion(Integer diasDevolucion) {
        this.diasDevolucion = diasDevolucion;
    }
    public static Integer getLimiteDiasPrestamo() {
        return limiteDiasPrestamo;
    }
    public static void setLimiteDiasPrestamo(Integer limiteDiasPrestamo) {
        Revista.limiteDiasPrestamo = limiteDiasPrestamo;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
        } else {
            System.out.println("No se puede prestar la revista " + nombreRevista + " porque no hay ejemplares disponibles.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("La revista " + nombreRevista + " ha sido devuelta.");
    }

    @Override
    public int calcularMultas() {
        Scanner entrada = new Scanner(System.in);
        int multa = 0;
        int multaPorDia = 3;
        System.out.println("Ingrese despues de cuantos dias se devuelve la revista:(Multa: S/.3 * Dia)");
        this.diasDevolucion = entrada.nextInt();  
        if (diasDevolucion > 7) {
            multa = (diasDevolucion - 7) * multaPorDia;
            System.out.println("La multa es: S/." + multa );
        }
        else{
            multa = 0;
        }
        return multa;      
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Revista: " + nombreRevista);
        System.out.println("Cantidad de Ejemplares: " + cantidadEjemplares);
    }
}
