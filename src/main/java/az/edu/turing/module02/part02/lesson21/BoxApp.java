package az.edu.turing.module02.part02.lesson21;

import java.util.Optional;

import static az.edu.turing.module02.part02.lesson21.BoxGeneric.printBox;

public class BoxApp {

    public static void main(String[] args) {
//        Box box = new Box("Hello, World!");
//        Integer str = (Integer) box.getObject();
//        System.out.println(str);

        BoxGeneric<Integer> a= new BoxGeneric<>(45);
        BoxGeneric<Object> b = new BoxGeneric<>(45);
        BoxGeneric<Double> c = new BoxGeneric<>(45.67);
        printBox(a);
        printBox(b);
//        (printBox(c);

//        BoxGeneric<String> strBox = new BoxGeneric<>("Hello, wildcard!");
//        printBox(strBox);
//
//        BoxGeneric<Double> doubleBox = new BoxGeneric<>(45.67);
//        printBox(doubleBox);


        Optional<String> optional = Optional.of("Hello, Optional!");
        System.out.println(optional.get());

        Optional<String > nullOptional = Optional.ofNullable(null);
        System.out.println(nullOptional.orElse("Hello, Optional!"));
    }

}
