package org.ies.tierno.exercises.suma;

public class SumaParcial implements Runnable {
    private int[] datos;
    private int desde;
    private int hasta;
    private int suma;

    public SumaParcial(int[] datos, int desde, int hasta) {
        this.datos = datos;
        this.desde = desde;
        this.hasta = hasta;

    }

    @Override
    public void run() {
        for (int i = desde; i <= hasta; i++) {
            suma += datos[i];
        }
    }

    public int getSuma() {
        return suma;
    }
}



