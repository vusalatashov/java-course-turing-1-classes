package az.edu.turing.module02.part01.lesson14;

public class Fish extends Animal {
    public Fish() {
    }

    public Fish(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish is making sound");
    }
}
