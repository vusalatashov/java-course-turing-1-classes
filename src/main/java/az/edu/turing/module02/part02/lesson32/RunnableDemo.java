package az.edu.turing.module02.part02.lesson32;

public class RunnableDemo {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MyRunnable myRunnable = new MyRunnable();
            Thread thread = new Thread(myRunnable);
            Thread thread1=new Thread(()->{
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("hello");
            } );

            thread.start();
            thread1.start();
        }
    }
}

class MyRunnable implements Runnable {
    static int counter = 0;

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyRunnable running" + counter++);
    }
}
