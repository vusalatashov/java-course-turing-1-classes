package az.edu.turing.module02.part02.lesson29;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("Johuoyfiuyfn", 20);
        Student student2 = new Student("Johytifiytfn", 2065);

        String path = "src/main/java/az/edu/turing/module02/part02/lesson29/student.txt";

        File file = new File(path);
        boolean exists = file.exists() ; //false
        boolean  empty = file.exists() && file.length() != 0; //false


        System.out.println("File exists: " + exists);
        System.out.println("File is empty: " + empty);

        try (FileOutputStream fileOut = new FileOutputStream(path, true);
             ObjectOutputStream out = (exists && empty) ? new AppendObjectOutputStream(fileOut) : new ObjectOutputStream(fileOut)) {
            out.writeObject(student1);
            out.writeObject(student2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fileIn = new FileInputStream(path);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    Student readStudent = (Student) in.readObject();
                    System.out.println("Read student: " + readStudent);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
