package az.edu.turing.module02.part02.lesson24;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Function {

    public static void main(String[] args) {

        Predicate<String> predicate = s -> s.length() > 5;

        System.out.println(predicate.test("Hello"));
        System.out.println(predicate.test("Helloe"));
        List<String> list = List.of("Hello", "Helloe", "Helloee", "Helloeee");


        Supplier<Integer> supplier = () -> new Random().nextInt(4);

        System.out.println(list.get(supplier.get()));

    }

}
