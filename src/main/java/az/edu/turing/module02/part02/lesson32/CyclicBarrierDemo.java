package az.edu.turing.module02.part02.lesson32;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        int count = 6;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, () -> System.out.println("All threads are finished"));

        try  {
            ExecutorService executorService = Executors.newFixedThreadPool(count);
            for (int i = 0; i < count; i++) {
                executorService.submit(() -> {
                    System.out.println(Thread.currentThread().getName() + " is running");
                    try {
                        Thread.sleep(2000);
                        cyclicBarrier.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is finished");
                });
            }

            executorService.shutdown();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
