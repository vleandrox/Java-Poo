package PooAvanzado.Enums.DiasSemana;

import PooAvanzado.Enums.DiasSemana.Enums.DiaSemana;
import java.util.Random;
public class Application {
 
    public static void main(String[] args) {
        // Crear un arreglo de 10 días de la semana generados al azar
        DiaSemana[] dias = new DiaSemana[10];
        Random random = new Random();
        DiaSemana[] diasSemana = DiaSemana.values(); // Obtener todos los días de la semana

        for (int i = 0; i < dias.length; i++) {
            dias[i] = diasSemana[random.nextInt(diasSemana.length)];
        }

        // Imprimir información sobre si el día es laboral o no
        imprimirDiaLaboral(dias);                          
    }

    public static void imprimirDiaLaboral(DiaSemana[] dias){
        System.out.println("");
        for (DiaSemana dia : dias) {
            if(dia.esDiaLaboral() == true){
                System.out.println("El dia: " + dia + " ES LABORAL");                
            }else{
                System.out.println("El dia: " + dia + " NO ES LABORAL");
            }            
        }
    }
}
