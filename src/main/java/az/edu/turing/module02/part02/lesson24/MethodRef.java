package az.edu.turing.module02.part02.lesson24;

import java.util.function.Consumer;

public class MethodRef {


    public static void main(String[] args) {
        String str = "Hello";
        Consumer<String> consumer = System.out::print;
        for (int i = str.length()-1; i >=0; i--) {
            consumer.accept(String.valueOf(str.charAt(i)));
        }
    }

}
