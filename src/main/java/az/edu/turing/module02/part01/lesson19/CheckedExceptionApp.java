package az.edu.turing.module02.part01.lesson19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionApp {

    public static void main(String[] args) {
        try {
            // Trying to read the file
            readFile("example.txt");
        } catch (IOException e) {
            // Catching the error and displaying a message to the user
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }

    // Method to read the file
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
