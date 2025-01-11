package az.edu.turing.module02.part01.lesson14;


import java.util.*;

public class Cat extends Animal{
    private String meow;

    public Cat(String meow) {
        this.meow = meow;
    }

    public Cat(String name, int age, String color, String meow) {
        super(name, age, color);
        this.meow = meow;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow(String meow) {
        this.meow = meow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return java.util.Objects.equals(meow, cat.meow);
    }

    @Override
    public int hashCode() {
        return  java.util.Objects.hash(super.hashCode(), meow);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "meow='" + meow + '\'' +
                "} " + super.toString();
    }
}
