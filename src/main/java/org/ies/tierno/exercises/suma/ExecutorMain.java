package org.ies.tierno.exercises.suma;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorMain {
    public static void main(String[] args) throws InterruptedException {
        //Array de 40 elementos
        int[] datos = new int[40];

        //Rellenamos el array

        for (int i = 0; i < datos.length; i++) {
            datos[i] = i + 1;

        }
        ExecutorService pool = Executors.newFixedThreadPool(4);


        //creo los objetos
        for (int i = 0; i < 4; i++) {
            pool.submit(new SumaParcial(datos, i * 10, (i * 10) + 9));

        }
    }
}
