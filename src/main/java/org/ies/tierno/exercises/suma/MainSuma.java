package org.ies.tierno.exercises.suma;

import org.ies.tierno.exercises.task.Tarea;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainSuma {
    public static void main(String[] args) throws InterruptedException {
        //Array de 40 elementos
        int[] datos = new int[40];

        //Rellenamos el array

        for (int i = 0; i < datos.length; i++) {
            datos[i] = i + 1;

        }
        //creo los objetos

        SumaParcial sumaParcial1 = new SumaParcial(datos, 0, 9);
        SumaParcial sumaParcial2 = new SumaParcial(datos, 10, 19);
        SumaParcial sumaParcial3 = new SumaParcial(datos, 20, 29);
        SumaParcial sumaParcial4 = new SumaParcial(datos, 30, 39);


        //creo los hilos
        Thread hilo1 = new Thread(sumaParcial1);
        Thread hilo2 = new Thread(sumaParcial2);
        Thread hilo3 = new Thread(sumaParcial3);
        Thread hilo4 = new Thread(sumaParcial4);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();

        int sum1 = sumaParcial1.getSuma();
        int sum2 = sumaParcial2.getSuma();
        int sum3 = sumaParcial3.getSuma();
        int sum4 = sumaParcial4.getSuma();

        // creo una variable para sumar todo

        int sumGlobal = sum1 + sum2 + sum3 + sum4;

        System.out.println("La suma total es: " + sumGlobal); //820
    }
}
