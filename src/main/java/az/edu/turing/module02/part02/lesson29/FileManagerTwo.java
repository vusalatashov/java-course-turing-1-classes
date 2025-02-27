package az.edu.turing.module02.part02.lesson29;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManagerTwo {
    public static void main(String[] args) {
        String path = "src/main/java/az/edu/turing/module02/part02/lesson29/resource";
        String fileName = "Object.txt";
        Student student1 = new Student("Günel", 20);
        Student student2 = new Student("ali", 20);

        // Fayla yeni tələbələri əlavə edirik
        try (FileOutputStream fileOut = new FileOutputStream("students.dat", true);  // append etmə
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            // Yeni tələbələri fayla yazırıq
            out.writeObject(student1);
            out.writeObject(student2);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Fayldan tələbələri oxuyuruq
        try (FileInputStream fileIn = new FileInputStream("students.dat");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {

            // Fayldan obyektləri oxuyuruq
            while (true) {
                try {
                    Student readStudent = (Student) in.readObject();
                    System.out.println("Oxunan tələbə: " + readStudent);
                } catch (EOFException e) {
                    break;  // Faylın sonuna gəldikdə çıxırıq
                }
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
