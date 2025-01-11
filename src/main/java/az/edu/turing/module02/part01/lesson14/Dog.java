package az.edu.turing.module02.part01.lesson14;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void move() {
        System.out.println("Dog is moving");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }
}
