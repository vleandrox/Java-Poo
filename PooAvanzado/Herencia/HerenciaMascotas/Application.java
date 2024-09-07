package PooAvanzado.Herencia.HerenciaMascotas;

import java.util.ArrayList;
import java.util.List;

import PooAvanzado.Herencia.HerenciaMascotas.Modelos.Animal;
import PooAvanzado.Herencia.HerenciaMascotas.Modelos.Gato;
import PooAvanzado.Herencia.HerenciaMascotas.Modelos.Perro;

public class Application {
    
    public static void main(String[] args) {
        // Animal animal = new Animal();    
        List<Animal> animales = new ArrayList<>();
        Animal perro1 = new Perro("Firulais", 5, "Pastor Aleman");
        Animal perro2 = new Perro("Scooby", 7, "Doberman");
        Animal gato1 = new Gato("Pelusa", 3, "Siames");
        Animal gato2 = new Gato("Nala", 2, "Ragdoll");

        //Agregar los objetos a la lista Animales
        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato1);
        animales.add(gato2);

        for (Animal animal : animales) {
            if(animal instanceof Perro){
                Perro perro = (Perro) animal;
                System.out.println( perro.getNombre() + " es un perro de raza: " + perro.getRaza());
                perro.ladrar(); 
            }else if(animal instanceof Gato){
                Gato gato = (Gato) animal;
                System.out.println( gato.getNombre()+ " es un gato de raza: " + gato.getRaza());
                gato.maullar();
            }
            // Métodos comunes a todos los animales
            animal.comer();
            animal.dormir();
        }

        // mostrarAnimal(perro1);
        // mostrarAnimal(perro2);
        // mostrarAnimal(gato1);
        // mostrarAnimal(gato2);

        // metodo(perro1, perro2);
        // metodo(gato1, gato2);
        // metodo(gato1, gato2);
        // metodo(gato1, gato1);

    }
    public static void mostrarAnimal(Animal animal) {
        System.out.println(animal.getNombre() + " tiene " + animal.getEdad() + " anios de edad");
    }
    public static void metodo(Animal instancia1, Animal instancia2) {
        System.out.println("instancia.equals(instancia2) = " + instancia1.equals(instancia2));
    }
}
