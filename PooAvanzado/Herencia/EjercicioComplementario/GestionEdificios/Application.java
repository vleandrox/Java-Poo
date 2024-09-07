package PooAvanzado.Herencia.EjercicioComplementario.GestionEdificios;

import java.util.ArrayList;

import PooAvanzado.Herencia.EjercicioComplementario.GestionEdificios.Modelos.Edificio;
import PooAvanzado.Herencia.EjercicioComplementario.GestionEdificios.Modelos.EdificioDeOficinas;
import PooAvanzado.Herencia.EjercicioComplementario.GestionEdificios.Modelos.Polideportivo;

public class Application {
     
    public static void main(String[] args) {   

        ArrayList<Edificio> edificios = new ArrayList<>();
        Edificio polideportivo1 = new Polideportivo(20, 15, 10, "Sauces", "Techado");
        Edificio polideportivo2 = new Polideportivo( 25, 10, 15 , "Pinos", "Abierto");
        Edificio polideportivo3 = new Polideportivo( 10 , 10, 15 , "Pinos", "Abierto");
        Edificio edificioOficina1 = new EdificioDeOficinas( 15, 10, 15, 2, 10, 3);
        Edificio edificioOficina2 = new EdificioDeOficinas( 25, 15 , 15, 3, 10, 3);
        edificios.add(polideportivo1);
        edificios.add(polideportivo2);
        edificios.add(polideportivo3);
        edificios.add(edificioOficina1);
        edificios.add(edificioOficina2);
        System.out.print("");
        for (Edificio edificio : edificios) {
            System.out.println(edificio.getClass().getSimpleName());
            System.out.println("Superficie: " +  edificio.calcularSuperficie());
            System.out.println("Volumen: " + edificio.calcularVolumen()); 
            if (edificio instanceof Polideportivo) {
                Polideportivo polideportivo = (Polideportivo) edificio; 
                System.out.println("Cantidad de Polideportivos Techados: " + polideportivo.contarPolideportivosTechados());
                System.out.println("Cantidad de Polideportivos Abiertos: " + polideportivo.contarPolideportivosAbiertos());
                               
            } else if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edificioOficinas = (EdificioDeOficinas) edificio;
                edificioOficinas.cantidadPersonas();
                System.out.println(edificioOficinas.cantidadPersonas()); 
            }
        }            
    }
}
