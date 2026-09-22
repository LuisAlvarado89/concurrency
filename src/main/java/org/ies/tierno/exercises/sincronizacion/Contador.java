package org.ies.tierno.exercises.sincronizacion;

public class Contador implements Runnable{

    private int valor = 0;

    public void incrementar() {
        valor++;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public void run() {

    }
}