package az.edu.turing.module02.part01.lesson10;

public class Student {
    public String name;
    public String surname;
    public static int age;


    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        Student.age = age;
    }

    public Student(String name) {
        this.name = name;
    }


    public Student(int age, String surname) {
        this.age = age;
        this.surname = surname;
    }
}
