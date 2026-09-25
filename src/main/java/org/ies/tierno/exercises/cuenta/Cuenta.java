package org.ies.tierno.exercises.cuenta;

public class Cuenta {
    private int saldo = 0;

    public synchronized void ingresar(int cantidad) {
        int nuevoSaldo = saldo + cantidad;
        saldo = nuevoSaldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public synchronized void sacar(int cantidad) {
        int nuevoSaldo = saldo - cantidad;
        saldo = nuevoSaldo;
    }
}

