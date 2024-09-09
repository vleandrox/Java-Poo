package PooAvanzado.Enums.Colores.Enums;

public enum Color {
    ROJO("#FF0000"), AMARILLO("#FFFF00"), AZUL("#0000FF");

    private String valorHexadecimal;

    // Constructor
    private Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }
    // Getters  
    public String getValorHexadecimal() {
        return valorHexadecimal;
    }    
}
