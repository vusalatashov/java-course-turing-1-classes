package az.edu.turing.module02.part02.lesson32;


public class ThreadDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread myThread = new MyThread();
            myThread.start();
        }
    }

}
class MyThread extends Thread {
    static int counter = 0;
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyThread running"+counter++);
    }
}