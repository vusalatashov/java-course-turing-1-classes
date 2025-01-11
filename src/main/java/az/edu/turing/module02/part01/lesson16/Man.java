package az.edu.turing.module02.part01.lesson16;

public class Man extends Human implements Swimming, Speak{
    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Swimming");

    }

    @Override
    public void foo() {

    }

    @Override
    public void speak() {

    }
}
