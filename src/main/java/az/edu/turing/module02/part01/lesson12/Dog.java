package az.edu.turing.module02.part01.lesson12;

public class Dog extends Animal{

    private String color;

    public Dog(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void eat() {
        System.out.println("it Ət Tixir");
    }

    public int eat(String a) {
        System.out.println("it Ət Tixir");
        return 0;
    }
    public void eat(int a) {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                ", color='" + this.color + '\'' +
                '}';
    }
}
