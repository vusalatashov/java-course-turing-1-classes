package az.edu.turing.module02.part02.lesson22;

import java.util.ArrayList;
import java.util.Optional;

public class BoxApp {

    public static void main(String[] args) {
//        BoxGeneric<Integer> a= new BoxGeneric<>(45);
//        BoxGeneric<Object> b = new BoxGeneric<>(45);
//        BoxGeneric<Number>d = new BoxGeneric<>(45);
//        BoxGeneric<Double> c = new BoxGeneric<>(45.67);
        Optional<String> name= Optional.ofNullable("faxi");
        System.out.println(name.orElse("Hello, Optional!"));

//        BoxGeneric.printBox(d);

    }

}
