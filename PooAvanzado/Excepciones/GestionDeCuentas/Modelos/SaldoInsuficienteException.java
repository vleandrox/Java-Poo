package PooAvanzado.Excepciones.GestionDeCuentas.Modelos;

public class SaldoInsuficienteException extends Exception {
    
    public SaldoInsuficienteException(String message) {
        super(message);
    }
}
