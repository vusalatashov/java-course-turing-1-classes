package az.edu.turing.module02.part02.lesson30;

import java.io.Serializable;

public class Student implements Serializable {
    private static long serialVersionUID = 2L;
    private String name;//[1]
    private int age;//[2]
    private String surname;//[3]
    private String email;//[4]

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
