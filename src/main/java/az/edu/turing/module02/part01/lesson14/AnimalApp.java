package az.edu.turing.module02.part01.lesson14;

public class AnimalApp {

    public static void main(String[] args) {

//        Cat cat= new Cat("Tom", 3, "White");
        Dog dog= new Dog("Rex", 5, "Black");
        Fish fish= new Fish("Nemo", 1, "Orange");

//        printAnimal(cat);
        printAnimal(dog);
        printAnimal(fish);

    }
    public static void printAnimal(Animal a) {
        if (a instanceof Cat) {

            Cat cat = (Cat) a;
            System.out.println("Cat: " + a.getName() + " " + a.getAge() + " " + a.getColor() + "meow" + cat.getMeow());
        } else if (a instanceof Dog) {
//            System.out.println("Dog: " + a.getName() + " " + a.getAge() + " " + a.getColor() + "bark" + a.getBark());
        }
    }
}