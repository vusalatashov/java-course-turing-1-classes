package az.edu.turing.module02.part02.lesson31;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyWithThreadPool {
    public static void main(String[] args) {
        System.out.println("Başlama vaxtı: " + LocalTime.now());

        // Taskları sırayla icra edirik
        new KitchenTask("Çörək bişir").run();
        new KitchenTask("Kök bişir").run();
        new KitchenTask("Et bişir").run();
        new KitchenTask("Kabab bişir").run();
        new KitchenTask("Plov bişir").run();
        new KitchenTask("Dolma bişir").run();
        new KitchenTask("Şorba bişir").run();
        new KitchenTask("Salat hazırla").run();
        new KitchenTask("Tərəvəz doğra").run();
        new KitchenTask("Kompot hazırla").run();

        System.out.println("Bitmə vaxtı: " + LocalTime.now());

    }
}
