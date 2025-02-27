package az.edu.turing.module02.part02.lesson32;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newFixedThreadPool(10);
            List<Callable<String>> tasks = new ArrayList<>(10);
            for (int i = 0; i < 10; i++) {
                tasks.add(new MyCallable());
            }
            List<Future<String>> futures = new ArrayList<>(10);

            for (int i = 0; i < 10; i++) {
                Future<String> future = executorService.submit(tasks.get(i));
                futures.add(future);
            }
            System.out.println("Main thread is running");

            for (Future<String> future : futures) {
                System.out.println(future.get());

            }
            executorService.shutdown();
        } catch (ExecutionException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyCallable implements Callable<String> {
    static int counter = 0;

    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "MyCallable running" + counter++;
    }
}
