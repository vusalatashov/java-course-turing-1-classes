package az.edu.turing.module02.part02.lesson23;

import java.util.Comparator;

public  class CustomCompareClass implements Comparator<Person> {
    @Override
    public  int compare(Person o1, Person o2) {
        int nameCompare = o1.getName().compareTo(o2.getName());
        if (nameCompare == 0) {
          return o2.getAge() - o1.getAge();
        }
        return nameCompare;
    }
}
