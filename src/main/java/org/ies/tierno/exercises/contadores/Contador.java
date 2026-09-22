package org.ies.tierno.exercises.contadores;

import org.ies.tierno.exercises.task.Tarea;

import java.util.Random;

public class Contador implements Runnable {
    private final String nombre;
    private final int numVueltas;

    public Contador(String nombre, int numVueltas) {
        this.nombre = nombre;
        this.numVueltas = numVueltas;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < numVueltas; i++) {
            System.out.println("Soy " +  nombre + " Vuelta numero " + i);
            try {
                Thread.sleep(random.nextInt(100, 500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
