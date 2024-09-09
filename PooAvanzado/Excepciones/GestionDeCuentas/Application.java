package PooAvanzado.Excepciones.GestionDeCuentas;

import PooAvanzado.Excepciones.GestionDeCuentas.Modelos.CuentaBancaria;
import PooAvanzado.Excepciones.GestionDeCuentas.Modelos.SaldoInsuficienteException;

public class Application {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta = new CuentaBancaria(5000);
        try {
            cuenta.retirar();
        } catch (SaldoInsuficienteException e) {
            System.out.println("Algo salio mal !!!: " + e.getMessage());
        }
    }
}
