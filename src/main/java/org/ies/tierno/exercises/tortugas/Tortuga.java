package org.ies.tierno.exercises.tortugas;

import java.util.Random;

public class Tortuga implements Runnable {
    private final String name;
    private final Random random;

    public Tortuga(String name, Random random) {
        this.name = name;
        this.random = random;
    }

    @Override
    public void run() {
        int pasos = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println(name + ", paso " + (i + 1));

            try {
                Thread.sleep(random.nextLong(50, 200));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " ha llegado a la meta!");

    }
}
