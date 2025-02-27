package az.edu.turing.module02.part02.lesson29;

import java.nio.file.*;
public class FileManagerThree {

    public static void main(String[] args) {
        Path path = Paths.get("src/main/java/az/edu/turing/module02/part02/lesson29/resource");
        Path fileName = Paths.get("file2.txt");
        //try with resources
        try{
            Files.write(path.resolve(fileName), "Hello BR SR--".getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }catch (Exception e) {
            System.out.println("Error while writing to file");
        }

        try {
            Files.lines(path.resolve(fileName)).forEach(System.out::println);
        }catch (Exception e) {
            System.out.println("Error while reading from file");
        }
    }
}
