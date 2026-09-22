package org.ies.tierno.exercises.contadores;

import java.util.LinkedList;
import java.util.List;

public class MainThreads {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.nanoTime();

        List<Thread> threads = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Contador("Contador- " + i, 5));
            threads.add(t);

            t.start();
            //No puedo poner el join aqui porque hace que el programa se vuelva secuencial

        }

        //Este bucle recorre todos los hilos haciendo join, al finalizar el bucle todos los hilos terminan
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("El main ha terminado");

        long endTime = System.nanoTime();

        System.out.println((endTime - startTime) / 1000);

    }
}
