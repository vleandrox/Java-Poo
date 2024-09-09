package PooAvanzado.Enums.Colores.Modelos;

import PooAvanzado.Enums.Colores.Enums.Color;

public class ConvertidorColor {
  
    public Color convertirHexadecimal(String valor){
        for (Color color : Color.values()) {
            if (color.getValorHexadecimal().equalsIgnoreCase(valor)) {
                return color;
            }
        }
        return null;
    }
}
