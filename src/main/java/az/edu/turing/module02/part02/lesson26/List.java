package az.edu.turing.module02.part02.lesson26;

import java.util.*;

public class List {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.remove(0);
        list1.set(0, 3);

        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.get(0);
        list2.remove(0);
        list2.set(0, 3);

        Set<String> set1=new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("a");
        set1.add("d");
        set1.add("c");
        set1.add("x");
        set1.add("f");
        System.out.println(set1);

//        System.out.println(list1);
//        System.out.println(list2);
    }

}
