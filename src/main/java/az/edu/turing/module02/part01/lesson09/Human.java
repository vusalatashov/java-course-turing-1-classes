package az.edu.turing.module02.part01.lesson09;

public class Human {
    public String name;
    public String surname;
    public int age;
    public String gender;


    public Human(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Human(String gender) {
        this.gender = gender;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                        ", surname='" + surname;
    }
}
