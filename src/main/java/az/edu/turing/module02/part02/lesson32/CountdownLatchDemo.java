package az.edu.turing.module02.part02.lesson32;

import java.util.concurrent.CountDownLatch;

public class CountdownLatchDemo {
    public static void main(String[] args) {
        int count = 10;
        CountDownLatch countdownLatch = new CountDownLatch(4);
        for (int i = 0; i < count; i++) {
           new Thread(()-> {
               System.out.println(Thread.currentThread().getName() + " is running");
               countdownLatch.countDown();
               System.out.println(Thread.currentThread().getName() + " is finished");
           }).start();
        }

        try {
            countdownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main thread is finished");
    }
}
