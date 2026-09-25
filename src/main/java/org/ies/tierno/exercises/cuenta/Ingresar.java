package org.ies.tierno.exercises.cuenta;

public class Ingresar implements Runnable {
    private final Cuenta cuenta;

    public Ingresar(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            cuenta.ingresar(i);
            cuenta.sacar(1);

        }
    }
}
