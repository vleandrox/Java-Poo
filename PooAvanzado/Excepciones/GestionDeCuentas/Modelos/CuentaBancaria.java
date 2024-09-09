package PooAvanzado.Excepciones.GestionDeCuentas.Modelos;

import java.util.Scanner;

public class CuentaBancaria {

    public Integer saldoInicial;
    public static Scanner entrada = new Scanner(System.in);

    public CuentaBancaria(Integer saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Integer getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Integer saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void retirar() throws SaldoInsuficienteException {
        System.out.println("Su saldo inicial es: " + saldoInicial);

        System.out.print("Ingresa el monto a retirar: ");
        int monto = entrada.nextInt();
        if (monto > saldoInicial) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar el retiro.");
        }
        saldoInicial = (saldoInicial - monto);
        System.out.println("Retiro exitoso. Su nuevo saldo es: " + saldoInicial);

        
        // System.out.println("Su saldo inicial es : " + saldoInicial);
        // do {
        // System.out.print("Ingresa el monto a retirar: ");
        // int monto = entrada.nextInt();
        // saldoInicial = (saldoInicial - monto);
        // if (saldoInicial < 0) {
        // throw new SaldoInsuficienteException("Saldo insuficiente");
        // }
        // System.out.println("Su saldo es : " + saldoInicial);
        // } while (saldoInicial!=0);
    }
}
