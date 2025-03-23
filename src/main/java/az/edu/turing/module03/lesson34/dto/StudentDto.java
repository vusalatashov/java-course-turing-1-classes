package az.edu.turing.module03.lesson34.dto;

import az.edu.turing.module03.lesson34.model.StudentEntity;

import java.util.Objects;

public class StudentDto {

    private long id;
    private String name;
    private String surname;
    private int age;
    private double gpa;

    public StudentDto() {

    }

    public StudentDto(long id, String name, String surname, int age, double gpa) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gpa = gpa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentDto that = (StudentDto) o;
        return id == that.id && age == that.age && Double.compare(gpa, that.gpa) == 0 && Objects.equals(name, that.name) && Objects.equals(surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age, gpa);
    }

    @Override
    public String toString() {
        return "StudentDto : \n{id=%d, name='%s', surname='%s', age=%d, gpa=%s} \n".formatted(id, name, surname, age, gpa);
    }
}
