package az.edu.turing.module02.part02.lesson31;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

class KitchenTask implements Runnable {
    private String task;

    public KitchenTask(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        // Task başladığında Thread adı ilə məlumatı ekrana yazdırırıq
        System.out.println(Thread.currentThread().getName() + " başladı: " + task);
        try {
            int cookingTime = ThreadLocalRandom.current().nextInt(1000, 5000); // Random 1-5 saniyə
            Thread.sleep(cookingTime);  // Yatmadan əvvəl 1-5 saniyə gözləyir
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Task bitdiyi zaman məlumatı ekrana yazdırırıq
        System.out.println(Thread.currentThread().getName() + " bitirdi: " + task);
    }
}