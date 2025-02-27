package az.edu.turing.module02.part02.lesson32;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        int count = 5;
        Semaphore semaphore = new Semaphore(count);
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            for (int i = 0; i < 10; i++) {
                executorService.submit(() -> {
                    try {
                        semaphore.acquire();
                        System.out.println(Thread.currentThread().getName() + " is running");
                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        semaphore.release();
                    }
                });
            }
            executorService.shutdown();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
