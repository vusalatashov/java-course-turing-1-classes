package az.edu.turing.module02.part02.lesson23;

import java.util.*;

public class FamilyApp {
    public static void main(String[] args) {

        Person person1 = new Person(1L, "Father", 40);
        Person person2 = new Person(1L, "Father", 30);
        Person person3 = new Person(3L, "Son", 15);
        Person person5 = new Person(5L, "Don", 21);
        Person person6 = new Person(5L, "Bon", 17);
        Person person4 = new Person(4L, "Daughter", 10);

        List<Person> family = new ArrayList<>();
        ArrayList<Person> family2 = new ArrayList<>();

        family.add(person2);
        family.add(person1);
        family.add(person4);
        family.add(person3);
        family.add(person5);
        family.add(person6);



//
//        new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                int nameCompare = o1.getName().compareTo(o2.getName());
//                if (nameCompare == 0) {
//                    return (int) (o1.getId() - o2.getId());
//                }
//                return nameCompare;
//            }
//        };

        Collections.sort(family, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int nameCompare = (int) (o1.getId() - o2.getId());
                return nameCompare;
            }
        });

        System.out.println(family);

        Collections.sort(family, (o1, o2) -> {
            int nameCompare = (o1.getName().compareTo(o2.getName()));
            return nameCompare;
        });

        System.out.println(family);
    }
}
