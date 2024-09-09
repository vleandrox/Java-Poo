package PooAvanzado.Enums.Colores;

import PooAvanzado.Enums.Colores.Enums.Color;
import PooAvanzado.Enums.Colores.Modelos.ConvertidorColor;

public class Application {

    public static void main(String[] args) {
        ConvertidorColor convertidor = new ConvertidorColor();
        
        // Arreglo de valores hexadecimales para prueba
        String[] valoresHex = { "#FF0000", "#00FF00", "#FFFF00", "#0000FF", "#FFFFFF" };
        
        // Verificar cada valor hexadecimal
        for (String valorHex : valoresHex) {
            Color color = convertidor.convertirHexadecimal(valorHex);
            if (color != null) {
                System.out.println("El valor hexadecimal " + valorHex + " corresponde al color " + color.name());
            } else {
                System.out.println("El valor hexadecimal " + valorHex + " no es un color primario.");
            }
        }
    }
}
