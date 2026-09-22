package org.ies.tierno.exercises.contadores;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(8);
        long startTime = System.nanoTime();


        for (int i = 0; i < 5; i++) {
            es.submit(new Contador("Contador- " + i, 5));

        }

        //ordena cuando se acaban las tareas se destruya el pool con sus hilos
        es.shutdown();


        //Espera a que todas las tareas hayan termnado, si a los 10 min no ha terminado
        //se desbloquea.

        es.awaitTermination(10, TimeUnit.MINUTES);

        System.out.println("El main ha terminado");

        long endTime = System.nanoTime();

        System.out.println((endTime - startTime) / 1000);

    }
}
